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
public class CodeBlockNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		CodeBlockMM.diagram.part.CodeBlockDiagramEditorPlugin.getInstance().getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		CodeBlockMM.diagram.part.CodeBlockDiagramEditorPlugin.getInstance().getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof CodeBlockMM.diagram.navigator.CodeBlockNavigatorItem
				&& !isOwnView(((CodeBlockMM.diagram.navigator.CodeBlockNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof CodeBlockMM.diagram.navigator.CodeBlockNavigatorGroup) {
			CodeBlockMM.diagram.navigator.CodeBlockNavigatorGroup group = (CodeBlockMM.diagram.navigator.CodeBlockNavigatorGroup) element;
			return CodeBlockMM.diagram.part.CodeBlockDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof CodeBlockMM.diagram.navigator.CodeBlockNavigatorItem) {
			CodeBlockMM.diagram.navigator.CodeBlockNavigatorItem navigatorItem = (CodeBlockMM.diagram.navigator.CodeBlockNavigatorItem) element;
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
		switch (CodeBlockMM.diagram.part.CodeBlockVisualIDRegistry.getVisualID(view)) {
		case CodeBlockMM.diagram.edit.parts.ArchitectureEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?http://codeblock/1.0?Architecture", //$NON-NLS-1$
					CodeBlockMM.diagram.providers.CodeBlockElementTypes.Architecture_1000);
		case CodeBlockMM.diagram.edit.parts.CodeBlockEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://codeblock/1.0?CodeBlock", //$NON-NLS-1$
					CodeBlockMM.diagram.providers.CodeBlockElementTypes.CodeBlock_2001);
		case CodeBlockMM.diagram.edit.parts.ConnectionEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://codeblock/1.0?Connection", //$NON-NLS-1$
					CodeBlockMM.diagram.providers.CodeBlockElementTypes.Connection_4001);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = CodeBlockMM.diagram.part.CodeBlockDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& CodeBlockMM.diagram.providers.CodeBlockElementTypes.isKnownElementType(elementType)) {
			image = CodeBlockMM.diagram.providers.CodeBlockElementTypes.getImage(elementType);
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
		if (element instanceof CodeBlockMM.diagram.navigator.CodeBlockNavigatorGroup) {
			CodeBlockMM.diagram.navigator.CodeBlockNavigatorGroup group = (CodeBlockMM.diagram.navigator.CodeBlockNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof CodeBlockMM.diagram.navigator.CodeBlockNavigatorItem) {
			CodeBlockMM.diagram.navigator.CodeBlockNavigatorItem navigatorItem = (CodeBlockMM.diagram.navigator.CodeBlockNavigatorItem) element;
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
		switch (CodeBlockMM.diagram.part.CodeBlockVisualIDRegistry.getVisualID(view)) {
		case CodeBlockMM.diagram.edit.parts.ArchitectureEditPart.VISUAL_ID:
			return getArchitecture_1000Text(view);
		case CodeBlockMM.diagram.edit.parts.CodeBlockEditPart.VISUAL_ID:
			return getCodeBlock_2001Text(view);
		case CodeBlockMM.diagram.edit.parts.ConnectionEditPart.VISUAL_ID:
			return getConnection_4001Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getArchitecture_1000Text(View view) {
		CodeBlockMM.Architecture domainModelElement = (CodeBlockMM.Architecture) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			CodeBlockMM.diagram.part.CodeBlockDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCodeBlock_2001Text(View view) {
		IParser parser = CodeBlockMM.diagram.providers.CodeBlockParserProvider.getParser(
				CodeBlockMM.diagram.providers.CodeBlockElementTypes.CodeBlock_2001,
				view.getElement() != null ? view.getElement() : view, CodeBlockMM.diagram.part.CodeBlockVisualIDRegistry
						.getType(CodeBlockMM.diagram.edit.parts.CodeBlockNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			CodeBlockMM.diagram.part.CodeBlockDiagramEditorPlugin.getInstance()
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
			CodeBlockMM.diagram.part.CodeBlockDiagramEditorPlugin.getInstance()
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
		return CodeBlockMM.diagram.edit.parts.ArchitectureEditPart.MODEL_ID
				.equals(CodeBlockMM.diagram.part.CodeBlockVisualIDRegistry.getModelID(view));
	}

}
