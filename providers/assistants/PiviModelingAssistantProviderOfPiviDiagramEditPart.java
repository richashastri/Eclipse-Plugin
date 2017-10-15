package asu.ser.capstone.pivi.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import asu.ser.capstone.pivi.diagram.providers.PiviElementTypes;
import asu.ser.capstone.pivi.diagram.providers.PiviModelingAssistantProvider;

/**
 * @generated
 */
public class PiviModelingAssistantProviderOfPiviDiagramEditPart extends PiviModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(8);
		types.add(PiviElementTypes.IfStart_2001);
		types.add(PiviElementTypes.WhileEnd_2002);
		types.add(PiviElementTypes.MethodEnd_2003);
		types.add(PiviElementTypes.IfEnd_2004);
		types.add(PiviElementTypes.Instruction_2005);
		types.add(PiviElementTypes.MethodStart_2006);
		types.add(PiviElementTypes.WhileStart_2007);
		types.add(PiviElementTypes.Start_2008);
		return types;
	}

}
