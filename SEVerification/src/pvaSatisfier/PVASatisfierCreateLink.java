package pvaSatisfier;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import pvaAnalyzer.ModelLoader;
import pvaAnalyzer.model.ASymmetry;
import pvaAnalyzer.model.AssociationCardMax;
import pvaAnalyzer.model.Constraint;
import pvaAnalyzer.model.Irreflexivity;
import pvaAnalyzer.model.Symmetry;
import severification.actionSemantics.Association;
import severification.actionSemantics.CreateLink;
import severification.actionSemantics.CreateObject;
import severification.actionSemantics.DestroyLink;
import severification.actionSemantics.ExecutionPath;
import severification.actionSemantics.Guard;
import severification.actionSemantics.Object;
import severification.actionSemantics.ReclassifyObject;
import severification.actionSemantics.Term;
import severification.alf.parser.OperationScanner;

public class PVASatisfierCreateLink extends PVASatisfier {
	
	public boolean isSatisfied(CreateLink pva, Constraint constraint , ExecutionPath path, ModelLoader ml) {
		if (constraint instanceof AssociationCardMax){
			return satisfyAssocCardMaxSVC( pva , constraint , path );
		} else if (constraint instanceof Symmetry){
			return satisfySymmetrySVC( pva , constraint , path );
		} else if (constraint instanceof ASymmetry){
			return satisfyASymmetrySVC( pva , constraint , path );
		} else if (constraint instanceof Irreflexivity){
			return satisfyIrreflexiveSVC( pva , constraint , path );
		}
		return false;
	}

	private boolean satisfyIrreflexiveSVC(CreateLink pva, Constraint constraint, ExecutionPath path) {
		Pattern diffPattern = Pattern.compile( "([a-zA-Z0-9]+)\\s!=\\s([a-zA-Z0-9]+)" );
		Iterator<Guard> actionGuardsIter = path.getTerms().get( pva.getPathIndex() ).getGuards().iterator();
		while ( actionGuardsIter.hasNext() ){
			String guard = actionGuardsIter.next().getCondition();
			Matcher m = diffPattern.matcher( guard );
			if ( m.matches() && 
					( ( m.group(1).equals( pva.getObjName1() ) && m.group(2).equals( pva.getObjName2() ) ) ||
					( m.group(1).equals( pva.getObjName2() ) && m.group(2).equals( pva.getObjName1() ) ) ) ){
				return true;
			}
		}
		
		ArrayList<String> codePiece = new ArrayList<String>();
		String multip = multiplicityCodeGeneration( pva , path );
		if ( multip != null && !multip.equals("") ){
			codePiece.add( multip );
		}
		codePiece.add( "if ( " + pva.getObjName1() + " != " + pva.getObjName2() + " ){ // or viceversa" );
		codePiece.add( TAB_CHAR + "/* your current code */" );
		codePiece.add( TAB_CHAR  + pva.toAlf() );
		codePiece.add( TAB_CHAR + COMMENT );
		codePiece.add( "}" );
		constraint.addCodeToBeSatisfied( codePiece );
		return false;
	}
	
	private boolean satisfyASymmetrySVC(CreateLink pva, Constraint constraint, ExecutionPath path) {
		ASymmetry asym = (ASymmetry) constraint;
		DestroyLink drLink = new DestroyLink( 	new Association( asym.getAssociation() ), 
												pva.getRoleB(), 
												pva.getObjName1() , 
												pva.getRoleA() , 
												pva.getObjName2() );
		if ( existsIncludesGuard( pva , constraint , path ) ){
			constraint.setSatisfiedBy(1);
			return true;
		} else if ( existsDestroyLink( pva , constraint , path , drLink , false ) ){
			constraint.setSatisfiedBy(2);
			return true;
		}
		return false;
	}

	private boolean existsIncludesGuard(CreateLink pva, Constraint constraint, ExecutionPath path) {
		Pattern includesPattern = Pattern.compile( "!([a-zA-Z0-9]+).([a-zA-Z0-9]+)->includes\\(([a-zA-Z0-9]+)\\)" );
		Pattern excludesPattern = Pattern.compile( "([a-zA-Z0-9]+).([a-zA-Z0-9]+)->excludes\\(([a-zA-Z0-9]+)\\)" );
		Iterator<Guard> actionGuardsIter = path.getTerms().get( pva.getPathIndex() ).getGuards().iterator();
		while ( actionGuardsIter.hasNext() ){
			Guard guard = actionGuardsIter.next();
			Matcher incMatcher = includesPattern.matcher( guard.getCondition() );
			Matcher excMatcher = excludesPattern.matcher( guard.getCondition() );
			if ( incMatcher.matches() ){
				if ( 	( incMatcher.group(1).equals(pva.getObjName2()) && incMatcher.group(2).equals(pva.getRoleB()) && 
							incMatcher.group(3).equals(pva.getObjName1()) ) || 
						( incMatcher.group(1).equals(pva.getObjName1()) && incMatcher.group(2).equals(pva.getRoleA()) && 
								incMatcher.group(3).equals(pva.getObjName2())  ) ){
					return true;
				}
			} else if ( excMatcher.matches() ){
				if ( 	( excMatcher.group(1).equals(pva.getObjName2()) && excMatcher.group(2).equals(pva.getRoleB()) && 
							excMatcher.group(3).equals(pva.getObjName1()) ) || 
						( excMatcher.group(1).equals(pva.getObjName1()) && excMatcher.group(2).equals(pva.getRoleA()) && 
									excMatcher.group(3).equals(pva.getObjName2())  ) ){
					return true;
				}
			}
		}
		
		ArrayList<String> codePiece = new ArrayList<String>();
		String multip = multiplicityCodeGeneration( pva , path );
		if ( multip != null && !multip.equals("") ){
			codePiece.add( multip );
		}
		codePiece.add( "if ( !" + pva.getObjName2() + "." + pva.getRoleB() + "->includes(" + pva.getObjName1() + ") ){" );
		codePiece.add( TAB_CHAR + "/* your current code */" );
		codePiece.add( TAB_CHAR  + pva.toAlf() );
		codePiece.add( TAB_CHAR + COMMENT );
		codePiece.add( "}" );
		constraint.addCodeToBeSatisfied( codePiece );
		return false;
	}

	private boolean satisfySymmetrySVC(CreateLink pva, Constraint constraint, ExecutionPath path) {
		Symmetry symm = (Symmetry) constraint;
		CreateLink crLink = new CreateLink( 	new Association( symm.getAssociation() ), 
												pva.getRoleB(),
												pva.getObjName1(),
												pva.getRoleA(),
												pva.getObjName2());
		return existsCreateLink( pva , constraint, path , crLink , false );
	}

	private boolean satisfyAssocCardMaxSVC(CreateLink pva, Constraint constraint, ExecutionPath path) {
		AssociationCardMax assocCardMax = (AssociationCardMax) constraint;
		String oppositeRole = OperationScanner.getModelLoader().oppositeAssociationRole( assocCardMax.getAssociation() , 
				assocCardMax.getRole() );
		
		DestroyLink drLink = new DestroyLink( 	new Association( assocCardMax.getAssociation() ), 
												pva.oppositeRoleFromRole( assocCardMax.getRole() ), 
												pva.oppositeObjectFromRole( assocCardMax.getRole() ) , 
												assocCardMax.getRole() , 
												null );
		CreateLink crLink = new CreateLink( 	new Association( assocCardMax.getAssociation() ), 
												pva.oppositeRoleFromRole( assocCardMax.getRole() ), 
												pva.oppositeObjectFromRole( assocCardMax.getRole() ) , 
												assocCardMax.getRole() , 
												null );
		if ( existsCreateObject(pva , assocCardMax , path, oppositeRole , crLink ) ){
			constraint.setSatisfiedBy(3);
			return true;
		} else if ( existsReclassifyObject(pva , assocCardMax , path, oppositeRole , crLink ) ){
			constraint.setSatisfiedBy(4);
			return true;
		} else if ( existsAssocCardMaxGuards(pva , assocCardMax , path , oppositeRole ) ){
			constraint.setSatisfiedBy(1);
			return true;
		} else if ( existsDestroyLink( pva , assocCardMax , path , drLink , true ) ){
			constraint.setSatisfiedBy(2);
			return true;
		}
		return false;			
	}

	private boolean existsReclassifyObject(CreateLink pva, AssociationCardMax constraint, ExecutionPath path, String oppossiteRole , 
			CreateLink crLink) {
		String clazz = OperationScanner.getModelLoader().oppositeClassFromAssocRole( constraint.getAssociation(), constraint.getRole() );
		if ( OperationScanner.getModelLoader().isChild( clazz ) ){
			boolean existsReclassifyObject = false;
			int assocRoleMax = OperationScanner.getModelLoader().getAssocRoleUpper( constraint.getAssociation() ,  constraint.getRole() );
			String oppObj = pva.oppositeObjectFromRole( constraint.getRole() );
			ReclassifyObject rcl = new ReclassifyObject( 
												oppObj , 
												null , 
												new ArrayList<String>( Arrays.asList( 		
														OperationScanner.getModelLoader().oppositeClassFromAssocRole(
																constraint.getAssociation(), constraint.getRole() ) ) ) );
			int crLinkOcurrences = 0;
			for ( int i = 0; i < pva.getPathIndex(); i++ ){
				Term term = path.getTerms().get(i);
				if ( term.getAction() instanceof ReclassifyObject && term.getAction().equals( rcl ) ){
					existsReclassifyObject = true;
				} else if ( term.getAction() instanceof CreateLink && term.getAction().equals( crLink ) ){
					try{
						crLinkOcurrences += term.getNumericMultiplicity();
					} catch (NumberFormatException nfe){
						constraint.addUserQuery( term.getMultiplicity() + " < " + assocRoleMax );
						return false;
					}
				}
			}
			if ( existsReclassifyObject && crLinkOcurrences < assocRoleMax ){
				return true;
			} else {
				ArrayList<String> codePiece = new ArrayList<String>();
				String multip = multiplicityCodeGeneration( pva , path );
				if ( multip != null && !multip.equals("") ){
					codePiece.add( multip );
				}
				codePiece.add( rcl.toAlfTo() + ";" );
				codePiece.add( crLink.toAlf() + " // at most " + assocRoleMax + " invocation/s" );
				constraint.addCodeToBeSatisfied( codePiece );
				return false;
			}
		} else {
			return false;
		}
	}

	private boolean existsCreateObject(CreateLink pva, AssociationCardMax constraint, ExecutionPath path, String oppossiteRole, 
			CreateLink crLink) {
		boolean existsCreateObject = false;
		int assocRoleMax = OperationScanner.getModelLoader().getAssocRoleUpper( constraint.getAssociation() ,  constraint.getRole() );
		String oppObjName = pva.oppositeObjectFromRole( constraint.getRole() );
		CreateObject cr = new CreateObject( new Object( oppObjName , OperationScanner.getModelLoader().oppositeClassFromAssocRole(
																		constraint.getAssociation(), constraint.getRole() ) ) );
		int crLinkOcurrences = 0;
		for ( int i = 0; i < pva.getPathIndex(); i++ ){
			Term term = path.getTerms().get(i);
			if ( term.getAction() instanceof CreateObject && term.getAction().equals( cr ) && !existsCreateObject ){
				existsCreateObject = true;
			} else if ( term.getAction() instanceof CreateLink && term.getAction().equals( crLink ) ){
				try{
					crLinkOcurrences += term.getNumericMultiplicity();
				} catch (NumberFormatException nfe){
					constraint.addUserQuery( term.getMultiplicity() + " < " + assocRoleMax );
					return false;
				}
			}
			
		}
		if ( existsCreateObject && crLinkOcurrences < assocRoleMax ){
			return true;
		} else {
			ArrayList<String> codePiece = new ArrayList<String>();
			String multip = multiplicityCodeGeneration( pva , path );
			if ( multip != null && !multip.equals("") ){
				codePiece.add( multip );
			}
			codePiece.add( cr.toAlf() + ";" );
			codePiece.add( crLink.toAlf() + " // at most " + assocRoleMax + " invocation/s" );
			constraint.addCodeToBeSatisfied( codePiece );
			return false;
		}
	}

	private boolean existsAssocCardMaxGuards(CreateLink pva, AssociationCardMax constraint, ExecutionPath path, String oppossiteRole) {
		String roleOppositeObj = pva.oppositeObjectFromRole( constraint.getRole() );
		String roleOppositeRole = pva.oppositeRoleFromRole( constraint.getRole() );
		int o = numCreateLink( pva.getPathIndex() , path , new CreateLink( 	new Association( constraint.getAssociation() ), 
																			roleOppositeRole, 
																			roleOppositeObj, 
																			constraint.getRole(), 
																			null ) );
		int p = numDestroyLink( pva.getPathIndex() , path , new DestroyLink( new Association( constraint.getAssociation() ), 
																			roleOppositeRole, 
																			roleOppositeObj, 
																			constraint.getRole(), 
																			null ) );
		int assocRoleMax = OperationScanner.getModelLoader().getAssocRoleUpper( constraint.getAssociation() ,  constraint.getRole() );
		int rightSide = assocRoleMax - o + p;
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
					if ( 	( op.equals( "<" ) && intValue <= rightSide ) ||
							( op.equals( "<=" ) && intValue < rightSide ) ||
							( op.equals( "==" ) && intValue < rightSide ) ){
						return true;
					}
				}
			} catch ( NumberFormatException nfe ){
				String queryOp = new String();
				if ( sizePatternMatcher.group(3).equals( "<" ) ){
					queryOp = "<=";
				} else {
					queryOp = "<";
				}
				constraint.addUserQuery( sizePatternMatcher.group(4) + " " + queryOp + " " + rightSide );
			}	
		}
		ArrayList<String> codePiece = new ArrayList<String>();
		String multip = multiplicityCodeGeneration( pva , path );
		if ( multip != null && !multip.equals("") ){
			codePiece.add( multip );
		}
		codePiece.add( "if ( " + roleOppositeObj + "." + constraint.getRole() + "->size() < " + rightSide + " ){" );
		codePiece.add( TAB_CHAR + "/* your current code */" );
		codePiece.add( TAB_CHAR  + pva.toAlf() );
		codePiece.add( TAB_CHAR + COMMENT );
		codePiece.add( "}" );
		constraint.addCodeToBeSatisfied( codePiece );
		return false;
	}
}
