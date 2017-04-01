package CodeBlockMM.diagram.edit.commands;

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
public class ConnectionReorientCommand extends EditElementCommand {

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
	public ConnectionReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof CodeBlockMM.Connection) {
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
		if (!(oldEnd instanceof CodeBlockMM.CodeBlock && newEnd instanceof CodeBlockMM.CodeBlock)) {
			return false;
		}
		CodeBlockMM.CodeBlock target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof CodeBlockMM.Architecture)) {
			return false;
		}
		CodeBlockMM.Architecture container = (CodeBlockMM.Architecture) getLink().eContainer();
		return CodeBlockMM.diagram.edit.policies.CodeBlockBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistConnection_4001(container, getLink(), getNewSource(), target);
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof CodeBlockMM.CodeBlock && newEnd instanceof CodeBlockMM.CodeBlock)) {
			return false;
		}
		CodeBlockMM.CodeBlock source = getLink().getSource();
		if (!(getLink().eContainer() instanceof CodeBlockMM.Architecture)) {
			return false;
		}
		CodeBlockMM.Architecture container = (CodeBlockMM.Architecture) getLink().eContainer();
		return CodeBlockMM.diagram.edit.policies.CodeBlockBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistConnection_4001(container, getLink(), source, getNewTarget());
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
	protected CodeBlockMM.Connection getLink() {
		return (CodeBlockMM.Connection) getElementToEdit();
	}

	/**
	* @generated
	*/
	protected CodeBlockMM.CodeBlock getOldSource() {
		return (CodeBlockMM.CodeBlock) oldEnd;
	}

	/**
	* @generated
	*/
	protected CodeBlockMM.CodeBlock getNewSource() {
		return (CodeBlockMM.CodeBlock) newEnd;
	}

	/**
	* @generated
	*/
	protected CodeBlockMM.CodeBlock getOldTarget() {
		return (CodeBlockMM.CodeBlock) oldEnd;
	}

	/**
	* @generated
	*/
	protected CodeBlockMM.CodeBlock getNewTarget() {
		return (CodeBlockMM.CodeBlock) newEnd;
	}
}
