package severification.alf.parser;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;
import org.xtext.alf.alf.ClassificationFromClause;
import org.xtext.alf.alf.ClassificationToClause;
import org.xtext.alf.alf.ClassifyStatement;
import org.xtext.alf.alf.QualifiedNameWithBinding;

import severification.alf.model.ExecutionPathsDirectedGraph;
import severification.alf.model.Instruction;
import severification.alf.model.InstructionType;

public class ClassifyStatementProcessor extends StatementProcessor {

	public ClassifyStatementProcessor( ClassifyStatement classifyStatement ){
		this.statement = classifyStatement;
	}
	
	@Override
	public ExecutionPathsDirectedGraph processStatement() {
		ClassifyStatement statement = (ClassifyStatement) this.statement;
		ExecutionPathsDirectedGraph epdg = new ExecutionPathsDirectedGraph();
		String objectToBeRecl = this.exprStringifier.exprToStr( statement.getExpression() );
		String classifStatementStr = new String("classify " + objectToBeRecl );
		epdg.concatFromLeafs( new ExpressionPathFinder( statement.getExpression() , null ).process() );
		Instruction reclassifInstruction = new Instruction( InstructionType.RECLASSIFY_OBJECT );
		reclassifInstruction.addArgument( objectToBeRecl );
		ClassificationFromClause classifyFromClause = statement.getClause().getClassifyFromClause();
		if ( classifyFromClause != null){
			classifStatementStr = classifStatementStr.concat( " from " );
			EList<QualifiedNameWithBinding> qualNameBindList = 	classifyFromClause.getQualifiedNameList().getQualifiedName();
			ArrayList<String> fromArgs = new ArrayList<String>();
			for ( int i = 0; i < qualNameBindList.size(); i++ ){
				String qualNameBindStr = this.exprStringifier.qualNameBindToStr( qualNameBindList.get( i ) );
				fromArgs.add( qualNameBindStr );
				classifStatementStr = classifStatementStr.concat( qualNameBindStr + ", " );
			}
			classifStatementStr = classifStatementStr.substring( 0 , classifStatementStr.length() - 2 );
			reclassifInstruction.addArgument( fromArgs );
		} else if ( statement.getClause().getReclassyAllClause() != null ){
			classifStatementStr = classifStatementStr.concat( " from *" );
			reclassifInstruction.addArgument( new ArrayList<String>() );
		} else {
			reclassifInstruction.addArgument( new ArrayList<String>() );
		}
		
		ClassificationToClause classifyToClause = statement.getClause().getClassifyToClause();
		if ( classifyToClause != null ){
			classifStatementStr = classifStatementStr.concat( " to " );
			EList<QualifiedNameWithBinding> qualNameBindList = 	classifyToClause.getQualifiedNameList().getQualifiedName();
			ArrayList<String> toArgs = new ArrayList<String>();
			for ( int i = 0; i < qualNameBindList.size(); i++ ){
				String qualNameBindStr = this.exprStringifier.qualNameBindToStr( qualNameBindList.get( i ) );
				toArgs.add( qualNameBindStr );
				classifStatementStr = classifStatementStr.concat( qualNameBindStr + ", " );
			}
			classifStatementStr = classifStatementStr.substring( 0 , classifStatementStr.length() - 2 );
			reclassifInstruction.addArgument( toArgs );
			OperationScanner.instancesClass.remove( objectToBeRecl );
			OperationScanner.instancesClass.put( objectToBeRecl , toArgs.get(0));
		} else {
			reclassifInstruction.addArgument( new ArrayList<String>() );
		}
		reclassifInstruction.setLiteral( classifStatementStr );
		
		epdg.addNodeFromLeafs( reclassifInstruction );
		return epdg;
	}
}