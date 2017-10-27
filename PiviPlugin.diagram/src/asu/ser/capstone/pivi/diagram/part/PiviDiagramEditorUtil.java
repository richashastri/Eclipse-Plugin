	package asu.ser.capstone.pivi.diagram.part;

/**
 * @generated
 */
public class PiviDiagramEditorUtil {

	/**
 * @generated
 */
	public static java.util.Map<?, ?> getSaveOptions() {
		java.util.HashMap<String, Object> saveOptions= new java.util.HashMap<String, Object>();
		saveOptions.put(org.eclipse.emf.ecore.xmi.XMLResource.OPTION_ENCODING, "UTF-8");  //$NON-NLS-1$
		saveOptions.put(org.eclipse.emf.ecore.resource.Resource.OPTION_SAVE_ONLY_IF_CHANGED, org.eclipse.emf.ecore.resource.Resource.OPTION_SAVE_ONLY_IF_CHANGED_MEMORY_BUFFER);
		return saveOptions;
	}

	/**
 * @generated
 */
	public static boolean openDiagram(org.eclipse.emf.ecore.resource.Resource diagram) throws org.eclipse.ui.PartInitException {
		String path = diagram.getURI().toPlatformString(true);
		org.eclipse.core.resources.IResource workspaceResource = org.eclipse.core.resources.ResourcesPlugin.getWorkspace().getRoot().findMember(new org.eclipse.core.runtime.Path(path));
		if (workspaceResource instanceof org.eclipse.core.resources.IFile) {
			org.eclipse.ui.IWorkbenchPage page = org.eclipse.ui.PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
			return null != page.openEditor(new org.eclipse.ui.part.FileEditorInput((org.eclipse.core.resources.IFile) workspaceResource), asu.ser.capstone.pivi.diagram.part.PiviDiagramEditor.ID);
		}
		return false;
	}

		/**
 * @generated
 */
	public static void setCharset(org.eclipse.core.resources.IFile file) {
		if (file == null) {
			return;
		}
		try {
			file.setCharset("UTF-8", new org.eclipse.core.runtime.NullProgressMonitor());  //$NON-NLS-1$
		} catch (org.eclipse.core.runtime.CoreException e) {
			asu.ser.capstone.pivi.diagram.part.PiviDiagramEditorPlugin.getInstance().logError("Unable to set charset for file " + file.getFullPath(), e);  //$NON-NLS-1$
		}
	}	

	/**
 * @generated
 */
	public static String getUniqueFileName(org.eclipse.core.runtime.IPath containerFullPath, String fileName, String extension) {
		if (containerFullPath == null) {
			containerFullPath = new org.eclipse.core.runtime.Path("");  //$NON-NLS-1$
		}
		if (fileName == null || fileName.trim().length() == 0) {
			fileName = "default";  //$NON-NLS-1$
		}
		org.eclipse.core.runtime.IPath filePath = containerFullPath.append(fileName);
		if (extension != null && !extension.equals(filePath.getFileExtension())) {
			filePath = filePath.addFileExtension(extension);
		}
		extension = filePath.getFileExtension();
		fileName = filePath.removeFileExtension().lastSegment();
		int i = 1;
		while (
					org.eclipse.core.resources.ResourcesPlugin.getWorkspace().getRoot().exists(filePath)
				) {
			i++;
			filePath = containerFullPath.append(fileName + i);
			if (extension != null) {
				filePath = filePath.addFileExtension(extension);
			}
		}
		return filePath.lastSegment();
	}



	/**
	 * Runs the wizard in a dialog.
	 * 
	 * @generated
	 */
	public static void runWizard(org.eclipse.swt.widgets.Shell shell, org.eclipse.jface.wizard.Wizard wizard, String settingsKey) {
		org.eclipse.jface.dialogs.IDialogSettings pluginDialogSettings = asu.ser.capstone.pivi.diagram.part.PiviDiagramEditorPlugin.getInstance().getDialogSettings();
		org.eclipse.jface.dialogs.IDialogSettings wizardDialogSettings = pluginDialogSettings.getSection(settingsKey);
		if (wizardDialogSettings == null) {
			wizardDialogSettings = pluginDialogSettings.addNewSection(settingsKey);
		}
		wizard.setDialogSettings(wizardDialogSettings);
		org.eclipse.jface.wizard.WizardDialog dialog = new org.eclipse.jface.wizard.WizardDialog(shell, wizard);
		dialog.create();
		dialog.getShell().setSize(Math.max(500, dialog.getShell().getSize().x), 500);
		dialog.open();
	}

	/**
 * This method should be called within a workspace modify operation since it creates resources.
 * @generated
 */
	public static org.eclipse.emf.ecore.resource.Resource createDiagram(org.eclipse.emf.common.util.URI diagramURI, org.eclipse.emf.common.util.URI modelURI, org.eclipse.core.runtime.IProgressMonitor progressMonitor) {
		org.eclipse.emf.transaction.TransactionalEditingDomain editingDomain = org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory.INSTANCE.createEditingDomain();
		progressMonitor.beginTask(asu.ser.capstone.pivi.diagram.part.Messages.PiviDiagramEditorUtil_CreateDiagramProgressTask, 3);
		final org.eclipse.emf.ecore.resource.Resource diagramResource = editingDomain.getResourceSet().createResource(diagramURI);
		final org.eclipse.emf.ecore.resource.Resource modelResource = editingDomain.getResourceSet().createResource(modelURI);
		final String diagramName = diagramURI.lastSegment();
		org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand command = new org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand(editingDomain, asu.ser.capstone.pivi.diagram.part.Messages.PiviDiagramEditorUtil_CreateDiagramCommandLabel, java.util.Collections.EMPTY_LIST) {
			protected org.eclipse.gmf.runtime.common.core.command.CommandResult doExecuteWithResult(org.eclipse.core.runtime.IProgressMonitor monitor, org.eclipse.core.runtime.IAdaptable info) throws org.eclipse.core.commands.ExecutionException {
				asu.ser.capstone.pivi.PiviDiagram model = createInitialModel();
				attachModelToResource(model, modelResource);

				org.eclipse.gmf.runtime.notation.Diagram diagram = org.eclipse.gmf.runtime.diagram.core.services.ViewService.createDiagram(
				model, 
					asu.ser.capstone.pivi.diagram.edit.parts.PiviDiagramEditPart.MODEL_ID, asu.ser.capstone.pivi.diagram.part.PiviDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				if (diagram != null) {
					diagramResource.getContents().add(diagram);
					diagram.setName(diagramName);
					diagram.setElement(model);
				}
				
				try {
					modelResource.save(asu.ser.capstone.pivi.diagram.part.PiviDiagramEditorUtil.getSaveOptions());
					diagramResource.save(asu.ser.capstone.pivi.diagram.part.PiviDiagramEditorUtil.getSaveOptions());
				} catch (java.io.IOException e) {
					
					asu.ser.capstone.pivi.diagram.part.PiviDiagramEditorPlugin.getInstance().logError("Unable to store model and diagram resources", e);  //$NON-NLS-1$
				}
				return org.eclipse.gmf.runtime.common.core.command.CommandResult.newOKCommandResult();
			}
		};
		try {
			org.eclipse.core.commands.operations.OperationHistoryFactory.getOperationHistory().execute(command, new org.eclipse.core.runtime.SubProgressMonitor(progressMonitor, 1), null);
		} catch (org.eclipse.core.commands.ExecutionException e) {
			asu.ser.capstone.pivi.diagram.part.PiviDiagramEditorPlugin.getInstance().logError("Unable to create model and diagram", e);  //$NON-NLS-1$
		}
		setCharset(org.eclipse.emf.workspace.util.WorkspaceSynchronizer.getFile(modelResource));
		setCharset(org.eclipse.emf.workspace.util.WorkspaceSynchronizer.getFile(diagramResource));
		return diagramResource;
	}

	
	/**
 * Create a new instance of domain element associated with canvas.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
	private static asu.ser.capstone.pivi.PiviDiagram createInitialModel() {
		return asu.ser.capstone.pivi.PiviFactory.eINSTANCE.createPiviDiagram();
	}

	
	/**
 * Store model element in the resource.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
	private static void attachModelToResource(asu.ser.capstone.pivi.PiviDiagram model, org.eclipse.emf.ecore.resource.Resource resource) {
		resource.getContents().add(model);
	}

	



	/**
 * @generated
 */
	public static void selectElementsInDiagram(org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramWorkbenchPart diagramPart, java.util.List<org.eclipse.gef.EditPart> editParts) {
		diagramPart.getDiagramGraphicalViewer().deselectAll();

		org.eclipse.gef.EditPart firstPrimary = null;
		for (org.eclipse.gef.EditPart nextPart : editParts) {
			diagramPart.getDiagramGraphicalViewer().appendSelection(nextPart);
			if(firstPrimary == null && nextPart instanceof org.eclipse.gmf.runtime.diagram.ui.editparts.IPrimaryEditPart) {
				firstPrimary = nextPart;
			}
		}

		if(!editParts.isEmpty()) {
			diagramPart.getDiagramGraphicalViewer().reveal(firstPrimary != null ? firstPrimary : (org.eclipse.gef.EditPart)editParts.get(0));
		}
	}


	/**
 * @generated
 */
	private static int findElementsInDiagramByID(org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart diagramPart, org.eclipse.emf.ecore.EObject element, java.util.List<org.eclipse.gef.EditPart> editPartCollector) {
		org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramGraphicalViewer viewer = (org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramGraphicalViewer) diagramPart.getViewer();
		final int intialNumOfEditParts = editPartCollector.size();
		
		if (element instanceof org.eclipse.gmf.runtime.notation.View) { // support notation element lookup
			org.eclipse.gef.EditPart editPart = (org.eclipse.gef.EditPart) viewer.getEditPartRegistry().get(element);
			if (editPart != null) {
				editPartCollector.add(editPart);
				return 1;
			}
		}

		String elementID = org.eclipse.gmf.runtime.emf.core.util.EMFCoreUtil.getProxyID(element);
		@SuppressWarnings("unchecked")
		java.util.List<org.eclipse.gef.EditPart> associatedParts = viewer.findEditPartsForElement(elementID, org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart.class);
		// perform the possible hierarchy disjoint -> take the top-most parts only
		for (org.eclipse.gef.EditPart nextPart : associatedParts) {
			org.eclipse.gef.EditPart parentPart = nextPart.getParent();
			while (parentPart != null && !associatedParts.contains(parentPart)) {
				parentPart = parentPart.getParent();
			}
			if (parentPart == null) {
				editPartCollector.add(nextPart);
			}
		}

		if (intialNumOfEditParts == editPartCollector.size()) {
			if (!associatedParts.isEmpty()) {
				editPartCollector.add(associatedParts.get(0));
			} else {
				if (element.eContainer() != null) {
					return findElementsInDiagramByID(diagramPart, element.eContainer(), editPartCollector);
				}
			}
		}
		return editPartCollector.size() - intialNumOfEditParts;
	}


	/**
 * @generated
 */
	public static org.eclipse.gmf.runtime.notation.View findView(org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart diagramEditPart, org.eclipse.emf.ecore.EObject targetElement, LazyElement2ViewMap lazyElement2ViewMap) {
		boolean hasStructuralURI = false;						
		if(targetElement.eResource() instanceof org.eclipse.emf.ecore.xmi.XMLResource) {
			hasStructuralURI = ((org.eclipse.emf.ecore.xmi.XMLResource)targetElement.eResource()).getID(targetElement) == null;
		}
		
		org.eclipse.gmf.runtime.notation.View view = null;
		java.util.LinkedList<org.eclipse.gef.EditPart> editPartHolder = new java.util.LinkedList<org.eclipse.gef.EditPart>();
		if(hasStructuralURI && !lazyElement2ViewMap.getElement2ViewMap().isEmpty()) {
			view = lazyElement2ViewMap.getElement2ViewMap().get(targetElement);
		} else if (findElementsInDiagramByID(diagramEditPart, targetElement, editPartHolder) > 0) {
			org.eclipse.gef.EditPart editPart = editPartHolder.get(0);
			view = editPart.getModel() instanceof org.eclipse.gmf.runtime.notation.View ? (org.eclipse.gmf.runtime.notation.View) editPart.getModel() : null;
		}
	
		return (view == null) ? diagramEditPart.getDiagramView() : view;
	}

	/**
 * XXX This is quite suspicious code (especially editPartTmpHolder) and likely to be removed soon
 * @generated
 */
	public static class LazyElement2ViewMap {
		/**
 * @generated
 */
		private java.util.Map<org.eclipse.emf.ecore.EObject, org.eclipse.gmf.runtime.notation.View> element2ViewMap;

		/**
 * @generated
 */
		private org.eclipse.gmf.runtime.notation.View scope;

		/**
 * @generated
 */
		private java.util.Set<? extends org.eclipse.emf.ecore.EObject> elementSet;

		/**
 * @generated
 */
		public LazyElement2ViewMap(org.eclipse.gmf.runtime.notation.View scope, java.util.Set<? extends org.eclipse.emf.ecore.EObject> elements) {
			this.scope = scope;
			this.elementSet = elements;
		}

		/**
 * @generated
 */
		public final java.util.Map<org.eclipse.emf.ecore.EObject, org.eclipse.gmf.runtime.notation.View> getElement2ViewMap() {
			if(element2ViewMap == null) {
				element2ViewMap = new java.util.HashMap<org.eclipse.emf.ecore.EObject, org.eclipse.gmf.runtime.notation.View>();
				// map possible notation elements to itself as these can't be found by view.getElement()
				for (org.eclipse.emf.ecore.EObject element : elementSet) {
					if(element instanceof org.eclipse.gmf.runtime.notation.View) {
						org.eclipse.gmf.runtime.notation.View view = (org.eclipse.gmf.runtime.notation.View) element;
						if(view.getDiagram() == scope.getDiagram()) {
							element2ViewMap.put(element, view); // take only those that part of our diagram
						}
					}
				}
				
				buildElement2ViewMap(scope, element2ViewMap, elementSet);					
			}
			return element2ViewMap;
		}
		/**
 * @generated
 */
		private static boolean buildElement2ViewMap(org.eclipse.gmf.runtime.notation.View parentView, java.util.Map<org.eclipse.emf.ecore.EObject, org.eclipse.gmf.runtime.notation.View> element2ViewMap, java.util.Set<? extends org.eclipse.emf.ecore.EObject> elements) {
			if (elements.size() == element2ViewMap.size()) {
				return true;
			}

			if(parentView.isSetElement() && !element2ViewMap.containsKey(parentView.getElement()) && elements.contains(parentView.getElement())) {
				element2ViewMap.put(parentView.getElement(), parentView);
				if (elements.size() == element2ViewMap.size()) {
					return true;
				}
			}
			boolean complete = false;
			for (java.util.Iterator<?> it = parentView.getChildren().iterator(); it.hasNext() && !complete;) {
				complete = buildElement2ViewMap((org.eclipse.gmf.runtime.notation.View) it.next(), element2ViewMap, elements);			
			}
			for (java.util.Iterator<?> it = parentView.getSourceEdges().iterator(); it.hasNext() && !complete;) {
				complete = buildElement2ViewMap((org.eclipse.gmf.runtime.notation.View) it.next(), element2ViewMap, elements);			
			}
			for (java.util.Iterator<?> it = parentView.getTargetEdges().iterator(); it.hasNext() && !complete;) {
				complete = buildElement2ViewMap((org.eclipse.gmf.runtime.notation.View) it.next(), element2ViewMap, elements);			
			}	
			return complete;
		}
	} //LazyElement2ViewMap	



}
