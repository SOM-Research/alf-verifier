package severification.alf.parser;

import org.xtext.alf.alf.InstanceCreationInvocationStatement;

import severification.alf.model.ExecutionPathsDirectedGraph;

public class InstanceCreationInvocationStatementProcessor extends StatementProcessor {

	public InstanceCreationInvocationStatementProcessor( InstanceCreationInvocationStatement icis ){
		this.statement = icis;
	}
	
	@Override
	public ExecutionPathsDirectedGraph processStatement() {
		InstanceCreationInvocationStatement statement = (InstanceCreationInvocationStatement) this.statement;
		return new ExpressionPathFinder().instanceCreationExprToStr( statement.get_new() );
	}
}