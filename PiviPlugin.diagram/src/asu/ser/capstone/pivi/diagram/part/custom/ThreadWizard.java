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

import asu.ser.capstone.pivi.ThreadStart;

public class ThreadWizard extends Wizard{
	
	private class ThreadPage extends WizardPage {

		public Text threadName;

		public ThreadPage(String pageName) {
			super(pageName);
			setTitle("Thread");
		}

		@Override
		public void createControl(Composite parent) {
			Composite composite = new Composite(parent, SWT.NONE);
			Label threadLabel = new Label(composite, SWT.NONE);
			threadLabel.setText("Thread Name:");
			GridData gridData = new GridData();
			gridData.horizontalSpan = 2;
			threadLabel.setLayoutData(gridData);
			threadName = new Text(composite, SWT.MULTI | SWT.BORDER | SWT.V_SCROLL);
			gridData = new GridData();
			gridData.horizontalAlignment = SWT.FILL;
			gridData.grabExcessHorizontalSpace = true;
			gridData.verticalAlignment = SWT.FILL;
			gridData.grabExcessVerticalSpace = true;
			threadName.setLayoutData(gridData);
			threadName.setText(newName);
			composite.setLayout(new GridLayout(2, false));
			setControl(composite);
		}
	}
	
	private String newName;

	public ThreadWizard(GraphicalEditPart threadStartEditPart) {
		if (threadStartEditPart != null) {
			ThreadStart threadStatementModel = (ThreadStart) threadStartEditPart.resolveSemanticElement();
			if (threadStatementModel != null && threadStatementModel.getCondition() != null) {
				this.newName = threadStatementModel.getCondition();
			} else {
				this.newName = "";
			}
			
		} else {
			this.newName = "";
		}
		addPage(new ThreadPage("ThreadPage"));
	}

	@Override
	public boolean performFinish() {
		ThreadPage page = (ThreadPage) getPage("ThreadPage");
		newName = page.threadName.getText();
		return true;
	}

	public String getNewName() {
		return newName;
	}
}
