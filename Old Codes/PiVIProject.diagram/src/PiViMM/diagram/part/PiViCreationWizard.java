package PiViMM.diagram.part;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

/**
 * @generated
 */
public class PiViCreationWizard extends Wizard implements INewWizard {

	/**
	* @generated
	*/
	private IWorkbench workbench;

	/**
	* @generated
	*/
	protected IStructuredSelection selection;

	/**
	* @generated
	*/
	protected PiViMM.diagram.part.PiViCreationWizardPage diagramModelFilePage;

	/**
	* @generated
	*/
	protected PiViMM.diagram.part.PiViCreationWizardPage domainModelFilePage;

	/**
	* @generated
	*/
	protected Resource diagram;

	/**
	* @generated
	*/
	private boolean openNewlyCreatedDiagramEditor = true;

	/**
	* @generated
	*/
	public IWorkbench getWorkbench() {
		return workbench;
	}

	/**
	* @generated
	*/
	public IStructuredSelection getSelection() {
		return selection;
	}

	/**
	* @generated
	*/
	public final Resource getDiagram() {
		return diagram;
	}

	/**
	* @generated
	*/
	public final boolean isOpenNewlyCreatedDiagramEditor() {
		return openNewlyCreatedDiagramEditor;
	}

	/**
	* @generated
	*/
	public void setOpenNewlyCreatedDiagramEditor(boolean openNewlyCreatedDiagramEditor) {
		this.openNewlyCreatedDiagramEditor = openNewlyCreatedDiagramEditor;
	}

	/**
	* @generated
	*/
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(PiViMM.diagram.part.Messages.PiViCreationWizardTitle);
		setDefaultPageImageDescriptor(PiViMM.diagram.part.PiViDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewPiViMMWizard.gif")); //$NON-NLS-1$
		setNeedsProgressMonitor(true);
	}

	/**
	* @generated
	*/
	public void addPages() {
		diagramModelFilePage = new PiViMM.diagram.part.PiViCreationWizardPage("DiagramModelFile", getSelection(), //$NON-NLS-1$
				"pivimm_diagram"); //$NON-NLS-1$
		diagramModelFilePage.setTitle(PiViMM.diagram.part.Messages.PiViCreationWizard_DiagramModelFilePageTitle);
		diagramModelFilePage
				.setDescription(PiViMM.diagram.part.Messages.PiViCreationWizard_DiagramModelFilePageDescription);
		addPage(diagramModelFilePage);

		domainModelFilePage = new PiViMM.diagram.part.PiViCreationWizardPage("DomainModelFile", getSelection(), //$NON-NLS-1$
				"pivimm") { //$NON-NLS-1$

			public void setVisible(boolean visible) {
				if (visible) {
					String fileName = diagramModelFilePage.getFileName();
					fileName = fileName.substring(0, fileName.length() - ".pivimm_diagram".length()); //$NON-NLS-1$
					setFileName(PiViMM.diagram.part.PiViDiagramEditorUtil.getUniqueFileName(getContainerFullPath(),
							fileName, "pivimm")); //$NON-NLS-1$
				}
				super.setVisible(visible);
			}
		};
		domainModelFilePage.setTitle(PiViMM.diagram.part.Messages.PiViCreationWizard_DomainModelFilePageTitle);
		domainModelFilePage
				.setDescription(PiViMM.diagram.part.Messages.PiViCreationWizard_DomainModelFilePageDescription);
		addPage(domainModelFilePage);
	}

	/**
	* @generated
	*/
	public boolean performFinish() {
		IRunnableWithProgress op = new WorkspaceModifyOperation(null) {

			protected void execute(IProgressMonitor monitor) throws CoreException, InterruptedException {
				diagram = PiViMM.diagram.part.PiViDiagramEditorUtil.createDiagram(diagramModelFilePage.getURI(),
						domainModelFilePage.getURI(), monitor);
				if (isOpenNewlyCreatedDiagramEditor() && diagram != null) {
					try {
						PiViMM.diagram.part.PiViDiagramEditorUtil.openDiagram(diagram);
					} catch (PartInitException e) {
						ErrorDialog.openError(getContainer().getShell(),
								PiViMM.diagram.part.Messages.PiViCreationWizardOpenEditorError, null, e.getStatus());
					}
				}
			}
		};
		try {
			getContainer().run(false, true, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			if (e.getTargetException() instanceof CoreException) {
				ErrorDialog.openError(getContainer().getShell(),
						PiViMM.diagram.part.Messages.PiViCreationWizardCreationError, null,
						((CoreException) e.getTargetException()).getStatus());
			} else {
				PiViMM.diagram.part.PiViDiagramEditorPlugin.getInstance().logError("Error creating diagram", //$NON-NLS-1$
						e.getTargetException());
			}
			return false;
		}
		return diagram != null;
	}
}
