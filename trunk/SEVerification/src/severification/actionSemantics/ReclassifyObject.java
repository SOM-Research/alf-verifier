package severification.actionSemantics;

import java.util.ArrayList;

public class ReclassifyObject extends Action{
	private String objName;
	private ArrayList<String> newCl;
	private ArrayList<String> oldCl;
	
	public ReclassifyObject( String objName , ArrayList<String> oldCl , ArrayList<String> newCl ){
		this.objName = objName;
		this.setNewCl(newCl);
		this.setOldCl(oldCl);
	}
	
	@Override
	public String toString() {
		String old = oldCl!=null && !oldCl.isEmpty() ? oldCl.get(0) : "*";
		String new_ = newCl!=null && !newCl.isEmpty()?newCl.get(0):"*";
		return "ReclassifyObject " + (this.objName!=null?this.objName:"*") + " " + old + " " + new_;
	}
	
	public String toAlf(){
		if ( oldCl==null || ( oldCl!=null && oldCl.isEmpty() ) ){
			return this.toAlfTo();
		} else if ( newCl==null || ( newCl!=null && newCl.isEmpty() ) ){
			return this.toAlfFrom();
		} else {
			return "classify " + this.objName + " from " + oldCl.get(0) + " to " + newCl.get(0);
		}
	}
	
	public String toAlfFrom(){
		String old = oldCl!=null && !oldCl.isEmpty() ? oldCl.get(0) : "*";
		return "classify " + this.objName + " from " + old;
	}
	
	public String toAlfTo(){
		String new_ = newCl!=null && !newCl.isEmpty()?newCl.get(0): "*";
		return "classify " + this.objName + " to " + new_;
	}
	
	public boolean equals( java.lang.Object obj ) {
		ReclassifyObject rclObj = (ReclassifyObject) obj;
		return 	(rclObj.getObjName() == null || (this.objName!=null && this.objName.equals( rclObj.getObjName() ))) &&
				(rclObj.getNewCl() == null || (this.newCl!=null && this.newCl.equals( rclObj.getNewCl() ))) &&
				(rclObj.getOldCl() == null || (this.oldCl!=null && this.oldCl.equals( rclObj.getOldCl() )));
	}
	
	public String getObjName() {
		return objName;
	}
	public void setObjName(String objName) {
		this.objName = objName;
	}
	public void setNewCl(ArrayList<String> newCl) {
		this.newCl = newCl;
	}
	public ArrayList<String> getNewCl() {
		return newCl;
	}
	public void setOldCl(ArrayList<String> oldCl) {
		this.oldCl = oldCl;
	}
	public ArrayList<String> getOldCl() {
		return oldCl;
	}
}