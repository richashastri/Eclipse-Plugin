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

import asu.ser.capstone.pivi.diagram.edit.commands.custom.EditIfStartCommandThread;
import asu.ser.capstone.pivi.diagram.edit.commands.custom.EditInstructionCommandThread;
import asu.ser.capstone.pivi.diagram.edit.parts.IfStartIfStartFigureCompartmentEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.InstructionInstructionFigureCompartmentEditPart;
import asu.ser.capstone.pivi.diagram.part.custom.InstructionWizard;
import asu.ser.capstone.pivi.diagram.part.custom.IfStatementWizard;;

public class IfStatementOpenEditPolicy extends OpenEditPolicy{

	private WizardDialog wizardDialog;

	public IfStatementOpenEditPolicy(WizardDialog wizardDialog) {
		super();
		this.wizardDialog = wizardDialog;
	}

	@Override
	protected Command getOpenCommand(Request request) {

		if (wizardDialog.open() == Window.OK) {
			IWizard wizard = wizardDialog.getCurrentPage().getWizard();
			if (wizard instanceof IfStatementWizard) {
				EditPart editPart = getTargetEditPart(request);
				if (editPart != null && editPart instanceof IfStartIfStartFigureCompartmentEditPart) {
					EditPart ifStatementEditPart = editPart.getParent();
					if (ifStatementEditPart != null) {
						GraphicalEditPart ifStatementGEP = ((GraphicalEditPart) editPart);
						TransactionalEditingDomain domain = ifStatementGEP.getEditingDomain();
						EObject modelElement = ifStatementGEP.resolveSemanticElement();
						EStructuralFeature feature = modelElement.eClass().getEStructuralFeature("condition");
						Thread editIfStartCommand = new Thread(new EditIfStartCommandThread(domain, feature, modelElement, wizard));
						editIfStartCommand.start();
					}
				}
			}
		}
		return null;
	}

}
