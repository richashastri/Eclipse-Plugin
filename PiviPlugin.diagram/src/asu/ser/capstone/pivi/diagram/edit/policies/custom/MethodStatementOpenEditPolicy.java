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

import asu.ser.capstone.pivi.diagram.edit.commands.custom.EditMethodStartCommandThread;
import asu.ser.capstone.pivi.diagram.edit.commands.custom.EditWhileStartCommandThread;
import asu.ser.capstone.pivi.diagram.edit.parts.MethodStartMethodStartFigureCompartmentEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.WhileStartWhileStartFigureCompartmentEditPart;
import asu.ser.capstone.pivi.diagram.part.custom.MethodWizard;
import asu.ser.capstone.pivi.diagram.part.custom.WhileStatementWizard;

public class MethodStatementOpenEditPolicy extends OpenEditPolicy{
	
	private WizardDialog wizardDialog;

	public MethodStatementOpenEditPolicy(WizardDialog wizardDialog) {
		super();
		this.wizardDialog = wizardDialog;
	}

	@Override
	protected Command getOpenCommand(Request request) {

		if (wizardDialog.open() == Window.OK) {
			IWizard wizard = wizardDialog.getCurrentPage().getWizard();
			if (wizard instanceof MethodWizard) {
				EditPart editPart = getTargetEditPart(request);
				if (editPart != null && editPart instanceof MethodStartMethodStartFigureCompartmentEditPart) {
					EditPart methodStatementEditPart = editPart.getParent();
					if (methodStatementEditPart != null) {
						GraphicalEditPart methodStatementGEP = ((GraphicalEditPart) editPart);
						TransactionalEditingDomain domain = methodStatementGEP.getEditingDomain();
						EObject modelElement = methodStatementGEP.resolveSemanticElement();
						EStructuralFeature feature = modelElement.eClass().getEStructuralFeature("condition");
						Thread editMethodStartCommand = new Thread(new EditMethodStartCommandThread(domain, feature, modelElement, wizard));
						editMethodStartCommand.start();
					}
				}
			}
		}
		return null;
	}
}
