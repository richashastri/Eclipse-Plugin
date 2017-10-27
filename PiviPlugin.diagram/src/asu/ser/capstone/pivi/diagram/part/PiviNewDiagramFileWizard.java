package asu.ser.capstone.pivi.diagram.part;

/**
 * @generated
 */
public class PiviNewDiagramFileWizard extends org.eclipse.jface.wizard.Wizard {

	/**
 * @generated
 */
	private 
org.eclipse.ui.dialogs.WizardNewFileCreationPage myFileCreationPage;

	/**
 * @generated
 */
	private asu.ser.capstone.pivi.diagram.part.ModelElementSelectionPage diagramRootElementSelectionPage;

	/**
 * @generated
 */
	private org.eclipse.emf.transaction.TransactionalEditingDomain myEditingDomain;

	/**
 * @generated
 */
	public PiviNewDiagramFileWizard(org.eclipse.emf.common.util.URI domainModelURI,
			org.eclipse.emf.ecore.EObject diagramRoot,
			org.eclipse.emf.transaction.TransactionalEditingDomain editingDomain) {
		assert domainModelURI != null : "Domain model uri must be specified"; //$NON-NLS-1$
	    assert diagramRoot != null : "Doagram root element must be specified"; //$NON-NLS-1$
	    assert editingDomain != null : "Editing domain must be specified"; //$NON-NLS-1$

		myFileCreationPage = new 
org.eclipse.ui.dialogs.WizardNewFileCreationPage(asu.ser.capstone.pivi.diagram.part.Messages.PiviNewDiagramFileWizard_CreationPageName, org.eclipse.jface.viewers.StructuredSelection.EMPTY);
		myFileCreationPage.setTitle(asu.ser.capstone.pivi.diagram.part.Messages.PiviNewDiagramFileWizard_CreationPageTitle);
		myFileCreationPage.setDescription(org.eclipse.osgi.util.NLS.bind(
				asu.ser.capstone.pivi.diagram.part.Messages.PiviNewDiagramFileWizard_CreationPageDescription, 
				asu.ser.capstone.pivi.diagram.edit.parts.PiviDiagramEditPart.MODEL_ID));
		org.eclipse.core.runtime.IPath filePath;
		String fileName = org.eclipse.emf.common.util.URI.decode(domainModelURI.trimFileExtension().lastSegment());
		if (domainModelURI.isPlatformResource()) {
			filePath = new org.eclipse.core.runtime.Path(domainModelURI.trimSegments(1).toPlatformString(true));
		} else if (domainModelURI.isFile()) {
			filePath = new org.eclipse.core.runtime.Path(domainModelURI.trimSegments(1).toFileString());
		} else {
			// TODO : use some default path
			throw new IllegalArgumentException("Unsupported URI: " + domainModelURI);  //$NON-NLS-1$
		}
		myFileCreationPage.setContainerFullPath(filePath);
		myFileCreationPage.setFileName(asu.ser.capstone.pivi.diagram.part.PiviDiagramEditorUtil.getUniqueFileName(
				filePath, fileName, "pivi_diagram"));  //$NON-NLS-1$

		diagramRootElementSelectionPage = new DiagramRootElementSelectionPage(asu.ser.capstone.pivi.diagram.part.Messages.PiviNewDiagramFileWizard_RootSelectionPageName);
		diagramRootElementSelectionPage.setTitle(asu.ser.capstone.pivi.diagram.part.Messages.PiviNewDiagramFileWizard_RootSelectionPageTitle);
		diagramRootElementSelectionPage.setDescription(asu.ser.capstone.pivi.diagram.part.Messages.PiviNewDiagramFileWizard_RootSelectionPageDescription);
		diagramRootElementSelectionPage.setModelElement(diagramRoot);

	   	myEditingDomain = editingDomain;
	}

	/**
 * @generated
 */
	public void addPages() {
		addPage(myFileCreationPage);
		addPage(diagramRootElementSelectionPage);
	}

	/**
 * @generated
 */
	public boolean performFinish() {
		java.util.LinkedList<org.eclipse.core.resources.IFile> affectedFiles = new java.util.LinkedList<org.eclipse.core.resources.IFile>();
				org.eclipse.core.resources.IFile diagramFile = myFileCreationPage.createNewFile();
		asu.ser.capstone.pivi.diagram.part.PiviDiagramEditorUtil.setCharset(diagramFile);
		affectedFiles.add(diagramFile);
		org.eclipse.emf.common.util.URI diagramModelURI = org.eclipse.emf.common.util.URI.createPlatformResourceURI(diagramFile.getFullPath().toString(), true);
				org.eclipse.emf.ecore.resource.ResourceSet resourceSet = myEditingDomain.getResourceSet();
		final org.eclipse.emf.ecore.resource.Resource diagramResource = resourceSet.createResource(diagramModelURI);
		org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand command =
			new org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand(
				myEditingDomain, asu.ser.capstone.pivi.diagram.part.Messages.PiviNewDiagramFileWizard_InitDiagramCommand, affectedFiles) {

			protected org.eclipse.gmf.runtime.common.core.command.CommandResult doExecuteWithResult(
					org.eclipse.core.runtime.IProgressMonitor monitor, org.eclipse.core.runtime.IAdaptable info)
						throws org.eclipse.core.commands.ExecutionException {
				int diagramVID = asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getDiagramVisualID(diagramRootElementSelectionPage.getModelElement());
				if (diagramVID != asu.ser.capstone.pivi.diagram.edit.parts.PiviDiagramEditPart.VISUAL_ID) {
					return org.eclipse.gmf.runtime.common.core.command.CommandResult.newErrorCommandResult(
						asu.ser.capstone.pivi.diagram.part.Messages.PiviNewDiagramFileWizard_IncorrectRootError);
				}
				org.eclipse.gmf.runtime.notation.Diagram diagram =
					org.eclipse.gmf.runtime.diagram.core.services.ViewService.createDiagram(
						diagramRootElementSelectionPage.getModelElement(), asu.ser.capstone.pivi.diagram.edit.parts.PiviDiagramEditPart.MODEL_ID,
						asu.ser.capstone.pivi.diagram.part.PiviDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				diagramResource.getContents().add(diagram);
												return org.eclipse.gmf.runtime.common.core.command.CommandResult.newOKCommandResult();
			}
		};
		try {
			org.eclipse.core.commands.operations.OperationHistoryFactory.getOperationHistory().execute(
				command, new org.eclipse.core.runtime.NullProgressMonitor(), null);
			diagramResource.save(asu.ser.capstone.pivi.diagram.part.PiviDiagramEditorUtil.getSaveOptions());
			asu.ser.capstone.pivi.diagram.part.PiviDiagramEditorUtil.openDiagram(diagramResource);
		} catch (org.eclipse.core.commands.ExecutionException e) {
			asu.ser.capstone.pivi.diagram.part.PiviDiagramEditorPlugin.getInstance().logError(
				"Unable to create model and diagram", e);  //$NON-NLS-1$
		} catch (java.io.IOException ex) {
			asu.ser.capstone.pivi.diagram.part.PiviDiagramEditorPlugin.getInstance().logError(
				"Save operation failed for: " + diagramModelURI, ex);  //$NON-NLS-1$
		} catch (org.eclipse.ui.PartInitException ex) {
			asu.ser.capstone.pivi.diagram.part.PiviDiagramEditorPlugin.getInstance().logError(
				"Unable to open editor", ex);  //$NON-NLS-1$
		}			
		return true;
	}

	/**
 * @generated
 */
	private static class DiagramRootElementSelectionPage extends asu.ser.capstone.pivi.diagram.part.ModelElementSelectionPage {

		/**
 * @generated
 */
		protected DiagramRootElementSelectionPage(String pageName) {
			super(pageName);
		}

		/**
 * @generated
 */
		protected String getSelectionTitle() {
			return asu.ser.capstone.pivi.diagram.part.Messages.PiviNewDiagramFileWizard_RootSelectionPageSelectionTitle;
		}

		/**
 * @generated
 */
		protected boolean validatePage() {
			if (selectedModelElement == null) {
				setErrorMessage(asu.ser.capstone.pivi.diagram.part.Messages.PiviNewDiagramFileWizard_RootSelectionPageNoSelectionMessage);
				return false;
			}
			boolean result = org.eclipse.gmf.runtime.diagram.core.services.ViewService.getInstance().provides(
				new org.eclipse.gmf.runtime.diagram.core.services.view.CreateDiagramViewOperation(
					new org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter(selectedModelElement),
					asu.ser.capstone.pivi.diagram.edit.parts.PiviDiagramEditPart.MODEL_ID, asu.ser.capstone.pivi.diagram.part.PiviDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT));
			setErrorMessage(result ? null : asu.ser.capstone.pivi.diagram.part.Messages.PiviNewDiagramFileWizard_RootSelectionPageInvalidSelectionMessage);
			return result;
		}
	}
}
