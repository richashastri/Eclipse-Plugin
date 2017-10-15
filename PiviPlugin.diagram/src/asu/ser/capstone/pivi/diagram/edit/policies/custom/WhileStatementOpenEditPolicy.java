package asu.ser.capstone.pivi.diagram.edit.policies.custom;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.OpenEditPolicy;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.WizardDialog;

import asu.ser.capstone.pivi.diagram.edit.commands.custom.EditWhileStartCommandThread;
import asu.ser.capstone.pivi.diagram.edit.parts.WhileStartWhileStartFigureCompartmentEditPart;
import asu.ser.capstone.pivi.diagram.part.custom.WhileStatementWizard;

public class WhileStatementOpenEditPolicy extends OpenEditPolicy{
	private WizardDialog wizardDialog;

	public WhileStatementOpenEditPolicy(WizardDialog wizardDialog) {
		super();
		this.wizardDialog = wizardDialog;
	}

	@Override
	protected Command getOpenCommand(Request request) {

		if (wizardDialog.open() == Window.OK) {
			IWizard wizard = wizardDialog.getCurrentPage().getWizard();
			if (wizard instanceof WhileStatementWizard) {
				EditPart editPart = getTargetEditPart(request);
				if (editPart != null && editPart instanceof WhileStartWhileStartFigureCompartmentEditPart) {
					EditPart whileStatementEditPart = editPart.getParent();
					if (whileStatementEditPart != null) {
						GraphicalEditPart whileStatementGEP = ((GraphicalEditPart) editPart);
						TransactionalEditingDomain domain = whileStatementGEP.getEditingDomain();
						EObject modelElement = whileStatementGEP.resolveSemanticElement();
						EStructuralFeature feature = modelElement.eClass().getEStructuralFeature("condition");
						Thread editWhileStartCommand = new Thread(new EditWhileStartCommandThread(domain, feature, modelElement, wizard));
						editWhileStartCommand.start();
					}
				}
			}
		}
		return null;
	}

}
