package SquareMM.diagram.part;

import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramActionBarContributor;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.IWorkbenchPage;

/**
 * @generated
 */
public class SquareDiagramActionBarContributor extends DiagramActionBarContributor {

	/**
	* @generated
	*/
	protected Class getEditorClass() {
		return SquareMM.diagram.part.SquareDiagramEditor.class;
	}

	/**
	* @generated
	*/
	protected String getEditorId() {
		return SquareMM.diagram.part.SquareDiagramEditor.ID;
	}

	/**
	* @generated
	*/
	public void init(IActionBars bars, IWorkbenchPage page) {
		super.init(bars, page);
		// print preview
		IMenuManager fileMenu = bars.getMenuManager().findMenuUsingPath(IWorkbenchActionConstants.M_FILE);
		assert fileMenu != null;
		fileMenu.remove("pageSetupAction"); //$NON-NLS-1$
	}
}
