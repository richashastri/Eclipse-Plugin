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

import asu.ser.capstone.pivi.IfStart;

public class IfStatementWizard extends Wizard{

	private class IfStatementPage extends WizardPage {

		public Text conditionText;

		public IfStatementPage(String pageName) {
			super(pageName);
			setTitle("IF Condition");
		}

		@Override
		public void createControl(Composite parent) {
			Composite composite = new Composite(parent, SWT.NONE);
			Label conditionLabel = new Label(composite, SWT.NONE);
			conditionLabel.setText("If Condition:");
			GridData gridData = new GridData();
			gridData.horizontalSpan = 2;
			conditionLabel.setLayoutData(gridData);
			conditionText = new Text(composite, SWT.MULTI | SWT.BORDER | SWT.V_SCROLL);
			gridData = new GridData();
			gridData.horizontalAlignment = SWT.FILL;
			gridData.grabExcessHorizontalSpace = true;
			gridData.verticalAlignment = SWT.FILL;
			gridData.grabExcessVerticalSpace = true;
			conditionText.setLayoutData(gridData);
			conditionText.setText(newCondition);
			composite.setLayout(new GridLayout(2, false));
			setControl(composite);
		}
	}

	private String newCondition;

	public IfStatementWizard(GraphicalEditPart ifStartEditPart) {
		if (ifStartEditPart != null) {
			IfStart ifStatementModel = (IfStart) ifStartEditPart.resolveSemanticElement();
			if (ifStatementModel != null && ifStatementModel.getCondition() != null) {
				this.newCondition = ifStatementModel.getCondition();
			} else {
				this.newCondition = "";
			}
			
		} else {
			this.newCondition = "";
		}
		addPage(new IfStatementPage("ifStatementPage"));
	}

	@Override
	public boolean performFinish() {
		IfStatementPage page = (IfStatementPage) getPage("ifStatementPage");
		newCondition = page.conditionText.getText();
		return true;
	}

	public String getNewCondition() {
		return newCondition;
	}

	
}
