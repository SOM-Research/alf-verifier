package severification.alf.parser;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.xtext.alf.AlfStandaloneSetup;
import org.xtext.alf.alf.Operations;

public class AlfOperationsReader {
	private Operations alfOperations;

	/**
	 * Builds a new activity from the activity defined in filename (which is expected to be
	 * written following Alf grammar)
	 * @param filename
	 */
	public AlfOperationsReader(String filename) {
		new AlfStandaloneSetup().createInjectorAndDoEMFRegistration();

		ResourceSet rs = new ResourceSetImpl();
		Resource resource = rs.getResource(URI.createURI("file://" + filename), true);
		if ( resource.getErrors().size() == 0 ){
//			System.out.println("[OK] no parsing errors!");
		} else {
			System.out.println("[ERROR] parsing errors exists!");
			System.out.println( resource.getErrors() );
		}
		if ( resource.getContents().size() > 0 ){
			EObject eobject = resource.getContents().get(0);
			this.setAlfOperations((Operations) eobject);
		}
	}

	public void setAlfOperations(Operations operations) {
		this.alfOperations = operations;
	}

	public Operations getAlfOperations() {
		return alfOperations;
	}
}