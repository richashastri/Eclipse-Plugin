package CodeBlockMM.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class CodeBlockModelingAssistantProviderOfCodeBlockEditPart
		extends CodeBlockMM.diagram.providers.CodeBlockModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((CodeBlockMM.diagram.edit.parts.CodeBlockEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(CodeBlockMM.diagram.edit.parts.CodeBlockEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(CodeBlockMM.diagram.providers.CodeBlockElementTypes.Connection_4001);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((CodeBlockMM.diagram.edit.parts.CodeBlockEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(CodeBlockMM.diagram.edit.parts.CodeBlockEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof CodeBlockMM.diagram.edit.parts.CodeBlockEditPart) {
			types.add(CodeBlockMM.diagram.providers.CodeBlockElementTypes.Connection_4001);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((CodeBlockMM.diagram.edit.parts.CodeBlockEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(CodeBlockMM.diagram.edit.parts.CodeBlockEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == CodeBlockMM.diagram.providers.CodeBlockElementTypes.Connection_4001) {
			types.add(CodeBlockMM.diagram.providers.CodeBlockElementTypes.CodeBlock_2001);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((CodeBlockMM.diagram.edit.parts.CodeBlockEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(CodeBlockMM.diagram.edit.parts.CodeBlockEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(CodeBlockMM.diagram.providers.CodeBlockElementTypes.Connection_4001);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((CodeBlockMM.diagram.edit.parts.CodeBlockEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(CodeBlockMM.diagram.edit.parts.CodeBlockEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == CodeBlockMM.diagram.providers.CodeBlockElementTypes.Connection_4001) {
			types.add(CodeBlockMM.diagram.providers.CodeBlockElementTypes.CodeBlock_2001);
		}
		return types;
	}

}
