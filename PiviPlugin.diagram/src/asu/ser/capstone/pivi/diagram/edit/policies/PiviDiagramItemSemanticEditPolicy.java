package asu.ser.capstone.pivi.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import asu.ser.capstone.pivi.diagram.edit.commands.IfEndCreateCommand;
import asu.ser.capstone.pivi.diagram.edit.commands.IfStartCreateCommand;
import asu.ser.capstone.pivi.diagram.edit.commands.InstructionCreateCommand;
import asu.ser.capstone.pivi.diagram.edit.commands.MethodEndCreateCommand;
import asu.ser.capstone.pivi.diagram.edit.commands.MethodStartCreateCommand;
import asu.ser.capstone.pivi.diagram.edit.commands.StartCreateCommand;
import asu.ser.capstone.pivi.diagram.edit.commands.WhileEndCreateCommand;
import asu.ser.capstone.pivi.diagram.edit.commands.WhileStartCreateCommand;
import asu.ser.capstone.pivi.diagram.providers.PiviElementTypes;

/**
 * @generated
 */
public class PiviDiagramItemSemanticEditPolicy extends PiviBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public PiviDiagramItemSemanticEditPolicy() {
		super(PiviElementTypes.PiviDiagram_1000);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (PiviElementTypes.IfStart_2001 == req.getElementType()) {
			return getGEFWrapper(new IfStartCreateCommand(req));
		}
		if (PiviElementTypes.WhileEnd_2002 == req.getElementType()) {
			return getGEFWrapper(new WhileEndCreateCommand(req));
		}
		if (PiviElementTypes.MethodEnd_2003 == req.getElementType()) {
			return getGEFWrapper(new MethodEndCreateCommand(req));
		}
		if (PiviElementTypes.IfEnd_2004 == req.getElementType()) {
			return getGEFWrapper(new IfEndCreateCommand(req));
		}
		if (PiviElementTypes.Instruction_2005 == req.getElementType()) {
			return getGEFWrapper(new InstructionCreateCommand(req));
		}
		if (PiviElementTypes.MethodStart_2006 == req.getElementType()) {
			return getGEFWrapper(new MethodStartCreateCommand(req));
		}
		if (PiviElementTypes.WhileStart_2007 == req.getElementType()) {
			return getGEFWrapper(new WhileStartCreateCommand(req));
		}
		if (PiviElementTypes.Start_2008 == req.getElementType()) {
			return getGEFWrapper(new StartCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	* @generated
	*/
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost()).getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	* @generated
	*/
	private static class DuplicateAnythingCommand extends DuplicateEObjectsCommand {

		/**
		* @generated
		*/
		public DuplicateAnythingCommand(TransactionalEditingDomain editingDomain, DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req.getElementsToBeDuplicated(), req.getAllDuplicatedElementsMap());
		}

	}

}
