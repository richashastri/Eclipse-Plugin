package CodeBlockMM.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class CodeBlockModelingAssistantProviderOfArchitectureEditPart
		extends CodeBlockMM.diagram.providers.CodeBlockModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(CodeBlockMM.diagram.providers.CodeBlockElementTypes.CodeBlock_2001);
		return types;
	}

}
