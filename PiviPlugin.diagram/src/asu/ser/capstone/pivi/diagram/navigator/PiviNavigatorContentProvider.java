	package asu.ser.capstone.pivi.diagram.navigator;

/**
 * @generated
 */
public class PiviNavigatorContentProvider implements org.eclipse.ui.navigator.ICommonContentProvider {

		/**
 * @generated
 */
private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
 * @generated
 */
private org.eclipse.jface.viewers.Viewer myViewer;

	/**
 * @generated
 */
private org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain myEditingDomain;

	/**
 * @generated
 */
private org.eclipse.emf.workspace.util.WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
 * @generated
 */
private Runnable myViewerRefreshRunnable;
	
	/**
 * @generated
 */
@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
public PiviNavigatorContentProvider() {
	org.eclipse.emf.transaction.TransactionalEditingDomain editingDomain = org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory.INSTANCE.createEditingDomain();
myEditingDomain = (org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain) editingDomain;
myEditingDomain.setResourceToReadOnlyMap(new java.util.HashMap() {
	public Object get(Object key) {
		if (!containsKey(key)) {
			put(key, Boolean.TRUE);
		}
		return super.get(key);
	}
});
myViewerRefreshRunnable = new Runnable() {
	public void run() {
		if (myViewer != null) {
			myViewer.refresh();
		}
	}
};
myWorkspaceSynchronizer = new org.eclipse.emf.workspace.util.WorkspaceSynchronizer(editingDomain, new org.eclipse.emf.workspace.util.WorkspaceSynchronizer.Delegate() {
	public void dispose() {
	}

	public boolean handleResourceChanged(final org.eclipse.emf.ecore.resource.Resource resource) {
		unloadAllResources();
asyncRefresh();
return true;
	}
	
	public boolean handleResourceDeleted(org.eclipse.emf.ecore.resource.Resource resource) {
		unloadAllResources();
asyncRefresh();
return true;
	}
	
	public boolean handleResourceMoved(org.eclipse.emf.ecore.resource.Resource resource, final org.eclipse.emf.common.util.URI newURI) {
		unloadAllResources();
asyncRefresh();
return true;
	}
});
}

		/**
 * @generated
 */
public void dispose() {
	myWorkspaceSynchronizer.dispose();
	myWorkspaceSynchronizer = null;
	myViewerRefreshRunnable = null;
	myViewer = null;
	unloadAllResources();
	((org.eclipse.emf.transaction.TransactionalEditingDomain) myEditingDomain).dispose();
	myEditingDomain = null;
}
	
		/**
 * @generated
 */
public void inputChanged(org.eclipse.jface.viewers.Viewer viewer, Object oldInput, Object newInput) {
	myViewer = viewer;
}
	
	
	/**
 * @generated
 */
	void unloadAllResources() {
		for (org.eclipse.emf.ecore.resource.Resource nextResource : myEditingDomain.getResourceSet().getResources()) {
			nextResource.unload();
		}
	}
	
	/**
 * @generated
 */
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay().asyncExec(myViewerRefreshRunnable);
		}
	}
	
	/**
 * @generated
 */
public Object[] getElements(Object inputElement) {
	return getChildren(inputElement);
}
	
	/**
 * @generated
 */
public void restoreState(org.eclipse.ui.IMemento aMemento) {
}

/**
 * @generated
 */
public void saveState(org.eclipse.ui.IMemento aMemento) {
}
    
    /**
 * @generated
 */
public void init(org.eclipse.ui.navigator.ICommonContentExtensionSite aConfig) {
}
    
    	/**
 * @generated
 */
public Object[] getChildren(Object parentElement) {
	if (parentElement instanceof org.eclipse.core.resources.IFile) {
		org.eclipse.core.resources.IFile file = (org.eclipse.core.resources.IFile) parentElement;
org.eclipse.emf.common.util.URI fileURI = org.eclipse.emf.common.util.URI.createPlatformResourceURI(file.getFullPath().toString(), true);
org.eclipse.emf.ecore.resource.Resource resource = myEditingDomain.getResourceSet().getResource(fileURI, true);
	java.util.ArrayList<asu.ser.capstone.pivi.diagram.navigator.PiviNavigatorItem> result = new java.util.ArrayList<asu.ser.capstone.pivi.diagram.navigator.PiviNavigatorItem>();
					java.util.ArrayList<org.eclipse.gmf.runtime.notation.View> topViews = new java.util.ArrayList<org.eclipse.gmf.runtime.notation.View>(resource.getContents().size());
		for (org.eclipse.emf.ecore.EObject o : resource.getContents()) {
			if (o instanceof org.eclipse.gmf.runtime.notation.View) {
				topViews.add((org.eclipse.gmf.runtime.notation.View) o);
			}
		}
					result.addAll(createNavigatorItems(selectViewsByType(topViews, asu.ser.capstone.pivi.diagram.edit.parts.PiviDiagramEditPart.MODEL_ID), file, false));
						return result.toArray();
   	} 
    	
   	if (parentElement instanceof asu.ser.capstone.pivi.diagram.navigator.PiviNavigatorGroup) {
	asu.ser.capstone.pivi.diagram.navigator.PiviNavigatorGroup group = (asu.ser.capstone.pivi.diagram.navigator.PiviNavigatorGroup) parentElement;
return group.getChildren();
	} 
		
	if (parentElement instanceof asu.ser.capstone.pivi.diagram.navigator.PiviNavigatorItem) {
	asu.ser.capstone.pivi.diagram.navigator.PiviNavigatorItem navigatorItem = (asu.ser.capstone.pivi.diagram.navigator.PiviNavigatorItem) parentElement;
if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
	return EMPTY_ARRAY;
}
return getViewChildren(navigatorItem.getView(), parentElement);
	}
		
		return EMPTY_ARRAY;
}
    
	/**
 * @generated
 */
private Object[] getViewChildren(org.eclipse.gmf.runtime.notation.View view, Object parentElement) {
   	switch (asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getVisualID(view)) {
	
case asu.ser.capstone.pivi.diagram.edit.parts.InstructionEditPart.VISUAL_ID: {
	java.util.LinkedList<asu.ser.capstone.pivi.diagram.navigator.PiviAbstractNavigatorItem> result = new java.util.LinkedList<asu.ser.capstone.pivi.diagram.navigator.PiviAbstractNavigatorItem>();
		org.eclipse.gmf.runtime.notation.Node sv = (org.eclipse.gmf.runtime.notation.Node) view;
							java.util.Collection<org.eclipse.gmf.runtime.notation.View> connectedViews;
														connectedViews = 						getChildrenByType						(java.util.Collections.singleton(sv)					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.InstructionInstructionFigureCompartmentEditPart.VISUAL_ID));
									connectedViews = 						getChildrenByType						(connectedViews					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.InputPortEditPart.VISUAL_ID));
								result.addAll(createNavigatorItems(connectedViews, parentElement, false));
																	connectedViews = 						getChildrenByType						(java.util.Collections.singleton(sv)					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.InstructionInstructionFigureCompartmentEditPart.VISUAL_ID));
									connectedViews = 						getChildrenByType						(connectedViews					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.StartPortEditPart.VISUAL_ID));
								result.addAll(createNavigatorItems(connectedViews, parentElement, false));
																	connectedViews = 						getChildrenByType						(java.util.Collections.singleton(sv)					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.InstructionInstructionFigureCompartmentEditPart.VISUAL_ID));
									connectedViews = 						getChildrenByType						(connectedViews					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.OutputPortEditPart.VISUAL_ID));
								result.addAll(createNavigatorItems(connectedViews, parentElement, false));
											return result.toArray();
}

case asu.ser.capstone.pivi.diagram.edit.parts.ThreadEndEditPart.VISUAL_ID: {
	java.util.LinkedList<asu.ser.capstone.pivi.diagram.navigator.PiviAbstractNavigatorItem> result = new java.util.LinkedList<asu.ser.capstone.pivi.diagram.navigator.PiviAbstractNavigatorItem>();
		org.eclipse.gmf.runtime.notation.Node sv = (org.eclipse.gmf.runtime.notation.Node) view;
							java.util.Collection<org.eclipse.gmf.runtime.notation.View> connectedViews;
														connectedViews = 						getChildrenByType						(java.util.Collections.singleton(sv)					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.ThreadEndThreadEndFigureCompartmentEditPart.VISUAL_ID));
									connectedViews = 						getChildrenByType						(connectedViews					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.InputPortEditPart.VISUAL_ID));
								result.addAll(createNavigatorItems(connectedViews, parentElement, false));
																	connectedViews = 						getChildrenByType						(java.util.Collections.singleton(sv)					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.ThreadEndThreadEndFigureCompartmentEditPart.VISUAL_ID));
									connectedViews = 						getChildrenByType						(connectedViews					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.OutputPortEditPart.VISUAL_ID));
								result.addAll(createNavigatorItems(connectedViews, parentElement, false));
																	connectedViews = 						getChildrenByType						(java.util.Collections.singleton(sv)					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.ThreadEndThreadEndFigureCompartmentEditPart.VISUAL_ID));
									connectedViews = 						getChildrenByType						(connectedViews					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.StartPortEditPart.VISUAL_ID));
								result.addAll(createNavigatorItems(connectedViews, parentElement, false));
											return result.toArray();
}

case asu.ser.capstone.pivi.diagram.edit.parts.PrintStatementEditPart.VISUAL_ID: {
	java.util.LinkedList<asu.ser.capstone.pivi.diagram.navigator.PiviAbstractNavigatorItem> result = new java.util.LinkedList<asu.ser.capstone.pivi.diagram.navigator.PiviAbstractNavigatorItem>();
		org.eclipse.gmf.runtime.notation.Node sv = (org.eclipse.gmf.runtime.notation.Node) view;
							java.util.Collection<org.eclipse.gmf.runtime.notation.View> connectedViews;
														connectedViews = 						getChildrenByType						(java.util.Collections.singleton(sv)					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.PrintStatementPrintStatementFigureCompartmentEditPart.VISUAL_ID));
									connectedViews = 						getChildrenByType						(connectedViews					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.InputPortEditPart.VISUAL_ID));
								result.addAll(createNavigatorItems(connectedViews, parentElement, false));
																	connectedViews = 						getChildrenByType						(java.util.Collections.singleton(sv)					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.PrintStatementPrintStatementFigureCompartmentEditPart.VISUAL_ID));
									connectedViews = 						getChildrenByType						(connectedViews					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.OutputPortEditPart.VISUAL_ID));
								result.addAll(createNavigatorItems(connectedViews, parentElement, false));
																	connectedViews = 						getChildrenByType						(java.util.Collections.singleton(sv)					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.PrintStatementPrintStatementFigureCompartmentEditPart.VISUAL_ID));
									connectedViews = 						getChildrenByType						(connectedViews					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.StartPortEditPart.VISUAL_ID));
								result.addAll(createNavigatorItems(connectedViews, parentElement, false));
											return result.toArray();
}

case asu.ser.capstone.pivi.diagram.edit.parts.IfStartEditPart.VISUAL_ID: {
	java.util.LinkedList<asu.ser.capstone.pivi.diagram.navigator.PiviAbstractNavigatorItem> result = new java.util.LinkedList<asu.ser.capstone.pivi.diagram.navigator.PiviAbstractNavigatorItem>();
		org.eclipse.gmf.runtime.notation.Node sv = (org.eclipse.gmf.runtime.notation.Node) view;
							java.util.Collection<org.eclipse.gmf.runtime.notation.View> connectedViews;
														connectedViews = 						getChildrenByType						(java.util.Collections.singleton(sv)					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.IfStartIfStartFigureCompartmentEditPart.VISUAL_ID));
									connectedViews = 						getChildrenByType						(connectedViews					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.InputPortEditPart.VISUAL_ID));
								result.addAll(createNavigatorItems(connectedViews, parentElement, false));
																	connectedViews = 						getChildrenByType						(java.util.Collections.singleton(sv)					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.IfStartIfStartFigureCompartmentEditPart.VISUAL_ID));
									connectedViews = 						getChildrenByType						(connectedViews					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.StartPortEditPart.VISUAL_ID));
								result.addAll(createNavigatorItems(connectedViews, parentElement, false));
																	connectedViews = 						getChildrenByType						(java.util.Collections.singleton(sv)					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.IfStartIfStartFigureCompartmentEditPart.VISUAL_ID));
									connectedViews = 						getChildrenByType						(connectedViews					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.OutputPortEditPart.VISUAL_ID));
								result.addAll(createNavigatorItems(connectedViews, parentElement, false));
											return result.toArray();
}

case asu.ser.capstone.pivi.diagram.edit.parts.PiviDiagramEditPart.VISUAL_ID: {
	java.util.LinkedList<asu.ser.capstone.pivi.diagram.navigator.PiviAbstractNavigatorItem> result = new java.util.LinkedList<asu.ser.capstone.pivi.diagram.navigator.PiviAbstractNavigatorItem>();
		org.eclipse.gmf.runtime.notation.Diagram sv = (org.eclipse.gmf.runtime.notation.Diagram) view;
				asu.ser.capstone.pivi.diagram.navigator.PiviNavigatorGroup links = new asu.ser.capstone.pivi.diagram.navigator.PiviNavigatorGroup(
	asu.ser.capstone.pivi.diagram.part.Messages.NavigatorGroupName_PiviDiagram_1000_links,
	"icons/linksNavigatorGroup.gif", parentElement);  //$NON-NLS-1$
				java.util.Collection<org.eclipse.gmf.runtime.notation.View> connectedViews;
														connectedViews = 						getChildrenByType						(java.util.Collections.singleton(sv)					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.IfStartEditPart.VISUAL_ID));
								result.addAll(createNavigatorItems(connectedViews, parentElement, false));
																	connectedViews = 						getChildrenByType						(java.util.Collections.singleton(sv)					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.WhileEndEditPart.VISUAL_ID));
								result.addAll(createNavigatorItems(connectedViews, parentElement, false));
																	connectedViews = 						getChildrenByType						(java.util.Collections.singleton(sv)					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.MethodEndEditPart.VISUAL_ID));
								result.addAll(createNavigatorItems(connectedViews, parentElement, false));
																	connectedViews = 						getChildrenByType						(java.util.Collections.singleton(sv)					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.IfEndEditPart.VISUAL_ID));
								result.addAll(createNavigatorItems(connectedViews, parentElement, false));
																	connectedViews = 						getChildrenByType						(java.util.Collections.singleton(sv)					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.InstructionEditPart.VISUAL_ID));
								result.addAll(createNavigatorItems(connectedViews, parentElement, false));
																	connectedViews = 						getChildrenByType						(java.util.Collections.singleton(sv)					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.MethodStartEditPart.VISUAL_ID));
								result.addAll(createNavigatorItems(connectedViews, parentElement, false));
																	connectedViews = 						getChildrenByType						(java.util.Collections.singleton(sv)					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.WhileStartEditPart.VISUAL_ID));
								result.addAll(createNavigatorItems(connectedViews, parentElement, false));
																	connectedViews = 						getChildrenByType						(java.util.Collections.singleton(sv)					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.StartEditPart.VISUAL_ID));
								result.addAll(createNavigatorItems(connectedViews, parentElement, false));
																	connectedViews = 						getChildrenByType						(java.util.Collections.singleton(sv)					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.ThreadEndEditPart.VISUAL_ID));
								result.addAll(createNavigatorItems(connectedViews, parentElement, false));
																	connectedViews = 						getChildrenByType						(java.util.Collections.singleton(sv)					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.ThreadStartEditPart.VISUAL_ID));
								result.addAll(createNavigatorItems(connectedViews, parentElement, false));
																	connectedViews = 						getChildrenByType						(java.util.Collections.singleton(sv)					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.PrintStatementEditPart.VISUAL_ID));
								result.addAll(createNavigatorItems(connectedViews, parentElement, false));
																	connectedViews = 						getChildrenByType						(java.util.Collections.singleton(sv)					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.SyncEndEditPart.VISUAL_ID));
								result.addAll(createNavigatorItems(connectedViews, parentElement, false));
																	connectedViews = 						getChildrenByType						(java.util.Collections.singleton(sv)					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.SyncStartEditPart.VISUAL_ID));
								result.addAll(createNavigatorItems(connectedViews, parentElement, false));
																	connectedViews = 						getDiagramLinksByType						(java.util.Collections.singleton(sv)					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.StartStartPortEditPart.VISUAL_ID));
								links.addChildren(createNavigatorItems(connectedViews, links, false));
																	connectedViews = 						getDiagramLinksByType						(java.util.Collections.singleton(sv)					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.OutputPortInputPortEditPart.VISUAL_ID));
								links.addChildren(createNavigatorItems(connectedViews, links, false));
															if (!links.isEmpty()) {		result.add(links);
					}			return result.toArray();
}

case asu.ser.capstone.pivi.diagram.edit.parts.MethodStartEditPart.VISUAL_ID: {
	java.util.LinkedList<asu.ser.capstone.pivi.diagram.navigator.PiviAbstractNavigatorItem> result = new java.util.LinkedList<asu.ser.capstone.pivi.diagram.navigator.PiviAbstractNavigatorItem>();
		org.eclipse.gmf.runtime.notation.Node sv = (org.eclipse.gmf.runtime.notation.Node) view;
							java.util.Collection<org.eclipse.gmf.runtime.notation.View> connectedViews;
														connectedViews = 						getChildrenByType						(java.util.Collections.singleton(sv)					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.MethodStartMethodStartFigureCompartmentEditPart.VISUAL_ID));
									connectedViews = 						getChildrenByType						(connectedViews					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.InputPortEditPart.VISUAL_ID));
								result.addAll(createNavigatorItems(connectedViews, parentElement, false));
																	connectedViews = 						getChildrenByType						(java.util.Collections.singleton(sv)					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.MethodStartMethodStartFigureCompartmentEditPart.VISUAL_ID));
									connectedViews = 						getChildrenByType						(connectedViews					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.OutputPortEditPart.VISUAL_ID));
								result.addAll(createNavigatorItems(connectedViews, parentElement, false));
																	connectedViews = 						getChildrenByType						(java.util.Collections.singleton(sv)					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.MethodStartMethodStartFigureCompartmentEditPart.VISUAL_ID));
									connectedViews = 						getChildrenByType						(connectedViews					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.StartPortEditPart.VISUAL_ID));
								result.addAll(createNavigatorItems(connectedViews, parentElement, false));
											return result.toArray();
}

case asu.ser.capstone.pivi.diagram.edit.parts.InputPortEditPart.VISUAL_ID: {
	java.util.LinkedList<asu.ser.capstone.pivi.diagram.navigator.PiviAbstractNavigatorItem> result = new java.util.LinkedList<asu.ser.capstone.pivi.diagram.navigator.PiviAbstractNavigatorItem>();
		org.eclipse.gmf.runtime.notation.Node sv = (org.eclipse.gmf.runtime.notation.Node) view;
				asu.ser.capstone.pivi.diagram.navigator.PiviNavigatorGroup incominglinks = new asu.ser.capstone.pivi.diagram.navigator.PiviNavigatorGroup(
	asu.ser.capstone.pivi.diagram.part.Messages.NavigatorGroupName_InputPort_3001_incominglinks,
	"icons/incomingLinksNavigatorGroup.gif", parentElement);  //$NON-NLS-1$
				java.util.Collection<org.eclipse.gmf.runtime.notation.View> connectedViews;
														connectedViews = 			getIncomingLinksByType						(java.util.Collections.singleton(sv)					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.OutputPortInputPortEditPart.VISUAL_ID));
								incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
															if (!incominglinks.isEmpty()) {		result.add(incominglinks);
					}			return result.toArray();
}

case asu.ser.capstone.pivi.diagram.edit.parts.StartStartPortEditPart.VISUAL_ID: {
	java.util.LinkedList<asu.ser.capstone.pivi.diagram.navigator.PiviAbstractNavigatorItem> result = new java.util.LinkedList<asu.ser.capstone.pivi.diagram.navigator.PiviAbstractNavigatorItem>();
		org.eclipse.gmf.runtime.notation.Edge sv = (org.eclipse.gmf.runtime.notation.Edge) view;
				asu.ser.capstone.pivi.diagram.navigator.PiviNavigatorGroup target = new asu.ser.capstone.pivi.diagram.navigator.PiviNavigatorGroup(
	asu.ser.capstone.pivi.diagram.part.Messages.NavigatorGroupName_StartStartPort_4004_target,
	"icons/linkTargetNavigatorGroup.gif", parentElement);  //$NON-NLS-1$
	asu.ser.capstone.pivi.diagram.navigator.PiviNavigatorGroup source = new asu.ser.capstone.pivi.diagram.navigator.PiviNavigatorGroup(
	asu.ser.capstone.pivi.diagram.part.Messages.NavigatorGroupName_StartStartPort_4004_source,
	"icons/linkSourceNavigatorGroup.gif", parentElement);  //$NON-NLS-1$
				java.util.Collection<org.eclipse.gmf.runtime.notation.View> connectedViews;
														connectedViews = 	getLinksTargetByType					(java.util.Collections.singleton(sv)					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.StartPortEditPart.VISUAL_ID));
								target.addChildren(createNavigatorItems(connectedViews, target, true));
																	connectedViews = 	getLinksSourceByType					(java.util.Collections.singleton(sv)					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.StartEditPart.VISUAL_ID));
								source.addChildren(createNavigatorItems(connectedViews, source, true));
															if (!target.isEmpty()) {		result.add(target);
					}							if (!source.isEmpty()) {		result.add(source);
					}			return result.toArray();
}

case asu.ser.capstone.pivi.diagram.edit.parts.MethodEndEditPart.VISUAL_ID: {
	java.util.LinkedList<asu.ser.capstone.pivi.diagram.navigator.PiviAbstractNavigatorItem> result = new java.util.LinkedList<asu.ser.capstone.pivi.diagram.navigator.PiviAbstractNavigatorItem>();
		org.eclipse.gmf.runtime.notation.Node sv = (org.eclipse.gmf.runtime.notation.Node) view;
							java.util.Collection<org.eclipse.gmf.runtime.notation.View> connectedViews;
														connectedViews = 						getChildrenByType						(java.util.Collections.singleton(sv)					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.MethodEndMethodEndFigureCompartmentEditPart.VISUAL_ID));
									connectedViews = 						getChildrenByType						(connectedViews					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.InputPortEditPart.VISUAL_ID));
								result.addAll(createNavigatorItems(connectedViews, parentElement, false));
																	connectedViews = 						getChildrenByType						(java.util.Collections.singleton(sv)					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.MethodEndMethodEndFigureCompartmentEditPart.VISUAL_ID));
									connectedViews = 						getChildrenByType						(connectedViews					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.StartPortEditPart.VISUAL_ID));
								result.addAll(createNavigatorItems(connectedViews, parentElement, false));
																	connectedViews = 						getChildrenByType						(java.util.Collections.singleton(sv)					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.MethodEndMethodEndFigureCompartmentEditPart.VISUAL_ID));
									connectedViews = 						getChildrenByType						(connectedViews					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.OutputPortEditPart.VISUAL_ID));
								result.addAll(createNavigatorItems(connectedViews, parentElement, false));
											return result.toArray();
}

case asu.ser.capstone.pivi.diagram.edit.parts.ThreadStartEditPart.VISUAL_ID: {
	java.util.LinkedList<asu.ser.capstone.pivi.diagram.navigator.PiviAbstractNavigatorItem> result = new java.util.LinkedList<asu.ser.capstone.pivi.diagram.navigator.PiviAbstractNavigatorItem>();
		org.eclipse.gmf.runtime.notation.Node sv = (org.eclipse.gmf.runtime.notation.Node) view;
							java.util.Collection<org.eclipse.gmf.runtime.notation.View> connectedViews;
														connectedViews = 						getChildrenByType						(java.util.Collections.singleton(sv)					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.ThreadStartThreadStartFigureCompartmentEditPart.VISUAL_ID));
									connectedViews = 						getChildrenByType						(connectedViews					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.InputPortEditPart.VISUAL_ID));
								result.addAll(createNavigatorItems(connectedViews, parentElement, false));
																	connectedViews = 						getChildrenByType						(java.util.Collections.singleton(sv)					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.ThreadStartThreadStartFigureCompartmentEditPart.VISUAL_ID));
									connectedViews = 						getChildrenByType						(connectedViews					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.OutputPortEditPart.VISUAL_ID));
								result.addAll(createNavigatorItems(connectedViews, parentElement, false));
																	connectedViews = 						getChildrenByType						(java.util.Collections.singleton(sv)					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.ThreadStartThreadStartFigureCompartmentEditPart.VISUAL_ID));
									connectedViews = 						getChildrenByType						(connectedViews					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.StartPortEditPart.VISUAL_ID));
								result.addAll(createNavigatorItems(connectedViews, parentElement, false));
											return result.toArray();
}

case asu.ser.capstone.pivi.diagram.edit.parts.WhileEndEditPart.VISUAL_ID: {
	java.util.LinkedList<asu.ser.capstone.pivi.diagram.navigator.PiviAbstractNavigatorItem> result = new java.util.LinkedList<asu.ser.capstone.pivi.diagram.navigator.PiviAbstractNavigatorItem>();
		org.eclipse.gmf.runtime.notation.Node sv = (org.eclipse.gmf.runtime.notation.Node) view;
							java.util.Collection<org.eclipse.gmf.runtime.notation.View> connectedViews;
														connectedViews = 						getChildrenByType						(java.util.Collections.singleton(sv)					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.WhileEndWhileEndFigureCompartmentEditPart.VISUAL_ID));
									connectedViews = 						getChildrenByType						(connectedViews					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.InputPortEditPart.VISUAL_ID));
								result.addAll(createNavigatorItems(connectedViews, parentElement, false));
																	connectedViews = 						getChildrenByType						(java.util.Collections.singleton(sv)					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.WhileEndWhileEndFigureCompartmentEditPart.VISUAL_ID));
									connectedViews = 						getChildrenByType						(connectedViews					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.OutputPortEditPart.VISUAL_ID));
								result.addAll(createNavigatorItems(connectedViews, parentElement, false));
																	connectedViews = 						getChildrenByType						(java.util.Collections.singleton(sv)					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.WhileEndWhileEndFigureCompartmentEditPart.VISUAL_ID));
									connectedViews = 						getChildrenByType						(connectedViews					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.StartPortEditPart.VISUAL_ID));
								result.addAll(createNavigatorItems(connectedViews, parentElement, false));
											return result.toArray();
}

case asu.ser.capstone.pivi.diagram.edit.parts.StartEditPart.VISUAL_ID: {
	java.util.LinkedList<asu.ser.capstone.pivi.diagram.navigator.PiviAbstractNavigatorItem> result = new java.util.LinkedList<asu.ser.capstone.pivi.diagram.navigator.PiviAbstractNavigatorItem>();
		org.eclipse.gmf.runtime.notation.Node sv = (org.eclipse.gmf.runtime.notation.Node) view;
				asu.ser.capstone.pivi.diagram.navigator.PiviNavigatorGroup outgoinglinks = new asu.ser.capstone.pivi.diagram.navigator.PiviNavigatorGroup(
	asu.ser.capstone.pivi.diagram.part.Messages.NavigatorGroupName_Start_2008_outgoinglinks,
	"icons/outgoingLinksNavigatorGroup.gif", parentElement);  //$NON-NLS-1$
				java.util.Collection<org.eclipse.gmf.runtime.notation.View> connectedViews;
														connectedViews = 			getOutgoingLinksByType						(java.util.Collections.singleton(sv)					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.StartStartPortEditPart.VISUAL_ID));
								outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
															if (!outgoinglinks.isEmpty()) {		result.add(outgoinglinks);
					}			return result.toArray();
}

case asu.ser.capstone.pivi.diagram.edit.parts.SyncStartEditPart.VISUAL_ID: {
	java.util.LinkedList<asu.ser.capstone.pivi.diagram.navigator.PiviAbstractNavigatorItem> result = new java.util.LinkedList<asu.ser.capstone.pivi.diagram.navigator.PiviAbstractNavigatorItem>();
		org.eclipse.gmf.runtime.notation.Node sv = (org.eclipse.gmf.runtime.notation.Node) view;
							java.util.Collection<org.eclipse.gmf.runtime.notation.View> connectedViews;
														connectedViews = 						getChildrenByType						(java.util.Collections.singleton(sv)					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.SyncStartSyncStartFigureCompartmentEditPart.VISUAL_ID));
									connectedViews = 						getChildrenByType						(connectedViews					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.InputPortEditPart.VISUAL_ID));
								result.addAll(createNavigatorItems(connectedViews, parentElement, false));
																	connectedViews = 						getChildrenByType						(java.util.Collections.singleton(sv)					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.SyncStartSyncStartFigureCompartmentEditPart.VISUAL_ID));
									connectedViews = 						getChildrenByType						(connectedViews					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.OutputPortEditPart.VISUAL_ID));
								result.addAll(createNavigatorItems(connectedViews, parentElement, false));
																	connectedViews = 						getChildrenByType						(java.util.Collections.singleton(sv)					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.SyncStartSyncStartFigureCompartmentEditPart.VISUAL_ID));
									connectedViews = 						getChildrenByType						(connectedViews					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.StartPortEditPart.VISUAL_ID));
								result.addAll(createNavigatorItems(connectedViews, parentElement, false));
											return result.toArray();
}

case asu.ser.capstone.pivi.diagram.edit.parts.IfEndEditPart.VISUAL_ID: {
	java.util.LinkedList<asu.ser.capstone.pivi.diagram.navigator.PiviAbstractNavigatorItem> result = new java.util.LinkedList<asu.ser.capstone.pivi.diagram.navigator.PiviAbstractNavigatorItem>();
		org.eclipse.gmf.runtime.notation.Node sv = (org.eclipse.gmf.runtime.notation.Node) view;
							java.util.Collection<org.eclipse.gmf.runtime.notation.View> connectedViews;
														connectedViews = 						getChildrenByType						(java.util.Collections.singleton(sv)					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.IfEndIfEndFigureCompartmentEditPart.VISUAL_ID));
									connectedViews = 						getChildrenByType						(connectedViews					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.InputPortEditPart.VISUAL_ID));
								result.addAll(createNavigatorItems(connectedViews, parentElement, false));
																	connectedViews = 						getChildrenByType						(java.util.Collections.singleton(sv)					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.IfEndIfEndFigureCompartmentEditPart.VISUAL_ID));
									connectedViews = 						getChildrenByType						(connectedViews					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.OutputPortEditPart.VISUAL_ID));
								result.addAll(createNavigatorItems(connectedViews, parentElement, false));
																	connectedViews = 						getChildrenByType						(java.util.Collections.singleton(sv)					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.IfEndIfEndFigureCompartmentEditPart.VISUAL_ID));
									connectedViews = 						getChildrenByType						(connectedViews					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.StartPortEditPart.VISUAL_ID));
								result.addAll(createNavigatorItems(connectedViews, parentElement, false));
											return result.toArray();
}

case asu.ser.capstone.pivi.diagram.edit.parts.OutputPortInputPortEditPart.VISUAL_ID: {
	java.util.LinkedList<asu.ser.capstone.pivi.diagram.navigator.PiviAbstractNavigatorItem> result = new java.util.LinkedList<asu.ser.capstone.pivi.diagram.navigator.PiviAbstractNavigatorItem>();
		org.eclipse.gmf.runtime.notation.Edge sv = (org.eclipse.gmf.runtime.notation.Edge) view;
				asu.ser.capstone.pivi.diagram.navigator.PiviNavigatorGroup target = new asu.ser.capstone.pivi.diagram.navigator.PiviNavigatorGroup(
	asu.ser.capstone.pivi.diagram.part.Messages.NavigatorGroupName_OutputPortInputPort_4002_target,
	"icons/linkTargetNavigatorGroup.gif", parentElement);  //$NON-NLS-1$
	asu.ser.capstone.pivi.diagram.navigator.PiviNavigatorGroup source = new asu.ser.capstone.pivi.diagram.navigator.PiviNavigatorGroup(
	asu.ser.capstone.pivi.diagram.part.Messages.NavigatorGroupName_OutputPortInputPort_4002_source,
	"icons/linkSourceNavigatorGroup.gif", parentElement);  //$NON-NLS-1$
				java.util.Collection<org.eclipse.gmf.runtime.notation.View> connectedViews;
														connectedViews = 	getLinksTargetByType					(java.util.Collections.singleton(sv)					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.InputPortEditPart.VISUAL_ID));
								target.addChildren(createNavigatorItems(connectedViews, target, true));
																	connectedViews = 	getLinksSourceByType					(java.util.Collections.singleton(sv)					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.OutputPortEditPart.VISUAL_ID));
								source.addChildren(createNavigatorItems(connectedViews, source, true));
															if (!target.isEmpty()) {		result.add(target);
					}							if (!source.isEmpty()) {		result.add(source);
					}			return result.toArray();
}

case asu.ser.capstone.pivi.diagram.edit.parts.OutputPortEditPart.VISUAL_ID: {
	java.util.LinkedList<asu.ser.capstone.pivi.diagram.navigator.PiviAbstractNavigatorItem> result = new java.util.LinkedList<asu.ser.capstone.pivi.diagram.navigator.PiviAbstractNavigatorItem>();
		org.eclipse.gmf.runtime.notation.Node sv = (org.eclipse.gmf.runtime.notation.Node) view;
				asu.ser.capstone.pivi.diagram.navigator.PiviNavigatorGroup outgoinglinks = new asu.ser.capstone.pivi.diagram.navigator.PiviNavigatorGroup(
	asu.ser.capstone.pivi.diagram.part.Messages.NavigatorGroupName_OutputPort_3003_outgoinglinks,
	"icons/outgoingLinksNavigatorGroup.gif", parentElement);  //$NON-NLS-1$
				java.util.Collection<org.eclipse.gmf.runtime.notation.View> connectedViews;
														connectedViews = 			getOutgoingLinksByType						(java.util.Collections.singleton(sv)					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.OutputPortInputPortEditPart.VISUAL_ID));
								outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
															if (!outgoinglinks.isEmpty()) {		result.add(outgoinglinks);
					}			return result.toArray();
}

case asu.ser.capstone.pivi.diagram.edit.parts.WhileStartEditPart.VISUAL_ID: {
	java.util.LinkedList<asu.ser.capstone.pivi.diagram.navigator.PiviAbstractNavigatorItem> result = new java.util.LinkedList<asu.ser.capstone.pivi.diagram.navigator.PiviAbstractNavigatorItem>();
		org.eclipse.gmf.runtime.notation.Node sv = (org.eclipse.gmf.runtime.notation.Node) view;
							java.util.Collection<org.eclipse.gmf.runtime.notation.View> connectedViews;
														connectedViews = 						getChildrenByType						(java.util.Collections.singleton(sv)					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.WhileStartWhileStartFigureCompartmentEditPart.VISUAL_ID));
									connectedViews = 						getChildrenByType						(connectedViews					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.InputPortEditPart.VISUAL_ID));
								result.addAll(createNavigatorItems(connectedViews, parentElement, false));
																	connectedViews = 						getChildrenByType						(java.util.Collections.singleton(sv)					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.WhileStartWhileStartFigureCompartmentEditPart.VISUAL_ID));
									connectedViews = 						getChildrenByType						(connectedViews					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.OutputPortEditPart.VISUAL_ID));
								result.addAll(createNavigatorItems(connectedViews, parentElement, false));
																	connectedViews = 						getChildrenByType						(java.util.Collections.singleton(sv)					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.WhileStartWhileStartFigureCompartmentEditPart.VISUAL_ID));
									connectedViews = 						getChildrenByType						(connectedViews					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.StartPortEditPart.VISUAL_ID));
								result.addAll(createNavigatorItems(connectedViews, parentElement, false));
											return result.toArray();
}

case asu.ser.capstone.pivi.diagram.edit.parts.SyncEndEditPart.VISUAL_ID: {
	java.util.LinkedList<asu.ser.capstone.pivi.diagram.navigator.PiviAbstractNavigatorItem> result = new java.util.LinkedList<asu.ser.capstone.pivi.diagram.navigator.PiviAbstractNavigatorItem>();
		org.eclipse.gmf.runtime.notation.Node sv = (org.eclipse.gmf.runtime.notation.Node) view;
							java.util.Collection<org.eclipse.gmf.runtime.notation.View> connectedViews;
														connectedViews = 						getChildrenByType						(java.util.Collections.singleton(sv)					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.SyncEndSyncEndFigureCompartmentEditPart.VISUAL_ID));
									connectedViews = 						getChildrenByType						(connectedViews					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.InputPortEditPart.VISUAL_ID));
								result.addAll(createNavigatorItems(connectedViews, parentElement, false));
																	connectedViews = 						getChildrenByType						(java.util.Collections.singleton(sv)					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.SyncEndSyncEndFigureCompartmentEditPart.VISUAL_ID));
									connectedViews = 						getChildrenByType						(connectedViews					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.OutputPortEditPart.VISUAL_ID));
								result.addAll(createNavigatorItems(connectedViews, parentElement, false));
																	connectedViews = 						getChildrenByType						(java.util.Collections.singleton(sv)					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.SyncEndSyncEndFigureCompartmentEditPart.VISUAL_ID));
									connectedViews = 						getChildrenByType						(connectedViews					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.StartPortEditPart.VISUAL_ID));
								result.addAll(createNavigatorItems(connectedViews, parentElement, false));
											return result.toArray();
}

case asu.ser.capstone.pivi.diagram.edit.parts.StartPortEditPart.VISUAL_ID: {
	java.util.LinkedList<asu.ser.capstone.pivi.diagram.navigator.PiviAbstractNavigatorItem> result = new java.util.LinkedList<asu.ser.capstone.pivi.diagram.navigator.PiviAbstractNavigatorItem>();
		org.eclipse.gmf.runtime.notation.Node sv = (org.eclipse.gmf.runtime.notation.Node) view;
				asu.ser.capstone.pivi.diagram.navigator.PiviNavigatorGroup incominglinks = new asu.ser.capstone.pivi.diagram.navigator.PiviNavigatorGroup(
	asu.ser.capstone.pivi.diagram.part.Messages.NavigatorGroupName_StartPort_3002_incominglinks,
	"icons/incomingLinksNavigatorGroup.gif", parentElement);  //$NON-NLS-1$
				java.util.Collection<org.eclipse.gmf.runtime.notation.View> connectedViews;
														connectedViews = 			getIncomingLinksByType						(java.util.Collections.singleton(sv)					, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.StartStartPortEditPart.VISUAL_ID));
								incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
															if (!incominglinks.isEmpty()) {		result.add(incominglinks);
					}			return result.toArray();
}
	}
	return EMPTY_ARRAY;
}
    
    /**
 * @generated
 */
private java.util.Collection<org.eclipse.gmf.runtime.notation.View> getLinksSourceByType(java.util.Collection<org.eclipse.gmf.runtime.notation.Edge> edges, String type) {
	java.util.LinkedList<org.eclipse.gmf.runtime.notation.View> result = new java.util.LinkedList<org.eclipse.gmf.runtime.notation.View>();
 	for (org.eclipse.gmf.runtime.notation.Edge nextEdge : edges) {
 		org.eclipse.gmf.runtime.notation.View nextEdgeSource = nextEdge.getSource();
 		if (type.equals(nextEdgeSource.getType()) && isOwnView(nextEdgeSource)) {
 			result.add(nextEdgeSource);
 		}
 	}
 	return result;
}
	
/**
 * @generated
 */
 private java.util.Collection<org.eclipse.gmf.runtime.notation.View> getLinksTargetByType(java.util.Collection<org.eclipse.gmf.runtime.notation.Edge> edges, String type) {
	java.util.LinkedList<org.eclipse.gmf.runtime.notation.View> result = new java.util.LinkedList<org.eclipse.gmf.runtime.notation.View>();
 	for (org.eclipse.gmf.runtime.notation.Edge nextEdge : edges) {
 		org.eclipse.gmf.runtime.notation.View nextEdgeTarget = nextEdge.getTarget();
 		if (type.equals(nextEdgeTarget.getType()) && isOwnView(nextEdgeTarget)) {
 			result.add(nextEdgeTarget);
 		}
 	}
 	return result;
}

/**
 * @generated
 */
 private java.util.Collection<org.eclipse.gmf.runtime.notation.View> getOutgoingLinksByType(java.util.Collection<? extends org.eclipse.gmf.runtime.notation.View> nodes, String type) {
	java.util.LinkedList<org.eclipse.gmf.runtime.notation.View> result = new java.util.LinkedList<org.eclipse.gmf.runtime.notation.View>();
 	for (org.eclipse.gmf.runtime.notation.View nextNode : nodes) {
		result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
 	}
 	return result;
}
	
/**
 * @generated
 */
private java.util.Collection<org.eclipse.gmf.runtime.notation.View> getIncomingLinksByType(java.util.Collection<? extends org.eclipse.gmf.runtime.notation.View> nodes, String type) {
	java.util.LinkedList<org.eclipse.gmf.runtime.notation.View> result = new java.util.LinkedList<org.eclipse.gmf.runtime.notation.View>();
 	for (org.eclipse.gmf.runtime.notation.View nextNode : nodes) {
		result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
 	}
 	return result;
}
	
/**
 * @generated
 */
private java.util.Collection<org.eclipse.gmf.runtime.notation.View> getChildrenByType(java.util.Collection<? extends org.eclipse.gmf.runtime.notation.View> nodes, String type) {
	java.util.LinkedList<org.eclipse.gmf.runtime.notation.View> result = new java.util.LinkedList<org.eclipse.gmf.runtime.notation.View>();
	for (org.eclipse.gmf.runtime.notation.View nextNode : nodes) {
		result.addAll(selectViewsByType(nextNode.getChildren(), type));
	}
	return result;
}
	
/**
 * @generated
 */
private java.util.Collection<org.eclipse.gmf.runtime.notation.View> getDiagramLinksByType(java.util.Collection<org.eclipse.gmf.runtime.notation.Diagram> diagrams, String type) {
	java.util.ArrayList<org.eclipse.gmf.runtime.notation.View> result = new java.util.ArrayList<org.eclipse.gmf.runtime.notation.View>();
	for (org.eclipse.gmf.runtime.notation.Diagram nextDiagram : diagrams) {
		result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
	}
	return result;
}

// TODO refactor as static method
/**
 * @generated
 */
private java.util.Collection<org.eclipse.gmf.runtime.notation.View> selectViewsByType(java.util.Collection<org.eclipse.gmf.runtime.notation.View> views, String type) {
	java.util.ArrayList<org.eclipse.gmf.runtime.notation.View> result = new java.util.ArrayList<org.eclipse.gmf.runtime.notation.View>();
	for (org.eclipse.gmf.runtime.notation.View nextView : views) {
		if (type.equals(nextView.getType()) && isOwnView(nextView)) {
			result.add(nextView);
		}
	}
	return result;
}
	
/**
 * @generated
 */
private boolean isOwnView(org.eclipse.gmf.runtime.notation.View view) {
	return asu.ser.capstone.pivi.diagram.edit.parts.PiviDiagramEditPart.MODEL_ID.equals(asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getModelID(view));
}
	
/**
 * @generated
 */
private java.util.Collection<asu.ser.capstone.pivi.diagram.navigator.PiviNavigatorItem> createNavigatorItems(java.util.Collection<org.eclipse.gmf.runtime.notation.View> views, Object parent, boolean isLeafs) {
	java.util.ArrayList<asu.ser.capstone.pivi.diagram.navigator.PiviNavigatorItem> result = new java.util.ArrayList<asu.ser.capstone.pivi.diagram.navigator.PiviNavigatorItem>(views.size());
	for (org.eclipse.gmf.runtime.notation.View nextView : views) {
		result.add(new asu.ser.capstone.pivi.diagram.navigator.PiviNavigatorItem(nextView, parent, isLeafs));
	}
	return result;
}
		
	/**
 * @generated
 */
public Object getParent(Object element) {
	if (element instanceof asu.ser.capstone.pivi.diagram.navigator.PiviAbstractNavigatorItem) {
    	asu.ser.capstone.pivi.diagram.navigator.PiviAbstractNavigatorItem abstractNavigatorItem = (asu.ser.capstone.pivi.diagram.navigator.PiviAbstractNavigatorItem) element;
		return abstractNavigatorItem.getParent();
	}
	return null;
}
	
	/**
 * @generated
 */
public boolean hasChildren(Object element) {
	return element instanceof org.eclipse.core.resources.IFile || getChildren(element).length > 0;
}
    
    }
