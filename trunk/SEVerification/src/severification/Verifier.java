package severification;

import java.util.ArrayList;
import java.util.Iterator;

import pvaAnalyzer.PVAAnalyzerFacade;
import pvaAnalyzer.PVAHashtable;
import pvaAnalyzer.model.Constraint;
import pvaSatisfier.PVASatisfierFacade;
import severification.actionSemantics.Action;
import severification.actionSemantics.Operation;
import severification.actionSemantics.facade.ActionSemanticsFacade;
import severification.alf.facade.AlfGrammarFacade;
import severification.alf.model.Instruction;
import severification.alf.parser.OperationScanner;

public class Verifier {
	
		public ArrayList<Operation> verify( String alfOpsFileName , ArrayList<String> operations, String umlModelPath ) {
			PVAHashtable< Action, ArrayList<Constraint> > pvas = PVAAnalyzerFacade.getPVAs( umlModelPath );
			ArrayList<Operation> res = new ArrayList<Operation>();
			Iterator<String> operationsIter = operations.iterator();
			while ( operationsIter.hasNext() ){
				String operationName = operationsIter.next();
				AlfGrammarFacade agf = new AlfGrammarFacade();
				ArrayList<ArrayList<Instruction>> execPaths = agf.getExecutionPaths( alfOpsFileName , operationName );
				Operation p = ActionSemanticsFacade.operationFromExecutionPaths( execPaths , operationName );
				PVAAnalyzerFacade.assignPVAsToOperation(pvas, p);
				PVASatisfierFacade pvaSatisfierFacade = new PVASatisfierFacade();
				pvaSatisfierFacade.satisfy( p , OperationScanner.getModelLoader() );
				res.add( p );
			}
			return res;
		}
}
