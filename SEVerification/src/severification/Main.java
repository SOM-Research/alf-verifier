package severification;

import java.util.ArrayList;

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

public class Main {
	private static final String ALF_OPERATIONS = 
		"C:/Models/Operations2.alf";
	private static final String MAIN_OPERATION = "CreateObject_Cmin";
	private static final String UML_MODEL_PATH = 
		"file://c:/Models/testElenaModificat.uml";

	public static void main(String[] args) {
		verify();
	}

	private static void verify() {
		PVAHashtable< Action, ArrayList<Constraint> > pvas = PVAAnalyzerFacade.getPVAs( UML_MODEL_PATH );
		
		
		Operation p = satisfyOperation(pvas, ALF_OPERATIONS, MAIN_OPERATION);
		
		System.out.println( p.toString() );
	}

	private static Operation satisfyOperation( PVAHashtable<Action, ArrayList<Constraint>> pvas, String alfOpsFileName, String operationName ) {
		AlfGrammarFacade agf = new AlfGrammarFacade();
		ArrayList<ArrayList<Instruction>> execPaths = agf.getExecutionPaths( alfOpsFileName , operationName );
		Operation p = ActionSemanticsFacade.operationFromExecutionPaths( execPaths , operationName );
		PVAAnalyzerFacade.assignPVAsToOperation(pvas, p);
		PVASatisfierFacade pvaSatisfierFacade = new PVASatisfierFacade();
		pvaSatisfierFacade.satisfy( p , OperationScanner.getModelLoader() );
		return p;
	}
}