package pvaSatisfier;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import pvaAnalyzer.ModelLoader;
import pvaAnalyzer.model.Constraint;
import pvaAnalyzer.model.Id;
import pvaAnalyzer.model.ValueComp;

import severification.actionSemantics.Action;
import severification.actionSemantics.AddStructuralFeature;
import severification.actionSemantics.DestroyObject;
import severification.actionSemantics.ExecutionPath;
import severification.actionSemantics.Guard;
import severification.actionSemantics.ReclassifyObject;
import severification.actionSemantics.Term;
import severification.alf.parser.OperationScanner;

public class PVASatisfierAddStructuralFeature extends PVASatisfier{
	
	public boolean isSatisfied(AddStructuralFeature pva, Constraint constraint, ExecutionPath path, ModelLoader ml) {
		if ( constraint instanceof ValueComp ){
			return satisfyValueCompSVC( pva , constraint, path );
		} else if ( constraint instanceof Id ){
			Id idConstr = (Id)constraint;
			return satisfyIdSVC( pva , constraint, path , idConstr );
		}
		return false;
	}

	private boolean satisfyIdSVC(AddStructuralFeature pva, Constraint constraint, ExecutionPath path, Id idConstr ) {
		return 	allInstancesGuardExists( pva , path , idConstr ) ||
				addStructuralFeatureExists( pva , constraint , path ) ||
				destroyObjectExists( pva , constraint , path ) ||
				( OperationScanner.getModelLoader().isChild( pva.getObjClass() ) &&  
						reclassifObjectExists( pva , path , idConstr ) );
	}

	private boolean reclassifObjectExists(AddStructuralFeature pva, ExecutionPath path, Id idConstr) {
			for ( int i = 0; i < path.size(); i++ ){
				Term term = path.getTerms().get(i);
				if ( 	!term.getAction().isUsedForDiscarding() &&
						term.getAction() instanceof ReclassifyObject &&
						!((ReclassifyObject) term.getAction()).getObjName().equals( pva.getObjName() ) &&
						((ReclassifyObject) term.getAction()).getOldCl().contains( idConstr.getClazz() ) &&
						valueEqConstrExists( pva , term ) ){
					term.getAction().setUsedForDiscarding( true );
					return true;
				}
			}
			
			ArrayList<String> codePiece = new ArrayList<String>();
			String multip = multiplicityCodeGeneration( pva , path );
			if ( multip != null && !multip.equals("") ){
				codePiece.add( multip );
			}
			codePiece.add( "if ( o2." + pva.getAttrName() + " == " + pva.getValue() + " ){" );
			codePiece.add( TAB_CHAR + "classify o2 from " + idConstr.getClazz() + ";" );
			codePiece.add( "}" );
			idConstr.addCodeToBeSatisfied( codePiece );
			return false;
	}

	private boolean destroyObjectExists(AddStructuralFeature pva, Constraint constraint, ExecutionPath path ) {
		for ( int i = 0; i < path.size(); i++ ){
			Term term = path.getTerms().get(i);
			if ( 	!term.getAction().isUsedForDiscarding() &&
					term.getAction() instanceof DestroyObject &&
					!((DestroyObject) term.getAction()).getObject().getName().equals( pva.getObjName() ) &&
					pva.getObjClass().equals( ((DestroyObject) term.getAction()).getObject().getClazz() ) &&
					valueEqConstrExists( pva , term ) ){
				term.getAction().setUsedForDiscarding( true );
				return true;
			}
		}
		
		ArrayList<String> codePiece = new ArrayList<String>();
		String multip = multiplicityCodeGeneration( pva , path );
		if ( multip != null && !multip.equals("") ){
			codePiece.add( multip );
		}
		codePiece.add( "if ( o2." + pva.getAttrName() + " == " + pva.getValue() + " ){" );
		codePiece.add( TAB_CHAR + "o2.destroy();" );
		codePiece.add( "}");
		constraint.addCodeToBeSatisfied( codePiece );
		return false;
	}

	private boolean addStructuralFeatureExists(AddStructuralFeature pva, Constraint constraint, ExecutionPath path) {
		for ( int i = 0; i < path.size(); i++ ){
			Term term = path.getTerms().get(i);
			if ( 	!term.getAction().isUsedForDiscarding() &&
					term.getAction() instanceof AddStructuralFeature &&
					!((AddStructuralFeature) term.getAction()).getObjName().equals( pva.getObjName() ) &&
					((AddStructuralFeature) term.getAction()).getObjClass().equals( pva.getObjClass() ) &&
					((AddStructuralFeature) term.getAction()).getAttrName().equals( pva.getAttrName() ) &&
					!((AddStructuralFeature) term.getAction()).getValue().equals( pva.getValue() ) &&
					valueEqConstrExists( pva , term ) ){
				term.getAction().setUsedForDiscarding( true );
				return true;
			}
		}
		ArrayList<String> codePiece = new ArrayList<String>();
		String multip = multiplicityCodeGeneration( pva , path );
		if ( multip != null && !multip.equals("") ){
			codePiece.add( multip );
		}
		codePiece.add( "if ( o2." + pva.getAttrName() + " == " + pva.getValue() + " ){" );
		codePiece.add( TAB_CHAR + "o2." + pva.getAttrName() + " = value2; //value2!=" + pva.getValue() );
		codePiece.add( "}" );
		constraint.addCodeToBeSatisfied( codePiece );
		return false;
	}
	
	private boolean valueEqConstrExists(AddStructuralFeature pva, Term term) {
		Pattern valueEqual = Pattern.compile( "([a-zA-Z0-9]+).([a-zA-Z0-9]+)\\s?(=|==)\\s?([\"a-zA-Z.0-9_]+|[0-9]+)" );
		Iterator<Guard> actionGuardsIter = term.getGuards().iterator();
		while ( actionGuardsIter.hasNext() ){
			String guard = actionGuardsIter.next().getCondition();
			Matcher guardMatcher = valueEqual.matcher( guard );
			if ( 	term.getAction() instanceof AddStructuralFeature &&
					guardMatcher.matches() &&
					guardMatcher.group(1).equals( ((AddStructuralFeature) term.getAction()).getObjName() ) && 
					guardMatcher.group(2).equals( pva.getAttrName() ) &&
					guardMatcher.group(4).equals( pva.getValue() ) ){
				return true;
			} else if ( 	term.getAction() instanceof DestroyObject &&
							guardMatcher.matches() &&
							guardMatcher.group(1).equals( ((DestroyObject) term.getAction()).getObject().getName() ) && 
							guardMatcher.group(2).equals( pva.getAttrName() ) &&
							guardMatcher.group(4).equals( pva.getValue() ) ){
				return true;
			} else if ( 	term.getAction() instanceof ReclassifyObject &&
							guardMatcher.matches() &&
							guardMatcher.group(1).equals( ((ReclassifyObject) term.getAction()).getObjName() ) && 
							guardMatcher.group(2).equals( pva.getAttrName() ) &&
							guardMatcher.group(4).equals( pva.getValue() ) ){
				return true;
			}
		}
		return false;
	}

	private boolean allInstancesGuardExists(AddStructuralFeature pva, ExecutionPath path, Id idConstr) {
		Pattern allInstancesPattern = 
			Pattern.compile( "!([a-zA-Z0-9]+).allInstances\\(\\)->exists\\(([a-zA-Z0-9]+)\\|([a-zA-Z0-9]+).([a-zA-Z0-9]+)=([a-zA-Z0-9_\"]+)\\)" );
		Iterator<Guard> pvaGuardsIter = path.getTerms().get( pva.getPathIndex() ).getGuards().iterator();
		while ( pvaGuardsIter.hasNext() ){
			String guard = pvaGuardsIter.next().getCondition();
			Matcher guardMatcher = allInstancesPattern.matcher( guard );
			if ( 	guardMatcher.matches() && 
					idConstr.getClazz().equals( guardMatcher.group(1) ) &&
					guardMatcher.group(2).equals( guardMatcher.group(3) ) &&
					guardMatcher.group(4).equals( pva.getAttrName() ) &&
					guardMatcher.group(5).equals( pva.getValue() ) ){
				boolean addStrFeatExists = false;
				for ( int i = 0; i < pva.getPathIndex(); i++){
					Action action = path.getTerms().get(i).getAction();
					if ( 	action instanceof AddStructuralFeature &&
							((AddStructuralFeature) action).getAttrName().equals( pva.getAttrName() ) &&
							((AddStructuralFeature) action).getValue().equals( pva.getValue() ) && 
							!((AddStructuralFeature) action).getObjName().equals( guardMatcher.group(2) ) &&
							!((AddStructuralFeature) action).getObjName().equals( pva.getObjName() ) &&
							((AddStructuralFeature) action).getObjClass().equals( guardMatcher.group(2) ) ){
						addStrFeatExists = true;
					}
				}
				if ( !addStrFeatExists ){
					return true;
				}
			}
		}
		
		ArrayList<String> codePiece = new ArrayList<String>();
		String multip = multiplicityCodeGeneration( pva , path );
		if ( multip != null && !multip.equals("") ){
			codePiece.add( multip );
		}
		codePiece.add( "if ( !" + idConstr.getClazz() + ".allInstances()->exists(o2|o2." + pva.getAttrName() + " = " 
				+ pva.getValue() + ") ){ ");
		codePiece.add( TAB_CHAR + "/* your current code */" );
		codePiece.add( TAB_CHAR  + pva.toAlf() + ";" );
		codePiece.add( TAB_CHAR + COMMENT );
		codePiece.add( TAB_CHAR + "//Not exists action [ o3." + pva.getAttrName() + " = " + pva.getValue() + " ]" );
		codePiece.add( "}" );
		idConstr.addCodeToBeSatisfied( codePiece );
		return false;
	}

	private boolean satisfyValueCompSVC(AddStructuralFeature pva, Constraint constraint, ExecutionPath path) {
		Pattern valueCompPattern = Pattern.compile( "([\"a-zA-Z0-9_.]+)\\s?(<|<=|>=|>|=|==|<>)\\s?([\"a-zA-Z0-9.]+)" );
		ValueComp valueCompConstr = (ValueComp) constraint;
		Iterator<Guard> pvaGuardsIter = path.getTerms().get( pva.getPathIndex() ).getGuards().iterator();
		while ( pvaGuardsIter.hasNext() ){
			String guard = pvaGuardsIter.next().getCondition();
			Matcher guardMatcher = valueCompPattern.matcher( guard );
			if ( guardMatcher.matches() ){
				String op = guardMatcher.group(2).equals("==")?"=":guardMatcher.group(2);
				if ( 	pva.getValue().equals( guardMatcher.group(1).replace("\"", "") ) &&
						op.equals( valueCompConstr.getOp() ) &&
						valueCompConstr.getValue().equals( guardMatcher.group(3).replace("\"", "") ) ){
					return true;
				}	
			}
		}
		
		ArrayList<String> codePiece = new ArrayList<String>();
		String multip = multiplicityCodeGeneration( pva , path );
		if ( multip != null && !multip.equals("") ){
			codePiece.add( multip );
		}
		codePiece.add( "if ( " + pva.getValue() + " " + valueCompConstr.getOp() + " " + valueCompConstr.getValue() + " ){" );
		codePiece.add( TAB_CHAR + "/* your current code */" );
		codePiece.add( TAB_CHAR  + pva.toAlf() + ";" );
		codePiece.add( TAB_CHAR + COMMENT );
		codePiece.add( "}" );
		constraint.addCodeToBeSatisfied( codePiece );
		return false;
	}
}
