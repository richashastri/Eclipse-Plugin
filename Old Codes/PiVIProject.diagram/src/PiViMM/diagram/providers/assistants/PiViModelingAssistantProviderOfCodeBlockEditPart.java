package PiViMM.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class PiViModelingAssistantProviderOfCodeBlockEditPart
		extends PiViMM.diagram.providers.PiViModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((PiViMM.diagram.edit.parts.CodeBlockEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(PiViMM.diagram.edit.parts.CodeBlockEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(PiViMM.diagram.providers.PiViElementTypes.Connector_4001);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((PiViMM.diagram.edit.parts.CodeBlockEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(PiViMM.diagram.edit.parts.CodeBlockEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof PiViMM.diagram.edit.parts.CodeBlockEditPart) {
			types.add(PiViMM.diagram.providers.PiViElementTypes.Connector_4001);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((PiViMM.diagram.edit.parts.CodeBlockEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(PiViMM.diagram.edit.parts.CodeBlockEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == PiViMM.diagram.providers.PiViElementTypes.Connector_4001) {
			types.add(PiViMM.diagram.providers.PiViElementTypes.CodeBlock_2001);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((PiViMM.diagram.edit.parts.CodeBlockEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(PiViMM.diagram.edit.parts.CodeBlockEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(PiViMM.diagram.providers.PiViElementTypes.Connector_4001);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((PiViMM.diagram.edit.parts.CodeBlockEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(PiViMM.diagram.edit.parts.CodeBlockEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == PiViMM.diagram.providers.PiViElementTypes.Connector_4001) {
			types.add(PiViMM.diagram.providers.PiViElementTypes.CodeBlock_2001);
		}
		return types;
	}

}
