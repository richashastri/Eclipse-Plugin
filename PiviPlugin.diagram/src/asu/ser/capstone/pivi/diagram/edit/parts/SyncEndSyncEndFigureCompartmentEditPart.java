package asu.ser.capstone.pivi.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ListCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;

import asu.ser.capstone.pivi.diagram.edit.parts.custom.SyncEndCompartmentFigureListener;
import asu.ser.capstone.pivi.diagram.edit.parts.custom.SyncEndRoundedRectangle;
import asu.ser.capstone.pivi.diagram.edit.policies.SyncEndSyncEndFigureCompartmentCanonicalEditPolicy;
import asu.ser.capstone.pivi.diagram.edit.policies.SyncEndSyncEndFigureCompartmentItemSemanticEditPolicy;
import asu.ser.capstone.pivi.diagram.part.Messages;
import asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry;

/**
 * @generated
 */
public class SyncEndSyncEndFigureCompartmentEditPart extends
		ListCompartmentEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 7012;

	/**
	 * @generated
	 */
	public SyncEndSyncEndFigureCompartmentEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected boolean hasModelChildrenChanged(Notification evt) {
		return false;
	}

	/**
	 * @generated
	 */
	public String getCompartmentName() {
		return Messages.SyncEndSyncEndFigureCompartmentEditPart_title;
	}

	/**
	 * @generated Not
	 */
	public IFigure createFigure() {
		ResizableCompartmentFigure result = (ResizableCompartmentFigure) super
				.createFigure();
		result.setTitleVisibility(false);
		
		// Setup for a XYLayout
		IFigure contentPane = result.getContentPane();
		contentPane.setLayoutManager(new XYLayout());
				
		// Delete content pane insets
		Insets is = contentPane.getInsets();
		is.top = 0;
		is.bottom = 0;
		is.left = 0;
		is.right = 0;
				 
		// Setup graphical elements
		SyncEndRoundedRectangle roundedRectangle = new SyncEndRoundedRectangle();
		contentPane.add(roundedRectangle);
				 
		// Add the resize events listener
		result.addFigureListener(new SyncEndCompartmentFigureListener(this, roundedRectangle));
		return result;
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new SyncEndSyncEndFigureCompartmentItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(
						PiviVisualIDRegistry.TYPED_INSTANCE));
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new SyncEndSyncEndFigureCompartmentCanonicalEditPolicy());
	}

	/**
	 * @generated
	 */
	protected void setRatio(Double ratio) {
		if (getFigure().getParent().getLayoutManager() instanceof ConstrainedToolbarLayout) {
			super.setRatio(ratio);
		}
	}

}
