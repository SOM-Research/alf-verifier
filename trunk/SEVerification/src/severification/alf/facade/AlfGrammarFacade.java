package severification.alf.facade;

import java.util.ArrayList;

import severification.alf.model.ExecutionPathsDirectedGraph;
import severification.alf.model.Instruction;
import severification.alf.parser.BlockProcessor;
import severification.alf.parser.OperationScanner;
import severification.alf.parser.AlfOperationsReader;

public class AlfGrammarFacade {
	
	/**
	 * read file alfOperationsFilename and calculates all execution paths starting from operation mainOperation
	 * @param alfOpsFilename file in which alf operations are stored
	 * @param operationName operation to be considered the main one
	 * @return
	 */
	public ArrayList< ArrayList<Instruction> > getExecutionPaths( String alfOperationsFilename , String mainOperation ){
		AlfOperationsReader aor = new AlfOperationsReader( alfOperationsFilename );
		if ( aor.getAlfOperations() != null ){
			OperationScanner.getOperationScanner( aor );
			OperationScanner.setCurrentOperation( mainOperation );
			ExecutionPathsDirectedGraph epdg = new BlockProcessor( OperationScanner.getOperationBlock( mainOperation ) ).processStatement();
			epdg.toConsole();
			return epdg.getAllExecutionPaths();
		} else return new ArrayList<ArrayList<Instruction>>();
	}
}