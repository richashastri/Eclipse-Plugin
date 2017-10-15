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

import asu.ser.capstone.pivi.diagram.edit.commands.custom.EditInstructionCommandThread;
import asu.ser.capstone.pivi.diagram.edit.parts.InstructionInstructionFigureCompartmentEditPart;
import asu.ser.capstone.pivi.diagram.part.custom.InstructionWizard;

public class InstructionOpenEditPolicy extends OpenEditPolicy {

	private WizardDialog wizardDialog;

	public InstructionOpenEditPolicy(WizardDialog wizardDialog) {
		super();
		this.wizardDialog = wizardDialog;
	}

	@Override
	protected Command getOpenCommand(Request request) {

		if (wizardDialog.open() == Window.OK) {
			IWizard wizard = wizardDialog.getCurrentPage().getWizard();
			if (wizard instanceof InstructionWizard) {
				EditPart editPart = getTargetEditPart(request);
				if (editPart != null && editPart instanceof InstructionInstructionFigureCompartmentEditPart) {
					EditPart instructionEditPart = editPart.getParent();
					if (instructionEditPart != null) {
						GraphicalEditPart instructionGEP = ((GraphicalEditPart) editPart);
						TransactionalEditingDomain domain = instructionGEP.getEditingDomain();
						EObject modelElement = instructionGEP.resolveSemanticElement();
						EStructuralFeature feature = modelElement.eClass().getEStructuralFeature("instructions");
						Thread editInstruction = new Thread(new EditInstructionCommandThread(domain, feature, modelElement, wizard));
						editInstruction.start();
					}
				}
			}
		}
		return null;
	}
}
