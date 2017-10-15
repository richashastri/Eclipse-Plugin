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

import asu.ser.capstone.pivi.WhileStart;

public class WhileStatementWizard extends Wizard{

	private class WhileStatementPage extends WizardPage {

		public Text conditionText;

		public WhileStatementPage(String pageName) {
			super(pageName);
			setTitle("Whille Condition");
		}

		@Override
		public void createControl(Composite parent) {
			Composite composite = new Composite(parent, SWT.NONE);
			Label conditionLabel = new Label(composite, SWT.NONE);
			conditionLabel.setText("While Condition:");
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

	public WhileStatementWizard(GraphicalEditPart whileStartEditPart) {
		if (whileStartEditPart != null) {
			WhileStart whileStatementModel = (WhileStart) whileStartEditPart.resolveSemanticElement();
			if (whileStatementModel != null && whileStatementModel.getCondition() != null) {
				this.newCondition = whileStatementModel.getCondition();
			} else {
				this.newCondition = "";
			}
			
		} else {
			this.newCondition = "";
		}
		addPage(new WhileStatementPage("whileStatementPage"));
	}

	@Override
	public boolean performFinish() {
		WhileStatementPage page = (WhileStatementPage) getPage("whileStatementPage");
		newCondition = page.conditionText.getText();
		return true;
	}

	public String getNewCondition() {
		return newCondition;
	}

}
