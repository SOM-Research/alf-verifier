package severification.actionSemantics;

import java.util.ArrayList;
import java.util.Iterator;

import pvaAnalyzer.model.ASymmetry;
import pvaAnalyzer.model.AssociationCardMax;
import pvaAnalyzer.model.AssociationCardMin;
import pvaAnalyzer.model.ClassCardMax;
import pvaAnalyzer.model.ClassCardMin;
import pvaAnalyzer.model.Constraint;
import pvaAnalyzer.model.Covering;
import pvaAnalyzer.model.Disjoint;
import pvaAnalyzer.model.Id;
import pvaAnalyzer.model.Irreflexivity;
import pvaAnalyzer.model.MandatoryAttribute;
import pvaAnalyzer.model.Referential;
import pvaAnalyzer.model.Symmetry;
import pvaAnalyzer.model.ValueComp;


public class Action {
	
	protected int pathIndex;
	private boolean usedForDiscarding = false;
	private ArrayList<Constraint> constraints = new ArrayList<Constraint>();

	@Override
	public boolean equals(java.lang.Object obj) {
		return false;
	}

	public int getPathIndex() {
		return pathIndex;
	}

	public void setPathIndex(int pathIndex) {
		this.pathIndex = pathIndex;
	}

	public void setUsedForDiscarding(boolean usedForDiscarding) {
		this.usedForDiscarding = usedForDiscarding;
	}

	public boolean isUsedForDiscarding() {
		return usedForDiscarding;
	}

	public void addConstraints( ArrayList<Constraint> constraints ){
		// Need to clone all constraint because we want different constraint references for each one of the actions (PVAs)
		ArrayList<Constraint> currentPvaConstraints = new ArrayList<Constraint>();
		Iterator<Constraint> constraintsIter = constraints.iterator();
		while ( constraintsIter.hasNext() ){
			Constraint constr = constraintsIter.next();
			if ( constr instanceof AssociationCardMax ){
				currentPvaConstraints.add( new AssociationCardMax( (AssociationCardMax) constr ) );
			} else if ( constr instanceof AssociationCardMin ){
				currentPvaConstraints.add( new AssociationCardMin( (AssociationCardMin) constr ) );
			} else if ( constr instanceof ASymmetry ){
				currentPvaConstraints.add( new ASymmetry( (ASymmetry) constr ) );
			} else if ( constr instanceof ClassCardMax ){
				currentPvaConstraints.add( new ClassCardMax( (ClassCardMax) constr ) );
			} else if ( constr instanceof ClassCardMin ){
				currentPvaConstraints.add( new ClassCardMin( (ClassCardMin) constr ) );
			} else if ( constr instanceof Covering ){
				currentPvaConstraints.add( new Covering( (Covering) constr ) );
			} else if ( constr instanceof Disjoint ){
				currentPvaConstraints.add( new Disjoint( (Disjoint) constr ) );
			} else if ( constr instanceof Id ){
				currentPvaConstraints.add( new Id( (Id) constr ) );
			} else if ( constr instanceof Irreflexivity ){
				currentPvaConstraints.add( new Irreflexivity( (Irreflexivity) constr ) );
			} else if ( constr instanceof MandatoryAttribute ){
				currentPvaConstraints.add( new MandatoryAttribute( (MandatoryAttribute) constr ) );
			} else if ( constr instanceof Symmetry ){
				currentPvaConstraints.add( new Symmetry( (Symmetry) constr ) );
			} else if ( constr instanceof ValueComp ){
				currentPvaConstraints.add( new ValueComp( (ValueComp) constr ) );
			} else if ( constr instanceof Referential ){
				currentPvaConstraints.add( new Referential( (Referential) constr ) );
			}
		}
		this.getConstraints().addAll( currentPvaConstraints );
	}

	public void setConstraints(ArrayList<Constraint> constraints) {
		this.constraints = constraints;
	}

	public ArrayList<Constraint> getConstraints() {
		return constraints;
	}
	
	public String toAlf(){
		return "";
	}
}