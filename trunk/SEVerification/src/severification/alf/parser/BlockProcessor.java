package severification.alf.parser;

import java.util.ArrayList;
import java.util.Iterator;

import org.xtext.alf.alf.Block;
import org.xtext.alf.alf.ClassifyStatement;
import org.xtext.alf.alf.DoStatement;
import org.xtext.alf.alf.DocumentedStatement;
import org.xtext.alf.alf.ForStatement;
import org.xtext.alf.alf.IfStatement;
import org.xtext.alf.alf.InstanceCreationInvocationStatement;
import org.xtext.alf.alf.InvocationOrAssignementOrDeclarationStatement;
import org.xtext.alf.alf.ReturnStatement;
import org.xtext.alf.alf.Statement;
import org.xtext.alf.alf.SuperInvocationStatement;
import org.xtext.alf.alf.ThisInvocationStatement;
import org.xtext.alf.alf.WhileStatement;

import severification.alf.model.ExecutionPathsDirectedGraph;

public class BlockProcessor extends StatementProcessor{
	private Block block;
	private ArrayList<String> guards;
	private String multiplicity;
	
	public BlockProcessor( Block block , ArrayList<String> guards , String multiplicity ){
		this.block = block;
		this.guards = guards;
		this.multiplicity = new String( multiplicity );
	}
	
	public BlockProcessor( Block block , String guard , String multiplicity ){
		this.block = block;
		this.guards = new ArrayList<String>();
		this.guards.add( guard );
		this.multiplicity = new String( multiplicity );
	}
	
	public BlockProcessor( Block block ){
		this.block = block;
		this.guards = new ArrayList<String>();
	}
	
	public BlockProcessor( Block block , String multiplicity ){
		this.block = block;
		this.guards = new ArrayList<String>();
		this.multiplicity = new String( multiplicity );
	}

	@Override
	public ExecutionPathsDirectedGraph processStatement() {
		ExecutionPathsDirectedGraph epdg = new ExecutionPathsDirectedGraph();
		if ( this.block != null && this.block.getSequence() != null ){
			Iterator<DocumentedStatement> iterSeqStatements = this.block.getSequence().getStatements().iterator();
			while (iterSeqStatements.hasNext()) {
				DocumentedStatement documentedStatement = iterSeqStatements .next();
				if ( documentedStatement.getComment() == null || documentedStatement.getComment().trim().isEmpty() ){
					Statement statement = documentedStatement.getStatement();
					if ( statement instanceof IfStatement ){
						epdg.concatFromLeafs( new IfStatementProcessor( ( IfStatement ) statement ).processStatement() );
					} else if ( statement instanceof WhileStatement ){
						epdg.concatFromLeafs( new WhileStatementProcessor( ( WhileStatement ) statement ).processStatement() );
					} else if ( statement instanceof ForStatement ){
						epdg.concatFromLeafs( new ForStatementProcessor( ( ForStatement ) statement ).processStatement() );
					} else if ( statement instanceof ClassifyStatement ){
						epdg.concatFromLeafs( new ClassifyStatementProcessor( ( ClassifyStatement ) statement ).processStatement() );
					} else if ( statement instanceof SuperInvocationStatement ){
						epdg.concatFromLeafs( 
								new SuperInvocationStatementProcessor( ( SuperInvocationStatement ) statement ).processStatement() );
					} else if ( statement instanceof ThisInvocationStatement ){
						epdg.concatFromLeafs( 
								new ThisInvocationStatementProcessor( ( ThisInvocationStatement ) statement ).processStatement() );
					} else if ( statement instanceof InstanceCreationInvocationStatement ){
						epdg.concatFromLeafs( new InstanceCreationInvocationStatementProcessor( 
								( InstanceCreationInvocationStatement ) statement ).processStatement() );
					} else if ( statement instanceof InvocationOrAssignementOrDeclarationStatement ){
						epdg.concatFromLeafs( 
								new InvocOrAssignOrDeclStatementProcessor( (InvocationOrAssignementOrDeclarationStatement) statement ).
								processStatement() );
					} else if ( statement instanceof ReturnStatement ){
						epdg.concatFromLeafs( new ReturnStatementProcessor( (ReturnStatement) statement ).processStatement() );
					} else if ( statement instanceof DoStatement ){
						epdg.concatFromLeafs( new DoStatementProcessor( (DoStatement) statement ).processStatement() );
					}
					
				}
			}
		}
		epdg.addGuardsAndMultiplicityToNodes( this.guards , this.multiplicity );
		return epdg;
	}

	public void setGuards(ArrayList<String> guards) {
		this.guards = guards;
	}
	public ArrayList<String> getGuards() {
		return guards;
	}
	public void setMultiplicity(String multiplicity) {
		this.multiplicity = multiplicity;
	}
	public String getMultiplicity() {
		return multiplicity;
	}
}