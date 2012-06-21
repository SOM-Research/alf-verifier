package severification.alf.parser;

import org.xtext.alf.alf.AssignmentCompletion;
import org.xtext.alf.alf.AssignmentOperator;
import org.xtext.alf.alf.InvocationOrAssignementOrDeclarationStatement;

import severification.alf.model.ExecutionPathsDirectedGraph;
import severification.alf.model.Instruction;
import severification.alf.model.InstructionType;

public class InvocOrAssignOrDeclStatementProcessor extends StatementProcessor{
	
	public InvocOrAssignOrDeclStatementProcessor( InvocationOrAssignementOrDeclarationStatement statement ){
		this.statement = statement;
	}

	@Override
	public ExecutionPathsDirectedGraph processStatement() {
		ExecutionPathsDirectedGraph epdg = new ExecutionPathsDirectedGraph();
		InvocationOrAssignementOrDeclarationStatement ioaods = (InvocationOrAssignementOrDeclarationStatement) this.statement;
		epdg.concatFromLeafs( new ExpressionPathFinder().nameExprToStr( ioaods.getTypePart_OR_assignedPart_OR_invocationPart() ) );
		String strLeftSideNameExpr = exprStringifier.nameExprToStr( ioaods.getTypePart_OR_assignedPart_OR_invocationPart() );
		if ( ioaods.getVariableDeclarationCompletion() != null ){
			String varDeclCompl = ioaods.getVariableDeclarationCompletion().isMultiplicityIndicator()?"[]":"";
			String varName = ioaods.getVariableDeclarationCompletion().getVariableName();
			OperationScanner.instancesClass.put( varName , strLeftSideNameExpr );
			String argument = null;
			if ( varName!=null && !varName.equals("=") ){
				argument = varName;
			} else {
				argument = strLeftSideNameExpr + varDeclCompl;
			}
			epdg.concatFromLeafs( 	processAssignmentCompletion( ioaods.getVariableDeclarationCompletion().getInitValue() , 
									argument ) );
		} else if ( ioaods.getAssignmentCompletion() != null ) {
			epdg.concatFromLeafs( processAssignmentCompletion( ioaods.getAssignmentCompletion() , strLeftSideNameExpr ) );
		}
		return epdg;
	}

	private ExecutionPathsDirectedGraph processAssignmentCompletion( AssignmentCompletion assignmentCompletion , String argument ){
		if ( assignmentCompletion != null && assignmentCompletion.getRightHandSide() != null ){
			ExecutionPathsDirectedGraph epdg = new ExpressionPathFinder( assignmentCompletion.getRightHandSide() , argument ).process();
			if ( assignmentCompletion.getOp() == AssignmentOperator.ASSIGN ){
				String object = new String();
				String attribute = new String();
				String[] splits = argument.split("\\.");
				if ( splits.length >= 2 ){
					for ( int i=0; i < splits.length; i++ ){
						if ( i < splits.length - 1 ){
							object = object.concat( splits[i] ) + ".";
						} else {
							attribute = attribute.concat( splits[i] );
						}
					}
					String rightHandStr = this.exprStringifier.exprToStr( assignmentCompletion.getRightHandSide() );
					String exprStr = argument + assignmentCompletion.getOp() + rightHandStr;
					Instruction instruction = new Instruction( InstructionType.ADD_STRUCTURAL_FEATURE , exprStr );
					String objName = object.substring( 0 , object.length() - 1 );
					instruction.addArgument( objName );
					instruction.addArgument( attribute );
					instruction.addArgument( rightHandStr );
					if ( OperationScanner.instancesClass.containsKey( objName ) ){
						instruction.addArgument( OperationScanner.instancesClass.get( objName ) );
					} 
					epdg.addNodeFromLeafs( instruction );
				}
			}
			return epdg;
		} else {
			return new ExecutionPathsDirectedGraph();
		}
	}
}