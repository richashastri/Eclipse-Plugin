package PiViMM.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class PiViNavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 4003;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof PiViMM.diagram.navigator.PiViNavigatorItem) {
			PiViMM.diagram.navigator.PiViNavigatorItem item = (PiViMM.diagram.navigator.PiViNavigatorItem) element;
			return PiViMM.diagram.part.PiViVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
