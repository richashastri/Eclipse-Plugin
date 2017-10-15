package asu.ser.capstone.pivi.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry;

/**
 * @generated
 */
public class PiviNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7010;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof PiviNavigatorItem) {
			PiviNavigatorItem item = (PiviNavigatorItem) element;
			return PiviVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
