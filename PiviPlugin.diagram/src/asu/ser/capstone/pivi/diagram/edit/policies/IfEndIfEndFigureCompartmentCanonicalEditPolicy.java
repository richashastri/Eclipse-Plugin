	package asu.ser.capstone.pivi.diagram.edit.policies;

/**
 * @generated
 */
public class IfEndIfEndFigureCompartmentCanonicalEditPolicy extends org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy {
		
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
			myFeaturesToSynchronize.add(asu.ser.capstone.pivi.PiviPackage.eINSTANCE.getStatement_Inputs());
myFeaturesToSynchronize.add(asu.ser.capstone.pivi.PiviPackage.eINSTANCE.getStatement_Outputs());
myFeaturesToSynchronize.add(asu.ser.capstone.pivi.PiviPackage.eINSTANCE.getStatement_Start());
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
	java.util.List<asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor> childDescriptors = asu.ser.capstone.pivi.diagram.part.PiviDiagramUpdater.getIfEndIfEndFigureCompartment_7004SemanticChildren(viewObject);
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
		return visualID == asu.ser.capstone.pivi.diagram.edit.parts.InputPortEditPart.VISUAL_ID || visualID == asu.ser.capstone.pivi.diagram.edit.parts.OutputPortEditPart.VISUAL_ID || visualID == asu.ser.capstone.pivi.diagram.edit.parts.StartPortEditPart.VISUAL_ID; 
		}
	
	
	/**
 * @generated
 */
protected void refreshSemantic() {
	if (resolveSemanticElement() == null) {
		return;
	}
	java.util.LinkedList<org.eclipse.core.runtime.IAdaptable> createdViews = new java.util.LinkedList<org.eclipse.core.runtime.IAdaptable>();
			java.util.List<asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor> childDescriptors = 							asu.ser.capstone.pivi.diagram.part.PiviDiagramUpdater.getIfEndIfEndFigureCompartment_7004SemanticChildren((org.eclipse.gmf.runtime.notation.View) getHost().getModel());
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
		if (createdViews.size() > 1) {
		// perform a layout of the container
		org.eclipse.gmf.runtime.diagram.ui.commands.DeferredLayoutCommand layoutCmd = new org.eclipse.gmf.runtime.diagram.ui.commands.DeferredLayoutCommand(host().getEditingDomain(), createdViews, host());
		executeCommand(new org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy(layoutCmd));
	}
	
	makeViewsImmutable(createdViews);
}
	}
