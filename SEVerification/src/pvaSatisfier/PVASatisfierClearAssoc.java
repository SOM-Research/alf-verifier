package pvaSatisfier;

import java.util.ArrayList;
import java.util.Arrays;

import pvaAnalyzer.ModelLoader;
import pvaAnalyzer.model.AssociationCardMin;
import pvaAnalyzer.model.Constraint;
import severification.actionSemantics.Action;
import severification.actionSemantics.ActionLink;
import severification.actionSemantics.ClearAssociation;
import severification.actionSemantics.CreateLink;
import severification.actionSemantics.DestroyObject;
import severification.actionSemantics.ExecutionPath;
import severification.actionSemantics.Object;
import severification.actionSemantics.ReclassifyObject;
import severification.actionSemantics.Term;
import severification.alf.parser.OperationScanner;

public class PVASatisfierClearAssoc extends PVASatisfier {

	public boolean isSatisfied(ClearAssociation pva, Constraint constraint, ExecutionPath path, ModelLoader ml) {
		if ( constraint instanceof AssociationCardMin ){
			return satisfyCardMinSVC( pva, constraint, path, ml);
		}
		return false;
	}
	
	private boolean satisfyCardMinSVC(ClearAssociation pva, Constraint constraint, ExecutionPath path, ModelLoader ml) {
		AssociationCardMin assocCardMin = (AssociationCardMin) constraint;
		String oppositeRole = OperationScanner.getModelLoader().oppositeAssociationRole( assocCardMin.getAssociation() , 
				assocCardMin.getRole() );
		
		if ( satisfyCreateLink( pva , assocCardMin , path , oppositeRole ) ){
			constraint.setSatisfiedBy(1);
			return true;
		} else if ( satisfyDestroyObject( pva , assocCardMin , path , oppositeRole ) ){
			constraint.setSatisfiedBy(2);
			return true;
		} else if ( satisfyReclassifyObject( pva , assocCardMin , path , oppositeRole ) ){
			constraint.setSatisfiedBy(3);
			return true;
		}
		return false;
	}
	
	private boolean satisfyCreateLink(ClearAssociation pva, AssociationCardMin constraint, ExecutionPath path, String oppositeRole) {
		AssociationCardMin acMin = (AssociationCardMin) constraint;
		String objName = pva.getObjName();
		int assocRoleLower = OperationScanner.getModelLoader().getAssocRoleLower( acMin.getAssociation() , acMin.getRole() );
		String opposRole = OperationScanner.getModelLoader().oppositeAssociationRole( 
				OperationScanner.getModelLoader().getAssociations().get( acMin.getAssociation() ) , acMin.getRole() );
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
	
	private boolean satisfyDestroyObject(ClearAssociation pva, AssociationCardMin constraint, ExecutionPath path, String oppositeRole) {
		DestroyObject dro = new DestroyObject( new Object( pva.getObjName() , pva.getObjClass() ) );
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
	
	private boolean satisfyReclassifyObject(ClearAssociation pva, AssociationCardMin constraint, ExecutionPath path, String oppositeRole) {
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
}