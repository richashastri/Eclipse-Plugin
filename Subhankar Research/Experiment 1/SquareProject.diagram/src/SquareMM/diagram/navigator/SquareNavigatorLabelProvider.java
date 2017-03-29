package SquareMM.diagram.navigator;

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
public class SquareNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		SquareMM.diagram.part.SquareDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		SquareMM.diagram.part.SquareDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof SquareMM.diagram.navigator.SquareNavigatorItem
				&& !isOwnView(((SquareMM.diagram.navigator.SquareNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof SquareMM.diagram.navigator.SquareNavigatorGroup) {
			SquareMM.diagram.navigator.SquareNavigatorGroup group = (SquareMM.diagram.navigator.SquareNavigatorGroup) element;
			return SquareMM.diagram.part.SquareDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof SquareMM.diagram.navigator.SquareNavigatorItem) {
			SquareMM.diagram.navigator.SquareNavigatorItem navigatorItem = (SquareMM.diagram.navigator.SquareNavigatorItem) element;
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
		switch (SquareMM.diagram.part.SquareVisualIDRegistry.getVisualID(view)) {
		case SquareMM.diagram.edit.parts.ArchitectureEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?http://square/1.0?Architecture", //$NON-NLS-1$
					SquareMM.diagram.providers.SquareElementTypes.Architecture_1000);
		case SquareMM.diagram.edit.parts.SquareEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://square/1.0?Square", //$NON-NLS-1$
					SquareMM.diagram.providers.SquareElementTypes.Square_2001);
		case SquareMM.diagram.edit.parts.RelationEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://square/1.0?Relation", //$NON-NLS-1$
					SquareMM.diagram.providers.SquareElementTypes.Relation_4001);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = SquareMM.diagram.part.SquareDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& SquareMM.diagram.providers.SquareElementTypes.isKnownElementType(elementType)) {
			image = SquareMM.diagram.providers.SquareElementTypes.getImage(elementType);
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
		if (element instanceof SquareMM.diagram.navigator.SquareNavigatorGroup) {
			SquareMM.diagram.navigator.SquareNavigatorGroup group = (SquareMM.diagram.navigator.SquareNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof SquareMM.diagram.navigator.SquareNavigatorItem) {
			SquareMM.diagram.navigator.SquareNavigatorItem navigatorItem = (SquareMM.diagram.navigator.SquareNavigatorItem) element;
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
		switch (SquareMM.diagram.part.SquareVisualIDRegistry.getVisualID(view)) {
		case SquareMM.diagram.edit.parts.ArchitectureEditPart.VISUAL_ID:
			return getArchitecture_1000Text(view);
		case SquareMM.diagram.edit.parts.SquareEditPart.VISUAL_ID:
			return getSquare_2001Text(view);
		case SquareMM.diagram.edit.parts.RelationEditPart.VISUAL_ID:
			return getRelation_4001Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getArchitecture_1000Text(View view) {
		SquareMM.Architecture domainModelElement = (SquareMM.Architecture) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			SquareMM.diagram.part.SquareDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSquare_2001Text(View view) {
		IParser parser = SquareMM.diagram.providers.SquareParserProvider.getParser(
				SquareMM.diagram.providers.SquareElementTypes.Square_2001,
				view.getElement() != null ? view.getElement() : view, SquareMM.diagram.part.SquareVisualIDRegistry
						.getType(SquareMM.diagram.edit.parts.SquareNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SquareMM.diagram.part.SquareDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getRelation_4001Text(View view) {
		SquareMM.Relation domainModelElement = (SquareMM.Relation) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			SquareMM.diagram.part.SquareDiagramEditorPlugin.getInstance()
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
		return SquareMM.diagram.edit.parts.ArchitectureEditPart.MODEL_ID
				.equals(SquareMM.diagram.part.SquareVisualIDRegistry.getModelID(view));
	}

}
