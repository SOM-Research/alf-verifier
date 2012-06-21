package severification.ui.views;

import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

import pvaAnalyzer.model.Constraint;

import severification.Verifier;
import severification.actionSemantics.CreateLink;
import severification.actionSemantics.DestroyLink;
import severification.actionSemantics.ExecutionPath;
import severification.actionSemantics.Operation;
import severification.actionSemantics.Term;

/*
 * The content provider class is responsible for
 * providing objects to the view. It can wrap
 * existing objects in adapters or simply return
 * objects as-is. These objects may be sensitive
 * to the current input of the view, or ignore
 * it and always show the same content 
 * (like Task List, for example).
 */

class ViewContentProvider implements IStructuredContentProvider, ITreeContentProvider {
	
	private String alfOperations = new String();
	private ArrayList<String> mainOperation = new ArrayList<String>();
	private String umlModelPath = new String();


	public enum TREE_OBJ_TYPE { OP , PATH , PVA , SVC , COND , TEXT , QUERY }

	private final SeverificationTreeView severificationTreeView;

	ViewContentProvider(SeverificationTreeView severificationTreeView , String alfOperations , ArrayList<String> mainOperation , 
			String umlModelPath ) {
		this.severificationTreeView = severificationTreeView;
		this.alfOperations = alfOperations;
		this.setMainOperation(mainOperation);
		this.umlModelPath = umlModelPath;
	}
	

	private TreeParent invisibleRoot;

	public void inputChanged(Viewer v, Object oldInput, Object newInput) {
	}

	public void dispose() {
	}

	public Object[] getElements(Object parent) {
		if (parent.equals(this.severificationTreeView.getViewSite())) {
			if (invisibleRoot == null)
				initialize();
			return getChildren(invisibleRoot);
		}
		return getChildren(parent);
	}

	public Object getParent(Object child) {
		if (child instanceof TreeObject) {
			return ((TreeObject) child).getParent();
		}
		return null;
	}

	public Object[] getChildren(Object parent) {
		if (parent instanceof TreeParent) {
			return ((TreeParent) parent).getChildren();
		}
		return new Object[0];
	}

	public boolean hasChildren(Object parent) {
		if (parent instanceof TreeParent)
			return ((TreeParent) parent).hasChildren();
		return false;
	}

	private void initialize() {
		Verifier verifier = new Verifier();
		ArrayList<Operation> ops = verifier.verify(  this.alfOperations  , this.mainOperation, this.umlModelPath );
		Iterator<Operation> opsIters = ops.iterator();
		invisibleRoot = new TreeParent("");
		while ( opsIters.hasNext() ){
			Operation op = opsIters.next();
			TreeParent root = new TreeParent( "Operation: " + op.getName() + " is " + (op.isSE()?"":"not ")  +"strongly executable." , TREE_OBJ_TYPE.OP , op.isSE() );
			Iterator<ExecutionPath> execPathsIter = op.getExecPaths().iterator();
			int iterExecPaths = 1;
			while ( execPathsIter.hasNext() ) {
				ExecutionPath execPath = execPathsIter.next();
				if ( !execPath.getTerms().isEmpty() ){
					TreeParent execPathTree = new TreeParent( "Execution Path " + iterExecPaths + " is " + 
							(op.isSE()?"":"not ") + "strongly executable." , TREE_OBJ_TYPE.PATH , execPath.isSE() );
					root.addChild( execPathTree );
					Iterator<Term> execPathActionsIter = execPath.getTerms().iterator();
					while ( execPathActionsIter.hasNext() ) {
						Term term = execPathActionsIter.next();
						
						String semicolon = new String(";");
						if ( term.getAction() instanceof CreateLink || term.getAction() instanceof DestroyLink ){
							semicolon = "";
						}
						TreeParent execPathActionTree = new TreeParent( term.getAction().toAlf() + semicolon , TREE_OBJ_TYPE.PVA , term.isSE() );
						execPathTree.addChild( execPathActionTree );
						Iterator<Constraint> execPathActionConstrIter = term.getAction().getConstraints().iterator();
						while ( execPathActionConstrIter.hasNext() ) {
							Constraint constraint = execPathActionConstrIter.next();
							if ( !constraint.isSatisfied() ){
								String svcStr = constraint.toString();
								TreeParent execPathActionConstrTree = new TreeParent( svcStr , TREE_OBJ_TYPE.COND , constraint.isSatisfied() );
								execPathActionTree.addChild( execPathActionConstrTree );
								
								TreeParent queriesToSatisfy = new TreeParent( "If next expressions are not true then add the code below:" , 
										TREE_OBJ_TYPE.QUERY , true );
								TreeParent codeToSatisfy = new TreeParent( "Code to be added" , TREE_OBJ_TYPE.TEXT , true );
								
								if ( !constraint.getUserQueries().isEmpty() ){
									execPathActionConstrTree.addChild( queriesToSatisfy );
									Iterator<String> execPathActionContrsQueriesIter = constraint.getUserQueries().iterator();
									while ( execPathActionContrsQueriesIter.hasNext() ){
										queriesToSatisfy.addChild( new TreeObject( execPathActionContrsQueriesIter.next() + "?" ) );
									}
								}
								
								if ( !constraint.isSatisfied() ){
									execPathActionConstrTree.addChild( codeToSatisfy );
									Iterator<ArrayList<String>> execPathActionConstrCodeIter = constraint.getCodeToBeSatisfied().iterator();
									int idAlternatives = 1;
									while ( execPathActionConstrCodeIter.hasNext() ){
										TreeParent codeAlt = new TreeParent( "Alternative " + idAlternatives , TREE_OBJ_TYPE.TEXT , true );
										codeToSatisfy.addChild( codeAlt );
										Iterator<String> codeLines = execPathActionConstrCodeIter.next().iterator();
										while ( codeLines.hasNext() ){
											codeAlt.addChild( new TreeObject( codeLines.next() ) );
										}
										idAlternatives++;
									}
								}
							}
						}
					}
					iterExecPaths++;
				}
			}
			invisibleRoot.addChild(root);
		}
	}


	public void setUmlModelPath(String umlModelPath) {
		this.umlModelPath = umlModelPath;
	}

	public String getUmlModelPath() {
		return umlModelPath;
	}

	public String getAlfOperations() {
		return alfOperations;
	}

	public void setAlfOperations(String alfOperations) {
		this.alfOperations = alfOperations;
	}

	public void setMainOperation(ArrayList<String> mainOperation) {
		this.mainOperation = mainOperation;
	}

	public ArrayList<String> getMainOperation() {
		return mainOperation;
	}
}