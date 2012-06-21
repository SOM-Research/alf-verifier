package pvaAnalyzer.model;

public class MandatoryAttribute extends Constraint {
	private String attr;
	private String clazz;
	
	public MandatoryAttribute( String attr , String clazz ) {
		this.attr = attr;
		this.clazz = clazz;
	}
	
	public MandatoryAttribute( MandatoryAttribute anotherMandAtrr ){
		this.attr = anotherMandAtrr.attr;
		this.clazz = anotherMandAtrr.clazz;
	}

	@Override
	public String toString() {
//		return "Mand(" + attr + "," + clazz + ")" + " [" + this.satisfied +"]";
		return "Attribute " + attr + " from " + clazz + " is mandatory.";
	}
	
	public String getAttr() {
		return attr;
	}
	public void setAttr(String attr) {
		this.attr = attr;
	}
	public String getClazz() {
		return clazz;
	}
	public void setClazz(String clazz) {
		this.clazz = clazz;
	}
}