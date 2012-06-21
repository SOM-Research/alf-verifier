package severification.actionSemantics;

public class ClearAssociation extends ActionLink {
	private String objName;
	private String objClass;
	private Association association;
	
	public ClearAssociation( Association assoc , String objName , String objClass ){
		this.objName = objName;
		this.setObjClass(objClass);
		this.setAssociation(assoc);
	}
	
	@Override
	public String toString() {
		return "ClearAssociation " + (this.objName!=null?this.objName:"*") + " " + (this.getObjClass()!=null?this.getObjClass():"*") + " " + this.association;
	}
	
	public String toAlf(){
		return this.association.getName() + ".clearAssoc(" + this.objName + ")";
	}
	
	public boolean equals( java.lang.Object obj ) {
		ClearAssociation assoc = (ClearAssociation) obj;
		return 	( assoc.getObjName() == null || ( this.objName!=null && this.objName.equals( assoc.getObjName() )) ) &&
				(assoc.getAssociation() == null || ( this.association!=null && this.association.equals( assoc.getAssociation() )) );
	}
	
	public String getObjName() {
		return objName;
	}
	public void setObjName(String objName) {
		this.objName = objName;
	}
	public void setAssociation(Association association) {
		this.association = association;
	}
	public Association getAssociation() {
		return association;
	}

	public void setObjClass(String objClass) {
		this.objClass = objClass;
	}

	public String getObjClass() {
		return objClass;
	}
}