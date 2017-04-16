package PiViM.diagram.navigator;

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
		if (element instanceof PiViM.diagram.navigator.PiViNavigatorItem) {
			PiViM.diagram.navigator.PiViNavigatorItem item = (PiViM.diagram.navigator.PiViNavigatorItem) element;
			return PiViM.diagram.part.PiViVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
