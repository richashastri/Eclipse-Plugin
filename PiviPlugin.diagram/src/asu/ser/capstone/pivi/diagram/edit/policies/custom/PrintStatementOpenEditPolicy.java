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

import asu.ser.capstone.pivi.diagram.edit.commands.custom.EditPrintStatementCommandThread;
import asu.ser.capstone.pivi.diagram.edit.parts.PrintStatementPrintStatementFigureCompartmentEditPart;
import asu.ser.capstone.pivi.diagram.part.custom.PrintStatementWizard;

public class PrintStatementOpenEditPolicy extends OpenEditPolicy {
	private WizardDialog wizardDialog;

	public PrintStatementOpenEditPolicy(WizardDialog wizardDialog) {
		super();
		this.wizardDialog = wizardDialog;
	}

	@Override
	protected Command getOpenCommand(Request request) {

		if (wizardDialog.open() == Window.OK) {
			IWizard wizard = wizardDialog.getCurrentPage().getWizard();
			if (wizard instanceof PrintStatementWizard) {
				EditPart editPart = getTargetEditPart(request);
				if (editPart != null && editPart instanceof PrintStatementPrintStatementFigureCompartmentEditPart) {
					EditPart printstatementEditPart = editPart.getParent();
					if (printstatementEditPart != null) {
						GraphicalEditPart printstatementGEP = ((GraphicalEditPart) editPart);
						TransactionalEditingDomain domain = printstatementGEP.getEditingDomain();
						EObject modelElement = printstatementGEP.resolveSemanticElement();
						EStructuralFeature feature = modelElement.eClass().getEStructuralFeature("printlines");
						Thread editPrintStatement = new Thread(new EditPrintStatementCommandThread(domain, feature, modelElement, wizard));
						editPrintStatement.start();
					}
				}
			}
		}
		return null;
	}
	

}
