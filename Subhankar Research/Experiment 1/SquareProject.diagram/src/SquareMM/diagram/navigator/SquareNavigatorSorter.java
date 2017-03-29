package SquareMM.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class SquareNavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 4003;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof SquareMM.diagram.navigator.SquareNavigatorItem) {
			SquareMM.diagram.navigator.SquareNavigatorItem item = (SquareMM.diagram.navigator.SquareNavigatorItem) element;
			return SquareMM.diagram.part.SquareVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
