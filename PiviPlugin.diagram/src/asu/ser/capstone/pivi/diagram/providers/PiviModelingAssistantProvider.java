package asu.ser.capstone.pivi.diagram.providers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.modelingassistant.ModelingAssistantProvider;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

import asu.ser.capstone.pivi.diagram.edit.parts.IfEndEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.IfStartEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.InputPortEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.InstructionEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.MethodEndEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.MethodStartEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.OutputPortEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.PiviDiagramEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.StartEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.StartPortEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.ThreadEndEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.ThreadStartEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.WhileEndEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.WhileStartEditPart;
import asu.ser.capstone.pivi.diagram.part.Messages;
import asu.ser.capstone.pivi.diagram.part.PiviDiagramEditorPlugin;

/**
 * @generated
 */
public class PiviModelingAssistantProvider extends ModelingAssistantProvider {

	/**
	 * @generated
	 */
	public List getTypesForPopupBar(IAdaptable host) {
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart instanceof PiviDiagramEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(10);
			types.add(PiviElementTypes.IfStart_2001);
			types.add(PiviElementTypes.WhileEnd_2002);
			types.add(PiviElementTypes.MethodEnd_2003);
			types.add(PiviElementTypes.IfEnd_2004);
			types.add(PiviElementTypes.Instruction_2005);
			types.add(PiviElementTypes.MethodStart_2006);
			types.add(PiviElementTypes.WhileStart_2007);
			types.add(PiviElementTypes.Start_2008);
			types.add(PiviElementTypes.ThreadEnd_2009);
			types.add(PiviElementTypes.ThreadStart_2010);
			return types;
		}
		if (editPart instanceof IfStartEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(3);
			types.add(PiviElementTypes.InputPort_3001);
			types.add(PiviElementTypes.StartPort_3002);
			types.add(PiviElementTypes.OutputPort_3003);
			return types;
		}
		if (editPart instanceof WhileEndEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(3);
			types.add(PiviElementTypes.InputPort_3001);
			types.add(PiviElementTypes.OutputPort_3003);
			types.add(PiviElementTypes.StartPort_3002);
			return types;
		}
		if (editPart instanceof MethodEndEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(3);
			types.add(PiviElementTypes.InputPort_3001);
			types.add(PiviElementTypes.StartPort_3002);
			types.add(PiviElementTypes.OutputPort_3003);
			return types;
		}
		if (editPart instanceof IfEndEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(3);
			types.add(PiviElementTypes.InputPort_3001);
			types.add(PiviElementTypes.OutputPort_3003);
			types.add(PiviElementTypes.StartPort_3002);
			return types;
		}
		if (editPart instanceof InstructionEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(3);
			types.add(PiviElementTypes.InputPort_3001);
			types.add(PiviElementTypes.StartPort_3002);
			types.add(PiviElementTypes.OutputPort_3003);
			return types;
		}
		if (editPart instanceof MethodStartEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(3);
			types.add(PiviElementTypes.InputPort_3001);
			types.add(PiviElementTypes.OutputPort_3003);
			types.add(PiviElementTypes.StartPort_3002);
			return types;
		}
		if (editPart instanceof WhileStartEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(3);
			types.add(PiviElementTypes.InputPort_3001);
			types.add(PiviElementTypes.OutputPort_3003);
			types.add(PiviElementTypes.StartPort_3002);
			return types;
		}
		if (editPart instanceof ThreadEndEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(3);
			types.add(PiviElementTypes.InputPort_3001);
			types.add(PiviElementTypes.OutputPort_3003);
			types.add(PiviElementTypes.StartPort_3002);
			return types;
		}
		if (editPart instanceof ThreadStartEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(3);
			types.add(PiviElementTypes.InputPort_3001);
			types.add(PiviElementTypes.OutputPort_3003);
			types.add(PiviElementTypes.StartPort_3002);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof StartEditPart) {
			return ((StartEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof OutputPortEditPart) {
			return ((OutputPortEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof InputPortEditPart) {
			return ((InputPortEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof StartPortEditPart) {
			return ((StartPortEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof StartEditPart) {
			return ((StartEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof OutputPortEditPart) {
			return ((OutputPortEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof InputPortEditPart) {
			return ((InputPortEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof StartPortEditPart) {
			return ((StartPortEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof StartEditPart) {
			return ((StartEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof OutputPortEditPart) {
			return ((OutputPortEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForSource(IAdaptable target,
			IElementType relationshipType) {
		return selectExistingElement(target,
				getTypesForSource(target, relationshipType));
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForTarget(IAdaptable source,
			IElementType relationshipType) {
		return selectExistingElement(source,
				getTypesForTarget(source, relationshipType));
	}

	/**
	 * @generated
	 */
	protected EObject selectExistingElement(IAdaptable host, Collection types) {
		if (types.isEmpty()) {
			return null;
		}
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart == null) {
			return null;
		}
		Diagram diagram = (Diagram) editPart.getRoot().getContents().getModel();
		HashSet<EObject> elements = new HashSet<EObject>();
		for (Iterator<EObject> it = diagram.getElement().eAllContents(); it
				.hasNext();) {
			EObject element = it.next();
			if (isApplicableElement(element, types)) {
				elements.add(element);
			}
		}
		if (elements.isEmpty()) {
			return null;
		}
		return selectElement((EObject[]) elements.toArray(new EObject[elements
				.size()]));
	}

	/**
	 * @generated
	 */
	protected boolean isApplicableElement(EObject element, Collection types) {
		IElementType type = ElementTypeRegistry.getInstance().getElementType(
				element);
		return types.contains(type);
	}

	/**
	 * @generated
	 */
	protected EObject selectElement(EObject[] elements) {
		Shell shell = Display.getCurrent().getActiveShell();
		ILabelProvider labelProvider = new AdapterFactoryLabelProvider(
				PiviDiagramEditorPlugin.getInstance()
						.getItemProvidersAdapterFactory());
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(
				shell, labelProvider);
		dialog.setMessage(Messages.PiviModelingAssistantProviderMessage);
		dialog.setTitle(Messages.PiviModelingAssistantProviderTitle);
		dialog.setMultipleSelection(false);
		dialog.setElements(elements);
		EObject selected = null;
		if (dialog.open() == Window.OK) {
			selected = (EObject) dialog.getFirstResult();
		}
		return selected;
	}
}
