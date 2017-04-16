package PiViM.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class ConnectorReorientCommand extends EditElementCommand {

	/**
	* @generated
	*/
	private final int reorientDirection;

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
	public ConnectorReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof PiViM.Connector) {
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
		if (!(oldEnd instanceof PiViM.CodeBlock && newEnd instanceof PiViM.CodeBlock)) {
			return false;
		}
		PiViM.CodeBlock target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof PiViM.Icons)) {
			return false;
		}
		PiViM.Icons container = (PiViM.Icons) getLink().eContainer();
		return PiViM.diagram.edit.policies.PiViBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistConnector_4001(container, getLink(), getNewSource(), target);
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof PiViM.CodeBlock && newEnd instanceof PiViM.CodeBlock)) {
			return false;
		}
		PiViM.CodeBlock source = getLink().getSource();
		if (!(getLink().eContainer() instanceof PiViM.Icons)) {
			return false;
		}
		PiViM.Icons container = (PiViM.Icons) getLink().eContainer();
		return PiViM.diagram.edit.policies.PiViBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistConnector_4001(container, getLink(), source, getNewTarget());
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
		getLink().setSource(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTarget(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected PiViM.Connector getLink() {
		return (PiViM.Connector) getElementToEdit();
	}

	/**
	* @generated
	*/
	protected PiViM.CodeBlock getOldSource() {
		return (PiViM.CodeBlock) oldEnd;
	}

	/**
	* @generated
	*/
	protected PiViM.CodeBlock getNewSource() {
		return (PiViM.CodeBlock) newEnd;
	}

	/**
	* @generated
	*/
	protected PiViM.CodeBlock getOldTarget() {
		return (PiViM.CodeBlock) oldEnd;
	}

	/**
	* @generated
	*/
	protected PiViM.CodeBlock getNewTarget() {
		return (PiViM.CodeBlock) newEnd;
	}
}
