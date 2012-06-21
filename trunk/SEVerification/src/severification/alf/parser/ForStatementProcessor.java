package severification.alf.parser;

import org.xtext.alf.alf.ForStatement;
import org.xtext.alf.alf.LoopVariableDefinition;

import severification.alf.model.ExecutionPathsDirectedGraph;
import severification.alf.model.Instruction;
import severification.alf.model.InstructionType;

public class ForStatementProcessor extends StatementProcessor {
	
	public ForStatementProcessor( ForStatement whileStatement ){
		this.statement = whileStatement;
	}

	@Override
	public ExecutionPathsDirectedGraph processStatement() {
		ForStatement forStatement = (ForStatement) this.statement;
		ExecutionPathsDirectedGraph epdg = new ExecutionPathsDirectedGraph();
		LoopVariableDefinition lvd = forStatement.getControl().getLoopVariableDefinition();
		// processing first expression path graph
		epdg.concatFromRoot( new ExpressionPathFinder( lvd.getExpression1() , null ).process() );
		epdg.joinLeafNodes();
		// processing second expression path graph
		epdg.concatFromLeafs( new ExpressionPathFinder( lvd.getExpression2() , null ).process() );
		epdg.joinLeafNodes();
		// processing for block
		this.exprStringifier.exprToStr( lvd.getExpression1() );
		this.exprStringifier.exprToStr( lvd.getExpression2() );
		String multiplicity = new String();
		try{
			int intExprTwo = new Integer( this.exprStringifier.exprToStr( lvd.getExpression2() ) );
			int intExprOne = new Integer( this.exprStringifier.exprToStr( lvd.getExpression1() ) );
			int intMultip = intExprTwo - intExprOne + 1;
			if ( intMultip > 0 ){
				multiplicity = new Integer( intMultip ).toString();
			}
		} catch ( NumberFormatException nfe ){
			try{
				int intExprOne = new Integer( this.exprStringifier.exprToStr( lvd.getExpression1() ) );
				String multipSuffix = new String();
				if ( intExprOne - 1 > 0 ){
					multipSuffix = " - " + new Integer( intExprOne - 1 ).toString();
				}
				multiplicity = multiplicity.concat( this.exprStringifier.exprToStr( lvd.getExpression2() ) + multipSuffix );
			} catch ( NumberFormatException nfe2 ){
				multiplicity = this.exprStringifier.exprToStr( lvd.getExpression2() ) + "-" + this.exprStringifier.exprToStr( lvd.getExpression1() ) + 
				"+1";
			}
		}
		epdg.concatFromLeafs( new BlockProcessor( forStatement.getBlock() , "(" + multiplicity + ")" ).processStatement() );
		// "skipping for" node
		epdg.addNodeFromRoot( new Instruction( InstructionType.EMPTY ) );
		return epdg;
	}
}