package asu.ser.capstone.pivi.diagram.part.custom;

import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IWorkbenchPage;

import asu.ser.capstone.pivi.diagram.part.PiviDiagramActionBarContributor;

public class CustomPiviDiagramActionBarContributor extends PiviDiagramActionBarContributor{
	@Override 
	public void init(IActionBars bars, IWorkbenchPage page) { 
		//super.init(bars, page); 
		IToolBarManager toolBarManager = bars.getToolBarManager();
		assert toolBarManager != null;
		GenerateCodeAction codeGenAction = new GenerateCodeAction();
		toolBarManager.add(codeGenAction);		
		toolBarManager.add(new Separator());
		//ExecuteCodeAction codeExecAction = new ExecuteCodeAction();
		//toolBarManager.add(codeExecAction);
	}
}
