package pvaAnalyzer;

import java.util.ArrayList;
import java.util.Iterator;
import pvaAnalyzer.model.Constraint;
import severification.actionSemantics.Action;
import severification.actionSemantics.ExecutionPath;
import severification.actionSemantics.Operation;
import severification.actionSemantics.Term;
import severification.alf.parser.OperationScanner;

public class PVAAnalyzerFacade {
	
	public static PVAHashtable<Action, ArrayList<Constraint>> getPVAs( String modelFilePath ){
		ModelLoader ml = new ModelLoader( modelFilePath );
		OperationScanner.setModelLoader( ml );
		
		return new PVAExtractor( ml ).extract();
	}
	
	public static void assignPVAsToOperation( PVAHashtable<Action, ArrayList<Constraint>> pvas , Operation p ) {
		Iterator<Action> iterPvas = pvas.keySet().iterator();
		while ( iterPvas.hasNext() ){
			Action pva = iterPvas.next();
			Iterator<ExecutionPath> iterExecPaths = p.getExecPaths().iterator();
			while ( iterExecPaths.hasNext() ){
				ExecutionPath execPath = iterExecPaths.next();
				Iterator<Term> execPathTermsIter = execPath.getTerms().iterator();
				while ( execPathTermsIter.hasNext() ){
					Term currTerm = execPathTermsIter.next();
					Action action = currTerm.getAction();
					action.setPathIndex( currTerm.getId().intValue() );
					if ( action.getClass().equals( pva.getClass() ) && action.equals( pva ) ){
						action.addConstraints( pvas.get( pva ) );
					}
				}
			}	
		}
	}
}
