package PiViM.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class ConnectorItemSemanticEditPolicy extends PiViM.diagram.edit.policies.PiViBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ConnectorItemSemanticEditPolicy() {
		super(PiViM.diagram.providers.PiViElementTypes.Connector_4001);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
