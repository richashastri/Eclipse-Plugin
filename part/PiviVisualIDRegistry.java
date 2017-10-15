package asu.ser.capstone.pivi.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import asu.ser.capstone.pivi.PiviDiagram;
import asu.ser.capstone.pivi.PiviPackage;
import asu.ser.capstone.pivi.diagram.edit.parts.IfEndEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.IfEndIfEndFigureCompartmentEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.IfStartEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.IfStartIfStartFigureCompartmentEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.InputPortEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.InstructionEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.InstructionInstructionFigureCompartmentEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.MethodEndEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.MethodEndMethodEndFigureCompartmentEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.MethodStartEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.MethodStartMethodStartFigureCompartmentEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.OutputPortEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.PiviDiagramEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.StartEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.StartPortEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.WhileEndEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.WhileEndWhileEndFigureCompartmentEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.WhileStartEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.WhileStartWhileStartFigureCompartmentEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class PiviVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "PiviPlugin.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (PiviDiagramEditPart.MODEL_ID.equals(view.getType())) {
				return PiviDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	* @generated
	*/
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	* @generated
	*/
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				PiviDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	* @generated
	*/
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (PiviPackage.eINSTANCE.getPiviDiagram().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((PiviDiagram) domainElement)) {
			return PiviDiagramEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getModelID(containerView);
		if (!PiviDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (PiviDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = PiviDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case PiviDiagramEditPart.VISUAL_ID:
			if (PiviPackage.eINSTANCE.getIfStart().isSuperTypeOf(domainElement.eClass())) {
				return IfStartEditPart.VISUAL_ID;
			}
			if (PiviPackage.eINSTANCE.getWhileEnd().isSuperTypeOf(domainElement.eClass())) {
				return WhileEndEditPart.VISUAL_ID;
			}
			if (PiviPackage.eINSTANCE.getMethodEnd().isSuperTypeOf(domainElement.eClass())) {
				return MethodEndEditPart.VISUAL_ID;
			}
			if (PiviPackage.eINSTANCE.getIfEnd().isSuperTypeOf(domainElement.eClass())) {
				return IfEndEditPart.VISUAL_ID;
			}
			if (PiviPackage.eINSTANCE.getInstruction().isSuperTypeOf(domainElement.eClass())) {
				return InstructionEditPart.VISUAL_ID;
			}
			if (PiviPackage.eINSTANCE.getMethodStart().isSuperTypeOf(domainElement.eClass())) {
				return MethodStartEditPart.VISUAL_ID;
			}
			if (PiviPackage.eINSTANCE.getWhileStart().isSuperTypeOf(domainElement.eClass())) {
				return WhileStartEditPart.VISUAL_ID;
			}
			if (PiviPackage.eINSTANCE.getStart().isSuperTypeOf(domainElement.eClass())) {
				return StartEditPart.VISUAL_ID;
			}
			break;
		case IfStartIfStartFigureCompartmentEditPart.VISUAL_ID:
			if (PiviPackage.eINSTANCE.getInputPort().isSuperTypeOf(domainElement.eClass())) {
				return InputPortEditPart.VISUAL_ID;
			}
			if (PiviPackage.eINSTANCE.getStartPort().isSuperTypeOf(domainElement.eClass())) {
				return StartPortEditPart.VISUAL_ID;
			}
			if (PiviPackage.eINSTANCE.getOutputPort().isSuperTypeOf(domainElement.eClass())) {
				return OutputPortEditPart.VISUAL_ID;
			}
			break;
		case WhileEndWhileEndFigureCompartmentEditPart.VISUAL_ID:
			if (PiviPackage.eINSTANCE.getInputPort().isSuperTypeOf(domainElement.eClass())) {
				return InputPortEditPart.VISUAL_ID;
			}
			if (PiviPackage.eINSTANCE.getOutputPort().isSuperTypeOf(domainElement.eClass())) {
				return OutputPortEditPart.VISUAL_ID;
			}
			if (PiviPackage.eINSTANCE.getStartPort().isSuperTypeOf(domainElement.eClass())) {
				return StartPortEditPart.VISUAL_ID;
			}
			break;
		case MethodEndMethodEndFigureCompartmentEditPart.VISUAL_ID:
			if (PiviPackage.eINSTANCE.getInputPort().isSuperTypeOf(domainElement.eClass())) {
				return InputPortEditPart.VISUAL_ID;
			}
			if (PiviPackage.eINSTANCE.getStartPort().isSuperTypeOf(domainElement.eClass())) {
				return StartPortEditPart.VISUAL_ID;
			}
			if (PiviPackage.eINSTANCE.getOutputPort().isSuperTypeOf(domainElement.eClass())) {
				return OutputPortEditPart.VISUAL_ID;
			}
			break;
		case IfEndIfEndFigureCompartmentEditPart.VISUAL_ID:
			if (PiviPackage.eINSTANCE.getInputPort().isSuperTypeOf(domainElement.eClass())) {
				return InputPortEditPart.VISUAL_ID;
			}
			if (PiviPackage.eINSTANCE.getOutputPort().isSuperTypeOf(domainElement.eClass())) {
				return OutputPortEditPart.VISUAL_ID;
			}
			if (PiviPackage.eINSTANCE.getStartPort().isSuperTypeOf(domainElement.eClass())) {
				return StartPortEditPart.VISUAL_ID;
			}
			break;
		case InstructionInstructionFigureCompartmentEditPart.VISUAL_ID:
			if (PiviPackage.eINSTANCE.getInputPort().isSuperTypeOf(domainElement.eClass())) {
				return InputPortEditPart.VISUAL_ID;
			}
			if (PiviPackage.eINSTANCE.getStartPort().isSuperTypeOf(domainElement.eClass())) {
				return StartPortEditPart.VISUAL_ID;
			}
			if (PiviPackage.eINSTANCE.getOutputPort().isSuperTypeOf(domainElement.eClass())) {
				return OutputPortEditPart.VISUAL_ID;
			}
			break;
		case MethodStartMethodStartFigureCompartmentEditPart.VISUAL_ID:
			if (PiviPackage.eINSTANCE.getInputPort().isSuperTypeOf(domainElement.eClass())) {
				return InputPortEditPart.VISUAL_ID;
			}
			if (PiviPackage.eINSTANCE.getOutputPort().isSuperTypeOf(domainElement.eClass())) {
				return OutputPortEditPart.VISUAL_ID;
			}
			if (PiviPackage.eINSTANCE.getStartPort().isSuperTypeOf(domainElement.eClass())) {
				return StartPortEditPart.VISUAL_ID;
			}
			break;
		case WhileStartWhileStartFigureCompartmentEditPart.VISUAL_ID:
			if (PiviPackage.eINSTANCE.getInputPort().isSuperTypeOf(domainElement.eClass())) {
				return InputPortEditPart.VISUAL_ID;
			}
			if (PiviPackage.eINSTANCE.getOutputPort().isSuperTypeOf(domainElement.eClass())) {
				return OutputPortEditPart.VISUAL_ID;
			}
			if (PiviPackage.eINSTANCE.getStartPort().isSuperTypeOf(domainElement.eClass())) {
				return StartPortEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getModelID(containerView);
		if (!PiviDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (PiviDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = PiviDiagramEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case PiviDiagramEditPart.VISUAL_ID:
			if (IfStartEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WhileEndEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MethodEndEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IfEndEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InstructionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MethodStartEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WhileStartEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StartEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IfStartEditPart.VISUAL_ID:
			if (IfStartIfStartFigureCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WhileEndEditPart.VISUAL_ID:
			if (WhileEndWhileEndFigureCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MethodEndEditPart.VISUAL_ID:
			if (MethodEndMethodEndFigureCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IfEndEditPart.VISUAL_ID:
			if (IfEndIfEndFigureCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InstructionEditPart.VISUAL_ID:
			if (InstructionInstructionFigureCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MethodStartEditPart.VISUAL_ID:
			if (MethodStartMethodStartFigureCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WhileStartEditPart.VISUAL_ID:
			if (WhileStartWhileStartFigureCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IfStartIfStartFigureCompartmentEditPart.VISUAL_ID:
			if (InputPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StartPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OutputPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WhileEndWhileEndFigureCompartmentEditPart.VISUAL_ID:
			if (InputPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OutputPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StartPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MethodEndMethodEndFigureCompartmentEditPart.VISUAL_ID:
			if (InputPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StartPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OutputPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IfEndIfEndFigureCompartmentEditPart.VISUAL_ID:
			if (InputPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OutputPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StartPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InstructionInstructionFigureCompartmentEditPart.VISUAL_ID:
			if (InputPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StartPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OutputPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MethodStartMethodStartFigureCompartmentEditPart.VISUAL_ID:
			if (InputPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OutputPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StartPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WhileStartWhileStartFigureCompartmentEditPart.VISUAL_ID:
			if (InputPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OutputPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StartPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(PiviDiagram element) {
		return true;
	}

	/**
	* @generated
	*/
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	* @generated
	*/
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case IfStartIfStartFigureCompartmentEditPart.VISUAL_ID:
		case WhileEndWhileEndFigureCompartmentEditPart.VISUAL_ID:
		case MethodEndMethodEndFigureCompartmentEditPart.VISUAL_ID:
		case IfEndIfEndFigureCompartmentEditPart.VISUAL_ID:
		case InstructionInstructionFigureCompartmentEditPart.VISUAL_ID:
		case MethodStartMethodStartFigureCompartmentEditPart.VISUAL_ID:
		case WhileStartWhileStartFigureCompartmentEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case PiviDiagramEditPart.VISUAL_ID:
			return false;
		case StartEditPart.VISUAL_ID:
		case InputPortEditPart.VISUAL_ID:
		case StartPortEditPart.VISUAL_ID:
		case OutputPortEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/
		@Override

		public int getVisualID(View view) {
			return asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getNodeVisualID(containerView,
					domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.checkNodeVisualID(containerView,
					domainElement, candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
