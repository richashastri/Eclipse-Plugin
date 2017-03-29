package SquareMM.diagram.part;

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
public class SquareCreationWizard extends Wizard implements INewWizard {

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
	protected SquareMM.diagram.part.SquareCreationWizardPage diagramModelFilePage;

	/**
	* @generated
	*/
	protected SquareMM.diagram.part.SquareCreationWizardPage domainModelFilePage;

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
		setWindowTitle(SquareMM.diagram.part.Messages.SquareCreationWizardTitle);
		setDefaultPageImageDescriptor(SquareMM.diagram.part.SquareDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewSquareMMWizard.gif")); //$NON-NLS-1$
		setNeedsProgressMonitor(true);
	}

	/**
	* @generated
	*/
	public void addPages() {
		diagramModelFilePage = new SquareMM.diagram.part.SquareCreationWizardPage("DiagramModelFile", getSelection(), //$NON-NLS-1$
				"squaremm_diagram"); //$NON-NLS-1$
		diagramModelFilePage.setTitle(SquareMM.diagram.part.Messages.SquareCreationWizard_DiagramModelFilePageTitle);
		diagramModelFilePage
				.setDescription(SquareMM.diagram.part.Messages.SquareCreationWizard_DiagramModelFilePageDescription);
		addPage(diagramModelFilePage);

		domainModelFilePage = new SquareMM.diagram.part.SquareCreationWizardPage("DomainModelFile", getSelection(), //$NON-NLS-1$
				"squaremm") { //$NON-NLS-1$

			public void setVisible(boolean visible) {
				if (visible) {
					String fileName = diagramModelFilePage.getFileName();
					fileName = fileName.substring(0, fileName.length() - ".squaremm_diagram".length()); //$NON-NLS-1$
					setFileName(SquareMM.diagram.part.SquareDiagramEditorUtil.getUniqueFileName(getContainerFullPath(),
							fileName, "squaremm")); //$NON-NLS-1$
				}
				super.setVisible(visible);
			}
		};
		domainModelFilePage.setTitle(SquareMM.diagram.part.Messages.SquareCreationWizard_DomainModelFilePageTitle);
		domainModelFilePage
				.setDescription(SquareMM.diagram.part.Messages.SquareCreationWizard_DomainModelFilePageDescription);
		addPage(domainModelFilePage);
	}

	/**
	* @generated
	*/
	public boolean performFinish() {
		IRunnableWithProgress op = new WorkspaceModifyOperation(null) {

			protected void execute(IProgressMonitor monitor) throws CoreException, InterruptedException {
				diagram = SquareMM.diagram.part.SquareDiagramEditorUtil.createDiagram(diagramModelFilePage.getURI(),
						domainModelFilePage.getURI(), monitor);
				if (isOpenNewlyCreatedDiagramEditor() && diagram != null) {
					try {
						SquareMM.diagram.part.SquareDiagramEditorUtil.openDiagram(diagram);
					} catch (PartInitException e) {
						ErrorDialog.openError(getContainer().getShell(),
								SquareMM.diagram.part.Messages.SquareCreationWizardOpenEditorError, null,
								e.getStatus());
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
						SquareMM.diagram.part.Messages.SquareCreationWizardCreationError, null,
						((CoreException) e.getTargetException()).getStatus());
			} else {
				SquareMM.diagram.part.SquareDiagramEditorPlugin.getInstance().logError("Error creating diagram", //$NON-NLS-1$
						e.getTargetException());
			}
			return false;
		}
		return diagram != null;
	}
}
