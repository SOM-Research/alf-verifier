package pvaSatisfier;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import pvaAnalyzer.ModelLoader;
import pvaAnalyzer.model.AssociationCardMin;
import pvaAnalyzer.model.ClassCardMax;
import pvaAnalyzer.model.Constraint;
import pvaAnalyzer.model.Disjoint;
import pvaAnalyzer.model.MandatoryAttribute;

import severification.actionSemantics.Action;
import severification.actionSemantics.ActionLink;
import severification.actionSemantics.AddStructuralFeature;
import severification.actionSemantics.CreateLink;
import severification.actionSemantics.DestroyObject;
import severification.actionSemantics.ExecutionPath;
import severification.actionSemantics.Guard;
import severification.actionSemantics.Object;
import severification.actionSemantics.ReclassifyObject;
import severification.actionSemantics.Term;
import severification.alf.parser.OperationScanner;

public class PVASatisfierReclassifyTo extends PVASatisfier {
	
	public boolean isSatisfied(ReclassifyObject pva, Constraint constraint , ExecutionPath path, ModelLoader ml) {
		if ( constraint instanceof MandatoryAttribute ){
			return satisfyMandSVC( pva , constraint , path );
		} else if ( constraint instanceof AssociationCardMin ){
			return satisfyAssocCardMinSVC( pva , constraint, path , ml );
		} else if ( constraint instanceof ClassCardMax ){
			return satisfyClassCardMaxSVC( pva , constraint, path );	
		} else if ( constraint instanceof Disjoint){
			return satisfyDisjoint( pva , constraint, path );
		}
		return true;
	}

	private boolean satisfyDisjoint(ReclassifyObject pva, Constraint constraint, ExecutionPath path) {
		if ( notExistsOclIsTypeOfGuard( pva, constraint, path )  ){
			constraint.setSatisfiedBy( 1 );
			return true;
		} else if ( OperationScanner.getModelLoader().hasBrothers( pva.getNewCl().get(0) ) && existsReclassifyObject( pva, constraint , path ) ){
			constraint.setSatisfiedBy( 2 );
			return true;
		}
		return false;
	}

	private boolean existsReclassifyObject(ReclassifyObject pva, Constraint constraint, ExecutionPath path) {
		Iterator<Term> pathTermsIter = path.getTerms().iterator();
		while ( pathTermsIter.hasNext() ){
			Action action = pathTermsIter.next().getAction();
			if ( 	action instanceof ReclassifyObject &&
					!((ReclassifyObject) action).getOldCl().isEmpty() &&
					!((ReclassifyObject) action).getOldCl().get(0).equals( pva.getNewCl().get(0) ) &&
					((ReclassifyObject) action).getObjName().equals( pva.getObjName() )){
				return true;
			}
		}
		
		ArrayList<String> codePiece = new ArrayList<String>();
		String multip = multiplicityCodeGeneration( pva , path );
		if ( multip != null && !multip.equals("") ){
			codePiece.add( multip );
		}
		codePiece.add( "classify " + pva.getObjName() + " from clr; //for r=1..n  where clr!=" + pva.getNewCl().get(0) + 
				" and cl generalizes cl1,...,cln" );
		constraint.addCodeToBeSatisfied( codePiece );
		return false;
	}

	private boolean notExistsOclIsTypeOfGuard(ReclassifyObject pva, Constraint constraint, ExecutionPath path) {
		Disjoint disjConstraint = (Disjoint) constraint;
		ArrayList<String> pvaClassGenSetBrothers = 
			OperationScanner.getModelLoader().getGenSetSpecificClasses( disjConstraint.getClazz() , pva.getNewCl().get(0) );
		if ( pvaClassGenSetBrothers != null && pvaClassGenSetBrothers.size() > 1 ){
			Pattern fullOclIsTypeOfPattern = 
				Pattern.compile( 
				"(\\!([a-zA-Z0-9]+).oclIsTypeOf\\(([a-zA-Z0-9]+)\\))((?:\\s&&\\s\\!([a-zA-Z0-9]+).oclIsTypeOf\\(([a-zA-Z0-9]+)\\))*)" );
			Pattern partialOclIsTypeOfPattern = Pattern.compile("\\s&&\\s\\!([a-zA-Z0-9]+).oclIsTypeOf\\(([a-zA-Z0-9]+)\\)");
			Iterator<Guard> pvaGuardsIter = path.getTerms().get( pva.getPathIndex() ).getGuards().iterator();
			while ( pvaGuardsIter.hasNext() ){
				String guard = pvaGuardsIter.next().getCondition();	
				Matcher m = fullOclIsTypeOfPattern.matcher( guard );
				if ( m.matches() ) {
					String obj = m.group(2);
					String cl = m.group(3);
					if ( obj.equals( pva.getObjName() ) && pvaClassGenSetBrothers.contains( cl ) ){
						pvaClassGenSetBrothers.remove( cl );
					}
					if ( m.groupCount() > 4 ){
						Matcher m2 = partialOclIsTypeOfPattern.matcher( m.group(4) );
						while ( m2.find() ) {
							obj = m2.group(1);
							cl = m2.group(2);
							if ( obj.equals( pva.getObjName() ) && pvaClassGenSetBrothers.contains( cl ) ){
								pvaClassGenSetBrothers.remove( cl );
							}
						}
					}
				}
			}
			return pvaClassGenSetBrothers.size() == 1 && pvaClassGenSetBrothers.contains( pva.getNewCl().get(0) );
		} 

		ArrayList<String> codePiece = new ArrayList<String>();
		String multip = multiplicityCodeGeneration( pva , path );
		if ( multip != null && !multip.equals("") ){
			codePiece.add( multip );
		}
		codePiece.add( "if ( " + pva.getObjName() + ".oclIsTypeOf(Cls) ){ //for all cls where s=1,...,n and Cls!=" + pva.getNewCl().get(0));
		codePiece.add( TAB_CHAR + "/* your current code */" );
		codePiece.add( TAB_CHAR  + pva.toAlf() + ";" );
		codePiece.add( TAB_CHAR + COMMENT );
		codePiece.add( "}" );
		constraint.addCodeToBeSatisfied( codePiece );
		return false;
	}

	private boolean satisfyClassCardMaxSVC(ReclassifyObject pva, Constraint constraint, ExecutionPath path) {
		if ( allInstancesGuardExists( pva , constraint , path ) ){
			constraint.setSatisfiedBy( 1 );
			return true;
		} else if ( destroyObjectExists( pva , path , pva.getNewCl().get(0) , constraint ) ) {
			constraint.setSatisfiedBy( 2 );
			return true;
		} else if ( OperationScanner.getModelLoader().isChild( pva.getNewCl().get( 0 ) ) && 
				classifiesFromClassExists( pva , path , constraint) ) {
			constraint.setSatisfiedBy( 3 );
			return true;
		}
		return false;
	}

	private boolean classifiesFromClassExists(ReclassifyObject pva, ExecutionPath path, Constraint constraint) {
		String cl = pva.getNewCl().get(0);
		ReclassifyObject fromCl = new ReclassifyObject( null , new ArrayList<String>( Arrays.asList( cl ) ) , null );
		Pattern oclIsTypeOfPattern = Pattern.compile( "([a-zA-Z0-9]+).oclIsTypeOf\\(([a-zA-Z0-9]+)\\)" );
		Pattern allInstancesPattern = Pattern.compile( "([a-zA-Z0-9]+).allInstances\\(\\)->includes\\(([a-zA-Z0-9]+)\\)" );
		
		Iterator<Term> pathTermsIter = path.getTerms().iterator();
		while ( pathTermsIter.hasNext() ){
			Term term = pathTermsIter.next();
			if ( !term.getAction().isUsedForDiscarding() && term.getAction() instanceof ReclassifyObject && term.getAction().equals( fromCl ) ){
				Iterator<Guard> actionGuardsIter = term.getGuards().iterator();
				while ( actionGuardsIter.hasNext() ){
					String currGuard = actionGuardsIter.next().getCondition();
					Matcher oclIsTypeOfMatcher = oclIsTypeOfPattern.matcher( currGuard );
					Matcher allInstancesMatcher = allInstancesPattern.matcher( currGuard );
					if ( 	( oclIsTypeOfMatcher.matches() && 
								((ReclassifyObject)term.getAction()).getObjName().equals( oclIsTypeOfMatcher.group(1) ) &&
								((ReclassifyObject)term.getAction()).getOldCl().contains( oclIsTypeOfMatcher.group(2) ) ) ||
							( allInstancesMatcher.matches() && 
								((ReclassifyObject)term.getAction()).getObjName().equals( allInstancesMatcher.group(2) ) &&
								((ReclassifyObject)term.getAction()).getOldCl().contains( allInstancesMatcher.group(1) )) ){
						term.getAction().setUsedForDiscarding( true );
						return true;
					}
				}
			}
		}
		
		ArrayList<String> codePiece = new ArrayList<String>();
		String multip = multiplicityCodeGeneration( pva , path );
		if ( multip != null && !multip.equals("") ){
			codePiece.add( multip );
		}
		codePiece.add( "if ( x.oclIsTypeOf(" + cl + ") ){");
		codePiece.add( TAB_CHAR + "classify x from " + cl + ";" );
		codePiece.add( "}" );
		constraint.addCodeToBeSatisfied( codePiece );
		return false;
	}

	private boolean destroyObjectExists( ReclassifyObject pva, ExecutionPath path, String objClass, Constraint constraint) {
		DestroyObject dso = new DestroyObject( new Object( null , objClass ) );
		for ( int i = 0; i < path.size(); i++ ){
			Action action = path.getTerms().get(i).getAction();
			if ( !action.isUsedForDiscarding() && action instanceof DestroyObject && action.equals( dso ) ){
				action.setUsedForDiscarding( true );
				return true;
			}
		}
		
		ArrayList<String> codePiece = new ArrayList<String>();
		String multip = multiplicityCodeGeneration( pva , path );
		if ( multip != null && !multip.equals("") ){
			codePiece.add( multip );
		}
		codePiece.add( "x.destroy(); //x.oclIsTypeOf(" + objClass + ")" );
		constraint.addCodeToBeSatisfied( codePiece );
		return false;
	}

	private boolean allInstancesGuardExists(ReclassifyObject pva, Constraint constraint, ExecutionPath path) {
		ClassCardMax ccMax = (ClassCardMax) constraint;
		String cl = pva.getNewCl().get(0);
		int n = numObjectCreations( pva.getPathIndex() , path , cl);
		int m = numObjectDestroys( pva.getPathIndex() , path , cl);
		int intRightSide = Integer.valueOf( ccMax.getValue() ).intValue() - n + m;
		Pattern allInstancesPattern = Pattern.compile( "([a-zA-Z0-9]+).allInstances\\(\\)->size\\(\\)\\s?(<|<=|>=|>|==|<>)\\s?([a-zA-Z0-9()]+)" );
		Iterator<Guard> pvaGuardsIter = path.getTerms().get( pva.getPathIndex() ).getGuards().iterator();
		while ( pvaGuardsIter.hasNext() ){
			String guard = pvaGuardsIter.next().getCondition();
			Matcher guardMatcher = allInstancesPattern.matcher( guard );
			try{
				if ( guardMatcher.matches() && guardMatcher.group(1).equals( cl ) ){
					String op = guardMatcher.group(2);
					int intValue = Integer.valueOf( guardMatcher.group(3) );
					if ( 	( op.equals( "<" ) && intValue <= intRightSide ) ||
							( op.equals( "<=" ) && intValue < intRightSide ) ||
							( op.equals( "==" ) && intValue < intRightSide ) ){
						return true;
					}
				}
			} catch ( NumberFormatException nfe ){
				String queryOp = new String();
				if ( guardMatcher.group(2).equals( "<" ) ){
					queryOp = "<=";
				} else {
					queryOp = "<";
				}
				constraint.addUserQuery( guardMatcher.group(3) + queryOp + " " + intRightSide );
			}
		}
		
		ArrayList<String> codePiece = new ArrayList<String>();
		String multip = multiplicityCodeGeneration( pva , path );
		if ( multip != null && !multip.equals("") ){
			codePiece.add( multip );
		}
		codePiece.add( "if ( " + cl + ".allInstances()->size() < " + intRightSide + " ){" );
		codePiece.add( TAB_CHAR + "/* your current code */" );
		codePiece.add( TAB_CHAR  + pva.toAlf() + ";" );
		codePiece.add( TAB_CHAR + COMMENT );
		codePiece.add( "}" );
		constraint.addCodeToBeSatisfied( codePiece );
		return false;
	}

	private boolean satisfyAssocCardMinSVC(ReclassifyObject pva, Constraint constraint, ExecutionPath path, ModelLoader ml) {
		AssociationCardMin acMin = (AssociationCardMin) constraint;
		String objName = pva.getObjName();
		int assocRoleLower = ml.getAssocRoleLower( acMin.getAssociation() , acMin.getRole() );
		String opposRole = ml.oppositeAssociationRole( ml.getAssociations().get( acMin.getAssociation() ) , acMin.getRole() );
		int cumulatedTermMultip = 0;
		for ( int i = pva.getPathIndex() + 1; i < path.size(); i++ ){
			Term term = path.getTerms().get( i );
			Action action = term.getAction();
			if ( action instanceof CreateLink ){
				ActionLink crLink = (ActionLink) action;
				int termMultip = Integer.MIN_VALUE;
				try{
					termMultip = term.getNumericMultiplicity();
				} catch ( NumberFormatException nfe ){
					constraint.addUserQuery( term.getMultiplicity() + " >= " + Integer.toString( assocRoleLower ) );
				}
				if ( crLink.getAssociation().getName().equals( acMin.getAssociation() ) &&
						( 	( crLink.getRoleA().equals( opposRole ) && crLink.getObjName1().equals( objName ) &&
							crLink.getRoleB().equals( acMin.getRole() ) ) ||
							( crLink.getRoleB().equals( opposRole ) && crLink.getObjName2().equals( objName ) &&
							crLink.getRoleA().equals( acMin.getRole() ) ) ) ){
					cumulatedTermMultip += termMultip;
					if ( cumulatedTermMultip >= assocRoleLower  ){
						return true;
					}	
				}
			}
		}
		
		ArrayList<String> codePiece = new ArrayList<String>();
		String multip = multiplicityCodeGeneration( pva , path );
		if ( multip != null && !multip.equals("") ){
			codePiece.add( multip );
		}
		codePiece.add( "/* your current code */" );
		codePiece.add( pva.toAlf() + ";" );
		codePiece.add( COMMENT );
		codePiece.add( acMin.getAssociation() + ".createLink(" + opposRole + "=>" + objName + "," + acMin.getRole() + "=>X); " +
				"// at least " + assocRoleLower + " invocation/s, where X is an existing " +
				OperationScanner.getModelLoader().oppositeClassFromAssocRole( acMin.getAssociation() , opposRole ) );
		constraint.addCodeToBeSatisfied( codePiece );
		return false;
	}

	private boolean satisfyMandSVC(ReclassifyObject pva, Constraint constraint, ExecutionPath path) {
		String objName = pva.getObjName();
		MandatoryAttribute mAttr = (MandatoryAttribute) constraint;
		for ( int i = pva.getPathIndex() + 1; i < path.size(); i++ ){
			Action action = path.getTerms().get( i ).getAction();
			if ( action instanceof AddStructuralFeature ){
				AddStructuralFeature asf = (AddStructuralFeature) action;
				if ( asf.getAttrName().equals( mAttr.getAttr() ) && asf.getObjName().equals( objName ) ){
					return true;
				}
			}
		}
		
		ArrayList<String> codePiece = new ArrayList<String>();
		String multip = multiplicityCodeGeneration( pva , path );
		if ( multip != null && !multip.equals("") ){
			codePiece.add( multip );
		}
		codePiece.add( "/* your current code */" );
		codePiece.add( pva.toAlf() + ";" );
		codePiece.add( COMMENT );
		codePiece.add( objName + "." + mAttr.getAttr() + " = X;" );
		constraint.addCodeToBeSatisfied( codePiece );
		return false;
	}
}
