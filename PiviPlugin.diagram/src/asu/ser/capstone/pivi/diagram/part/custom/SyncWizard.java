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
import asu.ser.capstone.pivi.SyncStart;


public class SyncWizard extends Wizard{
	
	private class SyncPage extends WizardPage {

		public Text syncName;

		public SyncPage(String pageName) {
			super(pageName);
			setTitle("Sync");
		}

		@Override
		public void createControl(Composite parent) {
			Composite composite = new Composite(parent, SWT.NONE);
			Label syncLabel = new Label(composite, SWT.NONE);
			syncLabel.setText("Sync Name:");
			GridData gridData = new GridData();
			gridData.horizontalSpan = 2;
			syncLabel.setLayoutData(gridData);
			syncName = new Text(composite, SWT.MULTI | SWT.BORDER | SWT.V_SCROLL);
			gridData = new GridData();
			gridData.horizontalAlignment = SWT.FILL;
			gridData.grabExcessHorizontalSpace = true;
			gridData.verticalAlignment = SWT.FILL;
			gridData.grabExcessVerticalSpace = true;
			syncName.setLayoutData(gridData);
			syncName.setText(newName);
			composite.setLayout(new GridLayout(2, false));
			setControl(composite);
		}
	}
	private String newName;
	
	public SyncWizard(GraphicalEditPart syncStartEditPart) {
		if (syncStartEditPart != null) {
			SyncStart syncStatementModel = (SyncStart) syncStartEditPart.resolveSemanticElement();
			if (syncStatementModel != null && syncStatementModel.getCondition() != null) {
				this.newName = syncStatementModel.getCondition();
			} else {
				this.newName = "";
			}
			
		} else {
			this.newName = "";
		}
		addPage(new SyncPage("SyncPage"));
	}
	
	@Override
	public boolean performFinish() {
		SyncPage page = (SyncPage) getPage("SyncPage");
		newName = page.syncName.getText();
		return true;
	}

	public String getNewName() {
		return newName;
	}
}
