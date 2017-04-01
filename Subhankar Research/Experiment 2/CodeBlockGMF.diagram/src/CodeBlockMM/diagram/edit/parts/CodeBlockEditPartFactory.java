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
public class CodeBlockEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (CodeBlockMM.diagram.part.CodeBlockVisualIDRegistry.getVisualID(view)) {

			case CodeBlockMM.diagram.edit.parts.ArchitectureEditPart.VISUAL_ID:
				return new CodeBlockMM.diagram.edit.parts.ArchitectureEditPart(view);

			case CodeBlockMM.diagram.edit.parts.CodeBlockEditPart.VISUAL_ID:
				return new CodeBlockMM.diagram.edit.parts.CodeBlockEditPart(view);

			case CodeBlockMM.diagram.edit.parts.CodeBlockNameEditPart.VISUAL_ID:
				return new CodeBlockMM.diagram.edit.parts.CodeBlockNameEditPart(view);

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
