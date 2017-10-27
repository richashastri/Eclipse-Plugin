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

import asu.ser.capstone.pivi.PrintStatement;

public class PrintStatementWizard extends Wizard{
	
	private class PrintStatementPage extends WizardPage {

		public Text printstatementText;

		public PrintStatementPage(String pageName) {
			super(pageName);
			setTitle("Print Statement");
		}

		@Override
		public void createControl(Composite parent) {
			Composite composite = new Composite(parent, SWT.NONE);
			Label printstatementLabel = new Label(composite, SWT.NONE);
			printstatementLabel.setText("Print Statement:");
			GridData gridData = new GridData();
			gridData.horizontalSpan = 2;
			printstatementLabel.setLayoutData(gridData);

			printstatementText = new Text(composite, SWT.MULTI | SWT.BORDER | SWT.V_SCROLL);
			gridData = new GridData();
			gridData.horizontalAlignment = SWT.FILL;
			gridData.grabExcessHorizontalSpace = true;
			gridData.verticalAlignment = SWT.FILL;
			gridData.grabExcessVerticalSpace = true;
			printstatementText.setLayoutData(gridData);
			printstatementText.setText(newPrintlines);
			composite.setLayout(new GridLayout(2, false));
			setControl(composite);
		}
	}

	private String newPrintlines;

	public PrintStatementWizard(GraphicalEditPart printstatementEditPart) {
		if (printstatementEditPart != null) {
			PrintStatement printstatementModel = (PrintStatement) printstatementEditPart.resolveSemanticElement();
			if (printstatementModel != null && printstatementModel.getPrintlines() != null) {
				this.newPrintlines = printstatementModel.getPrintlines();
			} else {
				this.newPrintlines = "";
			}
		} else {
			this.newPrintlines = "";
		}
		addPage(new PrintStatementPage("PrintStatementPage"));
	}

	@Override
	public boolean performFinish() {
		PrintStatementPage page = (PrintStatementPage) getPage("PrintStatementPage");
		newPrintlines = page.printstatementText.getText();
		return true;
	}

	public String getNewPrintlines() {
		return newPrintlines;
	}
	
	

}
