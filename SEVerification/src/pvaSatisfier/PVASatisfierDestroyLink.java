package pvaSatisfier;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import pvaAnalyzer.ModelLoader;
import pvaAnalyzer.model.AssociationCardMin;
import pvaAnalyzer.model.Constraint;
import pvaAnalyzer.model.Symmetry;
import severification.actionSemantics.Action;
import severification.actionSemantics.Association;
import severification.actionSemantics.CreateLink;
import severification.actionSemantics.DestroyLink;
import severification.actionSemantics.DestroyObject;
import severification.actionSemantics.ExecutionPath;
import severification.actionSemantics.Guard;
import severification.actionSemantics.Object;
import severification.actionSemantics.ReclassifyObject;
import severification.alf.parser.OperationScanner;

public class PVASatisfierDestroyLink extends PVASatisfier {
	
	public boolean isSatisfied(DestroyLink pva, Constraint constraint , ExecutionPath path, ModelLoader ml) {
		if ( constraint instanceof AssociationCardMin ){
			return satisfyCardMinSVC( pva, constraint, path, ml);
		} else if ( constraint instanceof Symmetry ){
			return satisfySym( pva, constraint, path, ml);
		}
		return false;
	}

	private boolean satisfySym(DestroyLink pva, Constraint constraint, ExecutionPath path, ModelLoader ml) {
		Symmetry sym = (Symmetry) constraint;
		DestroyLink drLink = new DestroyLink( 	new Association( sym.getAssociation() ), 
												pva.getRoleB(), 
												pva.getObjName1() , 
												pva.getRoleA() , 
												pva.getObjName2() );
		return existsDestroyLink( pva , constraint, path, drLink, false);
	}

	private boolean satisfyCardMinSVC(DestroyLink pva, Constraint constraint, ExecutionPath path, ModelLoader ml) {
		AssociationCardMin assocCardMin = (AssociationCardMin) constraint;
		String oppositeRole = OperationScanner.getModelLoader().oppositeAssociationRole( assocCardMin.getAssociation() , 
				assocCardMin.getRole() );
		
		if ( satisfySizeGuard( pva , assocCardMin , path , oppositeRole ) ){
			constraint.setSatisfiedBy(1);
			return true;
		} else if ( satisfyCreateLink( pva , assocCardMin , path , oppositeRole ) ){
			constraint.setSatisfiedBy(2);
			return true;
		} else if ( satisfyDestroyObject( pva , assocCardMin , path , oppositeRole ) ){
			constraint.setSatisfiedBy(3);
			return true;
		} else if ( satisfyReclassifyObject( pva , assocCardMin , path , oppositeRole ) ){
			constraint.setSatisfiedBy(4);
			return true;
		}
		return false;
	}

	private boolean satisfyReclassifyObject(DestroyLink pva, AssociationCardMin constraint, ExecutionPath path, String oppositeRole) {
		String clazz = OperationScanner.getModelLoader().oppositeClassFromAssocRole( constraint.getAssociation(), constraint.getRole() );
		if ( OperationScanner.getModelLoader().isChild( clazz ) ){
			String oppObj = pva.oppositeObjectFromRole( constraint.getRole() );
			ReclassifyObject rcl = new ReclassifyObject( 	
												oppObj , 
												new ArrayList<String>( Arrays.asList( 
														OperationScanner.getModelLoader().oppositeClassFromAssocRole(
																constraint.getAssociation(), constraint.getRole() ) ) ) ,
												null );
			for ( int i = pva.getPathIndex() + 1; i < path.size(); i++ ){
				Action action = path.getTerms().get(i).getAction();
				if ( action instanceof ReclassifyObject && action.equals( rcl ) ){
					return true;
				}
			}
			
			ArrayList<String> codePiece = new ArrayList<String>();
			String multip = multiplicityCodeGeneration( pva , path );
			if ( multip != null && !multip.equals("") ){
				codePiece.add( multip );
			}
			codePiece.add( rcl.toAlfFrom() + ";" );
			constraint.addCodeToBeSatisfied( codePiece );
			return false;
		} else {
			return false;
		}
	}

	private boolean satisfyDestroyObject(DestroyLink pva, AssociationCardMin constraint, ExecutionPath path, String oppositeRole) {
		String oppObjName = pva.oppositeObjectFromRole( constraint.getRole() );
		DestroyObject dro = new DestroyObject( new Object( oppObjName , null ) );
		for ( int i = pva.getPathIndex() + 1; i < path.size(); i++ ){
			Action action = path.getTerms().get(i).getAction();
			if ( action instanceof DestroyObject && action.equals( dro ) ){
				return true;
			}
		}
		
		ArrayList<String> codePiece = new ArrayList<String>();
		String multip = multiplicityCodeGeneration( pva , path );
		if ( multip != null && !multip.equals("") ){
			codePiece.add( multip );
		}
		codePiece.add( dro.toAlf() + ";" );
		constraint.addCodeToBeSatisfied( codePiece );
		return false;
		
	}

	private boolean satisfyCreateLink(DestroyLink pva, AssociationCardMin constraint, ExecutionPath path, String oppositeRole) {
		CreateLink crLink = new CreateLink( 	new Association( constraint.getAssociation() ), 
												pva.oppositeRoleFromRole( constraint.getRole() ), 
												pva.oppositeObjectFromRole( constraint.getRole() ) , 
												constraint.getRole() , 
												null );
		return existsCreateLink( pva , constraint, path , crLink , true);
	}

	private boolean satisfySizeGuard(DestroyLink pva, AssociationCardMin constraint, ExecutionPath path, String oppositeRole) {
		String roleOppositeObj = pva.oppositeObjectFromRole( constraint.getRole() );
		String roleOppositeRole = pva.oppositeRoleFromRole( constraint.getRole() );
		int o = numCreateLink( pva.getPathIndex() , path , new CreateLink( 	new Association( constraint.getAssociation() ), 
																			roleOppositeRole, 
																			roleOppositeObj, 
																			constraint.getRole(), 
																			null ) );
		int p = numDestroyLink( pva.getPathIndex() , path , new DestroyLink(	new Association( constraint.getAssociation() ), 
																				roleOppositeRole, 
																				roleOppositeObj, 
																				constraint.getRole(), 
																				null ) );
		int assocRoleMin = OperationScanner.getModelLoader().getAssocRoleLower( constraint.getAssociation() ,  constraint.getRole() );
		int rightSide = assocRoleMin + o - p;
		Pattern sizePattern = Pattern.compile( "([a-zA-Z0-9]+).([a-zA-Z0-9]+)->size\\(\\)\\s(<|<=|>=|>|==|<>)\\s([a-zA-Z0-9()]+)" );
		Iterator<Guard> actionGuardsIter = path.getTerms().get( pva.getPathIndex() ).getGuards().iterator();
		while ( actionGuardsIter.hasNext() ){
			String guard = actionGuardsIter.next().getCondition();
			Matcher sizePatternMatcher = sizePattern.matcher( guard );
			try{
				if ( 	sizePatternMatcher.matches() &&
						sizePatternMatcher.group(1).equals( roleOppositeObj ) &&
						sizePatternMatcher.group(2).equals( constraint.getRole() ) ){
					String op = sizePatternMatcher.group(3);
					int intValue = Integer.valueOf( sizePatternMatcher.group(4) );
					if ( 	( op.equals( ">" ) && intValue >= rightSide ) ||
							( op.equals( ">=" ) && intValue > rightSide ) ||
							( op.equals( "==" ) && intValue > rightSide ) ){
						return true;
					}
				}
			} catch ( NumberFormatException nfe ){
				String queryOp = new String();
				if ( sizePatternMatcher.group(3).equals( ">" ) ){
					queryOp = ">=";
				} else {
					queryOp = ">";
				}
				constraint.addUserQuery( sizePatternMatcher.group(4) + " " + queryOp + " " + rightSide );
			}
		}
		
		ArrayList<String> codePiece = new ArrayList<String>();
		String multip = multiplicityCodeGeneration( pva , path );
		if ( multip != null && !multip.equals("") ){
			codePiece.add( multip );
		}
		codePiece.add( "if ( " + roleOppositeObj + "." +  constraint.getRole() + "->size() > " + rightSide + " ){" );
		codePiece.add( TAB_CHAR + "/* your current code */" );
		codePiece.add( TAB_CHAR  + pva.toAlf() );
		codePiece.add( TAB_CHAR + COMMENT );
		codePiece.add( "}" );
		constraint.addCodeToBeSatisfied( codePiece );
		return false;
	}
}
