package CodeBlockMM.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class CodeBlockNavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 4003;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof CodeBlockMM.diagram.navigator.CodeBlockNavigatorItem) {
			CodeBlockMM.diagram.navigator.CodeBlockNavigatorItem item = (CodeBlockMM.diagram.navigator.CodeBlockNavigatorItem) element;
			return CodeBlockMM.diagram.part.CodeBlockVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
