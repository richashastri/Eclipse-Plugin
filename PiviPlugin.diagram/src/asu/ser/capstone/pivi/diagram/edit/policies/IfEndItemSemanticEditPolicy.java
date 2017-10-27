	package asu.ser.capstone.pivi.diagram.edit.policies;

/**
 * @generated
 */
public class IfEndItemSemanticEditPolicy extends asu.ser.capstone.pivi.diagram.edit.policies.PiviBaseItemSemanticEditPolicy {

		/**
 * @generated
 */
	public IfEndItemSemanticEditPolicy() {
				super(asu.ser.capstone.pivi.diagram.providers.PiviElementTypes.IfEnd_2004);
	}

	
	/**
 * @generated
 */
protected org.eclipse.gef.commands.Command getDestroyElementCommand(org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest req) {
	org.eclipse.gmf.runtime.notation.View view = (org.eclipse.gmf.runtime.notation.View) getHost().getModel();
	org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand cmd = new org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand(getEditingDomain(), null);
	cmd.setTransactionNestingEnabled(false);
		org.eclipse.emf.ecore.EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
	if (annotation == null) {
		// there are indirectly referenced children, need extra commands: false
		addDestroyChildNodesCommand(cmd);
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
	private void addDestroyChildNodesCommand(org.eclipse.gmf.runtime.common.core.command.ICompositeCommand cmd) {
		org.eclipse.gmf.runtime.notation.View view = (org.eclipse.gmf.runtime.notation.View) getHost().getModel();
		for (java.util.Iterator<?> nit = view.getChildren().iterator(); nit.hasNext();) {
			org.eclipse.gmf.runtime.notation.Node node = (org.eclipse.gmf.runtime.notation.Node) nit.next();
			switch (asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getVisualID(node)) {
									case asu.ser.capstone.pivi.diagram.edit.parts.IfEndIfEndFigureCompartmentEditPart.VISUAL_ID:
				for (java.util.Iterator<?> cit = node.getChildren().iterator(); cit.hasNext();) {
					org.eclipse.gmf.runtime.notation.Node cnode = (org.eclipse.gmf.runtime.notation.Node) cit.next();
					switch (asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getVisualID(cnode)) {
					case asu.ser.capstone.pivi.diagram.edit.parts.InputPortEditPart.VISUAL_ID:
		for (java.util.Iterator<?> it = cnode.getTargetEdges().iterator(); it.hasNext();) {
		org.eclipse.gmf.runtime.notation.Edge incomingLink = (org.eclipse.gmf.runtime.notation.Edge) it.next();
		if (asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getVisualID(incomingLink) == asu.ser.capstone.pivi.diagram.edit.parts.OutputPortInputPortEditPart.VISUAL_ID) {
			org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest r = new org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest(incomingLink.getSource().getElement(), null, incomingLink.getTarget().getElement(), false);
			cmd.add(new org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand(r));
			cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), incomingLink));
			continue;
		}
	}
	cmd.add(new org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand(new org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest(getEditingDomain(), cnode.getElement(), false))); // directlyOwned: true
	// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
	// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
	break;
case asu.ser.capstone.pivi.diagram.edit.parts.OutputPortEditPart.VISUAL_ID:
		for (java.util.Iterator<?> it = cnode.getSourceEdges().iterator(); it.hasNext();) {
		org.eclipse.gmf.runtime.notation.Edge outgoingLink = (org.eclipse.gmf.runtime.notation.Edge) it.next();
		if (asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getVisualID(outgoingLink) == asu.ser.capstone.pivi.diagram.edit.parts.OutputPortInputPortEditPart.VISUAL_ID) {
			org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest r = new org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest(outgoingLink.getSource().getElement(), null, outgoingLink.getTarget().getElement(), false);
			cmd.add(new org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand(r));
			cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), outgoingLink));
			continue;
		}
	}
	cmd.add(new org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand(new org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest(getEditingDomain(), cnode.getElement(), false))); // directlyOwned: true
	// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
	// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
	break;
case asu.ser.capstone.pivi.diagram.edit.parts.StartPortEditPart.VISUAL_ID:
		for (java.util.Iterator<?> it = cnode.getTargetEdges().iterator(); it.hasNext();) {
		org.eclipse.gmf.runtime.notation.Edge incomingLink = (org.eclipse.gmf.runtime.notation.Edge) it.next();
		if (asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getVisualID(incomingLink) == asu.ser.capstone.pivi.diagram.edit.parts.StartStartPortEditPart.VISUAL_ID) {
			org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest r = new org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest(incomingLink.getSource().getElement(), null, incomingLink.getTarget().getElement(), false);
			cmd.add(new org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand(r));
			cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), incomingLink));
			continue;
		}
	}
	cmd.add(new org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand(new org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest(getEditingDomain(), cnode.getElement(), false))); // directlyOwned: true
	// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
	// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
	break;
					}
				}
				break;
						}
		}
	}
					
	}
