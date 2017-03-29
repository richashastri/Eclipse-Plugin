package SquareMM.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class SquareEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (SquareMM.diagram.part.SquareVisualIDRegistry.getVisualID(view)) {

			case SquareMM.diagram.edit.parts.ArchitectureEditPart.VISUAL_ID:
				return new SquareMM.diagram.edit.parts.ArchitectureEditPart(view);

			case SquareMM.diagram.edit.parts.SquareEditPart.VISUAL_ID:
				return new SquareMM.diagram.edit.parts.SquareEditPart(view);

			case SquareMM.diagram.edit.parts.SquareNameEditPart.VISUAL_ID:
				return new SquareMM.diagram.edit.parts.SquareNameEditPart(view);

			case SquareMM.diagram.edit.parts.RelationEditPart.VISUAL_ID:
				return new SquareMM.diagram.edit.parts.RelationEditPart(view);

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
