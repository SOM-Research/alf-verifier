package severification.alf.parser;

import org.xtext.alf.alf.WhileStatement;

import severification.alf.model.ExecutionPathsDirectedGraph;
import severification.alf.model.Instruction;
import severification.alf.model.InstructionType;

public class WhileStatementProcessor extends StatementProcessor{

	public WhileStatementProcessor( WhileStatement whileStatement ){
		this.statement = whileStatement;
	}
	
	@Override
	public ExecutionPathsDirectedGraph processStatement() {
		WhileStatement whileStatement = (WhileStatement) this.statement;
		// looking for new paths on condition statement
		ExecutionPathsDirectedGraph epdg = new ExecutionPathsDirectedGraph();
		epdg.concatFromRoot( new ExpressionPathFinder( whileStatement.getCondition() , "" ).process() );
		epdg.addMultiplicityToNodes("N");
		// joining all the possible leafs
		epdg.joinLeafNodes();
		Instruction leafNode = epdg.getLeafNodes().get( 0 ); //there will be only one due to joinLeafNodes()
		// adding one edge to the resulting graph from processing while block
		String whileCondition = new ExpressionStringifier( whileStatement.getCondition() ).process();
		epdg.concatFromNode( leafNode , new BlockProcessor( whileStatement.getBlock() , whileCondition , "N" ).processStatement() );
		// adding one edge for skipping while
		epdg.addNode( leafNode , new Instruction( InstructionType.EMPTY ) );
		return epdg;
	}
}