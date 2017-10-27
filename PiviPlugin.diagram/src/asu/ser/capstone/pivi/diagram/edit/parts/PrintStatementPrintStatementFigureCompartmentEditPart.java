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
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Shell;

import asu.ser.capstone.pivi.diagram.edit.parts.custom.PrintStatementCompartmentFigureListener;
import asu.ser.capstone.pivi.diagram.edit.parts.custom.PrintStatementRoundedRectangle;
import asu.ser.capstone.pivi.diagram.edit.policies.PrintStatementPrintStatementFigureCompartmentCanonicalEditPolicy;
import asu.ser.capstone.pivi.diagram.edit.policies.PrintStatementPrintStatementFigureCompartmentItemSemanticEditPolicy;
import asu.ser.capstone.pivi.diagram.edit.policies.custom.PrintStatementOpenEditPolicy;
import asu.ser.capstone.pivi.diagram.part.Messages;
import asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry;
import asu.ser.capstone.pivi.diagram.part.custom.PrintStatementWizard;

/**
 * @generated
 */
public class PrintStatementPrintStatementFigureCompartmentEditPart extends
		ListCompartmentEditPart {

	/**
	 * @generated NOT
	 */
	public static final int VISUAL_ID = 7011;
	
	protected Shell shell;
	
	protected WizardDialog wizardDialog;	

	/**
	 * @generated
	 */
	public PrintStatementPrintStatementFigureCompartmentEditPart(View view) {
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
		return Messages.PrintStatementPrintStatementFigureCompartmentEditPart_title;
	}

	/**
	 * @generated
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
				PrintStatementRoundedRectangle roundedRectangle = new PrintStatementRoundedRectangle();
				contentPane.add(roundedRectangle);
		 
				// Add the resize events listener
				result.addFigureListener(new PrintStatementCompartmentFigureListener(this, roundedRectangle));
				
				shell = new Shell(SWT.DIALOG_TRIM | 
		                SWT.PRIMARY_MODAL);
				wizardDialog = new WizardDialog(shell,
		                new PrintStatementWizard(this));
		
		return result;
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new PrintStatementPrintStatementFigureCompartmentItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(
						PiviVisualIDRegistry.TYPED_INSTANCE));
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new DragDropEditPolicy());
		installEditPolicy(
				EditPolicyRoles.CANONICAL_ROLE,
				new PrintStatementPrintStatementFigureCompartmentCanonicalEditPolicy());
		installEditPolicy(EditPolicyRoles.OPEN_ROLE, new PrintStatementOpenEditPolicy(wizardDialog));
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
