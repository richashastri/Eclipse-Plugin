package CodeBlockMM.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class PivicodeNavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 4003;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof CodeBlockMM.diagram.navigator.PivicodeNavigatorItem) {
			CodeBlockMM.diagram.navigator.PivicodeNavigatorItem item = (CodeBlockMM.diagram.navigator.PivicodeNavigatorItem) element;
			return CodeBlockMM.diagram.part.PivicodeVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
