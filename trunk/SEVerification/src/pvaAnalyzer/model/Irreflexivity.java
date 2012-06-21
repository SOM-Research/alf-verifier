package pvaAnalyzer.model;

public class Irreflexivity extends Constraint {
	private String association;
	private String oclExpr;

	public Irreflexivity(String association , String oclExpr) {
		this.association = association;
		this.oclExpr = oclExpr;
	}
	
	public Irreflexivity( Irreflexivity anotherIrrefl ) {
		this.association = anotherIrrefl.getAssociation();
		this.oclExpr = anotherIrrefl.getOclExpr();
	}

	@Override
	public String toString() {
//		return "Irrefl(" + association + ")" + " [" + this.satisfied +"]";
		return "Association " + association + " must be irreflexive (" + oclExpr + ").";
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