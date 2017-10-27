	package asu.ser.capstone.pivi.diagram.part;

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
	private static final String DEBUG_KEY = "PiviPlugin.diagram/debug/visualID";  //$NON-NLS-1$

		/**
 * @generated
 */
public static int getVisualID(org.eclipse.gmf.runtime.notation.View view) {
	if (view instanceof org.eclipse.gmf.runtime.notation.Diagram) {
		if (asu.ser.capstone.pivi.diagram.edit.parts.PiviDiagramEditPart.MODEL_ID.equals(view.getType())) {
			return asu.ser.capstone.pivi.diagram.edit.parts.PiviDiagramEditPart.VISUAL_ID;
		} else {
			return -1;
		}
	}
	return asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getVisualID(view.getType());
}
	
		/**
 * @generated
 */
public static String getModelID(org.eclipse.gmf.runtime.notation.View view) {
	org.eclipse.gmf.runtime.notation.View diagram = view.getDiagram();
	while (view != diagram) {
		org.eclipse.emf.ecore.EAnnotation annotation = view.getEAnnotation("Shortcut");  //$NON-NLS-1$
		if (annotation != null) {
			return (String) annotation.getDetails().get("modelID");  //$NON-NLS-1$
		}
		view = (org.eclipse.gmf.runtime.notation.View) view.eContainer();
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
		if (Boolean.TRUE.toString().equalsIgnoreCase(org.eclipse.core.runtime.Platform.getDebugOption(DEBUG_KEY))) {
			asu.ser.capstone.pivi.diagram.part.PiviDiagramEditorPlugin.getInstance().logError("Unable to parse view type as a visualID number: " + type);
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
public static int getDiagramVisualID(org.eclipse.emf.ecore.EObject domainElement) {
	if (domainElement == null) {
		return -1;
	}
	if (asu.ser.capstone.pivi.PiviPackage.eINSTANCE.getPiviDiagram().isSuperTypeOf(domainElement.eClass()) && isDiagram((asu.ser.capstone.pivi.PiviDiagram) domainElement)) {
	return asu.ser.capstone.pivi.diagram.edit.parts.PiviDiagramEditPart.VISUAL_ID;
}
	return -1;
}
	
		/**
 * @generated
 */
public static int getNodeVisualID(org.eclipse.gmf.runtime.notation.View containerView, org.eclipse.emf.ecore.EObject domainElement) {
	if (domainElement == null) {
		return -1;
	}
	String containerModelID = asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getModelID(containerView);
	if (!asu.ser.capstone.pivi.diagram.edit.parts.PiviDiagramEditPart.MODEL_ID.equals(containerModelID)) { 
		return -1;
	}
	int containerVisualID;
	if (asu.ser.capstone.pivi.diagram.edit.parts.PiviDiagramEditPart.MODEL_ID.equals(containerModelID)) {
		containerVisualID = asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getVisualID(containerView);
	} else {
		if (containerView instanceof org.eclipse.gmf.runtime.notation.Diagram) {
			containerVisualID = asu.ser.capstone.pivi.diagram.edit.parts.PiviDiagramEditPart.VISUAL_ID;		
		} else {
			return -1;
		}
	}
	switch (containerVisualID) {
			case asu.ser.capstone.pivi.diagram.edit.parts.PiviDiagramEditPart.VISUAL_ID:
	if (asu.ser.capstone.pivi.PiviPackage.eINSTANCE.getIfStart().isSuperTypeOf(domainElement.eClass())) {
	return asu.ser.capstone.pivi.diagram.edit.parts.IfStartEditPart.VISUAL_ID;
}
if (asu.ser.capstone.pivi.PiviPackage.eINSTANCE.getWhileEnd().isSuperTypeOf(domainElement.eClass())) {
	return asu.ser.capstone.pivi.diagram.edit.parts.WhileEndEditPart.VISUAL_ID;
}
if (asu.ser.capstone.pivi.PiviPackage.eINSTANCE.getMethodEnd().isSuperTypeOf(domainElement.eClass())) {
	return asu.ser.capstone.pivi.diagram.edit.parts.MethodEndEditPart.VISUAL_ID;
}
if (asu.ser.capstone.pivi.PiviPackage.eINSTANCE.getIfEnd().isSuperTypeOf(domainElement.eClass())) {
	return asu.ser.capstone.pivi.diagram.edit.parts.IfEndEditPart.VISUAL_ID;
}
if (asu.ser.capstone.pivi.PiviPackage.eINSTANCE.getInstruction().isSuperTypeOf(domainElement.eClass())) {
	return asu.ser.capstone.pivi.diagram.edit.parts.InstructionEditPart.VISUAL_ID;
}
if (asu.ser.capstone.pivi.PiviPackage.eINSTANCE.getMethodStart().isSuperTypeOf(domainElement.eClass())) {
	return asu.ser.capstone.pivi.diagram.edit.parts.MethodStartEditPart.VISUAL_ID;
}
if (asu.ser.capstone.pivi.PiviPackage.eINSTANCE.getWhileStart().isSuperTypeOf(domainElement.eClass())) {
	return asu.ser.capstone.pivi.diagram.edit.parts.WhileStartEditPart.VISUAL_ID;
}
if (asu.ser.capstone.pivi.PiviPackage.eINSTANCE.getStart().isSuperTypeOf(domainElement.eClass())) {
	return asu.ser.capstone.pivi.diagram.edit.parts.StartEditPart.VISUAL_ID;
}
if (asu.ser.capstone.pivi.PiviPackage.eINSTANCE.getThreadEnd().isSuperTypeOf(domainElement.eClass())) {
	return asu.ser.capstone.pivi.diagram.edit.parts.ThreadEndEditPart.VISUAL_ID;
}
if (asu.ser.capstone.pivi.PiviPackage.eINSTANCE.getThreadStart().isSuperTypeOf(domainElement.eClass())) {
	return asu.ser.capstone.pivi.diagram.edit.parts.ThreadStartEditPart.VISUAL_ID;
}
if (asu.ser.capstone.pivi.PiviPackage.eINSTANCE.getPrintStatement().isSuperTypeOf(domainElement.eClass())) {
	return asu.ser.capstone.pivi.diagram.edit.parts.PrintStatementEditPart.VISUAL_ID;
}
	break;
																case asu.ser.capstone.pivi.diagram.edit.parts.IfStartIfStartFigureCompartmentEditPart.VISUAL_ID:
	if (asu.ser.capstone.pivi.PiviPackage.eINSTANCE.getInputPort().isSuperTypeOf(domainElement.eClass())) {
	return asu.ser.capstone.pivi.diagram.edit.parts.InputPortEditPart.VISUAL_ID;
}
if (asu.ser.capstone.pivi.PiviPackage.eINSTANCE.getStartPort().isSuperTypeOf(domainElement.eClass())) {
	return asu.ser.capstone.pivi.diagram.edit.parts.StartPortEditPart.VISUAL_ID;
}
if (asu.ser.capstone.pivi.PiviPackage.eINSTANCE.getOutputPort().isSuperTypeOf(domainElement.eClass())) {
	return asu.ser.capstone.pivi.diagram.edit.parts.OutputPortEditPart.VISUAL_ID;
}
	break;
		case asu.ser.capstone.pivi.diagram.edit.parts.WhileEndWhileEndFigureCompartmentEditPart.VISUAL_ID:
	if (asu.ser.capstone.pivi.PiviPackage.eINSTANCE.getInputPort().isSuperTypeOf(domainElement.eClass())) {
	return asu.ser.capstone.pivi.diagram.edit.parts.InputPortEditPart.VISUAL_ID;
}
if (asu.ser.capstone.pivi.PiviPackage.eINSTANCE.getOutputPort().isSuperTypeOf(domainElement.eClass())) {
	return asu.ser.capstone.pivi.diagram.edit.parts.OutputPortEditPart.VISUAL_ID;
}
if (asu.ser.capstone.pivi.PiviPackage.eINSTANCE.getStartPort().isSuperTypeOf(domainElement.eClass())) {
	return asu.ser.capstone.pivi.diagram.edit.parts.StartPortEditPart.VISUAL_ID;
}
	break;
		case asu.ser.capstone.pivi.diagram.edit.parts.MethodEndMethodEndFigureCompartmentEditPart.VISUAL_ID:
	if (asu.ser.capstone.pivi.PiviPackage.eINSTANCE.getInputPort().isSuperTypeOf(domainElement.eClass())) {
	return asu.ser.capstone.pivi.diagram.edit.parts.InputPortEditPart.VISUAL_ID;
}
if (asu.ser.capstone.pivi.PiviPackage.eINSTANCE.getStartPort().isSuperTypeOf(domainElement.eClass())) {
	return asu.ser.capstone.pivi.diagram.edit.parts.StartPortEditPart.VISUAL_ID;
}
if (asu.ser.capstone.pivi.PiviPackage.eINSTANCE.getOutputPort().isSuperTypeOf(domainElement.eClass())) {
	return asu.ser.capstone.pivi.diagram.edit.parts.OutputPortEditPart.VISUAL_ID;
}
	break;
		case asu.ser.capstone.pivi.diagram.edit.parts.IfEndIfEndFigureCompartmentEditPart.VISUAL_ID:
	if (asu.ser.capstone.pivi.PiviPackage.eINSTANCE.getInputPort().isSuperTypeOf(domainElement.eClass())) {
	return asu.ser.capstone.pivi.diagram.edit.parts.InputPortEditPart.VISUAL_ID;
}
if (asu.ser.capstone.pivi.PiviPackage.eINSTANCE.getOutputPort().isSuperTypeOf(domainElement.eClass())) {
	return asu.ser.capstone.pivi.diagram.edit.parts.OutputPortEditPart.VISUAL_ID;
}
if (asu.ser.capstone.pivi.PiviPackage.eINSTANCE.getStartPort().isSuperTypeOf(domainElement.eClass())) {
	return asu.ser.capstone.pivi.diagram.edit.parts.StartPortEditPart.VISUAL_ID;
}
	break;
		case asu.ser.capstone.pivi.diagram.edit.parts.InstructionInstructionFigureCompartmentEditPart.VISUAL_ID:
	if (asu.ser.capstone.pivi.PiviPackage.eINSTANCE.getInputPort().isSuperTypeOf(domainElement.eClass())) {
	return asu.ser.capstone.pivi.diagram.edit.parts.InputPortEditPart.VISUAL_ID;
}
if (asu.ser.capstone.pivi.PiviPackage.eINSTANCE.getStartPort().isSuperTypeOf(domainElement.eClass())) {
	return asu.ser.capstone.pivi.diagram.edit.parts.StartPortEditPart.VISUAL_ID;
}
if (asu.ser.capstone.pivi.PiviPackage.eINSTANCE.getOutputPort().isSuperTypeOf(domainElement.eClass())) {
	return asu.ser.capstone.pivi.diagram.edit.parts.OutputPortEditPart.VISUAL_ID;
}
	break;
		case asu.ser.capstone.pivi.diagram.edit.parts.PrintStatementPrintStatementFigureCompartmentEditPart.VISUAL_ID:
	if (asu.ser.capstone.pivi.PiviPackage.eINSTANCE.getInputPort().isSuperTypeOf(domainElement.eClass())) {
	return asu.ser.capstone.pivi.diagram.edit.parts.InputPortEditPart.VISUAL_ID;
}
if (asu.ser.capstone.pivi.PiviPackage.eINSTANCE.getStartPort().isSuperTypeOf(domainElement.eClass())) {
	return asu.ser.capstone.pivi.diagram.edit.parts.StartPortEditPart.VISUAL_ID;
}
if (asu.ser.capstone.pivi.PiviPackage.eINSTANCE.getOutputPort().isSuperTypeOf(domainElement.eClass())) {
	return asu.ser.capstone.pivi.diagram.edit.parts.OutputPortEditPart.VISUAL_ID;
}
	break;
		case asu.ser.capstone.pivi.diagram.edit.parts.MethodStartMethodStartFigureCompartmentEditPart.VISUAL_ID:
	if (asu.ser.capstone.pivi.PiviPackage.eINSTANCE.getInputPort().isSuperTypeOf(domainElement.eClass())) {
	return asu.ser.capstone.pivi.diagram.edit.parts.InputPortEditPart.VISUAL_ID;
}
if (asu.ser.capstone.pivi.PiviPackage.eINSTANCE.getOutputPort().isSuperTypeOf(domainElement.eClass())) {
	return asu.ser.capstone.pivi.diagram.edit.parts.OutputPortEditPart.VISUAL_ID;
}
if (asu.ser.capstone.pivi.PiviPackage.eINSTANCE.getStartPort().isSuperTypeOf(domainElement.eClass())) {
	return asu.ser.capstone.pivi.diagram.edit.parts.StartPortEditPart.VISUAL_ID;
}
	break;
		case asu.ser.capstone.pivi.diagram.edit.parts.WhileStartWhileStartFigureCompartmentEditPart.VISUAL_ID:
	if (asu.ser.capstone.pivi.PiviPackage.eINSTANCE.getInputPort().isSuperTypeOf(domainElement.eClass())) {
	return asu.ser.capstone.pivi.diagram.edit.parts.InputPortEditPart.VISUAL_ID;
}
if (asu.ser.capstone.pivi.PiviPackage.eINSTANCE.getOutputPort().isSuperTypeOf(domainElement.eClass())) {
	return asu.ser.capstone.pivi.diagram.edit.parts.OutputPortEditPart.VISUAL_ID;
}
if (asu.ser.capstone.pivi.PiviPackage.eINSTANCE.getStartPort().isSuperTypeOf(domainElement.eClass())) {
	return asu.ser.capstone.pivi.diagram.edit.parts.StartPortEditPart.VISUAL_ID;
}
	break;
		case asu.ser.capstone.pivi.diagram.edit.parts.ThreadEndThreadEndFigureCompartmentEditPart.VISUAL_ID:
	if (asu.ser.capstone.pivi.PiviPackage.eINSTANCE.getInputPort().isSuperTypeOf(domainElement.eClass())) {
	return asu.ser.capstone.pivi.diagram.edit.parts.InputPortEditPart.VISUAL_ID;
}
if (asu.ser.capstone.pivi.PiviPackage.eINSTANCE.getOutputPort().isSuperTypeOf(domainElement.eClass())) {
	return asu.ser.capstone.pivi.diagram.edit.parts.OutputPortEditPart.VISUAL_ID;
}
if (asu.ser.capstone.pivi.PiviPackage.eINSTANCE.getStartPort().isSuperTypeOf(domainElement.eClass())) {
	return asu.ser.capstone.pivi.diagram.edit.parts.StartPortEditPart.VISUAL_ID;
}
	break;
		case asu.ser.capstone.pivi.diagram.edit.parts.ThreadStartThreadStartFigureCompartmentEditPart.VISUAL_ID:
	if (asu.ser.capstone.pivi.PiviPackage.eINSTANCE.getInputPort().isSuperTypeOf(domainElement.eClass())) {
	return asu.ser.capstone.pivi.diagram.edit.parts.InputPortEditPart.VISUAL_ID;
}
if (asu.ser.capstone.pivi.PiviPackage.eINSTANCE.getOutputPort().isSuperTypeOf(domainElement.eClass())) {
	return asu.ser.capstone.pivi.diagram.edit.parts.OutputPortEditPart.VISUAL_ID;
}
if (asu.ser.capstone.pivi.PiviPackage.eINSTANCE.getStartPort().isSuperTypeOf(domainElement.eClass())) {
	return asu.ser.capstone.pivi.diagram.edit.parts.StartPortEditPart.VISUAL_ID;
}
	break;
		}
	return -1;
}
	
		/**
 * @generated
 */
public static boolean canCreateNode(org.eclipse.gmf.runtime.notation.View containerView, int nodeVisualID) {
	String containerModelID = asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getModelID(containerView);
	if (!asu.ser.capstone.pivi.diagram.edit.parts.PiviDiagramEditPart.MODEL_ID.equals(containerModelID)) { 
		return false;
	}
	int containerVisualID;
	if (asu.ser.capstone.pivi.diagram.edit.parts.PiviDiagramEditPart.MODEL_ID.equals(containerModelID)) {
		containerVisualID = asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getVisualID(containerView);
	} else {
		if (containerView instanceof org.eclipse.gmf.runtime.notation.Diagram) {
			containerVisualID = asu.ser.capstone.pivi.diagram.edit.parts.PiviDiagramEditPart.VISUAL_ID;		
		} else {
			return false;
		}
	}
	switch (containerVisualID) {
		case asu.ser.capstone.pivi.diagram.edit.parts.PiviDiagramEditPart.VISUAL_ID:
	if (asu.ser.capstone.pivi.diagram.edit.parts.IfStartEditPart.VISUAL_ID == nodeVisualID) {
	return true;
}
if (asu.ser.capstone.pivi.diagram.edit.parts.WhileEndEditPart.VISUAL_ID == nodeVisualID) {
	return true;
}
if (asu.ser.capstone.pivi.diagram.edit.parts.MethodEndEditPart.VISUAL_ID == nodeVisualID) {
	return true;
}
if (asu.ser.capstone.pivi.diagram.edit.parts.IfEndEditPart.VISUAL_ID == nodeVisualID) {
	return true;
}
if (asu.ser.capstone.pivi.diagram.edit.parts.InstructionEditPart.VISUAL_ID == nodeVisualID) {
	return true;
}
if (asu.ser.capstone.pivi.diagram.edit.parts.MethodStartEditPart.VISUAL_ID == nodeVisualID) {
	return true;
}
if (asu.ser.capstone.pivi.diagram.edit.parts.WhileStartEditPart.VISUAL_ID == nodeVisualID) {
	return true;
}
if (asu.ser.capstone.pivi.diagram.edit.parts.StartEditPart.VISUAL_ID == nodeVisualID) {
	return true;
}
if (asu.ser.capstone.pivi.diagram.edit.parts.ThreadEndEditPart.VISUAL_ID == nodeVisualID) {
	return true;
}
if (asu.ser.capstone.pivi.diagram.edit.parts.ThreadStartEditPart.VISUAL_ID == nodeVisualID) {
	return true;
}
if (asu.ser.capstone.pivi.diagram.edit.parts.PrintStatementEditPart.VISUAL_ID == nodeVisualID) {
	return true;
}
	break;
case asu.ser.capstone.pivi.diagram.edit.parts.IfStartEditPart.VISUAL_ID:
	if (asu.ser.capstone.pivi.diagram.edit.parts.IfStartIfStartFigureCompartmentEditPart.VISUAL_ID == nodeVisualID) {
	return true;
}
	break;
case asu.ser.capstone.pivi.diagram.edit.parts.WhileEndEditPart.VISUAL_ID:
	if (asu.ser.capstone.pivi.diagram.edit.parts.WhileEndWhileEndFigureCompartmentEditPart.VISUAL_ID == nodeVisualID) {
	return true;
}
	break;
case asu.ser.capstone.pivi.diagram.edit.parts.MethodEndEditPart.VISUAL_ID:
	if (asu.ser.capstone.pivi.diagram.edit.parts.MethodEndMethodEndFigureCompartmentEditPart.VISUAL_ID == nodeVisualID) {
	return true;
}
	break;
case asu.ser.capstone.pivi.diagram.edit.parts.IfEndEditPart.VISUAL_ID:
	if (asu.ser.capstone.pivi.diagram.edit.parts.IfEndIfEndFigureCompartmentEditPart.VISUAL_ID == nodeVisualID) {
	return true;
}
	break;
case asu.ser.capstone.pivi.diagram.edit.parts.InstructionEditPart.VISUAL_ID:
	if (asu.ser.capstone.pivi.diagram.edit.parts.InstructionInstructionFigureCompartmentEditPart.VISUAL_ID == nodeVisualID) {
	return true;
}
	break;
case asu.ser.capstone.pivi.diagram.edit.parts.MethodStartEditPart.VISUAL_ID:
	if (asu.ser.capstone.pivi.diagram.edit.parts.MethodStartMethodStartFigureCompartmentEditPart.VISUAL_ID == nodeVisualID) {
	return true;
}
	break;
case asu.ser.capstone.pivi.diagram.edit.parts.WhileStartEditPart.VISUAL_ID:
	if (asu.ser.capstone.pivi.diagram.edit.parts.WhileStartWhileStartFigureCompartmentEditPart.VISUAL_ID == nodeVisualID) {
	return true;
}
	break;
case asu.ser.capstone.pivi.diagram.edit.parts.ThreadEndEditPart.VISUAL_ID:
	if (asu.ser.capstone.pivi.diagram.edit.parts.ThreadEndThreadEndFigureCompartmentEditPart.VISUAL_ID == nodeVisualID) {
	return true;
}
	break;
case asu.ser.capstone.pivi.diagram.edit.parts.ThreadStartEditPart.VISUAL_ID:
	if (asu.ser.capstone.pivi.diagram.edit.parts.ThreadStartThreadStartFigureCompartmentEditPart.VISUAL_ID == nodeVisualID) {
	return true;
}
	break;
case asu.ser.capstone.pivi.diagram.edit.parts.PrintStatementEditPart.VISUAL_ID:
	if (asu.ser.capstone.pivi.diagram.edit.parts.PrintStatementPrintStatementFigureCompartmentEditPart.VISUAL_ID == nodeVisualID) {
	return true;
}
	break;
case asu.ser.capstone.pivi.diagram.edit.parts.IfStartIfStartFigureCompartmentEditPart.VISUAL_ID:
	if (asu.ser.capstone.pivi.diagram.edit.parts.InputPortEditPart.VISUAL_ID == nodeVisualID) {
	return true;
}
if (asu.ser.capstone.pivi.diagram.edit.parts.StartPortEditPart.VISUAL_ID == nodeVisualID) {
	return true;
}
if (asu.ser.capstone.pivi.diagram.edit.parts.OutputPortEditPart.VISUAL_ID == nodeVisualID) {
	return true;
}
	break;
case asu.ser.capstone.pivi.diagram.edit.parts.WhileEndWhileEndFigureCompartmentEditPart.VISUAL_ID:
	if (asu.ser.capstone.pivi.diagram.edit.parts.InputPortEditPart.VISUAL_ID == nodeVisualID) {
	return true;
}
if (asu.ser.capstone.pivi.diagram.edit.parts.OutputPortEditPart.VISUAL_ID == nodeVisualID) {
	return true;
}
if (asu.ser.capstone.pivi.diagram.edit.parts.StartPortEditPart.VISUAL_ID == nodeVisualID) {
	return true;
}
	break;
case asu.ser.capstone.pivi.diagram.edit.parts.MethodEndMethodEndFigureCompartmentEditPart.VISUAL_ID:
	if (asu.ser.capstone.pivi.diagram.edit.parts.InputPortEditPart.VISUAL_ID == nodeVisualID) {
	return true;
}
if (asu.ser.capstone.pivi.diagram.edit.parts.StartPortEditPart.VISUAL_ID == nodeVisualID) {
	return true;
}
if (asu.ser.capstone.pivi.diagram.edit.parts.OutputPortEditPart.VISUAL_ID == nodeVisualID) {
	return true;
}
	break;
case asu.ser.capstone.pivi.diagram.edit.parts.IfEndIfEndFigureCompartmentEditPart.VISUAL_ID:
	if (asu.ser.capstone.pivi.diagram.edit.parts.InputPortEditPart.VISUAL_ID == nodeVisualID) {
	return true;
}
if (asu.ser.capstone.pivi.diagram.edit.parts.OutputPortEditPart.VISUAL_ID == nodeVisualID) {
	return true;
}
if (asu.ser.capstone.pivi.diagram.edit.parts.StartPortEditPart.VISUAL_ID == nodeVisualID) {
	return true;
}
	break;
case asu.ser.capstone.pivi.diagram.edit.parts.InstructionInstructionFigureCompartmentEditPart.VISUAL_ID:
	if (asu.ser.capstone.pivi.diagram.edit.parts.InputPortEditPart.VISUAL_ID == nodeVisualID) {
	return true;
}
if (asu.ser.capstone.pivi.diagram.edit.parts.StartPortEditPart.VISUAL_ID == nodeVisualID) {
	return true;
}
if (asu.ser.capstone.pivi.diagram.edit.parts.OutputPortEditPart.VISUAL_ID == nodeVisualID) {
	return true;
}
	break;
case asu.ser.capstone.pivi.diagram.edit.parts.PrintStatementPrintStatementFigureCompartmentEditPart.VISUAL_ID:
	if (asu.ser.capstone.pivi.diagram.edit.parts.InputPortEditPart.VISUAL_ID == nodeVisualID) {
	return true;
}
if (asu.ser.capstone.pivi.diagram.edit.parts.StartPortEditPart.VISUAL_ID == nodeVisualID) {
	return true;
}
if (asu.ser.capstone.pivi.diagram.edit.parts.OutputPortEditPart.VISUAL_ID == nodeVisualID) {
	return true;
}
	break;
case asu.ser.capstone.pivi.diagram.edit.parts.MethodStartMethodStartFigureCompartmentEditPart.VISUAL_ID:
	if (asu.ser.capstone.pivi.diagram.edit.parts.InputPortEditPart.VISUAL_ID == nodeVisualID) {
	return true;
}
if (asu.ser.capstone.pivi.diagram.edit.parts.OutputPortEditPart.VISUAL_ID == nodeVisualID) {
	return true;
}
if (asu.ser.capstone.pivi.diagram.edit.parts.StartPortEditPart.VISUAL_ID == nodeVisualID) {
	return true;
}
	break;
case asu.ser.capstone.pivi.diagram.edit.parts.WhileStartWhileStartFigureCompartmentEditPart.VISUAL_ID:
	if (asu.ser.capstone.pivi.diagram.edit.parts.InputPortEditPart.VISUAL_ID == nodeVisualID) {
	return true;
}
if (asu.ser.capstone.pivi.diagram.edit.parts.OutputPortEditPart.VISUAL_ID == nodeVisualID) {
	return true;
}
if (asu.ser.capstone.pivi.diagram.edit.parts.StartPortEditPart.VISUAL_ID == nodeVisualID) {
	return true;
}
	break;
case asu.ser.capstone.pivi.diagram.edit.parts.ThreadEndThreadEndFigureCompartmentEditPart.VISUAL_ID:
	if (asu.ser.capstone.pivi.diagram.edit.parts.InputPortEditPart.VISUAL_ID == nodeVisualID) {
	return true;
}
if (asu.ser.capstone.pivi.diagram.edit.parts.OutputPortEditPart.VISUAL_ID == nodeVisualID) {
	return true;
}
if (asu.ser.capstone.pivi.diagram.edit.parts.StartPortEditPart.VISUAL_ID == nodeVisualID) {
	return true;
}
	break;
case asu.ser.capstone.pivi.diagram.edit.parts.ThreadStartThreadStartFigureCompartmentEditPart.VISUAL_ID:
	if (asu.ser.capstone.pivi.diagram.edit.parts.InputPortEditPart.VISUAL_ID == nodeVisualID) {
	return true;
}
if (asu.ser.capstone.pivi.diagram.edit.parts.OutputPortEditPart.VISUAL_ID == nodeVisualID) {
	return true;
}
if (asu.ser.capstone.pivi.diagram.edit.parts.StartPortEditPart.VISUAL_ID == nodeVisualID) {
	return true;
}
	break;
			}
	return false;
}
	
		/**
 * @generated
 */
public static int getLinkWithClassVisualID(org.eclipse.emf.ecore.EObject domainElement) {
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
private static boolean isDiagram(asu.ser.capstone.pivi.PiviDiagram element) {
	return true;
}
	
		
	
	/**
 * @generated
 */
	public static boolean checkNodeVisualID(org.eclipse.gmf.runtime.notation.View containerView, org.eclipse.emf.ecore.EObject domainElement, int candidate) {
		if (candidate == -1){
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
				case asu.ser.capstone.pivi.diagram.edit.parts.IfStartIfStartFigureCompartmentEditPart.VISUAL_ID:case asu.ser.capstone.pivi.diagram.edit.parts.WhileEndWhileEndFigureCompartmentEditPart.VISUAL_ID:case asu.ser.capstone.pivi.diagram.edit.parts.MethodEndMethodEndFigureCompartmentEditPart.VISUAL_ID:case asu.ser.capstone.pivi.diagram.edit.parts.IfEndIfEndFigureCompartmentEditPart.VISUAL_ID:case asu.ser.capstone.pivi.diagram.edit.parts.InstructionInstructionFigureCompartmentEditPart.VISUAL_ID:case asu.ser.capstone.pivi.diagram.edit.parts.PrintStatementPrintStatementFigureCompartmentEditPart.VISUAL_ID:case asu.ser.capstone.pivi.diagram.edit.parts.MethodStartMethodStartFigureCompartmentEditPart.VISUAL_ID:case asu.ser.capstone.pivi.diagram.edit.parts.WhileStartWhileStartFigureCompartmentEditPart.VISUAL_ID:case asu.ser.capstone.pivi.diagram.edit.parts.ThreadEndThreadEndFigureCompartmentEditPart.VISUAL_ID:case asu.ser.capstone.pivi.diagram.edit.parts.ThreadStartThreadStartFigureCompartmentEditPart.VISUAL_ID:
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
						case asu.ser.capstone.pivi.diagram.edit.parts.PiviDiagramEditPart.VISUAL_ID:
				return false;
																																																																																																case asu.ser.capstone.pivi.diagram.edit.parts.StartEditPart.VISUAL_ID:
																																																						case asu.ser.capstone.pivi.diagram.edit.parts.InputPortEditPart.VISUAL_ID:
																		case asu.ser.capstone.pivi.diagram.edit.parts.StartPortEditPart.VISUAL_ID:
																		case asu.ser.capstone.pivi.diagram.edit.parts.OutputPortEditPart.VISUAL_ID:
													return true;
			default:
				break;
		}
		return false;
	}

		/**
 * @generated
 */
	public static final org.eclipse.gmf.tooling.runtime.structure.DiagramStructure TYPED_INSTANCE = new org.eclipse.gmf.tooling.runtime.structure.DiagramStructure() {
		/**
 * @generated
 */
		@Override

		public int getVisualID(org.eclipse.gmf.runtime.notation.View view) {
			return asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getVisualID(view);
		}
		
		/**
 * @generated
 */
		@Override

		public String getModelID(org.eclipse.gmf.runtime.notation.View view) {
			return asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getModelID(view);
		}
		
		/**
 * @generated
 */
		@Override

		public int getNodeVisualID(org.eclipse.gmf.runtime.notation.View containerView, org.eclipse.emf.ecore.EObject domainElement) {
			return asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}
		
		/**
 * @generated
 */
		@Override

		public boolean checkNodeVisualID(org.eclipse.gmf.runtime.notation.View containerView, org.eclipse.emf.ecore.EObject domainElement, int candidate) {
			return asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.checkNodeVisualID(containerView, domainElement, candidate);
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
