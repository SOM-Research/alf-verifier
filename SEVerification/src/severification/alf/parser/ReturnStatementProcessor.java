package severification.alf.parser;

import org.xtext.alf.alf.ReturnStatement;

import severification.alf.model.ExecutionPathsDirectedGraph;

public class ReturnStatementProcessor extends StatementProcessor {
	
	public ReturnStatementProcessor( ReturnStatement returnStatement ){
		this.statement = returnStatement;
	}

	@Override
	public ExecutionPathsDirectedGraph processStatement() {
		ReturnStatement statement = (ReturnStatement) this.statement;
		return new ExpressionPathFinder( statement.getExpression() , null ).process();
	}

}
