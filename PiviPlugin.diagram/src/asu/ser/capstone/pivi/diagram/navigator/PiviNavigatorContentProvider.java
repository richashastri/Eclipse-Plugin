package asu.ser.capstone.pivi.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

import asu.ser.capstone.pivi.diagram.edit.parts.IfEndEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.IfEndIfEndFigureCompartmentEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.IfStartEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.IfStartIfStartFigureCompartmentEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.InputPortEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.InstructionEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.InstructionInstructionFigureCompartmentEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.MethodEndEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.MethodEndMethodEndFigureCompartmentEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.MethodStartEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.MethodStartMethodStartFigureCompartmentEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.OutputPortEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.OutputPortInputPortEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.PiviDiagramEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.StartEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.StartPortEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.StartStartPortEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.WhileEndEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.WhileEndWhileEndFigureCompartmentEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.WhileStartEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.WhileStartWhileStartFigureCompartmentEditPart;
import asu.ser.capstone.pivi.diagram.part.Messages;
import asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry;

/**
 * @generated
 */
public class PiviNavigatorContentProvider implements ICommonContentProvider {

	/**
	 * @generated
	 */
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	 * @generated
	 */
	private Viewer myViewer;

	/**
	 * @generated
	 */
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	 * @generated
	 */
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	 * @generated
	 */
	private Runnable myViewerRefreshRunnable;

	/**
	 * @generated
	 */
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public PiviNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
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
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain,
				new WorkspaceSynchronizer.Delegate() {
					public void dispose() {
					}

					public boolean handleResourceChanged(final Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceDeleted(Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceMoved(Resource resource,
							final URI newURI) {
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
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	 * @generated
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	 * @generated
	 */
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet()
				.getResources()) {
			nextResource.unload();
		}
	}

	/**
	 * @generated
	 */
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay()
					.asyncExec(myViewerRefreshRunnable);
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
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath()
					.toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(
					fileURI, true);
			ArrayList<PiviNavigatorItem> result = new ArrayList<PiviNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource
					.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(
					selectViewsByType(topViews, PiviDiagramEditPart.MODEL_ID),
					file, false));
			return result.toArray();
		}

		if (parentElement instanceof PiviNavigatorGroup) {
			PiviNavigatorGroup group = (PiviNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof PiviNavigatorItem) {
			PiviNavigatorItem navigatorItem = (PiviNavigatorItem) parentElement;
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
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (PiviVisualIDRegistry.getVisualID(view)) {

		case StartStartPortEditPart.VISUAL_ID: {
			LinkedList<PiviAbstractNavigatorItem> result = new LinkedList<PiviAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			PiviNavigatorGroup target = new PiviNavigatorGroup(
					Messages.NavigatorGroupName_StartStartPort_4004_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			PiviNavigatorGroup source = new PiviNavigatorGroup(
					Messages.NavigatorGroupName_StartStartPort_4004_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PiviVisualIDRegistry.getType(StartPortEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PiviVisualIDRegistry.getType(StartEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case OutputPortInputPortEditPart.VISUAL_ID: {
			LinkedList<PiviAbstractNavigatorItem> result = new LinkedList<PiviAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			PiviNavigatorGroup target = new PiviNavigatorGroup(
					Messages.NavigatorGroupName_OutputPortInputPort_4002_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			PiviNavigatorGroup source = new PiviNavigatorGroup(
					Messages.NavigatorGroupName_OutputPortInputPort_4002_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					PiviVisualIDRegistry.getType(InputPortEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					PiviVisualIDRegistry.getType(OutputPortEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case WhileEndEditPart.VISUAL_ID: {
			LinkedList<PiviAbstractNavigatorItem> result = new LinkedList<PiviAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					PiviVisualIDRegistry
							.getType(WhileEndWhileEndFigureCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PiviVisualIDRegistry.getType(InputPortEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					PiviVisualIDRegistry
							.getType(WhileEndWhileEndFigureCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PiviVisualIDRegistry.getType(OutputPortEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					PiviVisualIDRegistry
							.getType(WhileEndWhileEndFigureCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PiviVisualIDRegistry.getType(StartPortEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case IfEndEditPart.VISUAL_ID: {
			LinkedList<PiviAbstractNavigatorItem> result = new LinkedList<PiviAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					PiviVisualIDRegistry
							.getType(IfEndIfEndFigureCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PiviVisualIDRegistry.getType(InputPortEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					PiviVisualIDRegistry
							.getType(IfEndIfEndFigureCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PiviVisualIDRegistry.getType(OutputPortEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					PiviVisualIDRegistry
							.getType(IfEndIfEndFigureCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PiviVisualIDRegistry.getType(StartPortEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case MethodEndEditPart.VISUAL_ID: {
			LinkedList<PiviAbstractNavigatorItem> result = new LinkedList<PiviAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					PiviVisualIDRegistry
							.getType(MethodEndMethodEndFigureCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PiviVisualIDRegistry.getType(InputPortEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					PiviVisualIDRegistry
							.getType(MethodEndMethodEndFigureCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PiviVisualIDRegistry.getType(StartPortEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					PiviVisualIDRegistry
							.getType(MethodEndMethodEndFigureCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PiviVisualIDRegistry.getType(OutputPortEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case PiviDiagramEditPart.VISUAL_ID: {
			LinkedList<PiviAbstractNavigatorItem> result = new LinkedList<PiviAbstractNavigatorItem>();
			Diagram sv = (Diagram) view;
			PiviNavigatorGroup links = new PiviNavigatorGroup(
					Messages.NavigatorGroupName_PiviDiagram_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PiviVisualIDRegistry.getType(IfStartEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PiviVisualIDRegistry.getType(WhileEndEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PiviVisualIDRegistry.getType(MethodEndEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PiviVisualIDRegistry.getType(IfEndEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PiviVisualIDRegistry.getType(InstructionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PiviVisualIDRegistry.getType(MethodStartEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PiviVisualIDRegistry.getType(WhileStartEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					PiviVisualIDRegistry.getType(StartEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					PiviVisualIDRegistry
							.getType(StartStartPortEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					PiviVisualIDRegistry
							.getType(OutputPortInputPortEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case MethodStartEditPart.VISUAL_ID: {
			LinkedList<PiviAbstractNavigatorItem> result = new LinkedList<PiviAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					PiviVisualIDRegistry
							.getType(MethodStartMethodStartFigureCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PiviVisualIDRegistry.getType(InputPortEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					PiviVisualIDRegistry
							.getType(MethodStartMethodStartFigureCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PiviVisualIDRegistry.getType(OutputPortEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					PiviVisualIDRegistry
							.getType(MethodStartMethodStartFigureCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PiviVisualIDRegistry.getType(StartPortEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case OutputPortEditPart.VISUAL_ID: {
			LinkedList<PiviAbstractNavigatorItem> result = new LinkedList<PiviAbstractNavigatorItem>();
			Node sv = (Node) view;
			PiviNavigatorGroup outgoinglinks = new PiviNavigatorGroup(
					Messages.NavigatorGroupName_OutputPort_3003_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PiviVisualIDRegistry
							.getType(OutputPortInputPortEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case StartEditPart.VISUAL_ID: {
			LinkedList<PiviAbstractNavigatorItem> result = new LinkedList<PiviAbstractNavigatorItem>();
			Node sv = (Node) view;
			PiviNavigatorGroup outgoinglinks = new PiviNavigatorGroup(
					Messages.NavigatorGroupName_Start_2008_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					PiviVisualIDRegistry
							.getType(StartStartPortEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case InstructionEditPart.VISUAL_ID: {
			LinkedList<PiviAbstractNavigatorItem> result = new LinkedList<PiviAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					PiviVisualIDRegistry
							.getType(InstructionInstructionFigureCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PiviVisualIDRegistry.getType(InputPortEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					PiviVisualIDRegistry
							.getType(InstructionInstructionFigureCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PiviVisualIDRegistry.getType(StartPortEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					PiviVisualIDRegistry
							.getType(InstructionInstructionFigureCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PiviVisualIDRegistry.getType(OutputPortEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case StartPortEditPart.VISUAL_ID: {
			LinkedList<PiviAbstractNavigatorItem> result = new LinkedList<PiviAbstractNavigatorItem>();
			Node sv = (Node) view;
			PiviNavigatorGroup incominglinks = new PiviNavigatorGroup(
					Messages.NavigatorGroupName_StartPort_3002_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PiviVisualIDRegistry
							.getType(StartStartPortEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case IfStartEditPart.VISUAL_ID: {
			LinkedList<PiviAbstractNavigatorItem> result = new LinkedList<PiviAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					PiviVisualIDRegistry
							.getType(IfStartIfStartFigureCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PiviVisualIDRegistry.getType(InputPortEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					PiviVisualIDRegistry
							.getType(IfStartIfStartFigureCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PiviVisualIDRegistry.getType(StartPortEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					PiviVisualIDRegistry
							.getType(IfStartIfStartFigureCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PiviVisualIDRegistry.getType(OutputPortEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case InputPortEditPart.VISUAL_ID: {
			LinkedList<PiviAbstractNavigatorItem> result = new LinkedList<PiviAbstractNavigatorItem>();
			Node sv = (Node) view;
			PiviNavigatorGroup incominglinks = new PiviNavigatorGroup(
					Messages.NavigatorGroupName_InputPort_3001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					PiviVisualIDRegistry
							.getType(OutputPortInputPortEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case WhileStartEditPart.VISUAL_ID: {
			LinkedList<PiviAbstractNavigatorItem> result = new LinkedList<PiviAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					PiviVisualIDRegistry
							.getType(WhileStartWhileStartFigureCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PiviVisualIDRegistry.getType(InputPortEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					PiviVisualIDRegistry
							.getType(WhileStartWhileStartFigureCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PiviVisualIDRegistry.getType(OutputPortEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					PiviVisualIDRegistry
							.getType(WhileStartWhileStartFigureCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					PiviVisualIDRegistry.getType(StartPortEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksSourceByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType())
					&& isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType())
					&& isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(
			Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views,
			String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return PiviDiagramEditPart.MODEL_ID.equals(PiviVisualIDRegistry
				.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<PiviNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<PiviNavigatorItem> result = new ArrayList<PiviNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new PiviNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof PiviAbstractNavigatorItem) {
			PiviAbstractNavigatorItem abstractNavigatorItem = (PiviAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
