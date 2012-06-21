package pvaAnalyzer.model;

public class Id extends Constraint {
	private String attr;
	private String clazz;
	private String oclExpr;
	
	public Id(String id, String clazz, String oclExpr) {
		this.attr = id;
		this.clazz = clazz;
		this.oclExpr = oclExpr;
	}
	
	public Id( Id anotherId ) {
		this.attr = anotherId.getAttr();
		this.clazz = anotherId.getClazz();
		this.oclExpr = anotherId.getOclExpr();
	}

	@Override
	public String toString() {
		return "Attribute " + attr + " value in class " + clazz + " must be unique; (" + oclExpr + ").";
	}
	
	public String getAttr() {
		return attr;
	}
	public void setAttr(String id) {
		this.attr = id;
	}
	public String getClazz() {
		return clazz;
	}
	public void setClazz(String clazz) {
		this.clazz = clazz;
	}

	public void setOclExpr(String oclExpr) {
		this.oclExpr = oclExpr;
	}

	public String getOclExpr() {
		return oclExpr;
	}
}
