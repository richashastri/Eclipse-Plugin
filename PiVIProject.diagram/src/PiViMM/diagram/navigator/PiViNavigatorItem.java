package PiViMM.diagram.navigator;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class PiViNavigatorItem extends PiViMM.diagram.navigator.PiViAbstractNavigatorItem {

	/**
	* @generated
	*/
	static {
		final Class[] supportedTypes = new Class[] { View.class, EObject.class };
		Platform.getAdapterManager().registerAdapters(new IAdapterFactory() {

			public Object getAdapter(Object adaptableObject, Class adapterType) {
				if (adaptableObject instanceof PiViMM.diagram.navigator.PiViNavigatorItem
						&& (adapterType == View.class || adapterType == EObject.class)) {
					return ((PiViMM.diagram.navigator.PiViNavigatorItem) adaptableObject).getView();
				}
				return null;
			}

			public Class[] getAdapterList() {
				return supportedTypes;
			}
		}, PiViMM.diagram.navigator.PiViNavigatorItem.class);
	}

	/**
	* @generated
	*/
	private View myView;

	/**
	* @generated
	*/
	private boolean myLeaf = false;

	/**
	* @generated
	*/
	public PiViNavigatorItem(View view, Object parent, boolean isLeaf) {
		super(parent);
		myView = view;
		myLeaf = isLeaf;
	}

	/**
	* @generated
	*/
	public View getView() {
		return myView;
	}

	/**
	* @generated
	*/
	public boolean isLeaf() {
		return myLeaf;
	}

	/**
	* @generated
	*/
	public boolean equals(Object obj) {
		if (obj instanceof PiViMM.diagram.navigator.PiViNavigatorItem) {
			return EcoreUtil.getURI(getView())
					.equals(EcoreUtil.getURI(((PiViMM.diagram.navigator.PiViNavigatorItem) obj).getView()));
		}
		return super.equals(obj);
	}

	/**
	* @generated
	*/
	public int hashCode() {
		return EcoreUtil.getURI(getView()).hashCode();
	}

}
