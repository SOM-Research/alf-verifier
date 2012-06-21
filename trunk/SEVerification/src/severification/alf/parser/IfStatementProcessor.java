package severification.alf.parser;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;
import org.xtext.alf.alf.ConcurrentClauses;
import org.xtext.alf.alf.IfStatement;
import org.xtext.alf.alf.NonFinalClause;

import severification.alf.model.ExecutionPathsDirectedGraph;
import severification.alf.model.Instruction;
import severification.alf.model.InstructionType;

public class IfStatementProcessor extends StatementProcessor {
	
	public IfStatementProcessor( IfStatement ifStatement ){
		this.statement = ifStatement;
	}

	@Override
	public ExecutionPathsDirectedGraph processStatement() {
		IfStatement ifStatement = (IfStatement) this.statement;
		// creating local execution path directed graph
		ExecutionPathsDirectedGraph epdg = new ExecutionPathsDirectedGraph();
		Instruction currentRoot = epdg.getRootNode();
		// list that will contain the previous conditions that (when negated) the current processed block satisfies
		ArrayList<String> previousSatisfiedConds = new ArrayList<String>();
		// iterating over concurrent clauses
		EList<ConcurrentClauses> concClauses = ifStatement.getSequentialClausses().getConccurentClauses();
		for ( int iConc = 0; iConc < concClauses.size(); iConc++ ){ 
			// variable to store de current concurrent clause condition (check inner loop)
			String currConcClauseCond = new String();
			// list that will contain the non final clauses (belonging to current concurrent clause) conditions
			ArrayList<String> nonFinalClausesConds = new ArrayList<String>();
			// iterating over non final clauses belonging to current concurrent clause
			EList<NonFinalClause> nonFinalClauses = concClauses.get( iConc ).getNonFinalClause();
			for ( int iNonFin = 0; iNonFin < nonFinalClauses.size(); iNonFin++ ){
				// storing the current non final clause condition
				String currNonFinClauseCond = this.exprStringifier.exprToStr( nonFinalClauses.get( iNonFin ).getCondition() );
				if ( iNonFin == 0 ){ // first non final clause is always the current concurrent clause, storing its condition
					currConcClauseCond = currNonFinClauseCond;
				} else { // other final clauses are, indeed, final clauses; its conditions are also stored
					nonFinalClausesConds.add( currNonFinClauseCond );
				}
				// adding the current non final clause condition to the negated previous satisfied condition
				// resulting list will be the current non final clause guards
				ArrayList<String> currNonFinalClauseStrGuards = currNonFinalClauseStrGuards( negateConditions( previousSatisfiedConds ), 
						currNonFinClauseCond );
				// processing condition: there can be new instructions or paths
				ExecutionPathsDirectedGraph conditionPaths = new ExpressionPathFinder( nonFinalClauses.get( iNonFin ).getCondition() , "" ).
						process();
				conditionPaths.addGuardsToNodes( negateConditions( previousSatisfiedConds ) );
				conditionPaths.joinLeafNodes();
				epdg.concatFromNode( currentRoot , conditionPaths );
				currentRoot = conditionPaths.getLeafNodes().get( 0 ); // due to joinLeafNodes there will be only one leaf
				// processing the current clause block ( resulting graph is added to local graph connected to root
				epdg.concatFromNode( currentRoot , new BlockProcessor( nonFinalClauses.get( iNonFin ).getBlock() , 
						currNonFinalClauseStrGuards , "" ).processStatement() );
			}
			// at this point all the non final clauses of the current concurrent clause have been processed
			// all conditions (both the current concurrent clause one and the non-final clauses ones) are stored for next concurrent clause
			previousSatisfiedConds.add( currConcClauseCond );
			previousSatisfiedConds.addAll( nonFinalClausesConds );
		}
		// a final clause exists
		if ( ifStatement.getFinalClause()!=null ){ 
			// processing the final ("else") clause block
			epdg.concatFromNode( currentRoot , new BlockProcessor( ifStatement.getFinalClause().getBlock() , 
					negateConditions( previousSatisfiedConds ) , "" ).processStatement() );
		} else {
			epdg.addNode( currentRoot , new Instruction( InstructionType.EMPTY ) );
		}
		return epdg;
	}
	
	private  ArrayList<String> negateConditions( ArrayList<String> conditions ){
		ArrayList<String> ret = new ArrayList<String>();
		for ( int i = 0 ; i < conditions.size() ; i++ ){
			ret.add( negateCondition( conditions.get( i ) ) );
		}
		return ret;
	}
	
	private  String negateCondition( String condition ){
		return "!(" + condition + ")";
	}
	
	private  ArrayList<String> currNonFinalClauseStrGuards(ArrayList<String> previousSatisfiedConds, String currNonFinClauseCond) {
		ArrayList<String> currClauseConds = new ArrayList<String>( previousSatisfiedConds );
		currClauseConds.add( currNonFinClauseCond );
		return currClauseConds;
	}
}