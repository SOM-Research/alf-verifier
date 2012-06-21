package pvaAnalyzer.model;

public class ASymmetry extends Constraint {
	private String association;
	private String oclExpr;
	
	public ASymmetry(String association, String oclExpr) {
		this.association = association;
		this.oclExpr = oclExpr;
	}
	
	public ASymmetry( ASymmetry anotherAsymmetry ) {
		this.association = anotherAsymmetry.getAssociation();
		this.oclExpr = anotherAsymmetry.getOclExpr();
	}

	@Override
	public String toString() {
//		return "Asym(" + association + ")" + " [" + this.satisfied +"]";
		return "Association " + association + " must be asymmetric; (" + oclExpr + ").";
	}
	
	public void setAssociation(String association) {
		this.association = association;
	}

	public String getAssociation() {
		return association;
	}
	
	public void setOclExpr(String oclExpr) {
		this.oclExpr = oclExpr;
	}

	public String getOclExpr() {
		return oclExpr;
	}
}