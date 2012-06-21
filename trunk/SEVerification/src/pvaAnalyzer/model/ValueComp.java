package pvaAnalyzer.model;

public class ValueComp extends Constraint {
	private String attr;
	private String op;
	private String value;
	private String oclExpr;
	private String clazz;
	
	public ValueComp(String attr, String op, String value , String oclExpr , String clazz ) {
		this.attr = attr;
		this.op = op;
		this.value = value;
		this.oclExpr = oclExpr;
		this.clazz = clazz;
	}
	
	public ValueComp( ValueComp anotherValueComp ) {
		this.attr = anotherValueComp.getAttr();
		this.op = anotherValueComp.getOp();
		this.value = anotherValueComp.getValue();
		this.oclExpr = anotherValueComp.getOclExpr();
		this.clazz = anotherValueComp.getClazz();
	}

	@Override
	public String toString() {
		return "Attribute value constraint: " + clazz + "." + attr + " " + op + " " + value + "; (" + oclExpr + ").";
	}

	public String getAttr() {
		return attr;
	}

	public void setAttr(String attr) {
		this.attr = attr;
	}

	public String getOp() {
		return op;
	}

	public void setOp(String op) {
		this.op = op;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	public void setOclExpr(String oclExpr) {
		this.oclExpr = oclExpr;
	}

	public String getOclExpr() {
		return oclExpr;
	}

	public void setClazz(String clazz) {
		this.clazz = clazz;
	}

	public String getClazz() {
		return clazz;
	}
}
