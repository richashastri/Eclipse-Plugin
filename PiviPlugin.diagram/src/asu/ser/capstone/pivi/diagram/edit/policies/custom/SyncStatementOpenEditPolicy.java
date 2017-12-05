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

import asu.ser.capstone.pivi.diagram.edit.commands.custom.EditSyncStartCommandThread;
import asu.ser.capstone.pivi.diagram.edit.parts.SyncStartSyncStartFigureCompartmentEditPart;
import asu.ser.capstone.pivi.diagram.part.custom.SyncWizard;

public class SyncStatementOpenEditPolicy extends OpenEditPolicy{
	
	private WizardDialog wizardDialog;

	public SyncStatementOpenEditPolicy(WizardDialog wizardDialog) {
		super();
		this.wizardDialog = wizardDialog;
	}
	
	@Override
	protected Command getOpenCommand(Request request) {

		if (wizardDialog.open() == Window.OK) {
			IWizard wizard = wizardDialog.getCurrentPage().getWizard();
			if (wizard instanceof SyncWizard) {
				EditPart editPart = getTargetEditPart(request);
				if (editPart != null && editPart instanceof SyncStartSyncStartFigureCompartmentEditPart) {
					EditPart whileStatementEditPart = editPart.getParent();
					if (whileStatementEditPart != null) {
						GraphicalEditPart whileStatementGEP = ((GraphicalEditPart) editPart);
						TransactionalEditingDomain domain = whileStatementGEP.getEditingDomain();
						EObject modelElement = whileStatementGEP.resolveSemanticElement();
						EStructuralFeature feature = modelElement.eClass().getEStructuralFeature("condition");
						Thread editSyncStartCommand = new Thread(new EditSyncStartCommandThread(domain, feature, modelElement, wizard));
						editSyncStartCommand.start();
					}
				}
			}
		}
		return null;
	}


}
