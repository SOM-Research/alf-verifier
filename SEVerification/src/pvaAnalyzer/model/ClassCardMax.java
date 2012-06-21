package pvaAnalyzer.model;

public class ClassCardMax extends Constraint {
	private String className;
	private String oclExpr;
	private String value;
	private String op;

	public ClassCardMax(String className, String oclExpr, String value, String op) {
		this.className = className;
		this.oclExpr = oclExpr;
		this.value = value;
		this.op = op;
	}
	
	public ClassCardMax( ClassCardMax anotherClassCardMax ) {
		this.className = anotherClassCardMax.getClassName();
		this.oclExpr = anotherClassCardMax.getOclExpr();
		this.value = anotherClassCardMax.getValue();
		this.op = anotherClassCardMax.getOp();
	}
	
	@Override
	public String toString() {
		String strOp = new String( "minor or equal" );
		if ( op.equals("=") ){
			strOp = "equal";
		}
//		return "Class " + className + " cardinality must be " + strOp + " to " + value + "; (" + oclExpr + ").";
		return oclExpr;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getClassName() {
		return className;
	}
	
	public void setOclExpr(String oclExpr) {
		this.oclExpr = oclExpr;
	}

	public String getOclExpr() {
		return oclExpr;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setOp(String op) {
		this.op = op;
	}

	public String getOp() {
		return op;
	}
}