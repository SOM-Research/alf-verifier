package severification.actionSemantics;

import java.util.ArrayList;


public class AddStructuralFeature extends Action {
	private String objName;
	private String attrName;
	private String value;
	private String objClass;
	
	public AddStructuralFeature( String objName , String attrName , String value , String objClass ){
		this.objName = objName;
		this.attrName = attrName;
		this.value = value;
		this.objClass = objClass;
	}
	
	@Override
	public String toString() {
		return 	"AddStructuralFeature " + (this.objName!=null?this.objName:"*") + " " + (this.objClass!=null?this.objClass:"*") + " " + 
				(this.attrName!=null?this.attrName:"*") + " " + (this.value!=null?this.value:"*");
	}
	
	public String toAlf(){
		return this.objName + "." + this.attrName + " = " + this.value;
	}
	
	public boolean equals( java.lang.Object obj ) {
		AddStructuralFeature asf = (AddStructuralFeature) obj;
		return 	(asf.getObjName() == null || (this.objName != null && this.objName.equals( asf.getObjName() ))) &&
				(asf.getAttrName() == null || (this.attrName != null && this.attrName.equals( asf.getAttrName() ))) &&
				(asf.getValue() == null || (this.value != null && this.value.equals( asf.getValue() ))) &&
				(asf.getObjClass() == null || (this.objClass != null && this.objClass.equals( asf.getObjClass() )));
	}

	public String getObjName() {
		return objName;
	}
	public void setObjName(String objName) {
		this.objName = objName;
	}
	public String getAttrName() {
		return attrName;
	}
	public void setAttrName(String attrName) {
		this.attrName = attrName;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}

	public String getObjClass() {
		return objClass;
	}

	public void setObjClass( String objClass) {
		this.objClass = objClass;
	}
}