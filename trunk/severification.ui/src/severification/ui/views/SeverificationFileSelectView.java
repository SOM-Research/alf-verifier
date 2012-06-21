package severification.ui.views;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IViewReference;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;

import severification.alf.parser.AlfOperationsReader;
import severification.alf.parser.OperationScanner;


public class SeverificationFileSelectView extends ViewPart {
	Shell parentShell = null;
	Label classDiagramLabel = null;
	Label operationsLabel = null;
	Button classDiagramsdfsdButton = null;
	Combo opsCombo = null;
	static final String BLANK_STRING = "                                                                                                                ";
	public static final String ID = "severification.ui.views.SeverificationFileSelectView";
	
	public SeverificationFileSelectView() {
		super();
	}

	public void setFocus() {
		
	}
	
	public IViewPart getView(IWorkbenchWindow window, String viewId) {
	    IViewReference[] refs = window.getActivePage().getViewReferences();
	    for (IViewReference viewReference : refs) {
	        if (viewReference.getId().equals(viewId)) {
	            return viewReference.getView(true);
	        }
	    }
	    return null;
	}

	public void createPartControl(Composite parent) {
		parentShell = new Shell( parent.getShell() );
		GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 2;
		parent.setLayout( gridLayout );
		
		Button classDiagramButton = new Button( parent , SWT.PUSH );
		classDiagramLabel = new Label( parent , SWT.BORDER );
		classDiagramLabel.setText(new String(BLANK_STRING));
		classDiagramButton.setText( "UML class diagram" );
		classDiagramButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				FileDialog classDiagramFileDialog = new FileDialog( parentShell , 0 );
				classDiagramFileDialog.setFilterExtensions( new String[] { "*.uml" } );
				classDiagramFileDialog.open();
				classDiagramLabel.setText( classDiagramFileDialog.getFilterPath() + File.separator + classDiagramFileDialog.getFileName() );
				classDiagramLabel.setSize( classDiagramLabel.computeSize(SWT.DEFAULT, SWT.DEFAULT) );
			}
		});
		
		Button operationsButton = new Button( parent , SWT.PUSH );
		operationsLabel = new Label( parent , SWT.BORDER );
		operationsLabel.setText(new String(BLANK_STRING));
		operationsButton.setText( "Alf operations" );
		operationsButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				FileDialog operationsFileDialog = new FileDialog( parentShell , 0 );
				operationsFileDialog.setFilterExtensions( new String[] { "*.alf" } );
				operationsFileDialog.open();
				operationsLabel.setText( operationsFileDialog.getFilterPath() + "/" + operationsFileDialog.getFileName() );

				operationsLabel.setSize( operationsLabel.computeSize(SWT.DEFAULT, SWT.DEFAULT) );
				
				OperationScanner opScan = new OperationScanner( new AlfOperationsReader( operationsLabel.getText() ) );
				Set<String> allOperations = opScan.getAllOperations();
				List<String> allOpList = new ArrayList<String>(allOperations);
				 java.util.Collections.sort(allOpList);
				Iterator<String> operations = allOpList.iterator();
				opsCombo.setEnabled( true );
				opsCombo.removeAll();
				opsCombo.add( "All" );
				opsCombo.select( 0 );
				while ( operations.hasNext() ){
					opsCombo.add( operations.next() );
				}
				opsCombo.setSize( opsCombo.computeSize(SWT.DEFAULT, SWT.DEFAULT) );
			}
		});	
		
		
		Label chooseOp = new Label(parent, SWT.NONE );
		chooseOp.setText("Choose operation to be processed:");
		
		opsCombo = new Combo(parent, SWT.VERTICAL | SWT.DROP_DOWN | SWT.BORDER | SWT.READ_ONLY);
		opsCombo.add( "All" );
		opsCombo.select( 0 );
		opsCombo.setEnabled( false );
		
		
		Button weakExecButton = new Button( parent , SWT.PUSH );
		weakExecButton.setText( "Verify weak executability" );
		weakExecButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
			}
		});	
		
		Button strongExecButton = new Button( parent , SWT.PUSH );
		strongExecButton.setText( "Verify strong executability" );
		strongExecButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e){
				SeverificationTreeView view = (SeverificationTreeView) getView( PlatformUI.getWorkbench().getActiveWorkbenchWindow() , SeverificationTreeView.ID );
				ArrayList<String> ops = new ArrayList<String>();
				if ( opsCombo.getSelectionIndex() == 0 ){
					Collections.addAll(ops, opsCombo.getItems()); 
					ops.remove( 0 );
				} else {
					ops = new ArrayList<String>( Arrays.asList( opsCombo.getItem( opsCombo.getSelectionIndex() ) ) );
				}
//				view.emptyContentProvider();
				view.setContentProvider( operationsLabel.getText() , ops , "file://" + classDiagramLabel.getText().replace("\\", "/") );
			}
		});	
		
	}
}