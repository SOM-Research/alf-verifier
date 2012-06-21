package severification.alf.parser;

import org.xtext.alf.alf.DoStatement;

import severification.alf.model.ExecutionPathsDirectedGraph;
import severification.alf.model.Instruction;
import severification.alf.model.InstructionType;

public class DoStatementProcessor extends StatementProcessor {
	
	public DoStatementProcessor( DoStatement doStatement ){
		this.statement = doStatement;
	}

	@Override
	public ExecutionPathsDirectedGraph processStatement() {
		DoStatement dostatement = (DoStatement) this.statement;
		// looking for new paths on condition statement
		ExecutionPathsDirectedGraph epdg = new ExecutionPathsDirectedGraph();
		epdg.concatFromRoot( new ExpressionPathFinder( dostatement.getCondition() , "" ).process() );
		epdg.addMultiplicityToNodes("N");
		// joining all the possible leafs
		epdg.joinLeafNodes();
		Instruction leafNode = epdg.getLeafNodes().get( 0 ); //there will be only one due to joinLeafNodes()
		// adding one edge to the resulting graph from processing while block
		String whileCondition = new ExpressionStringifier( dostatement.getCondition() ).process();
		epdg.concatFromNode( leafNode , new BlockProcessor( dostatement.getBlock() , whileCondition , "N" ).processStatement() );
		// adding one edge for skipping do-while
		epdg.addNode( leafNode , new Instruction( InstructionType.EMPTY ) );
		return epdg;
	}
}