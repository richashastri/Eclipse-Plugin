package asu.ser.capstone.pivi.diagram.part.custom;

import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import asu.ser.capstone.pivi.Instruction;

public class InstructionWizard extends Wizard {

	private class InstructionPage extends WizardPage {

		public Text instructionText;

		public InstructionPage(String pageName) {
			super(pageName);
			setTitle("Instruction");
		}

		@Override
		public void createControl(Composite parent) {
			Composite composite = new Composite(parent, SWT.NONE);
			Label instructionLabel = new Label(composite, SWT.NONE);
			instructionLabel.setText("Instructions:");
			GridData gridData = new GridData();
			gridData.horizontalSpan = 2;
			instructionLabel.setLayoutData(gridData);

			instructionText = new Text(composite, SWT.MULTI | SWT.BORDER | SWT.V_SCROLL);
			gridData = new GridData();
			gridData.horizontalAlignment = SWT.FILL;
			gridData.grabExcessHorizontalSpace = true;
			gridData.verticalAlignment = SWT.FILL;
			gridData.grabExcessVerticalSpace = true;
			instructionText.setLayoutData(gridData);
			instructionText.setText(newInstructions);
			composite.setLayout(new GridLayout(2, false));
			setControl(composite);
		}
	}

	private String newInstructions;

	public InstructionWizard(GraphicalEditPart instructionEditPart) {
		if (instructionEditPart != null) {
			Instruction instructionModel = (Instruction) instructionEditPart.resolveSemanticElement();
			if (instructionModel != null && instructionModel.getInstructions() != null) {
				this.newInstructions = instructionModel.getInstructions();
			} else {
				this.newInstructions = "";
			}
		} else {
			this.newInstructions = "";
		}
		addPage(new InstructionPage("instructionsPage"));
	}

	@Override
	public boolean performFinish() {
		InstructionPage page = (InstructionPage) getPage("instructionsPage");
		newInstructions = page.instructionText.getText();
		return true;
	}

	public String getNewInstructions() {
		return newInstructions;
	}
}
