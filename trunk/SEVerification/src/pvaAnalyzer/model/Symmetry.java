package pvaAnalyzer.model;

public class Symmetry extends Constraint {
	private String association;
	private String oclExpr;
	
	public Symmetry(String association, String oclExpr) {
		this.association = association;
		this.oclExpr = oclExpr;
	}
	
	public Symmetry( Symmetry anotherSymmetry ) {
		this.association = anotherSymmetry.getAssociation();
		this.oclExpr = anotherSymmetry.getOclExpr();
	}

	@Override
	public String toString() {
//		return "Sym(" + association + ")" + " [" + this.satisfied +"]";
		return "Association " + association + " must be symmetric; (" + oclExpr + ").";
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