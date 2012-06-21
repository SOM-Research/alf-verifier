package pvaSatisfier;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import pvaAnalyzer.ModelLoader;
import pvaAnalyzer.model.ClassCardMin;
import pvaAnalyzer.model.Constraint;
import pvaAnalyzer.model.Referential;
import severification.actionSemantics.Action;
import severification.actionSemantics.Association;
import severification.actionSemantics.ClearAssociation;
import severification.actionSemantics.CreateObject;
import severification.actionSemantics.DestroyObject;
import severification.actionSemantics.ExecutionPath;
import severification.actionSemantics.Guard;
import severification.actionSemantics.Object;
import severification.actionSemantics.ReclassifyObject;
import severification.actionSemantics.Term;
import severification.alf.parser.OperationScanner;

public class PVASatisfierDestroyObject extends PVASatisfier{

	public boolean isSatisfied(DestroyObject pva, Constraint constraint, ExecutionPath path, ModelLoader ml) {
		if ( constraint instanceof ClassCardMin ){
			return satisfyClassCardMinSVC( pva , constraint, path );
		} else if ( constraint instanceof Referential ) {
			return satisfyReferentialSVC( pva , constraint, path , ml );
		}
		return false;
	}

	private boolean satisfyReferentialSVC(DestroyObject pva, Constraint constraint, ExecutionPath path , ModelLoader ml ) {
		String obj = pva.getObject().getName();
		String cl = pva.getObject().getClazz();
		String assocName = ((Referential)constraint).getAssocName();
		ClearAssociation ca = new ClearAssociation( new Association( assocName ) , obj , cl );
		String oppRole = ml.oppositeRoleFromAssocClass( assocName , cl );	
		Pattern emptyMemberEnd = Pattern.compile("([a-zA-Z0-9]+).([a-zA-Z0-9]+)->isEmpty\\(\\)");
		Iterator<Guard> iterGuards = path.getTerms().get( pva.getPathIndex() ).getGuards().iterator();
		while ( iterGuards.hasNext() ){
			Guard guard = iterGuards.next();
			Matcher m = emptyMemberEnd.matcher( guard.getCondition() );
			if ( m.matches() && m.group(1).equals( obj ) && m.group(2).equals( oppRole ) ){
				constraint.setSatisfiedBy( 1 );
				return true;
			}
		}
//		Pattern notEmptyMemberEnd = Pattern.compile("([a-zA-Z0-9]+).([a-zA-Z0-9]+)->notEmpty\\(\\)");
		for ( int i = 0; i < pva.getPathIndex(); i++ ){
			Term term = path.getTerms().get(i);
			if ( term.getAction() instanceof ClearAssociation && term.getAction().equals( ca ) ){
				return true;
//				Iterator<Guard> actionGuardsIter = term.getGuards().iterator();
//				while ( actionGuardsIter.hasNext() ){
//					Guard guard = actionGuardsIter.next();
//					Matcher m = notEmptyMemberEnd.matcher( guard.getCondition() );
//					if ( m.matches() && m.group(1).equals( obj ) && m.group(2).equals( oppRole ) ){
//						constraint.setSatisfiedBy( 2 );
//						return true;
//					}
//				}
			}
		}
		
		ArrayList<String> codePiece = new ArrayList<String>();
		String multip = multiplicityCodeGeneration( pva , path );
		if ( multip != null && !multip.equals("") ){
			codePiece.add( multip );
		}
		codePiece.add( "if ( " + obj + "." + oppRole + "->notEmpty() ){" );
		codePiece.add( TAB_CHAR + assocName + ".clearAssoc(" + obj + ");" );
		codePiece.add( "}" );
		codePiece.add( "/* your current code */" );
		codePiece.add( pva.toAlf() + ";" );
		codePiece.add( COMMENT );
		constraint.addCodeToBeSatisfied( codePiece );
		
		ArrayList<String> codePiece2 = new ArrayList<String>();
		multip = multiplicityCodeGeneration( pva , path );
		if ( multip != null && !multip.equals("") ){
			codePiece2.add( multip );
		}
		codePiece2.add( "if ( " + obj + "." + oppRole + "->isEmpty() ){" );
		codePiece2.add( TAB_CHAR + "/* your current code */" );
		codePiece2.add( TAB_CHAR  + pva.toAlf() + ";" );
		codePiece2.add( TAB_CHAR + COMMENT );
		codePiece2.add( "}" );
		constraint.addCodeToBeSatisfied( codePiece2 );
		return false;
	}

	private boolean satisfyClassCardMinSVC(DestroyObject pva, Constraint constraint, ExecutionPath path) {
		return 	allInstancesGuardExists( pva , constraint , path) ||
				createObjectExists( pva , path , pva.getObject().getClazz() , constraint ) ||
				( OperationScanner.getModelLoader().isChild( pva.getObject().getClazz() ) && 
						classifiesToClassExists( pva , path , constraint) );
	}
	
	private boolean classifiesToClassExists(DestroyObject pva, ExecutionPath path, Constraint constraint) {
		String cl = pva.getObject().getClazz();
		ReclassifyObject toCl = new ReclassifyObject( null , null , new ArrayList<String>( Arrays.asList( cl ) ) );
		
		Iterator<Term> pathTermsIter = path.getTerms().iterator();
		while ( pathTermsIter.hasNext() ){
			Term term = pathTermsIter.next();
			if ( !term.getAction().isUsedForDiscarding() && term.getAction() instanceof ReclassifyObject && term.getAction().equals( toCl ) ){
				term.getAction().setUsedForDiscarding( true );
				return true;
			}
		}
		
		ArrayList<String> codePiece = new ArrayList<String>();
		String multip = multiplicityCodeGeneration( pva , path );
		if ( multip != null && !multip.equals("") ){
			codePiece.add( multip );
		}
		codePiece.add( "classify x to " + cl + ";" );
		constraint.addCodeToBeSatisfied( codePiece );
		return false;
	}

	private boolean createObjectExists( DestroyObject pva, ExecutionPath path, String clazz, Constraint constraint) {
		CreateObject cro = new CreateObject( new Object( null , clazz ) );
		for ( int i = 0; i < path.size(); i++ ){
			Action action = path.getTerms().get(i).getAction();
			if ( !action.isUsedForDiscarding() && action instanceof CreateObject && action.equals( cro ) ){
				action.setUsedForDiscarding( true );
				return true;
			}
		}
		
		ArrayList<String> codePiece = new ArrayList<String>();
		String multip = multiplicityCodeGeneration( pva , path );
		if ( multip != null && !multip.equals("") ){
			codePiece.add( multip );
		}
		codePiece.add( "x = new " + clazz + "();" );
		constraint.addCodeToBeSatisfied( codePiece );
		return false;
	}

	private boolean allInstancesGuardExists(DestroyObject pva, Constraint constraint, ExecutionPath path) {
		ClassCardMin ccMin = (ClassCardMin) constraint;
		String cl = pva.getObject().getClazz();
		int n = numObjectCreations( pva.getPathIndex() , path , cl);
		int m = numObjectDestroys( pva.getPathIndex() , path , cl);
		int intRightSide = Integer.valueOf( ccMin.getValue() ).intValue() + n - m;
		Pattern allInstancesPattern = Pattern.compile( "([a-zA-Z0-9]+).allInstances\\(\\)->size\\(\\)\\s?(<|<=|>=|>|==|<>)\\s?([a-zA-Z0-9()]+)" );
		Iterator<Guard> pvaGuardsIter = path.getTerms().get( pva.getPathIndex() ).getGuards().iterator();
		while ( pvaGuardsIter.hasNext() ){
			String guard = pvaGuardsIter.next().getCondition();
			Matcher guardMatcher = allInstancesPattern.matcher( guard );
			try{
				if ( guardMatcher.matches() && guardMatcher.group(1).equals( cl ) ){
					String op = guardMatcher.group(2);
					String value = guardMatcher.group(3);
					int intValue = Integer.valueOf( value );
					if ( 	( op.equals( ">" ) && intValue >= intRightSide ) ||
							( op.equals( ">=" ) && intValue > intRightSide ) ||
							( op.equals( "==" ) && intValue > intRightSide ) ){
						return true;
					}
				}
			} catch ( NumberFormatException nfe ){
				String queryOp = new String();
				if ( guardMatcher.group(2).equals( ">" ) ){
					queryOp = ">=";
				} else {
					queryOp = ">";
				}
				constraint.addUserQuery( guardMatcher.group(3) + " " + queryOp + " " + intRightSide );
			}
		}
		
		ArrayList<String> codePiece = new ArrayList<String>();
		String multip = multiplicityCodeGeneration( pva , path );
		if ( multip != null && !multip.equals("") ){
			codePiece.add( multip );
		}
		codePiece.add( "if ( " +  cl + ".allInstances()->size() > " + intRightSide + " ){" );
		codePiece.add( TAB_CHAR + "/* your current code */" );
		codePiece.add( TAB_CHAR  + pva.toAlf() + ";" );
		codePiece.add( TAB_CHAR + COMMENT );
		codePiece.add( "}" );
		constraint.addCodeToBeSatisfied( codePiece );
		return false;
	}
}