package CodeBlockMM.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class PivicodeEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (CodeBlockMM.diagram.part.PivicodeVisualIDRegistry.getVisualID(view)) {

			case CodeBlockMM.diagram.edit.parts.IconEditPart.VISUAL_ID:
				return new CodeBlockMM.diagram.edit.parts.IconEditPart(view);

			case CodeBlockMM.diagram.edit.parts.CodeblockEditPart.VISUAL_ID:
				return new CodeBlockMM.diagram.edit.parts.CodeblockEditPart(view);

			case CodeBlockMM.diagram.edit.parts.CodeblockNameEditPart.VISUAL_ID:
				return new CodeBlockMM.diagram.edit.parts.CodeblockNameEditPart(view);

			case CodeBlockMM.diagram.edit.parts.ConnectionEditPart.VISUAL_ID:
				return new CodeBlockMM.diagram.edit.parts.ConnectionEditPart(view);

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
