package asu.ser.capstone.pivi.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import asu.ser.capstone.pivi.InputPort;
import asu.ser.capstone.pivi.OutputPort;
import asu.ser.capstone.pivi.diagram.edit.policies.PiviBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class OutputPortInputPortReorientCommand extends EditElementCommand {

	/**
	* @generated
	*/
	private final int reorientDirection;

	/**
	* @generated
	*/
	private final EObject referenceOwner;

	/**
	* @generated
	*/
	private final EObject oldEnd;

	/**
	* @generated
	*/
	private final EObject newEnd;

	/**
	* @generated
	*/
	public OutputPortInputPortReorientCommand(ReorientReferenceRelationshipRequest request) {
		super(request.getLabel(), null, request);
		reorientDirection = request.getDirection();
		referenceOwner = request.getReferenceOwner();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (false == referenceOwner instanceof OutputPort) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof InputPort && newEnd instanceof OutputPort)) {
			return false;
		}
		return PiviBaseItemSemanticEditPolicy.getLinkConstraints().canExistOutputPortInputPort_4002(getNewSource(),
				getOldTarget());
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof InputPort && newEnd instanceof InputPort)) {
			return false;
		}
		return PiviBaseItemSemanticEditPolicy.getLinkConstraints().canExistOutputPortInputPort_4002(getOldSource(),
				getNewTarget());
	}

	/**
	* @generated
	*/
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException("Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	* @generated
	*/
	protected CommandResult reorientSource() throws ExecutionException {
		getOldSource().setInputPort(null);
		getNewSource().setInputPort(getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().setInputPort(getNewTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	* @generated
	*/
	protected OutputPort getOldSource() {
		return (OutputPort) referenceOwner;
	}

	/**
	* @generated
	*/
	protected OutputPort getNewSource() {
		return (OutputPort) newEnd;
	}

	/**
	* @generated
	*/
	protected InputPort getOldTarget() {
		return (InputPort) oldEnd;
	}

	/**
	* @generated
	*/
	protected InputPort getNewTarget() {
		return (InputPort) newEnd;
	}
}
