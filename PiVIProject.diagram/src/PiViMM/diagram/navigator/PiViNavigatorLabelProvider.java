package PiViMM.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class PiViNavigatorLabelProvider extends LabelProvider implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		PiViMM.diagram.part.PiViDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		PiViMM.diagram.part.PiViDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof PiViMM.diagram.navigator.PiViNavigatorItem
				&& !isOwnView(((PiViMM.diagram.navigator.PiViNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof PiViMM.diagram.navigator.PiViNavigatorGroup) {
			PiViMM.diagram.navigator.PiViNavigatorGroup group = (PiViMM.diagram.navigator.PiViNavigatorGroup) element;
			return PiViMM.diagram.part.PiViDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof PiViMM.diagram.navigator.PiViNavigatorItem) {
			PiViMM.diagram.navigator.PiViNavigatorItem navigatorItem = (PiViMM.diagram.navigator.PiViNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	* @generated
	*/
	public Image getImage(View view) {
		switch (PiViMM.diagram.part.PiViVisualIDRegistry.getVisualID(view)) {
		case PiViMM.diagram.edit.parts.IconsEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?http://pivi/1.1?Icons", //$NON-NLS-1$
					PiViMM.diagram.providers.PiViElementTypes.Icons_1000);
		case PiViMM.diagram.edit.parts.CodeBlockEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://pivi/1.1?CodeBlock", //$NON-NLS-1$
					PiViMM.diagram.providers.PiViElementTypes.CodeBlock_2001);
		case PiViMM.diagram.edit.parts.ConnectorEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://pivi/1.1?Connector", //$NON-NLS-1$
					PiViMM.diagram.providers.PiViElementTypes.Connector_4001);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = PiViMM.diagram.part.PiViDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& PiViMM.diagram.providers.PiViElementTypes.isKnownElementType(elementType)) {
			image = PiViMM.diagram.providers.PiViElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	* @generated
	*/
	public String getText(Object element) {
		if (element instanceof PiViMM.diagram.navigator.PiViNavigatorGroup) {
			PiViMM.diagram.navigator.PiViNavigatorGroup group = (PiViMM.diagram.navigator.PiViNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof PiViMM.diagram.navigator.PiViNavigatorItem) {
			PiViMM.diagram.navigator.PiViNavigatorItem navigatorItem = (PiViMM.diagram.navigator.PiViNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	* @generated
	*/
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (PiViMM.diagram.part.PiViVisualIDRegistry.getVisualID(view)) {
		case PiViMM.diagram.edit.parts.IconsEditPart.VISUAL_ID:
			return getIcons_1000Text(view);
		case PiViMM.diagram.edit.parts.CodeBlockEditPart.VISUAL_ID:
			return getCodeBlock_2001Text(view);
		case PiViMM.diagram.edit.parts.ConnectorEditPart.VISUAL_ID:
			return getConnector_4001Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getIcons_1000Text(View view) {
		PiViMM.Icons domainModelElement = (PiViMM.Icons) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			PiViMM.diagram.part.PiViDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCodeBlock_2001Text(View view) {
		IParser parser = PiViMM.diagram.providers.PiViParserProvider.getParser(
				PiViMM.diagram.providers.PiViElementTypes.CodeBlock_2001,
				view.getElement() != null ? view.getElement() : view, PiViMM.diagram.part.PiViVisualIDRegistry
						.getType(PiViMM.diagram.edit.parts.CodeBlockNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			PiViMM.diagram.part.PiViDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getConnector_4001Text(View view) {
		PiViMM.Connector domainModelElement = (PiViMM.Connector) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			PiViMM.diagram.part.PiViDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 4001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	* @generated
	*/
	private boolean isOwnView(View view) {
		return PiViMM.diagram.edit.parts.IconsEditPart.MODEL_ID
				.equals(PiViMM.diagram.part.PiViVisualIDRegistry.getModelID(view));
	}

}
