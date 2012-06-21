package severification.alf.parser;

import org.xtext.alf.alf.Expression;
import org.xtext.alf.alf.ThisInvocationStatement;

import severification.alf.model.ExecutionPathsDirectedGraph;
import severification.alf.model.Instruction;
import severification.alf.model.InstructionType;

public class ThisInvocationStatementProcessor extends StatementProcessor {
	public ThisInvocationStatementProcessor( ThisInvocationStatement thisInvocationStatement ){
		this.statement = thisInvocationStatement;
	}

	@Override
	public ExecutionPathsDirectedGraph processStatement() {
		ThisInvocationStatement statement = (ThisInvocationStatement) this.statement;
		ExecutionPathsDirectedGraph epdg = new ExecutionPathsDirectedGraph();
		Expression thisRightHandSide = null;
		if ( statement.getAssignmentCompletion() != null ){
			thisRightHandSide = statement.getAssignmentCompletion().getRightHandSide();
			epdg.concatFromRoot( new ExpressionPathFinder( thisRightHandSide , 
					this.exprStringifier.thisExprToStr( statement.get_this() ) ).process() ); 
		}
		if ( statement.get_this().getSuffix() != null){
			epdg.concatFromLeafs( new ExpressionPathFinder().suffixExprToStr( statement.get_this().getSuffix() ) );
		}
		if ( statement.getAssignmentCompletion() != null ){
			String thisStr = 	this.exprStringifier.thisExprToStr( statement.get_this() ) + 
								statement.getAssignmentCompletion().getOp().getLiteral() +
								this.exprStringifier.exprToStr( statement.getAssignmentCompletion().getRightHandSide() );
			Instruction thisInstruction = new Instruction( InstructionType.ADD_STRUCTURAL_FEATURE , thisStr );
			
			
			String[] thisSplits = this.exprStringifier.thisExprToStr( statement.get_this() ).split("\\.");
			String object = new String();
			String attribute = new String();
			for ( int i=0; i < thisSplits.length; i++ ){
				if ( i < thisSplits.length - 1 ){
					object = object.concat( thisSplits[i] ) + ".";
				} else {
					attribute = attribute.concat( thisSplits[i] );
				}
			}
			
			thisInstruction.addArgument( object.substring( 0 , object.length() - 1 ) );
			thisInstruction.addArgument( attribute );
			if ( thisRightHandSide != null ){
				thisInstruction.addArgument( this.exprStringifier.exprToStr( thisRightHandSide ) );
			}
			thisInstruction.addArgument( OperationScanner.getModelLoader().methodClassBelonging( OperationScanner.getCurrentOperation() ) );
			epdg.addNodeFromLeafs( thisInstruction );
		}
		return epdg;	
	}
}