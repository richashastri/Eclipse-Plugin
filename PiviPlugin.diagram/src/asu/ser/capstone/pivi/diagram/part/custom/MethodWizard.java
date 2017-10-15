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

import asu.ser.capstone.pivi.MethodStart;

public class MethodWizard extends Wizard{
	private class MethodPage extends WizardPage {

		public Text methodName;

		public MethodPage(String pageName) {
			super(pageName);
			setTitle("Method");
		}

		@Override
		public void createControl(Composite parent) {
			Composite composite = new Composite(parent, SWT.NONE);
			Label methodLabel = new Label(composite, SWT.NONE);
			methodLabel.setText("Method Name:");
			GridData gridData = new GridData();
			gridData.horizontalSpan = 2;
			methodLabel.setLayoutData(gridData);
			methodName = new Text(composite, SWT.MULTI | SWT.BORDER | SWT.V_SCROLL);
			gridData = new GridData();
			gridData.horizontalAlignment = SWT.FILL;
			gridData.grabExcessHorizontalSpace = true;
			gridData.verticalAlignment = SWT.FILL;
			gridData.grabExcessVerticalSpace = true;
			methodName.setLayoutData(gridData);
			methodName.setText(newName);
			composite.setLayout(new GridLayout(2, false));
			setControl(composite);
		}
	}

	private String newName;

	public MethodWizard(GraphicalEditPart methodStartEditPart) {
		if (methodStartEditPart != null) {
			MethodStart methodStatementModel = (MethodStart) methodStartEditPart.resolveSemanticElement();
			if (methodStatementModel != null && methodStatementModel.getName() != null) {
				this.newName = methodStatementModel.getName();
			} else {
				this.newName = "";
			}
			
		} else {
			this.newName = "";
		}
		addPage(new MethodPage("MethodPage"));
	}

	@Override
	public boolean performFinish() {
		MethodPage page = (MethodPage) getPage("MethodPage");
		newName = page.methodName.getText();
		return true;
	}

	public String getNewName() {
		return newName;
	}
}
