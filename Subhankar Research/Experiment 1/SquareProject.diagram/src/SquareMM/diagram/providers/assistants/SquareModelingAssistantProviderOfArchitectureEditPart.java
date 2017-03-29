package SquareMM.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class SquareModelingAssistantProviderOfArchitectureEditPart
		extends SquareMM.diagram.providers.SquareModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(SquareMM.diagram.providers.SquareElementTypes.Square_2001);
		return types;
	}

}
