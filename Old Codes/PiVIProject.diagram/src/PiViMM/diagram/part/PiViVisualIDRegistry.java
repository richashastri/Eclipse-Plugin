package PiViMM.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class PiViVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "PiVIProject.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (PiViMM.diagram.edit.parts.IconsEditPart.MODEL_ID.equals(view.getType())) {
				return PiViMM.diagram.edit.parts.IconsEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return PiViMM.diagram.part.PiViVisualIDRegistry.getVisualID(view.getType());
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
				PiViMM.diagram.part.PiViDiagramEditorPlugin.getInstance()
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
		if (PiViMM.PiViMMPackage.eINSTANCE.getIcons().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((PiViMM.Icons) domainElement)) {
			return PiViMM.diagram.edit.parts.IconsEditPart.VISUAL_ID;
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
		String containerModelID = PiViMM.diagram.part.PiViVisualIDRegistry.getModelID(containerView);
		if (!PiViMM.diagram.edit.parts.IconsEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (PiViMM.diagram.edit.parts.IconsEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = PiViMM.diagram.part.PiViVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = PiViMM.diagram.edit.parts.IconsEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case PiViMM.diagram.edit.parts.IconsEditPart.VISUAL_ID:
			if (PiViMM.PiViMMPackage.eINSTANCE.getCodeBlock().isSuperTypeOf(domainElement.eClass())) {
				return PiViMM.diagram.edit.parts.CodeBlockEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = PiViMM.diagram.part.PiViVisualIDRegistry.getModelID(containerView);
		if (!PiViMM.diagram.edit.parts.IconsEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (PiViMM.diagram.edit.parts.IconsEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = PiViMM.diagram.part.PiViVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = PiViMM.diagram.edit.parts.IconsEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case PiViMM.diagram.edit.parts.IconsEditPart.VISUAL_ID:
			if (PiViMM.diagram.edit.parts.CodeBlockEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PiViMM.diagram.edit.parts.CodeBlockEditPart.VISUAL_ID:
			if (PiViMM.diagram.edit.parts.CodeBlockNameEditPart.VISUAL_ID == nodeVisualID) {
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
		if (PiViMM.PiViMMPackage.eINSTANCE.getConnector().isSuperTypeOf(domainElement.eClass())) {
			return PiViMM.diagram.edit.parts.ConnectorEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(PiViMM.Icons element) {
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
		return false;
	}

	/**
	* @generated
	*/
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case PiViMM.diagram.edit.parts.IconsEditPart.VISUAL_ID:
			return false;
		case PiViMM.diagram.edit.parts.CodeBlockEditPart.VISUAL_ID:
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

		public int getVisualID(View view) {
			return PiViMM.diagram.part.PiViVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/

		public String getModelID(View view) {
			return PiViMM.diagram.part.PiViVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return PiViMM.diagram.part.PiViVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return PiViMM.diagram.part.PiViVisualIDRegistry.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		* @generated
		*/

		public boolean isCompartmentVisualID(int visualID) {
			return PiViMM.diagram.part.PiViVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/

		public boolean isSemanticLeafVisualID(int visualID) {
			return PiViMM.diagram.part.PiViVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
