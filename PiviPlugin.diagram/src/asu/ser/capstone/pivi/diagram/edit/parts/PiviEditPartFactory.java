package asu.ser.capstone.pivi.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry;

/**
 * @generated
 */
public class PiviEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (PiviVisualIDRegistry.getVisualID(view)) {

			case PiviDiagramEditPart.VISUAL_ID:
				return new PiviDiagramEditPart(view);

			case IfStartEditPart.VISUAL_ID:
				return new IfStartEditPart(view);

			case WhileEndEditPart.VISUAL_ID:
				return new WhileEndEditPart(view);

			case MethodEndEditPart.VISUAL_ID:
				return new MethodEndEditPart(view);

			case IfEndEditPart.VISUAL_ID:
				return new IfEndEditPart(view);

			case InstructionEditPart.VISUAL_ID:
				return new InstructionEditPart(view);

			case MethodStartEditPart.VISUAL_ID:
				return new MethodStartEditPart(view);

			case WhileStartEditPart.VISUAL_ID:
				return new WhileStartEditPart(view);

			case StartEditPart.VISUAL_ID:
				return new StartEditPart(view);

			case InputPortEditPart.VISUAL_ID:
				return new InputPortEditPart(view);

			case StartPortEditPart.VISUAL_ID:
				return new StartPortEditPart(view);

			case OutputPortEditPart.VISUAL_ID:
				return new OutputPortEditPart(view);

			case IfStartIfStartFigureCompartmentEditPart.VISUAL_ID:
				return new IfStartIfStartFigureCompartmentEditPart(view);

			case WhileEndWhileEndFigureCompartmentEditPart.VISUAL_ID:
				return new WhileEndWhileEndFigureCompartmentEditPart(view);

			case MethodEndMethodEndFigureCompartmentEditPart.VISUAL_ID:
				return new MethodEndMethodEndFigureCompartmentEditPart(view);

			case IfEndIfEndFigureCompartmentEditPart.VISUAL_ID:
				return new IfEndIfEndFigureCompartmentEditPart(view);

			case InstructionInstructionFigureCompartmentEditPart.VISUAL_ID:
				return new InstructionInstructionFigureCompartmentEditPart(view);

			case MethodStartMethodStartFigureCompartmentEditPart.VISUAL_ID:
				return new MethodStartMethodStartFigureCompartmentEditPart(view);

			case WhileStartWhileStartFigureCompartmentEditPart.VISUAL_ID:
				return new WhileStartWhileStartFigureCompartmentEditPart(view);

			case StartStartPortEditPart.VISUAL_ID:
				return new StartStartPortEditPart(view);

			case OutputPortInputPortEditPart.VISUAL_ID:
				return new OutputPortInputPortEditPart(view);

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
