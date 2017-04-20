package CodeBlockMM.diagram.navigator;

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
public class PivicodeNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		CodeBlockMM.diagram.part.PivicodeDiagramEditorPlugin.getInstance().getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		CodeBlockMM.diagram.part.PivicodeDiagramEditorPlugin.getInstance().getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof CodeBlockMM.diagram.navigator.PivicodeNavigatorItem
				&& !isOwnView(((CodeBlockMM.diagram.navigator.PivicodeNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof CodeBlockMM.diagram.navigator.PivicodeNavigatorGroup) {
			CodeBlockMM.diagram.navigator.PivicodeNavigatorGroup group = (CodeBlockMM.diagram.navigator.PivicodeNavigatorGroup) element;
			return CodeBlockMM.diagram.part.PivicodeDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof CodeBlockMM.diagram.navigator.PivicodeNavigatorItem) {
			CodeBlockMM.diagram.navigator.PivicodeNavigatorItem navigatorItem = (CodeBlockMM.diagram.navigator.PivicodeNavigatorItem) element;
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
		switch (CodeBlockMM.diagram.part.PivicodeVisualIDRegistry.getVisualID(view)) {
		case CodeBlockMM.diagram.edit.parts.IconEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?http://codeblock/1.0?Icon", //$NON-NLS-1$
					CodeBlockMM.diagram.providers.PivicodeElementTypes.Icon_1000);
		case CodeBlockMM.diagram.edit.parts.CodeblockEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://codeblock/1.0?Codeblock", //$NON-NLS-1$
					CodeBlockMM.diagram.providers.PivicodeElementTypes.Codeblock_2001);
		case CodeBlockMM.diagram.edit.parts.ConnectionEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://codeblock/1.0?Connection", //$NON-NLS-1$
					CodeBlockMM.diagram.providers.PivicodeElementTypes.Connection_4001);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = CodeBlockMM.diagram.part.PivicodeDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& CodeBlockMM.diagram.providers.PivicodeElementTypes.isKnownElementType(elementType)) {
			image = CodeBlockMM.diagram.providers.PivicodeElementTypes.getImage(elementType);
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
		if (element instanceof CodeBlockMM.diagram.navigator.PivicodeNavigatorGroup) {
			CodeBlockMM.diagram.navigator.PivicodeNavigatorGroup group = (CodeBlockMM.diagram.navigator.PivicodeNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof CodeBlockMM.diagram.navigator.PivicodeNavigatorItem) {
			CodeBlockMM.diagram.navigator.PivicodeNavigatorItem navigatorItem = (CodeBlockMM.diagram.navigator.PivicodeNavigatorItem) element;
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
		switch (CodeBlockMM.diagram.part.PivicodeVisualIDRegistry.getVisualID(view)) {
		case CodeBlockMM.diagram.edit.parts.IconEditPart.VISUAL_ID:
			return getIcon_1000Text(view);
		case CodeBlockMM.diagram.edit.parts.CodeblockEditPart.VISUAL_ID:
			return getCodeblock_2001Text(view);
		case CodeBlockMM.diagram.edit.parts.ConnectionEditPart.VISUAL_ID:
			return getConnection_4001Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getIcon_1000Text(View view) {
		CodeBlockMM.Icon domainModelElement = (CodeBlockMM.Icon) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			CodeBlockMM.diagram.part.PivicodeDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCodeblock_2001Text(View view) {
		IParser parser = CodeBlockMM.diagram.providers.PivicodeParserProvider.getParser(
				CodeBlockMM.diagram.providers.PivicodeElementTypes.Codeblock_2001,
				view.getElement() != null ? view.getElement() : view, CodeBlockMM.diagram.part.PivicodeVisualIDRegistry
						.getType(CodeBlockMM.diagram.edit.parts.CodeblockNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CodeBlockMM.diagram.part.PivicodeDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getConnection_4001Text(View view) {
		CodeBlockMM.Connection domainModelElement = (CodeBlockMM.Connection) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			CodeBlockMM.diagram.part.PivicodeDiagramEditorPlugin.getInstance()
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
		return CodeBlockMM.diagram.edit.parts.IconEditPart.MODEL_ID
				.equals(CodeBlockMM.diagram.part.PivicodeVisualIDRegistry.getModelID(view));
	}

}
