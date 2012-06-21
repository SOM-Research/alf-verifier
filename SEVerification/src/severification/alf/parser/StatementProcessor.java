package severification.alf.parser;

import org.xtext.alf.alf.Statement;

import severification.alf.model.ExecutionPathsDirectedGraph;

public abstract class StatementProcessor {

	protected Statement statement;
	protected ExpressionStringifier exprStringifier = new ExpressionStringifier();
	
	public abstract ExecutionPathsDirectedGraph processStatement(); 
}
