package severification.alf.model;

import java.util.ArrayList;
import java.util.Iterator;

import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.SimpleDirectedGraph;

public class ExecutionPathsDirectedGraph {
	private SimpleDirectedGraph< Instruction , DefaultEdge > graph;
	
	/**
	 * Constructor: 
	 * - creates a simple directed graph whose nodes are just Object.
	 * - add an empty Instruction (whose id will be rootNodeId and will have multiplicity 1) as a root vertex of the graph
	 * @param rootNodeId root instruction identificator
	 */
	public ExecutionPathsDirectedGraph(){
		this.graph = new SimpleDirectedGraph< Instruction , DefaultEdge >( DefaultEdge.class );
		this.graph.addVertex( new Instruction( InstructionType.EMPTY ) );
	}
	
	/**
	 * Adds a node to graph and connects it to the root node
	 * @param newNode new object that will be added to graph
	 */
	public void addNodeFromRoot( Instruction newNode ){
		this.graph.addVertex( newNode );
		this.graph.addEdge( getRootNode() , newNode );
	}
	
	/**
	 * Adds a node to graph and connects it to "from" node, "from" node must exist on the graph
	 * @param from node that will be connected to new node
	 * @param newNode new node added to graph
	 */
	public void addNode( Instruction from , Instruction newNode ){
		if ( this.graph.containsVertex( from ) ){
			this.graph.addVertex( newNode );
			if ( from != null ){
				this.graph.addEdge( from , newNode );
			}
		}
	}
	
	/**
	 * Adds a node to graph and connects all leaf nodes to it
	 * @param newNode node to be added on graph
	 */
	public void addNodeFromLeafs( Instruction newNode ){
		Iterator<Instruction> iterLeafNodes = getLeafNodes().iterator();
		this.graph.addVertex( newNode );
		while ( iterLeafNodes.hasNext() ){
			this.graph.addEdge( iterLeafNodes.next() , newNode );
		}
	}
	
	/**
	 * Obtains the graph's root node
	 * @return graph's root node
	 */
	public Instruction getRootNode(){
		Iterator<Instruction> iterNodeSet = this.graph.vertexSet().iterator();
		while ( iterNodeSet.hasNext() ){
			Instruction node = iterNodeSet.next();
			if ( this.graph.inDegreeOf( node ) == 0 ){
				return node;
			}
		}
		return null; // unreachable code
	}
	
	/**
	 * Obtains an ArrayList containing graph's leaf nodes
	 * @return an ArrayList containing graph's leaf nodes
	 */
	public ArrayList<Instruction> getLeafNodes(){
		ArrayList<Instruction> leafNodes = new ArrayList<Instruction>();
		Iterator<Instruction> iterNodesSet = this.graph.vertexSet().iterator();
		while ( iterNodesSet.hasNext() ){
			Instruction vertex = iterNodesSet.next();
			if ( isLeaf( vertex ) ){
				leafNodes.add( vertex );
			}
		}
		return leafNodes;
	}
	
	/**
	 * Checks if node is a leaf or not
	 * @param node object node to be checked
	 * @return TRUE in case node exists on the graph and is a leaf, FALSE, otherwise
	 */
	private boolean isLeaf( Instruction node ) {
		return this.graph.containsVertex( node ) && this.graph.outDegreeOf( node ) == 0;
	}
	
	/**
	 * Joins ALL graph leaf nodes into a single empty instruction node that will be the unique leaf node
	 */
	public void joinLeafNodes(){
		Instruction uniqueLeaf = new Instruction( InstructionType.EMPTY );
		Iterator<Instruction> iterLeafNodes = getLeafNodes().iterator();
		this.graph.addVertex( uniqueLeaf );
		while ( iterLeafNodes.hasNext() ){
			this.graph.addEdge( iterLeafNodes.next() , uniqueLeaf );
		}
	}
	
	/**
	 * Obtains all the outgoing nodes ( sons ) from node
	 * @param node 
	 * @return an ArrayList containing outgoing nodes ( sons ) from node
	 */
	public ArrayList<Instruction> getNodeExpansion( Instruction node ){
		ArrayList<Instruction> expansion = new ArrayList<Instruction>();
		Iterator<DefaultEdge> iterNodeOutEdges = this.graph.outgoingEdgesOf( node ).iterator();
		while ( iterNodeOutEdges.hasNext() ){
			expansion.add( this.graph.getEdgeTarget( iterNodeOutEdges.next() ) );
		}
		return expansion;
	}
	
	/**
	 * Searches all the differents paths the graph contains
	 * @return An ArrayList in which every position stands for a different path (represented as an ArrayList<Instruction>)
	 */
	public ArrayList< ArrayList<Instruction> > getAllExecutionPaths(){
		ArrayList< ArrayList<Instruction> > res = new ArrayList< ArrayList<Instruction> >();
		depthFirstSearch( (Instruction)this.getRootNode() , new ArrayList<Instruction>() , res );
		return res;
	}
	
	/**
	 * Traverses graph on a depth-first approach
	 * @param instruction current instruction being expanded
	 * @param currentPath current path element until now
	 * @param allPaths all the paths processed until now
	 */
	public void depthFirstSearch( Instruction instruction , ArrayList<Instruction> currentPath , 
			ArrayList< ArrayList<Instruction> > allPaths ){
		currentPath.add(instruction);
		if ( this.isLeaf( instruction ) ) {
			allPaths.add( new ArrayList<Instruction>( currentPath ) );
		}
		Iterator<Instruction> iterNodeExpansion = getNodeExpansion( instruction ).iterator();
		while ( iterNodeExpansion.hasNext() ) {
			depthFirstSearch( (Instruction) iterNodeExpansion.next() , currentPath , allPaths);
		}
		currentPath.remove( currentPath.size() - 1 );
	}
	
	public void concatFromLeafs( ExecutionPathsDirectedGraph anotherGraph ){
		Iterator<Instruction> iterCurrLeafNodes = this.getLeafNodes().iterator();
		addNodesAndVertex(anotherGraph);
		while ( iterCurrLeafNodes.hasNext() ){
			this.graph.addEdge( iterCurrLeafNodes.next() , anotherGraph.getRootNode() );
		}
	}
	
	public void concatFromRoot( ExecutionPathsDirectedGraph anotherGraph ){
		addNodesAndVertex(anotherGraph);
		this.graph.addEdge( this.getRootNode() , anotherGraph.getRootNode() );
	}
	
	public void concatFromNode( Instruction node , ExecutionPathsDirectedGraph anotherGraph ){
		addNodesAndVertex(anotherGraph);
		this.graph.addEdge( node , anotherGraph.getRootNode() );
	}
	
	private void addNodesAndVertex(ExecutionPathsDirectedGraph anotherGraph) {
		Iterator<Instruction> iterNodes = anotherGraph.getGraph().vertexSet().iterator();
		while ( iterNodes.hasNext() ){
			this.graph.addVertex( iterNodes.next() );
		}
		Iterator<DefaultEdge> iterEdges = anotherGraph.getGraph().edgeSet().iterator();
		while ( iterEdges.hasNext() ){
			DefaultEdge edge = iterEdges.next();
			this.graph.addEdge( this.graph.getEdgeSource( edge ) , this.graph.getEdgeTarget( edge ) );
		}
	}
	
	public void addGuardsToNodes( ArrayList<String> guards ){
		Iterator<Instruction> instructions = this.graph.vertexSet().iterator();
		while ( instructions.hasNext() ){
			Instruction instruction = instructions.next();
			instruction.addGuards( guards );
		}
	}
	
	public void addMultiplicityToNodes( String multiplicity ){
		Iterator<Instruction> instructions = this.graph.vertexSet().iterator();
		while ( instructions.hasNext() ){
			Instruction instruction = instructions.next();
			instruction.setMultiplicity( instruction.getMultiplicity().concat( 
					multiplicity!=null && !multiplicity.isEmpty() ? multiplicity + "*" : "" ) );
		}
	}
	
	public void addGuardsAndMultiplicityToNodes( ArrayList<String> guards , String multiplicity ){
		Iterator<Instruction> instructions = this.graph.vertexSet().iterator();
		while ( instructions.hasNext() ){
			Instruction instruction = instructions.next();
			instruction.addGuards( guards );
			instruction.setMultiplicity( instruction.getMultiplicity().concat( 
					multiplicity!=null && !multiplicity.isEmpty() ? multiplicity + "*" : "" ) );
		}
	}

	public SimpleDirectedGraph<Instruction, DefaultEdge> getGraph() {
		return graph;
	}

	public void setGraph(SimpleDirectedGraph<Instruction, DefaultEdge> graph) {
		this.graph = graph;
	}
	
	public void toConsole(){
		ArrayList<ArrayList<Instruction>> paths = getAllExecutionPaths();
		Iterator<ArrayList<Instruction>> pathsIter = paths.iterator();
		while ( pathsIter.hasNext() ){
			Iterator<Instruction> pathIter = pathsIter.next().iterator();
			System.out.println("New Path Found!");
			while ( pathIter.hasNext() ){
				Instruction node = pathIter.next();
				if ( node.getType() != InstructionType.EMPTY ){
					System.out.println( node );
				}
			}
			System.out.println("**********************************************");
		}
	}
}
