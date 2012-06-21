package severification.ui.views;

import java.util.ArrayList;

class TreeParent extends TreeObject {
	private ArrayList children;
	private ViewContentProvider.TREE_OBJ_TYPE type;
	private boolean isSE;
	
	public TreeParent(String name ) {
		super(name);
		children = new ArrayList();
	}
	
	public TreeParent(String name , ViewContentProvider.TREE_OBJ_TYPE type , boolean isSE ) {
		super(name);
		this.type = type;
		this.isSE = isSE;
		children = new ArrayList();
	}
	public void addChild(TreeObject child) {
		children.add(child);
		child.setParent(this);
	}
	public void removeChild(TreeObject child) {
		children.remove(child);
		child.setParent(null);
	}
	public TreeObject [] getChildren() {
		return (TreeObject [])children.toArray(new TreeObject[children.size()]);
	}
	
	public boolean hasChildren() {
		return children.size()>0;
	}
	public ViewContentProvider.TREE_OBJ_TYPE getType() {
		return type;
	}
	public void setType(ViewContentProvider.TREE_OBJ_TYPE type) {
		this.type = type;
	}
	public boolean isSE() {
		return isSE;
	}
	public void setSE(boolean isSE) {
		this.isSE = isSE;
	}
}