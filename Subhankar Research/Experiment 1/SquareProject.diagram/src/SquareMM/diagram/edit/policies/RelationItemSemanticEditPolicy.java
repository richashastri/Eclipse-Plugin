package SquareMM.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class RelationItemSemanticEditPolicy extends SquareMM.diagram.edit.policies.SquareBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public RelationItemSemanticEditPolicy() {
		super(SquareMM.diagram.providers.SquareElementTypes.Relation_4001);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
