package severification.alf.parser;

import org.xtext.alf.alf.SuperInvocationStatement;

import severification.alf.model.ExecutionPathsDirectedGraph;

public class SuperInvocationStatementProcessor extends StatementProcessor {
	public SuperInvocationStatementProcessor( SuperInvocationStatement superInvocationStatement ){
		this.statement = superInvocationStatement;
	}

	@Override
	public ExecutionPathsDirectedGraph processStatement() {
		SuperInvocationStatement superInvocationStatement = (SuperInvocationStatement) this.statement;
		ExecutionPathsDirectedGraph epdg = new ExecutionPathsDirectedGraph();
		epdg.concatFromLeafs( new ExpressionPathFinder().superInvocationExprToStr( superInvocationStatement.get_super() ) );
		return epdg;
	}
}