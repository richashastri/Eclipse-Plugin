package PiViMM.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class PiViEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (PiViMM.diagram.part.PiViVisualIDRegistry.getVisualID(view)) {

			case PiViMM.diagram.edit.parts.IconsEditPart.VISUAL_ID:
				return new PiViMM.diagram.edit.parts.IconsEditPart(view);

			case PiViMM.diagram.edit.parts.CodeBlockEditPart.VISUAL_ID:
				return new PiViMM.diagram.edit.parts.CodeBlockEditPart(view);

			case PiViMM.diagram.edit.parts.CodeBlockNameEditPart.VISUAL_ID:
				return new PiViMM.diagram.edit.parts.CodeBlockNameEditPart(view);

			case PiViMM.diagram.edit.parts.ConnectorEditPart.VISUAL_ID:
				return new PiViMM.diagram.edit.parts.ConnectorEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	* @generated
	*/
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	* @generated
	*/
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
