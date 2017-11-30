	package asu.ser.capstone.pivi.diagram.edit.policies;

	/**
 * @generated
 */
public class PiviDiagramCanonicalEditPolicy extends org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy {
	

		
	/**
 * @generated
 */
	private java.util.Set<org.eclipse.emf.ecore.EStructuralFeature> myFeaturesToSynchronize;

		/**
 * @generated
 */
	protected void refreshOnActivate() {
		// Need to activate editpart children before invoking the canonical refresh for EditParts to add event listeners
		java.util.List<?> c = getHost().getChildren();
		for (int i = 0; i < c.size(); i++) {
			((org.eclipse.gef.EditPart) c.get(i)).activate();
		}
		super.refreshOnActivate();
	}

	
	/**
 * @generated
 */
	protected java.util.Set getFeaturesToSynchronize() {
		if (myFeaturesToSynchronize == null) {
			myFeaturesToSynchronize = new java.util.HashSet<org.eclipse.emf.ecore.EStructuralFeature>();
			myFeaturesToSynchronize.add(asu.ser.capstone.pivi.PiviPackage.eINSTANCE.getPiviDiagram_Statements());
myFeaturesToSynchronize.add(asu.ser.capstone.pivi.PiviPackage.eINSTANCE.getPiviDiagram_Start());
		}
		return myFeaturesToSynchronize;
	}
	
	/**
 * @generated
 */
@SuppressWarnings("rawtypes")

protected java.util.List getSemanticChildrenList() {
		org.eclipse.gmf.runtime.notation.View viewObject = (org.eclipse.gmf.runtime.notation.View) getHost().getModel();
	java.util.LinkedList<org.eclipse.emf.ecore.EObject> result = new java.util.LinkedList<org.eclipse.emf.ecore.EObject>();
	java.util.List<asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor> childDescriptors = asu.ser.capstone.pivi.diagram.part.PiviDiagramUpdater.getPiviDiagram_1000SemanticChildren(viewObject);
	for (asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor d : childDescriptors) {
		result.add(d.getModelElement());
	}
	return result;
	}

	/**
 * @generated
 */
protected boolean isOrphaned(java.util.Collection<org.eclipse.emf.ecore.EObject> semanticChildren, final org.eclipse.gmf.runtime.notation.View view) {
		return isMyDiagramElement(view) && !semanticChildren.contains(view.getElement());
}

	/**
 * @generated
 */
private boolean isMyDiagramElement(org.eclipse.gmf.runtime.notation.View view) {
		int visualID = asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getVisualID(view);
		switch (visualID) {
		case asu.ser.capstone.pivi.diagram.edit.parts.IfStartEditPart.VISUAL_ID:case asu.ser.capstone.pivi.diagram.edit.parts.WhileEndEditPart.VISUAL_ID:case asu.ser.capstone.pivi.diagram.edit.parts.MethodEndEditPart.VISUAL_ID:case asu.ser.capstone.pivi.diagram.edit.parts.IfEndEditPart.VISUAL_ID:case asu.ser.capstone.pivi.diagram.edit.parts.InstructionEditPart.VISUAL_ID:case asu.ser.capstone.pivi.diagram.edit.parts.MethodStartEditPart.VISUAL_ID:case asu.ser.capstone.pivi.diagram.edit.parts.WhileStartEditPart.VISUAL_ID:case asu.ser.capstone.pivi.diagram.edit.parts.StartEditPart.VISUAL_ID:case asu.ser.capstone.pivi.diagram.edit.parts.ThreadEndEditPart.VISUAL_ID:case asu.ser.capstone.pivi.diagram.edit.parts.ThreadStartEditPart.VISUAL_ID:case asu.ser.capstone.pivi.diagram.edit.parts.PrintStatementEditPart.VISUAL_ID:case asu.ser.capstone.pivi.diagram.edit.parts.SyncEndEditPart.VISUAL_ID:case asu.ser.capstone.pivi.diagram.edit.parts.SyncStartEditPart.VISUAL_ID:
		return true;
	}
	return false;
		}
	
	

	/**
 * @generated
 */
protected void refreshSemantic() {
	if (resolveSemanticElement() == null) {
		return;
	}
	java.util.LinkedList<org.eclipse.core.runtime.IAdaptable> createdViews = new java.util.LinkedList<org.eclipse.core.runtime.IAdaptable>();
			java.util.List<asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor> childDescriptors = 							asu.ser.capstone.pivi.diagram.part.PiviDiagramUpdater.getPiviDiagram_1000SemanticChildren((org.eclipse.gmf.runtime.notation.View) getHost().getModel());
					java.util.LinkedList<org.eclipse.gmf.runtime.notation.View> orphaned = new java.util.LinkedList<org.eclipse.gmf.runtime.notation.View>();
				// we care to check only views we recognize as ours
		java.util.LinkedList<org.eclipse.gmf.runtime.notation.View> knownViewChildren = new java.util.LinkedList<org.eclipse.gmf.runtime.notation.View>();
		for (org.eclipse.gmf.runtime.notation.View v : getViewChildren()) {
			if (isMyDiagramElement(v)) {
				knownViewChildren.add(v);
			}
		}
				// alternative to #cleanCanonicalSemanticChildren(getViewChildren(), semanticChildren)
				//
		// iteration happens over list of desired semantic elements, trying to find best matching View, while original CEP
		// iterates views, potentially losing view (size/bounds) information - i.e. if there are few views to reference same EObject, only last one 
		// to answer isOrphaned == true will be used for the domain element representation, see #cleanCanonicalSemanticChildren()
		for (java.util.Iterator<asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor> descriptorsIterator = childDescriptors.iterator(); descriptorsIterator.hasNext();) {
	asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor next = descriptorsIterator.next();
			String hint = asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(next.getVisualID());
			java.util.LinkedList<org.eclipse.gmf.runtime.notation.View> perfectMatch = new java.util.LinkedList<org.eclipse.gmf.runtime.notation.View>(); // both semanticElement and hint match that of NodeDescriptor
						for (org.eclipse.gmf.runtime.notation.View childView : getViewChildren()) {
				org.eclipse.emf.ecore.EObject semanticElement = childView.getElement();
				if (next.getModelElement().equals(semanticElement)) {
					if (hint.equals(childView.getType())) {
						perfectMatch.add(childView);
						// actually, can stop iteration over view children here, but
						// may want to use not the first view but last one as a 'real' match (the way original CEP does
						// with its trick with viewToSemanticMap inside #cleanCanonicalSemanticChildren
										}
									}
			}
			if (perfectMatch.size() > 0) {
				descriptorsIterator.remove(); // precise match found no need to create anything for the NodeDescriptor
				// use only one view (first or last?), keep rest as orphaned for further consideration
				knownViewChildren.remove(perfectMatch.getFirst());
						}
		}
		// those left in knownViewChildren are subject to removal - they are our diagram elements we didn't find match to,
		// or those we have potential matches to, and thus need to be recreated, preserving size/location information.
		orphaned.addAll(knownViewChildren);
		//
				java.util.ArrayList<org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest.ViewDescriptor> viewDescriptors = new java.util.ArrayList<org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest.ViewDescriptor>(childDescriptors.size());		
		for (asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor next : childDescriptors) {
			String hint = asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(next.getVisualID());
			org.eclipse.core.runtime.IAdaptable elementAdapter = new CanonicalElementAdapter(next.getModelElement(), hint);
			org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest.ViewDescriptor descriptor = new org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest.ViewDescriptor(elementAdapter, org.eclipse.gmf.runtime.notation.Node.class, hint, org.eclipse.gmf.runtime.diagram.core.util.ViewUtil.APPEND, false, host().getDiagramPreferencesHint());
			viewDescriptors.add(descriptor);
				}

		boolean changed = deleteViews(orphaned.iterator());
		//
		org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest request = getCreateViewRequest(viewDescriptors);
		org.eclipse.gef.commands.Command cmd = getCreateViewCommand(request);
		if (cmd != null && cmd.canExecute() ) {
			org.eclipse.gmf.runtime.diagram.ui.commands.SetViewMutabilityCommand.makeMutable(new org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter(host().getNotationView())).execute();
			executeCommand(cmd);
						@SuppressWarnings("unchecked")

			java.util.List<org.eclipse.core.runtime.IAdaptable> nl = (java.util.List<org.eclipse.core.runtime.IAdaptable>) request.getNewObject();
			createdViews.addAll(nl);
		}
		if (changed || createdViews.size() > 0) {
			postProcessRefreshSemantic(createdViews);
		}

			java.util.Collection<org.eclipse.core.runtime.IAdaptable> createdConnectionViews = refreshConnections();
	
		if (createdViews.size() > 1) {
		// perform a layout of the container
		org.eclipse.gmf.runtime.diagram.ui.commands.DeferredLayoutCommand layoutCmd = new org.eclipse.gmf.runtime.diagram.ui.commands.DeferredLayoutCommand(host().getEditingDomain(), createdViews, host());
		executeCommand(new org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy(layoutCmd));
	}

			createdViews.addAll(createdConnectionViews);
	
	makeViewsImmutable(createdViews);
}
					/**
 * @generated
 */
	private java.util.Collection<org.eclipse.core.runtime.IAdaptable> refreshConnections() {
			Domain2Notation domain2NotationMap = new Domain2Notation();
	java.util.Collection<asu.ser.capstone.pivi.diagram.part.PiviLinkDescriptor> linkDescriptors = collectAllLinks(getDiagram(), domain2NotationMap);
	java.util.Collection existingLinks = new java.util.LinkedList(getDiagram().getEdges());
	for (java.util.Iterator linksIterator = existingLinks.iterator(); linksIterator.hasNext();) {
		org.eclipse.gmf.runtime.notation.Edge nextDiagramLink = (org.eclipse.gmf.runtime.notation.Edge) linksIterator.next();
		int diagramLinkVisualID = asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getVisualID(nextDiagramLink);
		if (diagramLinkVisualID == -1) {
			if (nextDiagramLink.getSource() != null && nextDiagramLink.getTarget() != null) {
				linksIterator.remove();
			}
			continue;
		}
		org.eclipse.emf.ecore.EObject diagramLinkObject = nextDiagramLink.getElement();
		org.eclipse.emf.ecore.EObject diagramLinkSrc = nextDiagramLink.getSource().getElement();
		org.eclipse.emf.ecore.EObject diagramLinkDst = nextDiagramLink.getTarget().getElement();
		for (java.util.Iterator<asu.ser.capstone.pivi.diagram.part.PiviLinkDescriptor> linkDescriptorsIterator = linkDescriptors.iterator(); linkDescriptorsIterator.hasNext();) {
	asu.ser.capstone.pivi.diagram.part.PiviLinkDescriptor nextLinkDescriptor = linkDescriptorsIterator.next();
			if (diagramLinkObject == nextLinkDescriptor.getModelElement() && diagramLinkSrc == nextLinkDescriptor.getSource() && diagramLinkDst == nextLinkDescriptor.getDestination() && diagramLinkVisualID == nextLinkDescriptor.getVisualID()) {
				linksIterator.remove();
				linkDescriptorsIterator.remove();
				break;
			}
		}
	}
	deleteViews(existingLinks.iterator());
	return createConnections(linkDescriptors, domain2NotationMap);
	}
		
			/**
 * @generated
 */
private java.util.Collection<asu.ser.capstone.pivi.diagram.part.PiviLinkDescriptor> collectAllLinks(org.eclipse.gmf.runtime.notation.View view, Domain2Notation domain2NotationMap) {
	if (!asu.ser.capstone.pivi.diagram.edit.parts.PiviDiagramEditPart.MODEL_ID.equals(asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getModelID(view))) {
		return java.util.Collections.emptyList();
	}
	java.util.LinkedList<asu.ser.capstone.pivi.diagram.part.PiviLinkDescriptor> result = new java.util.LinkedList<asu.ser.capstone.pivi.diagram.part.PiviLinkDescriptor>();
	switch (asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getVisualID(view)) {
		case asu.ser.capstone.pivi.diagram.edit.parts.PiviDiagramEditPart.VISUAL_ID: {
	if (!domain2NotationMap.containsKey(view.getElement())) {
		result.addAll(asu.ser.capstone.pivi.diagram.part.PiviDiagramUpdater.getPiviDiagram_1000ContainedLinks(view));
	}
	domain2NotationMap.putView(view.getElement(), view);
	break;	
}
case asu.ser.capstone.pivi.diagram.edit.parts.IfStartEditPart.VISUAL_ID: {
	if (!domain2NotationMap.containsKey(view.getElement())) {
		result.addAll(asu.ser.capstone.pivi.diagram.part.PiviDiagramUpdater.getIfStart_2001ContainedLinks(view));
	}
	domain2NotationMap.putView(view.getElement(), view);
	break;	
}
case asu.ser.capstone.pivi.diagram.edit.parts.WhileEndEditPart.VISUAL_ID: {
	if (!domain2NotationMap.containsKey(view.getElement())) {
		result.addAll(asu.ser.capstone.pivi.diagram.part.PiviDiagramUpdater.getWhileEnd_2002ContainedLinks(view));
	}
	domain2NotationMap.putView(view.getElement(), view);
	break;	
}
case asu.ser.capstone.pivi.diagram.edit.parts.MethodEndEditPart.VISUAL_ID: {
	if (!domain2NotationMap.containsKey(view.getElement())) {
		result.addAll(asu.ser.capstone.pivi.diagram.part.PiviDiagramUpdater.getMethodEnd_2003ContainedLinks(view));
	}
	domain2NotationMap.putView(view.getElement(), view);
	break;	
}
case asu.ser.capstone.pivi.diagram.edit.parts.IfEndEditPart.VISUAL_ID: {
	if (!domain2NotationMap.containsKey(view.getElement())) {
		result.addAll(asu.ser.capstone.pivi.diagram.part.PiviDiagramUpdater.getIfEnd_2004ContainedLinks(view));
	}
	domain2NotationMap.putView(view.getElement(), view);
	break;	
}
case asu.ser.capstone.pivi.diagram.edit.parts.InstructionEditPart.VISUAL_ID: {
	if (!domain2NotationMap.containsKey(view.getElement())) {
		result.addAll(asu.ser.capstone.pivi.diagram.part.PiviDiagramUpdater.getInstruction_2005ContainedLinks(view));
	}
	domain2NotationMap.putView(view.getElement(), view);
	break;	
}
case asu.ser.capstone.pivi.diagram.edit.parts.MethodStartEditPart.VISUAL_ID: {
	if (!domain2NotationMap.containsKey(view.getElement())) {
		result.addAll(asu.ser.capstone.pivi.diagram.part.PiviDiagramUpdater.getMethodStart_2006ContainedLinks(view));
	}
	domain2NotationMap.putView(view.getElement(), view);
	break;	
}
case asu.ser.capstone.pivi.diagram.edit.parts.WhileStartEditPart.VISUAL_ID: {
	if (!domain2NotationMap.containsKey(view.getElement())) {
		result.addAll(asu.ser.capstone.pivi.diagram.part.PiviDiagramUpdater.getWhileStart_2007ContainedLinks(view));
	}
	domain2NotationMap.putView(view.getElement(), view);
	break;	
}
case asu.ser.capstone.pivi.diagram.edit.parts.StartEditPart.VISUAL_ID: {
	if (!domain2NotationMap.containsKey(view.getElement())) {
		result.addAll(asu.ser.capstone.pivi.diagram.part.PiviDiagramUpdater.getStart_2008ContainedLinks(view));
	}
	domain2NotationMap.putView(view.getElement(), view);
	break;	
}
case asu.ser.capstone.pivi.diagram.edit.parts.ThreadEndEditPart.VISUAL_ID: {
	if (!domain2NotationMap.containsKey(view.getElement())) {
		result.addAll(asu.ser.capstone.pivi.diagram.part.PiviDiagramUpdater.getThreadEnd_2009ContainedLinks(view));
	}
	domain2NotationMap.putView(view.getElement(), view);
	break;	
}
case asu.ser.capstone.pivi.diagram.edit.parts.ThreadStartEditPart.VISUAL_ID: {
	if (!domain2NotationMap.containsKey(view.getElement())) {
		result.addAll(asu.ser.capstone.pivi.diagram.part.PiviDiagramUpdater.getThreadStart_2010ContainedLinks(view));
	}
	domain2NotationMap.putView(view.getElement(), view);
	break;	
}
case asu.ser.capstone.pivi.diagram.edit.parts.PrintStatementEditPart.VISUAL_ID: {
	if (!domain2NotationMap.containsKey(view.getElement())) {
		result.addAll(asu.ser.capstone.pivi.diagram.part.PiviDiagramUpdater.getPrintStatement_2011ContainedLinks(view));
	}
	domain2NotationMap.putView(view.getElement(), view);
	break;	
}
case asu.ser.capstone.pivi.diagram.edit.parts.SyncEndEditPart.VISUAL_ID: {
	if (!domain2NotationMap.containsKey(view.getElement())) {
		result.addAll(asu.ser.capstone.pivi.diagram.part.PiviDiagramUpdater.getSyncEnd_2012ContainedLinks(view));
	}
	domain2NotationMap.putView(view.getElement(), view);
	break;	
}
case asu.ser.capstone.pivi.diagram.edit.parts.SyncStartEditPart.VISUAL_ID: {
	if (!domain2NotationMap.containsKey(view.getElement())) {
		result.addAll(asu.ser.capstone.pivi.diagram.part.PiviDiagramUpdater.getSyncStart_2013ContainedLinks(view));
	}
	domain2NotationMap.putView(view.getElement(), view);
	break;	
}
case asu.ser.capstone.pivi.diagram.edit.parts.InputPortEditPart.VISUAL_ID: {
	if (!domain2NotationMap.containsKey(view.getElement())) {
		result.addAll(asu.ser.capstone.pivi.diagram.part.PiviDiagramUpdater.getInputPort_3001ContainedLinks(view));
	}
	domain2NotationMap.putView(view.getElement(), view);
	break;	
}
case asu.ser.capstone.pivi.diagram.edit.parts.StartPortEditPart.VISUAL_ID: {
	if (!domain2NotationMap.containsKey(view.getElement())) {
		result.addAll(asu.ser.capstone.pivi.diagram.part.PiviDiagramUpdater.getStartPort_3002ContainedLinks(view));
	}
	domain2NotationMap.putView(view.getElement(), view);
	break;	
}
case asu.ser.capstone.pivi.diagram.edit.parts.OutputPortEditPart.VISUAL_ID: {
	if (!domain2NotationMap.containsKey(view.getElement())) {
		result.addAll(asu.ser.capstone.pivi.diagram.part.PiviDiagramUpdater.getOutputPort_3003ContainedLinks(view));
	}
	domain2NotationMap.putView(view.getElement(), view);
	break;	
}
	}
	for (java.util.Iterator children = view.getChildren().iterator(); children.hasNext();) {
		result.addAll(collectAllLinks((org.eclipse.gmf.runtime.notation.View) children.next(), domain2NotationMap));
	}
	for (java.util.Iterator edges = view.getSourceEdges().iterator(); edges.hasNext();) {
		result.addAll(collectAllLinks((org.eclipse.gmf.runtime.notation.View) edges.next(), domain2NotationMap));
	}
	return result;
}
	/**
 * @generated
 */
private java.util.Collection<org.eclipse.core.runtime.IAdaptable>  createConnections(java.util.Collection<asu.ser.capstone.pivi.diagram.part.PiviLinkDescriptor> linkDescriptors, Domain2Notation domain2NotationMap) {
	java.util.LinkedList<org.eclipse.core.runtime.IAdaptable> adapters = new java.util.LinkedList<org.eclipse.core.runtime.IAdaptable>();
	for (asu.ser.capstone.pivi.diagram.part.PiviLinkDescriptor nextLinkDescriptor : linkDescriptors) {
		org.eclipse.gef.EditPart sourceEditPart = getSourceEditPart(nextLinkDescriptor, domain2NotationMap);
		org.eclipse.gef.EditPart targetEditPart = getTargetEditPart(nextLinkDescriptor, domain2NotationMap);
		if (sourceEditPart == null || targetEditPart == null) {
			continue;
		}
		org.eclipse.gmf.runtime.diagram.ui.requests.CreateConnectionViewRequest.ConnectionViewDescriptor descriptor = new org.eclipse.gmf.runtime.diagram.ui.requests.CreateConnectionViewRequest.ConnectionViewDescriptor(nextLinkDescriptor.getSemanticAdapter(), asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(nextLinkDescriptor.getVisualID()), org.eclipse.gmf.runtime.diagram.core.util.ViewUtil.APPEND, false, ((org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart) getHost()).getDiagramPreferencesHint());
		org.eclipse.gmf.runtime.diagram.ui.requests.CreateConnectionViewRequest ccr = new org.eclipse.gmf.runtime.diagram.ui.requests.CreateConnectionViewRequest(descriptor);
		ccr.setType(org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants.REQ_CONNECTION_START);
		ccr.setSourceEditPart(sourceEditPart);
		sourceEditPart.getCommand(ccr);
		ccr.setTargetEditPart(targetEditPart);
		ccr.setType(org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants.REQ_CONNECTION_END);
		org.eclipse.gef.commands.Command cmd = targetEditPart.getCommand(ccr);
		if (cmd != null && cmd.canExecute()) {
			executeCommand(cmd);
			org.eclipse.core.runtime.IAdaptable viewAdapter = (org.eclipse.core.runtime.IAdaptable) ccr.getNewObject();
			if (viewAdapter != null) {
				adapters.add(viewAdapter);
			}
		}
	}
	return adapters;
}
	/**
 * @generated
 */
private org.eclipse.gef.EditPart getEditPart(org.eclipse.emf.ecore.EObject domainModelElement, Domain2Notation domain2NotationMap) {
	org.eclipse.gmf.runtime.notation.View view = (org.eclipse.gmf.runtime.notation.View) domain2NotationMap.get(domainModelElement);
	if (view != null) {
		return (org.eclipse.gef.EditPart) getHost().getViewer().getEditPartRegistry().get(view);
	}
	return null;
}
	/**
 * @generated
 */
private org.eclipse.gmf.runtime.notation.Diagram getDiagram() {
	return ((org.eclipse.gmf.runtime.notation.View) getHost().getModel()).getDiagram();
}
		/**
 * @generated
 */
private org.eclipse.gef.EditPart getSourceEditPart(org.eclipse.gmf.tooling.runtime.update.UpdaterLinkDescriptor descriptor, Domain2Notation domain2NotationMap) { 
	return getEditPart(descriptor.getSource(), domain2NotationMap);
}
		/**
 * @generated
 */
private org.eclipse.gef.EditPart getTargetEditPart(org.eclipse.gmf.tooling.runtime.update.UpdaterLinkDescriptor descriptor, Domain2Notation domain2NotationMap) { 
	return getEditPart(descriptor.getDestination(), domain2NotationMap);
}
		/**
 * @generated
 */
protected final org.eclipse.gef.EditPart getHintedEditPart(org.eclipse.emf.ecore.EObject domainModelElement, Domain2Notation domain2NotationMap, int hintVisualId) { 
	org.eclipse.gmf.runtime.notation.View view = (org.eclipse.gmf.runtime.notation.View) domain2NotationMap.getHinted(domainModelElement, 											asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(hintVisualId));
	if (view != null) {
		return (org.eclipse.gef.EditPart) getHost().getViewer().getEditPartRegistry().get(view);
	}
	return null;
}
			    /**
 * @generated
 */
	@SuppressWarnings("serial")
	protected static class Domain2Notation extends java.util.HashMap<org.eclipse.emf.ecore.EObject, org.eclipse.gmf.runtime.notation.View> {
	    /**
 * @generated
 */
		public boolean containsDomainElement(org.eclipse.emf.ecore.EObject domainElement){
			return this.containsKey(domainElement);
		}
		
		/**
 * @generated
 */
		public org.eclipse.gmf.runtime.notation.View getHinted(org.eclipse.emf.ecore.EObject domainEObject, String hint) {
			return this.get(domainEObject);
		}
		
		/**
 * @generated
 */
		public void putView(org.eclipse.emf.ecore.EObject domainElement, org.eclipse.gmf.runtime.notation.View view) {
						if (!containsKey(view.getElement()) ) {
				this.put(domainElement, view);
			}
		}
		
	}
	}
