package severification.ui.views;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

/*
 * The content provider class is responsible for
 * providing objects to the view. It can wrap
 * existing objects in adapters or simply return
 * objects as-is. These objects may be sensitive
 * to the current input of the view, or ignore
 * it and always show the same content 
 * (like Task List, for example).
 */

class EmptyViewContentProvider implements IStructuredContentProvider,
		ITreeContentProvider {


	public enum TREE_OBJ_TYPE { OP , PATH , PVA , SVC , COND , TEXT }

	private final SeverificationTreeView severificationTreeView;

	EmptyViewContentProvider(SeverificationTreeView severificationTreeView) {
		this.severificationTreeView = severificationTreeView;
	}
	
	EmptyViewContentProvider() {
		this.severificationTreeView = null;
	}

	private TreeParent invisibleRoot;

	public void inputChanged(Viewer v, Object oldInput, Object newInput) {
	}

	public void dispose() {
	}

	public Object[] getElements(Object parent) {
		return new Object[0];
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
	}
}