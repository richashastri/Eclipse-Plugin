	package asu.ser.capstone.pivi.diagram.edit.policies;

/**
 * @generated
 */
public class StartPortItemSemanticEditPolicy extends asu.ser.capstone.pivi.diagram.edit.policies.PiviBaseItemSemanticEditPolicy {

		/**
 * @generated
 */
	public StartPortItemSemanticEditPolicy() {
				super(asu.ser.capstone.pivi.diagram.providers.PiviElementTypes.StartPort_3002);
	}

	
	/**
 * @generated
 */
protected org.eclipse.gef.commands.Command getDestroyElementCommand(org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest req) {
	org.eclipse.gmf.runtime.notation.View view = (org.eclipse.gmf.runtime.notation.View) getHost().getModel();
	org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand cmd = new org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand(getEditingDomain(), null);
	cmd.setTransactionNestingEnabled(false);
		for (java.util.Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
		org.eclipse.gmf.runtime.notation.Edge incomingLink = (org.eclipse.gmf.runtime.notation.Edge) it.next();
		if (asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getVisualID(incomingLink) == asu.ser.capstone.pivi.diagram.edit.parts.StartStartPortEditPart.VISUAL_ID) {
			org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest r = new org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest(incomingLink.getSource().getElement(), null, incomingLink.getTarget().getElement(), false);
			cmd.add(new org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand(r));
			cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), incomingLink));
			continue;
		}
	}
	org.eclipse.emf.ecore.EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
	if (annotation == null) {
		// there are indirectly referenced children, need extra commands: false
		addDestroyShortcutsCommand(cmd, view);
		// delete host element
		cmd.add(new org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand(req));
	} else {
		cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), view));
	}
	return getGEFWrapper(cmd.reduce());
}
					
/**
 * @generated
 */
protected org.eclipse.gef.commands.Command getCreateRelationshipCommand(
		org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest req) {
	org.eclipse.gef.commands.Command command = req.getTarget() == null ?
			getStartCreateRelationshipCommand(req) : getCompleteCreateRelationshipCommand(req);
	return command != null ? command : super.getCreateRelationshipCommand(req);
}

/**
 * @generated
 */
protected org.eclipse.gef.commands.Command getStartCreateRelationshipCommand(
		org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest req) {
	if (asu.ser.capstone.pivi.diagram.providers.PiviElementTypes.StartStartPort_4004 == req.getElementType()) {
		return null;
	}
	return null;
}

/**
 * @generated
 */
protected org.eclipse.gef.commands.Command getCompleteCreateRelationshipCommand(
		org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest req) {
	if (asu.ser.capstone.pivi.diagram.providers.PiviElementTypes.StartStartPort_4004 == req.getElementType()) {
		return getGEFWrapper(new asu.ser.capstone.pivi.diagram.edit.commands.StartStartPortCreateCommand(req,
					req.getSource(), req.getTarget()
			));
	}
	return null;
}
					
/**
 * Returns command to reorient EReference based link. New link target or source
 * should be the domain model element associated with this node.
 * 
 * @generated
 */
protected org.eclipse.gef.commands.Command getReorientReferenceRelationshipCommand(
		org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest req) {
	switch (getVisualID(req)) {
	case asu.ser.capstone.pivi.diagram.edit.parts.StartStartPortEditPart.VISUAL_ID:
	return getGEFWrapper(new asu.ser.capstone.pivi.diagram.edit.commands.StartStartPortReorientCommand(req));
	}
	return super.getReorientReferenceRelationshipCommand(req);
}
	
	}
