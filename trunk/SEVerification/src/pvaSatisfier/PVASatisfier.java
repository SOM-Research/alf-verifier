package pvaSatisfier;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import pvaAnalyzer.model.Constraint;

import severification.actionSemantics.Action;
import severification.actionSemantics.CreateLink;
import severification.actionSemantics.CreateObject;
import severification.actionSemantics.DestroyLink;
import severification.actionSemantics.DestroyObject;
import severification.actionSemantics.ExecutionPath;
import severification.actionSemantics.Object;
import severification.actionSemantics.ReclassifyObject;
import severification.actionSemantics.Term;

public abstract class PVASatisfier {
	
	protected static final String COMMENT = "/*****************/";
	protected final String TAB_CHAR = "    ";
	
	protected int numCreateLink( int toIndex, ExecutionPath path , CreateLink crLink ){
		int o = 0;
		for ( int i = 0; i < toIndex; i++){
			Action currAction = path.getTerms().get(i).getAction();
			if ( currAction instanceof CreateLink && currAction.equals( crLink ) ){
				o++;
			}
		}
		return o;
	}
	
	protected int numDestroyLink( int toIndex, ExecutionPath path , DestroyLink drLink ){
		int p = 0;
		for ( int i = 0; i < toIndex; i++){
			Action currAction = path.getTerms().get(i).getAction();
			if ( currAction instanceof DestroyLink && currAction.equals( drLink ) ){
				p++;
			}
		}
		return p;
	}

	protected int numObjectDestroys(int toIndex, ExecutionPath path, String cl) {
		DestroyObject dso = new DestroyObject( new Object( null ,  cl ) );
		ReclassifyObject roFrom = new ReclassifyObject( null , new ArrayList<String>( Arrays.asList( cl ) ) , null );
		int m = 0;
		for ( int i = 0; i < toIndex; i++){
			Action currAction = path.getTerms().get(i).getAction();
			if ( 	( currAction instanceof DestroyObject && currAction.equals( dso ) ) ||
					( currAction instanceof ReclassifyObject && currAction.equals( roFrom ) ) ){
				m++;
			}
		}
		return m;
	}

	protected int numObjectCreations(int toIndex, ExecutionPath path, String cl) {
		CreateObject co = new CreateObject( new Object( null ,  cl ) );
		ReclassifyObject roTo = new ReclassifyObject( null , null , new ArrayList<String>( Arrays.asList( cl ) ) );
		int n = 0;
		for ( int i = 0; i < toIndex; i++){
			Action currAction = path.getTerms().get(i).getAction();
			if ( 	( currAction instanceof CreateObject && currAction.equals( co ) ) ||
					( currAction instanceof ReclassifyObject && currAction.equals( roTo ) )	){
				n++;
			}
		}
		return n;
	}

	protected String createSuffix(int n, int m , String firstSign , String secondSign ) {
		String suffix = new String();
		if ( m!=n ){
			if ( n!=0 ){
				suffix = suffix.concat( " " + firstSign + " " + n );
			}
			if ( m!=0 ){
				suffix = suffix.concat( " " + secondSign + " "  + m );
			}
		}
		return suffix;
	}
	
	protected boolean existsDestroyLink( Action pva , Constraint constraint , ExecutionPath path , DestroyLink drLink , boolean checkIfUsed ) {
		Iterator<Term> pathActionIter = path.getTerms().iterator();
		while ( pathActionIter.hasNext() ){
			Action action = pathActionIter.next().getAction();
			if ( ( !action.isUsedForDiscarding() || !checkIfUsed ) && action instanceof DestroyLink && action.equals( drLink ) ){
				if ( checkIfUsed ){ action.setUsedForDiscarding( true ); };
				return true;
			}
		}
		ArrayList<String> codePiece = new ArrayList<String>();
		String multip = multiplicityCodeGeneration( pva , path );
		if ( multip != null && !multip.equals("") ){
			codePiece.add( multip );
		}
		codePiece.add( drLink.toAlf() );
		constraint.addCodeToBeSatisfied( codePiece );
		return false;
	}

	protected boolean existsCreateLink( Action pva , Constraint constraint, ExecutionPath path , CreateLink crLink , boolean checkIfUsed) {
		Iterator<Term> pathActionIter = path.getTerms().iterator();
		while ( pathActionIter.hasNext() ){
			Action action = pathActionIter.next().getAction();
			if ( ( !action.isUsedForDiscarding() || !checkIfUsed ) && action instanceof CreateLink && action.equals( crLink ) ){
				if ( checkIfUsed ){ action.setUsedForDiscarding( true ); }
				return true;
			}
		}
		ArrayList<String> codePiece = new ArrayList<String>();
		String multip = multiplicityCodeGeneration( pva , path );
		if ( multip != null && !multip.equals("") ){
			codePiece.add( multip );
		}
		codePiece.add( crLink.toAlf() );
		constraint.addCodeToBeSatisfied( codePiece );
		return false;
	}
	
	protected String multiplicityCodeGeneration( Action pva , ExecutionPath path ){
		String codePiece = new String();
		String multip = path.getTerms().get( pva.getPathIndex() ).getMultiplicity();
		if ( multip != null && !multip.equals("") ){
			codePiece = "/**** the following code must be added with multiplicity " + multip + " ****/";
		}
		return codePiece;
	}
}