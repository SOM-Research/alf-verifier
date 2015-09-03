package pvaAnalyzer;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.internal.impl.AssociationImpl;
import org.eclipse.uml2.uml.internal.impl.ClassImpl;
import org.eclipse.uml2.uml.internal.impl.GeneralizationSetImpl;
import org.eclipse.uml2.uml.internal.impl.PropertyImpl;
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
import severification.actionSemantics.Action;
import severification.actionSemantics.AddStructuralFeature;
import severification.actionSemantics.Association;
import severification.actionSemantics.ClearAssociation;
import severification.actionSemantics.CreateLink;
import severification.actionSemantics.CreateObject;
import severification.actionSemantics.DestroyLink;
import severification.actionSemantics.DestroyObject;
import severification.actionSemantics.Object;
import severification.actionSemantics.ReclassifyObject;

public class PVAExtractor {
	
	private static final String CONTEXT_CLASS_INV_NAME = "context\\s([a-zA-Z]+)\\sinv\\s[a-zA-Z]*:\\s";
	
	private static final String CONSTR_ID_PATTERN = CONTEXT_CLASS_INV_NAME + 
										"[a-zA-Z0-9]+\\.allInstances\\(\\)\\s?->\\s?isUnique\\(([a-zA-Z0-9]+)\\)";
	private static Pattern constrId = Pattern.compile( CONSTR_ID_PATTERN );
	
	private static final String CONSTR_SYM_PATTERN = CONTEXT_CLASS_INV_NAME + 
									"self\\.([a-zA-Z0-9]+)\\s?->\\s?forAll\\(([a-zA-Z0-9]+)\\|[a-zA-Z0-9]+\\.([a-zA-Z0-9]+)\\s?->\\s?includes\\(self\\)\\)";
	private static Pattern constrSym = Pattern.compile( CONSTR_SYM_PATTERN );
	
	private static final String CONSTR_SYM_SHORT_PATTERN = CONTEXT_CLASS_INV_NAME + 
									"self\\.([a-zA-Z0-9]+)\\.([a-zA-Z0-9]+)\\s?->\\s?includes\\(self\\)";
	private static Pattern constrShortSym = Pattern.compile( CONSTR_SYM_SHORT_PATTERN );
	
	private static final String CONSTR_ASYM_PATTERN = CONTEXT_CLASS_INV_NAME + 
									"self\\.([a-zA-Z0-9]+)\\s?->\\s?forAll\\(([a-zA-Z0-9]+)\\|[a-zA-Z0-9]+\\.([a-zA-Z0-9]+)\\s?->\\s?excludes\\(self\\)\\)";
	private static Pattern constrASym = Pattern.compile( CONSTR_ASYM_PATTERN );
	
	private static final String CONSTR_ASYM_SHORT_PATTERN = CONTEXT_CLASS_INV_NAME + 
									"self\\.([a-zA-Z0-9]+)\\.([a-zA-Z0-9]+)\\s?->\\s?excludes\\(self\\)";
	private static Pattern constrShortASym = Pattern.compile( CONSTR_ASYM_SHORT_PATTERN );
	
	private static final String CONSTR_IRREFL_PATTERN = CONTEXT_CLASS_INV_NAME + 
									"self\\.([a-zA-Z0-9]+)\\s?->\\s?excludes\\(self\\)";
	private static Pattern constrIrrefl = Pattern.compile( CONSTR_IRREFL_PATTERN );
	
	private static final String CONSTR_VALUE_COMP_PATTERN = CONTEXT_CLASS_INV_NAME + 
									"self\\.([a-zA-Z0-9]+)\\s?(<|<=|>=|>|=|<>)\\s?([a-zA-Z.0-9]+|[0-9]+)";
	private static Pattern constrValueComp = Pattern.compile( CONSTR_VALUE_COMP_PATTERN );
	
	private static final String CONSTR_CLASS_CARD = CONTEXT_CLASS_INV_NAME + 
									"([a-zA-Z0-9]+)\\.allInstances\\(\\)\\s?->\\s?size\\(\\)\\s?(<|<=|>=|>|=|<>)\\s?([0-9]+)";
	private static Pattern constrClassCard = Pattern.compile( CONSTR_CLASS_CARD );

	private ModelLoader modelLoader;
	
	public PVAExtractor( ModelLoader ml ){
		this.modelLoader = ml;
	}

	public PVAHashtable< Action , ArrayList<Constraint> > extract(){
		PVAHashtable< Action , ArrayList<Constraint> > pvas = new PVAHashtable<Action, ArrayList<Constraint>>();	
	
		extractGeneralizationSetsPVAs( pvas ); // extracting PVA's regarding to generalization sets
		extractClassDiagramPVAs( pvas ); // extracting PVA's regarding to classes mandatory attributes and associations
		// extracting PVA's regarding to OCL constraints found on class diagram
		Iterator<String> oclExprIter = this.modelLoader.getConstraints().iterator();
		while ( oclExprIter.hasNext() ){
			extractOCLConstraintPVAs( oclExprIter.next() , pvas );
		}
		
		return pvas;
	}
	
	private void extractGeneralizationSetsPVAs( PVAHashtable<Action, ArrayList<Constraint>> pvas ) {
		Iterator<GeneralizationSetImpl> genSetsIter = this.modelLoader.getGenSets().iterator();
		while ( genSetsIter.hasNext() ){
			GeneralizationSetImpl genSet = genSetsIter.next();
			String superClass = genSet.getGeneralizations().get(0).getGeneral().getName();
			Iterator<Generalization> generalizationsIter = genSet.getGeneralizations().iterator();
			while ( generalizationsIter.hasNext() ){
				String specificClass = generalizationsIter.next().getSpecific().getName();
				if ( genSet.isCovering() ){
					updatePVAs( pvas , 
						new ReclassifyObject( null , new ArrayList<String>( new ArrayList<String>( Arrays.asList( specificClass ) ) ) , null ) ,
						new Covering( superClass ) );
				}
				if ( genSet.isDisjoint() ){
					updatePVAs( pvas , 
						new ReclassifyObject( null , null , new ArrayList<String>( new ArrayList<String>( Arrays.asList( specificClass ) ) )  ) ,
						new Disjoint( superClass ) );
				}
			}
		}
	}

	private void extractOCLConstraintPVAs( String strOclExpr , PVAHashtable< Action , ArrayList<Constraint> > pvas ) {
		Matcher mId = constrId.matcher( strOclExpr );
		Matcher mSym = constrSym.matcher( strOclExpr );
		Matcher mShortSym = constrShortSym.matcher( strOclExpr );
		Matcher mASym = constrASym.matcher( strOclExpr );
		Matcher mShortASym = constrShortASym.matcher( strOclExpr );
		Matcher mIrrefl = constrIrrefl.matcher( strOclExpr );
		Matcher mValComp = constrValueComp.matcher( strOclExpr );
		Matcher mClassCard = constrClassCard.matcher( strOclExpr );
		
		/*** ID ***/
		if ( mId.matches() ){
			String attr = mId.group(2);
			String clazz = mId.group(1);
			
			updatePVAs( pvas , new AddStructuralFeature( null , attr , null , clazz ) , new Id( attr , clazz , strOclExpr) );
			if ( this.modelLoader.getClassesHierarchy().containsKey( clazz ) ){
				Iterator<String> hierarchyIter = this.modelLoader.getClassesHierarchy().get( clazz ).iterator();
				while ( hierarchyIter.hasNext() ){
					updatePVAs( pvas , new AddStructuralFeature( null , attr , null , hierarchyIter.next() ) , 
							new Id( attr , clazz , strOclExpr) );
				}
			}
		} 
		/*** SYM ***/
		else if ( mSym.matches() && mSym.group(2).equals( mSym.group(4) ) ) { 
			String className = mSym.group(1);
			String rolA = new String();
			String rolB = mSym.group(2);
			String association = new String();
			Iterator<String> itClassAssociations = this.modelLoader.getClassAssociations( className ).iterator();
			while ( itClassAssociations.hasNext() ){
				String classAssoc = itClassAssociations.next();
				ArrayList<String> associationRoles = new ArrayList<String>( this.modelLoader.getAssociationRoles( classAssoc ) );
				if ( associationRoles.contains( rolB ) ){
					associationRoles.remove( rolB );
					association = classAssoc;
					rolA = associationRoles.get(0);
				}
			}
		
			updatePVAs( pvas , new CreateLink( new Association( association ) , rolA , null , rolB , null ) , 
					new Symmetry( association , strOclExpr ) );
			updatePVAs( pvas , new DestroyLink( new Association( association ) , rolA , null , rolB , null ) , 
					new Symmetry( association , strOclExpr ) );
		}
		/*** SHORT SYM ***/
		else if ( mShortSym.matches() ) { 
			String className = mShortSym.group(1);
			String rolA = new String();
			String rolB = mShortSym.group(2);
			if ( rolB.equals( mShortSym.group(3) ) ){
				String association = new String();
				Iterator<String> itClassAssociations = this.modelLoader.getClassAssociations( className ).iterator();
				while ( itClassAssociations.hasNext() ){
					String classAssoc = itClassAssociations.next();
					ArrayList<String> associationRoles = new ArrayList<String>( this.modelLoader.getAssociationRoles( classAssoc ) );
					if ( associationRoles.contains( rolB ) ){
						associationRoles.remove( rolB );
						association = classAssoc;
						rolA = associationRoles.get(0);
					}
				}
				
				updatePVAs( pvas , new CreateLink( new Association( association ) , rolA , null , rolB , null ) , 
						new Symmetry( association , strOclExpr ) );
				updatePVAs( pvas , new DestroyLink( new Association( association ) , rolA , null , rolB , null ) , 
						new Symmetry( association , strOclExpr ) );
			}
		}
		/*** ASYM ***/
		else if ( mASym.matches() && mASym.group(2).equals( mASym.group(4) )) { 
			String className = mASym.group(1);
			String rolA = new String();
			String rolB = mASym.group(2);
			String association = new String();
			Iterator<String> itClassAssociations = this.modelLoader.getClassAssociations( className ).iterator();
			while ( itClassAssociations.hasNext() ){
				String classAssoc = itClassAssociations.next();
				ArrayList<String> associationRoles = new ArrayList<String>( this.modelLoader.getAssociationRoles( classAssoc ) );
				if ( associationRoles.contains( rolB ) ){
					associationRoles.remove( rolB );
					association = classAssoc;
					rolA = associationRoles.get(0);
				}
			}
		
			updatePVAs( pvas , new CreateLink( new Association( association ) , rolA , null , rolB , null ) , 
					new ASymmetry( association , strOclExpr ) );
		}
		/*** SHORT ASYM ***/
		else if ( mShortASym.matches() ) { 
			String className = mShortASym.group(1);
			String rolA = new String();
			String rolB = mShortASym.group(2);
			if ( rolB.equals( mShortASym.group(3) ) ){
				String association = new String();
				Iterator<String> itClassAssociations = this.modelLoader.getClassAssociations( className ).iterator();
				while ( itClassAssociations.hasNext() ){
					String classAssoc = itClassAssociations.next();
					ArrayList<String> associationRoles = new ArrayList<String>( this.modelLoader.getAssociationRoles( classAssoc ) );
					if ( associationRoles.contains( rolB ) ){
						associationRoles.remove( rolB );
						association = classAssoc;
						rolA = associationRoles.get(0);
					}
				}
				updatePVAs( pvas , new CreateLink( new Association( association ) , rolA , null , rolB , null ) , 
						new ASymmetry( association , strOclExpr ) );
			}
		}
		/*** IRREFL ***/
		else if ( mIrrefl.matches() ) { 
			String className = mIrrefl.group(1);
			String rolA = new String();
			String rolB = mIrrefl.group(2);
			String association = new String();
			Iterator<String> itClassAssociations = this.modelLoader.getClassAssociations( className ).iterator();
			while ( itClassAssociations.hasNext() ){
				String classAssoc = itClassAssociations.next();
				ArrayList<String> associationRoles = new ArrayList<String>( this.modelLoader.getAssociationRoles( classAssoc ) );
				if ( associationRoles.contains( rolB ) ){
					associationRoles.remove( rolB );
					association = classAssoc;
					rolA = associationRoles.get(0);
				}
			}
		
			updatePVAs( pvas , new CreateLink( new Association( association ) , rolA , null , rolB , null ) , 
					new Irreflexivity( association , strOclExpr ) );
		}
		/*** VALCOMP ***/
		else if ( mValComp.matches() ){
			String className = mValComp.group(1);
			String[] splittedAttr = mValComp.group(2).split("\\.");
			String attr = splittedAttr[ splittedAttr.length - 1 ];
			String op = mValComp.group(3);
			String value = mValComp.group(4);
			updatePVAs( pvas , 	new AddStructuralFeature( null , attr , null , className ) , 
								new ValueComp( attr , op , value , strOclExpr , className ) );
			if ( this.modelLoader.getClassesHierarchy().containsKey( className ) ){
				Iterator<String> hierarchyIter = this.modelLoader.getClassesHierarchy().get( className ).iterator();
				while ( hierarchyIter.hasNext() ){
					updatePVAs( pvas , 	new AddStructuralFeature( null , attr , null , hierarchyIter.next() ) , 
										new ValueComp( attr , op , null , strOclExpr , className ) );
				}
			}
		}
		/*** CLASS CARD ***/
		else if ( mClassCard.matches() ){
			String className = mClassCard.group(1);
			boolean clazzHasSuper = this.modelLoader.getClasses().get( className ).getSuperClasses().size() > 0;
			String op = mClassCard.group(3);
			String value = mClassCard.group(4);
			if ( op.equals("<") || op.equals("<=") || op.equals( "=" ) ){
				updatePVAs( pvas , new CreateObject( new Object( null , className ) ) , new ClassCardMax( className , strOclExpr , value , op ) );
				if ( this.modelLoader.getClassesHierarchy().containsKey( className ) ){
					Iterator<String> hierarchyIter = this.modelLoader.getClassesHierarchy().get( className ).iterator();
					while ( hierarchyIter.hasNext() ){
						updatePVAs( pvas , 
									new CreateObject( new Object( null , hierarchyIter.next() ) ) , 
									new ClassCardMax( className , strOclExpr , value , op ) );
					}
				}
				if ( clazzHasSuper ){
					updatePVAs( pvas , new ReclassifyObject( null , null , new ArrayList<String>( Arrays.asList( className ) ) ) , 
						new ClassCardMax( className , strOclExpr , value , op ) );
				}
			} 
			if ( op.equals(">") || op.equals(">=") || op.equals( "=" ) ){
				updatePVAs( pvas , new DestroyObject( new Object( null , className ) ) , new ClassCardMin( className , strOclExpr , value , op ) );
				if ( this.modelLoader.getClassesHierarchy().containsKey( className ) ){
					Iterator<String> hierarchyIter = this.modelLoader.getClassesHierarchy().get( className ).iterator();
					while ( hierarchyIter.hasNext() ){
						updatePVAs( pvas , 
									new DestroyObject( new Object( null , hierarchyIter.next() ) ) , 
									new ClassCardMin( className , strOclExpr , value , op ) );
					}
				}
				if ( clazzHasSuper ){
					updatePVAs( pvas , new ReclassifyObject( null , new ArrayList<String>( Arrays.asList( className ) ) , null ) , 
						new ClassCardMin( className , strOclExpr , value , op ) );
				}
			}
		}
	}
	
	private void extractClassDiagramPVAs( PVAHashtable< Action , ArrayList<Constraint> > pvas ) {
		Iterator<String> classesKeyIter = this.modelLoader.getClasses().keySet().iterator();
		while ( classesKeyIter.hasNext() ){
			ClassImpl clazz = this.modelLoader.getClasses().get( classesKeyIter.next() );
			mandatoryAttributesPVAs( pvas , clazz );
			assocReferentialPVAs(pvas, clazz);
		}
		classAssocCardPVAs( pvas );
	}

	private void assocReferentialPVAs( PVAHashtable<Action, ArrayList<Constraint>> pvas, ClassImpl clazz ) {
		if ( clazz.getAssociations() != null && clazz.getAssociations().size()>0 ){
			Iterator<org.eclipse.uml2.uml.Association> classAssocIter = clazz.getAssociations().iterator();
			while ( classAssocIter.hasNext() ){
				String assocName = classAssocIter.next().getLabel();
				updatePVAs( pvas ,
						new DestroyObject( new Object( null , clazz.getLabel() ) ) ,
						new Referential( clazz.getLabel() , assocName ) );
				updatePVAs( pvas ,
						new ReclassifyObject( null , new ArrayList<String>( Arrays.asList( clazz.getLabel() ) ), null ) ,
						new Referential( clazz.getLabel() , assocName ) );
				
				if ( this.modelLoader.getClassesHierarchy().containsKey( clazz.getLabel() ) ){
					Iterator<String> hierarchyIter = this.modelLoader.getClassesHierarchy().get( clazz.getLabel() ).iterator();
					while ( hierarchyIter.hasNext() ){
						String hierarchyClass = hierarchyIter.next();
						updatePVAs( pvas ,
								new DestroyObject( new Object( null , hierarchyClass ) ) ,
								new Referential( clazz.getLabel() , assocName ) );
						updatePVAs( pvas ,
								new ReclassifyObject( null , new ArrayList<String>( Arrays.asList( hierarchyClass ) ) , null ) ,
								new Referential( clazz.getLabel() , assocName ) );
					}
				}
			}
		}
	}
	
	private void classAssocCardPVAs( PVAHashtable< Action , ArrayList<Constraint> > pvas ) {
		Iterator<AssociationImpl> assocs = this.modelLoader.getAssociations().values().iterator();
		while ( assocs.hasNext() ){
			org.eclipse.uml2.uml.Association assoc = assocs.next();
			Iterator<Property> assocMembersIter = assoc.getMemberEnds().iterator();
			while ( assocMembersIter.hasNext() ){
				PropertyImpl assocMember = (PropertyImpl) assocMembersIter.next();
				String clazzName = assocMember.getType().getLabel();
				String assocRole = assocMember.getName();
				String oppositeAssocRole = this.modelLoader.oppositeAssociationRole( assoc , assocRole );
				String oppositeAssocClass = this.modelLoader.oppositeAssociationClass( assoc, clazzName );
				
				if ( assocMember.getLower() != 0 ){
					updatePVAs( pvas ,
							new ClearAssociation( new Association( assoc.getName() ) , null , null ) , 
							new AssociationCardMin( assoc.getName() , assocRole , Integer.toString( assocMember.getLower() ) ) );
					updatePVAs( pvas ,
								new DestroyLink( 	new severification.actionSemantics.Association( assoc.getName() ) , 
													oppositeAssocRole , 
													null , 
													assocRole , 
													null ) , 
								new AssociationCardMin( assoc.getName() , assocRole , Integer.toString( assocMember.getLower() ) ) );
					updatePVAs( pvas ,
								new CreateObject( new Object( null , oppositeAssocClass ) ) ,
								new AssociationCardMin( assoc.getName() , assocRole , Integer.toString( assocMember.getLower() ) ) );
					if ( this.modelLoader.getClassesHierarchy().containsKey( oppositeAssocClass ) ){
						Iterator<String> hierarchyIter = this.modelLoader.getClassesHierarchy().get( oppositeAssocClass ).iterator();
						while ( hierarchyIter.hasNext() ){
							String hierarchyClass = hierarchyIter.next();
							updatePVAs( pvas ,
									new CreateObject( new Object( null , hierarchyClass ) ) ,
									new AssociationCardMin( assoc.getName() , assocRole , Integer.toString( assocMember.getLower() ) ) );
						}
					}
					boolean clazzHasSuper = this.modelLoader.getClasses().get( oppositeAssocClass ).getSuperClasses().size() > 0;
					if ( clazzHasSuper ){
						updatePVAs( pvas ,
									new ReclassifyObject( null , null , new ArrayList<String>( Arrays.asList( oppositeAssocClass ) ) ) ,
									new AssociationCardMin( assoc.getName() , assocRole , Integer.toString( assocMember.getLower() )) );
					}
				}
				if ( assocMember.getUpper() != -1 ){
					updatePVAs( pvas ,
								new CreateLink( 	new severification.actionSemantics.Association( assoc.getName() ) , 
													oppositeAssocRole , 
													null , 
													assocRole , 
													null ) , 
								new AssociationCardMax( assoc.getName() , assocRole , Integer.toString( assocMember.getUpper() ) ) );
				}
			}
		}
	}

	private void mandatoryAttributesPVAs( PVAHashtable< Action , ArrayList<Constraint> > pvas , ClassImpl clazz ) {
		Iterator<Property> classAttrs = clazz.getAllAttributes().iterator();
		String clazzName = clazz.getName();
		boolean clazzHasSuper = this.modelLoader.getClasses().get( clazzName ).getSuperClasses().size() > 0;
		while ( classAttrs.hasNext() ){
			Property attr = classAttrs.next();
			
			if ( attr.getLower() > 0  && ( (ClassImpl)attr.getOwner() ).getName().equals( clazzName ) ){
				updatePVAs( pvas ,
							new CreateObject( new Object( null , clazzName ) ) ,
							new MandatoryAttribute( attr.getName() , clazzName ) );
				if ( this.modelLoader.getClassesHierarchy().containsKey( clazzName ) ){
					Iterator<String> hierarchyIter = this.modelLoader.getClassesHierarchy().get( clazzName ).iterator();
					while ( hierarchyIter.hasNext() ){
						updatePVAs( pvas ,
								new CreateObject( new Object( null , hierarchyIter.next() ) ) ,
								new MandatoryAttribute( attr.getName() , clazzName ) );
					}
				}
				if ( clazzHasSuper ){
					updatePVAs( pvas ,
								new ReclassifyObject( null , null , new ArrayList<String>( Arrays.asList( clazzName ) ) ) ,
								new MandatoryAttribute( attr.getName() , clazzName ) );
				}
			}
		}
	}

	private void updatePVAs(PVAHashtable< Action , ArrayList<Constraint> > pvas, Action action, Constraint constraint) {
		if ( pvas.containsKey( action ) ){
			pvas.get( action ).add( constraint );
		}else{
			pvas.put( action , new ArrayList<Constraint>( Arrays.asList( constraint ) ) );
		}
	}	
}
