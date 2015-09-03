package pvaSatisfier;

import java.util.Iterator;

import pvaAnalyzer.ModelLoader;
import pvaAnalyzer.model.Constraint;
import severification.actionSemantics.Action;
import severification.actionSemantics.AddStructuralFeature;
import severification.actionSemantics.ClearAssociation;
import severification.actionSemantics.CreateLink;
import severification.actionSemantics.CreateObject;
import severification.actionSemantics.DestroyLink;
import severification.actionSemantics.DestroyObject;
import severification.actionSemantics.ExecutionPath;
import severification.actionSemantics.Operation;
import severification.actionSemantics.ReclassifyObject;
import severification.actionSemantics.Term;

public class PVASatisfierFacade {
	
	public void satisfy( Operation operation , ModelLoader ml ){
		Iterator<ExecutionPath> iterExecPaths = operation.getExecPaths().iterator();
		while ( iterExecPaths.hasNext() ){
			ExecutionPath execPath = iterExecPaths.next();
			Iterator<Term> termsIter = execPath.getTerms().iterator();
			while ( termsIter.hasNext() ){
				Action pva = termsIter.next().getAction();
				Iterator<Constraint> pvasConstrIter = pva.getConstraints().iterator();
				while ( pvasConstrIter.hasNext() ){
					Constraint constraint = pvasConstrIter.next();
					boolean constrSatisfied = isSatisfied( pva , constraint , execPath , ml );
					constraint.setSatisfied( constrSatisfied );
				}
			}
		}
	}
	
	public boolean isSatisfied( Operation operation ){
		Iterator<ExecutionPath> iterExecPaths = operation.getExecPaths().iterator();
		while ( iterExecPaths.hasNext() ){
			ExecutionPath execPath = iterExecPaths.next();
			Iterator<Action> execPathPvasIter = execPath.getPvas().keySet().iterator(); 
			while ( execPathPvasIter.hasNext() ){
				Action pva = execPathPvasIter.next();
				Iterator<Constraint> pvasConstrIter = execPath.getPvas().get( pva ).iterator();
				while ( pvasConstrIter.hasNext() ){
					Constraint constraint = pvasConstrIter.next();
					if ( !constraint.isSatisfied() ){
						return false;
					}
				}
			}
		}
		return true;
	}
	
	public boolean isSatisfied( Action pva , Constraint constraint , ExecutionPath path , ModelLoader ml ){
		if ( pva instanceof CreateObject ){
			PVASatisfierCreateObject pvaSatisfierCreateObject = new PVASatisfierCreateObject();
			return pvaSatisfierCreateObject.isSatisfied( (CreateObject) pva , constraint , path , ml );
		} else if ( pva instanceof DestroyObject ){
			PVASatisfierDestroyObject pvaSatisfierDestroyObject = new PVASatisfierDestroyObject();
			return pvaSatisfierDestroyObject.isSatisfied( (DestroyObject) pva , constraint , path , ml );
		} else if ( pva instanceof AddStructuralFeature ){
			PVASatisfierAddStructuralFeature pvaSatisfierAddStructuralFeature = new PVASatisfierAddStructuralFeature();
			return pvaSatisfierAddStructuralFeature.isSatisfied( (AddStructuralFeature) pva , constraint , path , ml );
		} else if ( pva instanceof CreateLink ){
			PVASatisfierCreateLink pvaSatisfierCreateLink = new PVASatisfierCreateLink();
			return pvaSatisfierCreateLink.isSatisfied( (CreateLink) pva , constraint , path , ml );
		} else if ( pva instanceof DestroyLink){
			PVASatisfierDestroyLink pvaSatisfierDestroyLink = new PVASatisfierDestroyLink();
			return pvaSatisfierDestroyLink.isSatisfied( (DestroyLink) pva , constraint , path , ml );
		} else if ( pva instanceof ReclassifyObject){
			ReclassifyObject pvaRecl = (ReclassifyObject) pva;
			PVASatisfierReclassifyTo pvaSatisfierReclassifyTo = new PVASatisfierReclassifyTo();
			PVASatisfierReclassifyFrom pvaSatisfierReclassifyFrom = new PVASatisfierReclassifyFrom();
			boolean reclToSatisfied = pvaSatisfierReclassifyTo.isSatisfied(pvaRecl, constraint, path, ml);
			
			boolean reclFromSatisfied = pvaSatisfierReclassifyFrom.isSatisfied(pvaRecl, constraint, path, ml);
			return 	reclToSatisfied && reclFromSatisfied;
		} else if ( pva instanceof ClearAssociation ){
			PVASatisfierClearAssoc pvaClAssoc = new PVASatisfierClearAssoc();
			return pvaClAssoc.isSatisfied( (ClearAssociation ) pva , constraint , path , ml );
		}
		return false;
	}
}
