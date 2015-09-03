package pvaAnalyzer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Iterator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.internal.impl.AssociationImpl;
import org.eclipse.uml2.uml.internal.impl.ClassImpl;
import org.eclipse.uml2.uml.internal.impl.ConstraintImpl;
import org.eclipse.uml2.uml.internal.impl.GeneralizationSetImpl;
import org.eclipse.uml2.uml.internal.impl.PropertyImpl;
import org.eclipse.uml2.uml.resource.UMLResource;

public class ModelLoader {
	private Package model;
	private Hashtable<String, AssociationImpl> associations = new Hashtable<String, AssociationImpl>();
	private Hashtable<String, ClassImpl> classes = new Hashtable<String, ClassImpl>();
	private Hashtable<String, ConstraintImpl> constraints = new Hashtable<String, ConstraintImpl>();
	private Hashtable<String, ArrayList<String>> genSetsBySuperClass = new Hashtable<String, ArrayList<String>>();
	private Hashtable<String, ArrayList<String>> specificClassesByGenSet = new Hashtable<String, ArrayList<String>>();
	private ArrayList<GeneralizationSetImpl> genSets = new ArrayList<GeneralizationSetImpl>();
	private Hashtable<String, ArrayList<String>> classesHierarchy = new Hashtable<String, ArrayList<String>>();
	private Hashtable<String, ArrayList<String>> attrBelongingClass = new Hashtable<String, ArrayList<String>>();
	
	public ModelLoader( String filePath ){
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(UMLResource.FILE_EXTENSION,UMLResource.Factory.INSTANCE);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi",new XMIResourceFactoryImpl());
		
		ResourceSet resourceSet=new ResourceSetImpl();
		resourceSet.getPackageRegistry().put(UMLPackage.eNS_URI,UMLPackage.eINSTANCE);
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(UMLResource.FILE_EXTENSION, UMLResource.Factory.INSTANCE);

		// retrieving model
		Resource res = resourceSet.getResource( URI.createURI( filePath ) , true );
		this.model = (Package)res.getContents().get(0); 
		
		// extracting associations and classes, storing them on separate hashtables
		Iterator<Element> elementsIt = this.model.allOwnedElements().iterator();
		while ( elementsIt.hasNext() ) {
			Element e = elementsIt.next();
  			if ( e instanceof AssociationImpl ){
				AssociationImpl assoc = (AssociationImpl) e;
				this.associations.put( assoc.getName() , assoc );
			} else if ( e instanceof ClassImpl ){
				ClassImpl clazz = (ClassImpl) e;
				this.classes.put( clazz.getName() , clazz );
				if ( !clazz.allParents().isEmpty() ){
					Iterator<Classifier> classParents = clazz.allParents().iterator();
					while ( classParents.hasNext() ){
						String parentName = classParents.next().getName();
						if ( this.classesHierarchy.containsKey( parentName ) ){
							this.classesHierarchy.get( parentName ).add( clazz.getName() );
						} else {
							this.classesHierarchy.put( parentName , new ArrayList<String>( Arrays.asList( clazz.getName() ) ) );
						}
					}
				}
			} else if ( e instanceof ConstraintImpl ){
				ConstraintImpl constraint = (ConstraintImpl) e;
				this.constraints.put( constraint.getSpecification().stringValue() , constraint );
			} else if ( e instanceof GeneralizationSetImpl ){
				GeneralizationSetImpl genSet = (GeneralizationSetImpl) e;
				this.genSets.add( genSet );
	
				String superClass = genSet.getGeneralizations().get(0).getGeneral().getName();
				if ( this.genSetsBySuperClass.containsKey( superClass ) ){
					this.genSetsBySuperClass.get(superClass).add(genSet.getName());
				} else {
					this.genSetsBySuperClass.put( superClass , new ArrayList<String>( Arrays.asList( genSet.getName() ) ) );
				}
				
				ArrayList<String> specificClasses = new ArrayList<String>();
				Iterator<Generalization> generalizationsIter = genSet.getGeneralizations().iterator();
				while ( generalizationsIter.hasNext() ){
					specificClasses.add( generalizationsIter.next().getSpecific().getName() );
				}
				this.specificClassesByGenSet.put( genSet.getLabel() , specificClasses );
				
			} else if ( e instanceof PropertyImpl ){
				PropertyImpl property = (PropertyImpl) e;
				if ( property.getFeaturingClassifiers().get( 0 ) instanceof ClassImpl ){
					String clazz = property.getFeaturingClassifiers().get( 0 ).getName();
					if ( this.attrBelongingClass.containsKey( property.getName() ) ){
						this.attrBelongingClass.get( property.getName() ).add( clazz );
					}else{
						this.attrBelongingClass.put( property.getName() , new ArrayList<String>( Arrays.asList( clazz ) ) );
					}
				}
			}
		}	
	}
	
	public boolean isAssociationOnModel( String assocName ){
		return this.associations.containsKey( assocName );
	}
	
	public boolean isClassOnModel( String className ){
		return this.classes.containsKey( className );
	}
	
	public ArrayList<String> getClassAssociations( String className ){
		ArrayList<String> res = new ArrayList<String>();
		Iterator<Association> classAssocIter = this.classes.get( className ).getAssociations().iterator();
		while ( classAssocIter.hasNext() ){
			res.add( classAssocIter.next().getName() );
		}
		return res;
	}
	
	public ArrayList<String> getAssociationRoles( String assocName ){
		ArrayList<String> res = new ArrayList<String>();
		if ( this.isAssociationOnModel( assocName ) ){
			Iterator<NamedElement> assocRolesIter = this.associations.get( assocName ).getOwnedMembers().iterator();
			while ( assocRolesIter.hasNext() ){
				res.add( assocRolesIter.next().getName() );
			}
		} else {
			return null;
		}
		return res;
	}
	
	public ArrayList<String> getAssociationClasses( String assocName ){
		ArrayList<String> res = new ArrayList<String>();
		if ( this.isAssociationOnModel( assocName ) ){
			Iterator<Type> assocClassesIter = this.associations.get( assocName ).getEndTypes().iterator();
			while ( assocClassesIter.hasNext() ){
				res.add( assocClassesIter.next().getName() );
			}
		} else {
			return null;
		}
		return res;
	}
	
	public ArrayList<String> getConstraints(){
		ArrayList<String> res = new ArrayList<String>();
		Iterator<String> constraintsIter = this.constraints.keySet().iterator();
		while ( constraintsIter.hasNext() ){
			res.add( constraintsIter.next() );
		}
		return res;
	}
	
	public ArrayList<String> getClassMethods( String className ){
		ArrayList<String> res = new ArrayList<String>();
		Iterator<Operation> classMethodIt = this.classes.get( className ).getOperations().iterator();
		while ( classMethodIt.hasNext() ){
			res.add( classMethodIt.next().getName() );
		}
		return res;
	}
	
	public String methodClassBelonging( String methodName ){
		Iterator<String> classesIter = this.classes.keySet().iterator();
		while ( classesIter.hasNext() ){
			String currentClass = classesIter.next();
			if ( this.getClassMethods( currentClass ).contains( methodName ) ){
				return currentClass;
			}
		}
		return null;
	}
	
	public String oppositeAssociationClass( org.eclipse.uml2.uml.Association assoc, String clazzName ) {
		String oppositeAssocClass;
		ArrayList<String> assocClasses = new ArrayList<String>( this.getAssociationClasses( assoc.getLabel() ) );
		if ( assocClasses.size() > 1 ){
			assocClasses.remove( clazzName );
			oppositeAssocClass = assocClasses.get(0);
			return oppositeAssocClass;
		} else {
			return assocClasses.get(0);
		}
	}
	
	public String oppositeClassFromAssocRole( String assocName , String role ){
		ArrayList<Type> classes = new ArrayList<Type>( this.associations.get( assocName ).getEndTypes() );
		ArrayList<NamedElement> roles = new ArrayList<NamedElement>( this.associations.get( assocName ).getOwnedMembers() );
		if ( classes.size() > 1 ){
			for ( int i = 0; i < roles.size(); i++ ){
				if ( roles.get( i ).getLabel().equals( role ) ){
					classes.remove( i );
				}
			}
			if ( classes.size() == 1 ){
				return classes.get( 0 ).getLabel();
			} else { 
				return null;
			}
		} else {
			return classes.get( 0 ).getLabel();
		}
	}
	
	public String oppositeRoleFromAssocClass( String assocName , String clazz ){
		ArrayList<Type> classes = new ArrayList<Type>( this.associations.get( assocName ).getEndTypes() );
		ArrayList<NamedElement> roles = new ArrayList<NamedElement>( this.associations.get( assocName ).getOwnedMembers() );
		for ( int i = 0; i < classes.size(); i++ ){
			String assocClass = classes.get( i ).getLabel();
			if ( 	assocClass.equals( clazz ) || 
					( this.classesHierarchy.get( assocClass )!= null && this.classesHierarchy.get( assocClass ).contains( clazz ) ) ){
				roles.remove( i );
			}
		}
		if ( roles.size() == 1 ){
			return roles.get( 0 ).getLabel();
		} else { 
			return null;
		}
	}
	
	public String oppositeAssociationRole( String assocName , String assocRole ) {
		return this.oppositeAssociationRole( this.getAssociations().get( assocName ) , assocRole );
	}

	public String oppositeAssociationRole( org.eclipse.uml2.uml.Association assoc, String assocRole ) {
		String oppositeAssocRole;
		ArrayList<String> assocRoles = new ArrayList<String>( this.getAssociationRoles( assoc.getLabel() ) );
		assocRoles.remove( assocRole );
		oppositeAssocRole = assocRoles.get(0);
		return oppositeAssocRole;
	}
	
	public int getAssocRoleLower( String assocname , String roleName ){
		return this.associations.get( assocname ).getMemberEnd( roleName , null ).getLower();
	}
	
	public int getAssocRoleUpper( String assocname , String roleName ){
		int upper = this.associations.get( assocname ).getMemberEnd( roleName , null ).getUpper();
		if ( upper == -1 ){
			return Integer.MAX_VALUE;
		} else {
			return upper;
		}
		
	}
	
	public boolean hasBrothers( String clazz ){
		EList<Class> clazzSuperClasses = this.getClasses().get( clazz ).getSuperClasses();
		if ( clazzSuperClasses != null && clazzSuperClasses.size() > 0 ){
			String clazzParent = clazzSuperClasses.get(0).getLabel();
			if ( getClassesHierarchy().containsKey( clazzParent ) ){
				Iterator<String> parentSubClassesIter = getClassesHierarchy().get( clazzParent ).iterator();
				while ( parentSubClassesIter.hasNext() ){
					String parentSubClass = parentSubClassesIter.next();
					if ( 	!parentSubClass.equals( clazz ) && 
							this.getClasses().get( parentSubClass ).getSuperClasses().get(0).getLabel().equals( clazzParent ) ){
						return true;
					}
				}
			}
		}
		return false;
	}
	
	public boolean isChild( String clazz ){
		EList<Class> clazzSuperClasses = this.getClasses().get( clazz ).getSuperClasses();
		return clazzSuperClasses != null && clazzSuperClasses.size() > 0;
		
	}
	
	public ArrayList<String> getGenSetSpecificClasses( String superClass , String specificClass ){
		Iterator<String> genSetsBySuperClassIter = this.genSetsBySuperClass.get( superClass ).iterator();
		while ( genSetsBySuperClassIter.hasNext() ){
			String genset = genSetsBySuperClassIter.next();
			if ( specificClassesByGenSet.get( genset ).contains( specificClass ) ){
				return specificClassesByGenSet.get( genset );
			}
		}
		return null;
		
	}
	
	public ArrayList<String> getBrothers( String clazz ){
		ArrayList<String> brothers = new ArrayList<String>();
		EList<Class> clazzSuperClasses = this.getClasses().get( clazz ).getSuperClasses();
		if ( clazzSuperClasses != null && clazzSuperClasses.size() > 0 ){
			String clazzParent = clazzSuperClasses.get(0).getLabel();
			if ( getClassesHierarchy().containsKey( clazzParent ) ){
				Iterator<String> parentSubClassesIter = getClassesHierarchy().get( clazzParent ).iterator();
				while ( parentSubClassesIter.hasNext() ){
					String parentSubClass = parentSubClassesIter.next();
					if ( 	!parentSubClass.equals( clazz ) && 
							this.getClasses().get( parentSubClass ).getSuperClasses().get(0).getLabel().equals( clazzParent ) ){
						brothers.add( parentSubClass );
					}
				}
			}
		}
		return brothers;
	}

	public Package getModel() {
		return model;
	}
	public Hashtable<String, AssociationImpl> getAssociations() {
		return associations;
	}
	public Hashtable<String, ClassImpl> getClasses() {
		return classes;
	}
	public Hashtable<String, ArrayList<String>> getClassesHierarchy() {
		return classesHierarchy;
	}
	public void setClassesHierarchy( Hashtable<String, ArrayList<String>> classesHierarchy) {
		this.classesHierarchy = classesHierarchy;
	}
	public Hashtable<String, ArrayList<String>> getAttrBelongingClass() {
		return attrBelongingClass;
	}
	public void setAttrBelongingClass(Hashtable<String, ArrayList<String>> attrBelongingClass) {
		this.attrBelongingClass = attrBelongingClass;
	}
	public void setGenSets(ArrayList<GeneralizationSetImpl> genSets) {
		this.genSets = genSets;
	}
	public ArrayList<GeneralizationSetImpl> getGenSets() {
		return genSets;
	}
	public void setGenSetsBySuperClass(Hashtable<String, ArrayList<String>> genSetsBySuperClass) {
		this.genSetsBySuperClass = genSetsBySuperClass;
	}
	public Hashtable<String, ArrayList<String>> getGenSetsBySuperClass() {
		return genSetsBySuperClass;
	}
	public void setSpecificClassesByGenSet(Hashtable<String, ArrayList<String>> specificClassesByGenSet) {
		this.specificClassesByGenSet = specificClassesByGenSet;
	}
	public Hashtable<String, ArrayList<String>> getSpecificClassesByGenSet() {
		return specificClassesByGenSet;
	}
}
