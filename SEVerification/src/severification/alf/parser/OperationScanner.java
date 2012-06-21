package severification.alf.parser;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.xtext.alf.alf.Block;
import org.xtext.alf.alf.FormalParameter;
import org.xtext.alf.alf.FormalParameterList;
import org.xtext.alf.alf.OperationDefinitionOrStub;

import pvaAnalyzer.ModelLoader;


public class OperationScanner {
	public Hashtable< String , OperationDefinitionOrStub > hashOperations = new Hashtable< String , OperationDefinitionOrStub >();
	public static Hashtable< String , String > instancesClass = new Hashtable<String, String>();
	private static ModelLoader modelLoader;
	public String currentOperation;
	private static OperationScanner ref;
	
	public OperationScanner( AlfOperationsReader op ) {
		EList<OperationDefinitionOrStub> operations = op.getAlfOperations().getOperations();
		for ( int i = 0; i < operations.size(); i++ ){
			OperationDefinitionOrStub operation = operations.get( i );
			hashOperations.put( operation.getDeclaration().getName() , operation );	
		}
		currentOperation = new String();
	}
	
	public static OperationScanner getOperationScanner( AlfOperationsReader op ){
		if (op != null) {
			ref = new OperationScanner( op );
		}
		return ref;
	}
	
	public static OperationScanner getOperationScanner(){
		return getOperationScanner( null );
	}
	
	
	public static Block getOperationBlock( String opName ){
		if ( getOperationScanner().hashOperations.containsKey( opName ) ){
			OperationDefinitionOrStub operationDefinitionOrStub = getOperationScanner().hashOperations.get( opName );
			FormalParameterList paramsList = operationDefinitionOrStub.getDeclaration().getFormalParameters().getFormalParameterList();
			if ( paramsList != null ){
				Iterator<FormalParameter> paramsListIter = paramsList.getFormalParameter().iterator();
				while ( paramsListIter.hasNext() ){
					FormalParameter param = paramsListIter.next();
					OperationScanner.instancesClass.put( param.getName() , param.getType().getTypeName().getQualifiedName().getId() );	
				}
			}
			return operationDefinitionOrStub.getBody();
		} else {
			return null;
		}
	}
	
	public static String getCurrentOperation(){
		return getOperationScanner().currentOperation; 
	}
	
	public static void setCurrentOperation( String currentOperation ){
		getOperationScanner().currentOperation = currentOperation;
	}

	public static void setModelLoader(ModelLoader modelLoader) {
		OperationScanner.modelLoader = modelLoader;
	}

	public static ModelLoader getModelLoader() {
		return modelLoader;
	}
	
	public Set<String> getAllOperations(){
		return this.hashOperations.keySet();
	}
}