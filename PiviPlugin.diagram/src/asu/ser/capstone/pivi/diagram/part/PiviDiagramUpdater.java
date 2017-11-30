	package asu.ser.capstone.pivi.diagram.part;

	/**
 * @generated
 */
public class PiviDiagramUpdater {
		
		/**
 * @generated
 */
public static java.util.List<asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor> getSemanticChildren(org.eclipse.gmf.runtime.notation.View view) {
		switch (asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getVisualID(view)) {
		case asu.ser.capstone.pivi.diagram.edit.parts.PiviDiagramEditPart.VISUAL_ID:
	return getPiviDiagram_1000SemanticChildren(view);
case asu.ser.capstone.pivi.diagram.edit.parts.IfStartIfStartFigureCompartmentEditPart.VISUAL_ID:
	return getIfStartIfStartFigureCompartment_7001SemanticChildren(view);
case asu.ser.capstone.pivi.diagram.edit.parts.WhileEndWhileEndFigureCompartmentEditPart.VISUAL_ID:
	return getWhileEndWhileEndFigureCompartment_7002SemanticChildren(view);
case asu.ser.capstone.pivi.diagram.edit.parts.MethodEndMethodEndFigureCompartmentEditPart.VISUAL_ID:
	return getMethodEndMethodEndFigureCompartment_7003SemanticChildren(view);
case asu.ser.capstone.pivi.diagram.edit.parts.IfEndIfEndFigureCompartmentEditPart.VISUAL_ID:
	return getIfEndIfEndFigureCompartment_7004SemanticChildren(view);
case asu.ser.capstone.pivi.diagram.edit.parts.InstructionInstructionFigureCompartmentEditPart.VISUAL_ID:
	return getInstructionInstructionFigureCompartment_7005SemanticChildren(view);
case asu.ser.capstone.pivi.diagram.edit.parts.PrintStatementPrintStatementFigureCompartmentEditPart.VISUAL_ID:
	return getPrintStatementPrintStatementFigureCompartment_7011SemanticChildren(view);
case asu.ser.capstone.pivi.diagram.edit.parts.MethodStartMethodStartFigureCompartmentEditPart.VISUAL_ID:
	return getMethodStartMethodStartFigureCompartment_7007SemanticChildren(view);
case asu.ser.capstone.pivi.diagram.edit.parts.WhileStartWhileStartFigureCompartmentEditPart.VISUAL_ID:
	return getWhileStartWhileStartFigureCompartment_7008SemanticChildren(view);
case asu.ser.capstone.pivi.diagram.edit.parts.ThreadEndThreadEndFigureCompartmentEditPart.VISUAL_ID:
	return getThreadEndThreadEndFigureCompartment_7009SemanticChildren(view);
case asu.ser.capstone.pivi.diagram.edit.parts.ThreadStartThreadStartFigureCompartmentEditPart.VISUAL_ID:
	return getThreadStartThreadStartFigureCompartment_7010SemanticChildren(view);
case asu.ser.capstone.pivi.diagram.edit.parts.SyncEndSyncEndFigureCompartmentEditPart.VISUAL_ID:
	return getSyncEndSyncEndFigureCompartment_7012SemanticChildren(view);
case asu.ser.capstone.pivi.diagram.edit.parts.SyncStartSyncStartFigureCompartmentEditPart.VISUAL_ID:
	return getSyncStartSyncStartFigureCompartment_7013SemanticChildren(view);
	}
		return java.util.Collections.emptyList();
}
	
	/**
 * @generated
 */
public static java.util.List<asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor> getPiviDiagram_1000SemanticChildren(org.eclipse.gmf.runtime.notation.View view) {
		if (!view.isSetElement()) {
	return java.util.Collections.emptyList();
}
asu.ser.capstone.pivi.PiviDiagram modelElement = (asu.ser.capstone.pivi.PiviDiagram) view.getElement();
	java.util.LinkedList<asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor> result = new java.util.LinkedList<asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor>();
						for (java.util.Iterator<?> it = modelElement.getStatements().iterator(); it.hasNext();) {
		asu.ser.capstone.pivi.Statement childElement = (asu.ser.capstone.pivi.Statement) it.next();
					int visualID = asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == asu.ser.capstone.pivi.diagram.edit.parts.IfStartEditPart.VISUAL_ID) {
	result.add(new asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor(childElement, visualID));
	continue;
}
if (visualID == asu.ser.capstone.pivi.diagram.edit.parts.WhileEndEditPart.VISUAL_ID) {
	result.add(new asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor(childElement, visualID));
	continue;
}
if (visualID == asu.ser.capstone.pivi.diagram.edit.parts.MethodEndEditPart.VISUAL_ID) {
	result.add(new asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor(childElement, visualID));
	continue;
}
if (visualID == asu.ser.capstone.pivi.diagram.edit.parts.IfEndEditPart.VISUAL_ID) {
	result.add(new asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor(childElement, visualID));
	continue;
}
if (visualID == asu.ser.capstone.pivi.diagram.edit.parts.InstructionEditPart.VISUAL_ID) {
	result.add(new asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor(childElement, visualID));
	continue;
}
if (visualID == asu.ser.capstone.pivi.diagram.edit.parts.MethodStartEditPart.VISUAL_ID) {
	result.add(new asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor(childElement, visualID));
	continue;
}
if (visualID == asu.ser.capstone.pivi.diagram.edit.parts.WhileStartEditPart.VISUAL_ID) {
	result.add(new asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor(childElement, visualID));
	continue;
}
if (visualID == asu.ser.capstone.pivi.diagram.edit.parts.ThreadEndEditPart.VISUAL_ID) {
	result.add(new asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor(childElement, visualID));
	continue;
}
if (visualID == asu.ser.capstone.pivi.diagram.edit.parts.ThreadStartEditPart.VISUAL_ID) {
	result.add(new asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor(childElement, visualID));
	continue;
}
if (visualID == asu.ser.capstone.pivi.diagram.edit.parts.PrintStatementEditPart.VISUAL_ID) {
	result.add(new asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor(childElement, visualID));
	continue;
}
if (visualID == asu.ser.capstone.pivi.diagram.edit.parts.SyncEndEditPart.VISUAL_ID) {
	result.add(new asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor(childElement, visualID));
	continue;
}
if (visualID == asu.ser.capstone.pivi.diagram.edit.parts.SyncStartEditPart.VISUAL_ID) {
	result.add(new asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor(childElement, visualID));
	continue;
}
	}
						{ asu.ser.capstone.pivi.Start childElement = modelElement.getStart();
					int visualID = asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == asu.ser.capstone.pivi.diagram.edit.parts.StartEditPart.VISUAL_ID) {
	result.add(new asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor(childElement, visualID));
}
	}
			return result;
	}

	/**
 * @generated
 */
public static java.util.List<asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor> getIfStartIfStartFigureCompartment_7001SemanticChildren(org.eclipse.gmf.runtime.notation.View view) {
		if (false == view.eContainer() instanceof org.eclipse.gmf.runtime.notation.View) {
	return java.util.Collections.emptyList();
}
org.eclipse.gmf.runtime.notation.View containerView = (org.eclipse.gmf.runtime.notation.View) view.eContainer();
if (!containerView.isSetElement()) {
	return java.util.Collections.emptyList();
}
asu.ser.capstone.pivi.IfStart modelElement = (asu.ser.capstone.pivi.IfStart) containerView.getElement();
	java.util.LinkedList<asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor> result = new java.util.LinkedList<asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor>();
						for (java.util.Iterator<?> it = modelElement.getInputs().iterator(); it.hasNext();) {
		asu.ser.capstone.pivi.InputPort childElement = (asu.ser.capstone.pivi.InputPort) it.next();
					int visualID = asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == asu.ser.capstone.pivi.diagram.edit.parts.InputPortEditPart.VISUAL_ID) {
	result.add(new asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor(childElement, visualID));
	continue;
}
	}
						for (java.util.Iterator<?> it = modelElement.getStart().iterator(); it.hasNext();) {
		asu.ser.capstone.pivi.StartPort childElement = (asu.ser.capstone.pivi.StartPort) it.next();
					int visualID = asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == asu.ser.capstone.pivi.diagram.edit.parts.StartPortEditPart.VISUAL_ID) {
	result.add(new asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor(childElement, visualID));
	continue;
}
	}
						for (java.util.Iterator<?> it = modelElement.getOutputs().iterator(); it.hasNext();) {
		asu.ser.capstone.pivi.OutputPort childElement = (asu.ser.capstone.pivi.OutputPort) it.next();
					int visualID = asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == asu.ser.capstone.pivi.diagram.edit.parts.OutputPortEditPart.VISUAL_ID) {
	result.add(new asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor(childElement, visualID));
	continue;
}
	}
			return result;
	}

	/**
 * @generated
 */
public static java.util.List<asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor> getWhileEndWhileEndFigureCompartment_7002SemanticChildren(org.eclipse.gmf.runtime.notation.View view) {
		if (false == view.eContainer() instanceof org.eclipse.gmf.runtime.notation.View) {
	return java.util.Collections.emptyList();
}
org.eclipse.gmf.runtime.notation.View containerView = (org.eclipse.gmf.runtime.notation.View) view.eContainer();
if (!containerView.isSetElement()) {
	return java.util.Collections.emptyList();
}
asu.ser.capstone.pivi.WhileEnd modelElement = (asu.ser.capstone.pivi.WhileEnd) containerView.getElement();
	java.util.LinkedList<asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor> result = new java.util.LinkedList<asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor>();
						for (java.util.Iterator<?> it = modelElement.getInputs().iterator(); it.hasNext();) {
		asu.ser.capstone.pivi.InputPort childElement = (asu.ser.capstone.pivi.InputPort) it.next();
					int visualID = asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == asu.ser.capstone.pivi.diagram.edit.parts.InputPortEditPart.VISUAL_ID) {
	result.add(new asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor(childElement, visualID));
	continue;
}
	}
						for (java.util.Iterator<?> it = modelElement.getOutputs().iterator(); it.hasNext();) {
		asu.ser.capstone.pivi.OutputPort childElement = (asu.ser.capstone.pivi.OutputPort) it.next();
					int visualID = asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == asu.ser.capstone.pivi.diagram.edit.parts.OutputPortEditPart.VISUAL_ID) {
	result.add(new asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor(childElement, visualID));
	continue;
}
	}
						for (java.util.Iterator<?> it = modelElement.getStart().iterator(); it.hasNext();) {
		asu.ser.capstone.pivi.StartPort childElement = (asu.ser.capstone.pivi.StartPort) it.next();
					int visualID = asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == asu.ser.capstone.pivi.diagram.edit.parts.StartPortEditPart.VISUAL_ID) {
	result.add(new asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor(childElement, visualID));
	continue;
}
	}
			return result;
	}

	/**
 * @generated
 */
public static java.util.List<asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor> getMethodEndMethodEndFigureCompartment_7003SemanticChildren(org.eclipse.gmf.runtime.notation.View view) {
		if (false == view.eContainer() instanceof org.eclipse.gmf.runtime.notation.View) {
	return java.util.Collections.emptyList();
}
org.eclipse.gmf.runtime.notation.View containerView = (org.eclipse.gmf.runtime.notation.View) view.eContainer();
if (!containerView.isSetElement()) {
	return java.util.Collections.emptyList();
}
asu.ser.capstone.pivi.MethodEnd modelElement = (asu.ser.capstone.pivi.MethodEnd) containerView.getElement();
	java.util.LinkedList<asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor> result = new java.util.LinkedList<asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor>();
						for (java.util.Iterator<?> it = modelElement.getInputs().iterator(); it.hasNext();) {
		asu.ser.capstone.pivi.InputPort childElement = (asu.ser.capstone.pivi.InputPort) it.next();
					int visualID = asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == asu.ser.capstone.pivi.diagram.edit.parts.InputPortEditPart.VISUAL_ID) {
	result.add(new asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor(childElement, visualID));
	continue;
}
	}
						for (java.util.Iterator<?> it = modelElement.getStart().iterator(); it.hasNext();) {
		asu.ser.capstone.pivi.StartPort childElement = (asu.ser.capstone.pivi.StartPort) it.next();
					int visualID = asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == asu.ser.capstone.pivi.diagram.edit.parts.StartPortEditPart.VISUAL_ID) {
	result.add(new asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor(childElement, visualID));
	continue;
}
	}
						for (java.util.Iterator<?> it = modelElement.getOutputs().iterator(); it.hasNext();) {
		asu.ser.capstone.pivi.OutputPort childElement = (asu.ser.capstone.pivi.OutputPort) it.next();
					int visualID = asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == asu.ser.capstone.pivi.diagram.edit.parts.OutputPortEditPart.VISUAL_ID) {
	result.add(new asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor(childElement, visualID));
	continue;
}
	}
			return result;
	}

	/**
 * @generated
 */
public static java.util.List<asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor> getIfEndIfEndFigureCompartment_7004SemanticChildren(org.eclipse.gmf.runtime.notation.View view) {
		if (false == view.eContainer() instanceof org.eclipse.gmf.runtime.notation.View) {
	return java.util.Collections.emptyList();
}
org.eclipse.gmf.runtime.notation.View containerView = (org.eclipse.gmf.runtime.notation.View) view.eContainer();
if (!containerView.isSetElement()) {
	return java.util.Collections.emptyList();
}
asu.ser.capstone.pivi.IfEnd modelElement = (asu.ser.capstone.pivi.IfEnd) containerView.getElement();
	java.util.LinkedList<asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor> result = new java.util.LinkedList<asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor>();
						for (java.util.Iterator<?> it = modelElement.getInputs().iterator(); it.hasNext();) {
		asu.ser.capstone.pivi.InputPort childElement = (asu.ser.capstone.pivi.InputPort) it.next();
					int visualID = asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == asu.ser.capstone.pivi.diagram.edit.parts.InputPortEditPart.VISUAL_ID) {
	result.add(new asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor(childElement, visualID));
	continue;
}
	}
						for (java.util.Iterator<?> it = modelElement.getOutputs().iterator(); it.hasNext();) {
		asu.ser.capstone.pivi.OutputPort childElement = (asu.ser.capstone.pivi.OutputPort) it.next();
					int visualID = asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == asu.ser.capstone.pivi.diagram.edit.parts.OutputPortEditPart.VISUAL_ID) {
	result.add(new asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor(childElement, visualID));
	continue;
}
	}
						for (java.util.Iterator<?> it = modelElement.getStart().iterator(); it.hasNext();) {
		asu.ser.capstone.pivi.StartPort childElement = (asu.ser.capstone.pivi.StartPort) it.next();
					int visualID = asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == asu.ser.capstone.pivi.diagram.edit.parts.StartPortEditPart.VISUAL_ID) {
	result.add(new asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor(childElement, visualID));
	continue;
}
	}
			return result;
	}

	/**
 * @generated
 */
public static java.util.List<asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor> getInstructionInstructionFigureCompartment_7005SemanticChildren(org.eclipse.gmf.runtime.notation.View view) {
		if (false == view.eContainer() instanceof org.eclipse.gmf.runtime.notation.View) {
	return java.util.Collections.emptyList();
}
org.eclipse.gmf.runtime.notation.View containerView = (org.eclipse.gmf.runtime.notation.View) view.eContainer();
if (!containerView.isSetElement()) {
	return java.util.Collections.emptyList();
}
asu.ser.capstone.pivi.Instruction modelElement = (asu.ser.capstone.pivi.Instruction) containerView.getElement();
	java.util.LinkedList<asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor> result = new java.util.LinkedList<asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor>();
						for (java.util.Iterator<?> it = modelElement.getInputs().iterator(); it.hasNext();) {
		asu.ser.capstone.pivi.InputPort childElement = (asu.ser.capstone.pivi.InputPort) it.next();
					int visualID = asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == asu.ser.capstone.pivi.diagram.edit.parts.InputPortEditPart.VISUAL_ID) {
	result.add(new asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor(childElement, visualID));
	continue;
}
	}
						for (java.util.Iterator<?> it = modelElement.getStart().iterator(); it.hasNext();) {
		asu.ser.capstone.pivi.StartPort childElement = (asu.ser.capstone.pivi.StartPort) it.next();
					int visualID = asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == asu.ser.capstone.pivi.diagram.edit.parts.StartPortEditPart.VISUAL_ID) {
	result.add(new asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor(childElement, visualID));
	continue;
}
	}
						for (java.util.Iterator<?> it = modelElement.getOutputs().iterator(); it.hasNext();) {
		asu.ser.capstone.pivi.OutputPort childElement = (asu.ser.capstone.pivi.OutputPort) it.next();
					int visualID = asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == asu.ser.capstone.pivi.diagram.edit.parts.OutputPortEditPart.VISUAL_ID) {
	result.add(new asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor(childElement, visualID));
	continue;
}
	}
			return result;
	}

	/**
 * @generated
 */
public static java.util.List<asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor> getPrintStatementPrintStatementFigureCompartment_7011SemanticChildren(org.eclipse.gmf.runtime.notation.View view) {
		if (false == view.eContainer() instanceof org.eclipse.gmf.runtime.notation.View) {
	return java.util.Collections.emptyList();
}
org.eclipse.gmf.runtime.notation.View containerView = (org.eclipse.gmf.runtime.notation.View) view.eContainer();
if (!containerView.isSetElement()) {
	return java.util.Collections.emptyList();
}
asu.ser.capstone.pivi.PrintStatement modelElement = (asu.ser.capstone.pivi.PrintStatement) containerView.getElement();
	java.util.LinkedList<asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor> result = new java.util.LinkedList<asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor>();
						for (java.util.Iterator<?> it = modelElement.getInputs().iterator(); it.hasNext();) {
		asu.ser.capstone.pivi.InputPort childElement = (asu.ser.capstone.pivi.InputPort) it.next();
					int visualID = asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == asu.ser.capstone.pivi.diagram.edit.parts.InputPortEditPart.VISUAL_ID) {
	result.add(new asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor(childElement, visualID));
	continue;
}
	}
						for (java.util.Iterator<?> it = modelElement.getStart().iterator(); it.hasNext();) {
		asu.ser.capstone.pivi.StartPort childElement = (asu.ser.capstone.pivi.StartPort) it.next();
					int visualID = asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == asu.ser.capstone.pivi.diagram.edit.parts.StartPortEditPart.VISUAL_ID) {
	result.add(new asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor(childElement, visualID));
	continue;
}
	}
						for (java.util.Iterator<?> it = modelElement.getOutputs().iterator(); it.hasNext();) {
		asu.ser.capstone.pivi.OutputPort childElement = (asu.ser.capstone.pivi.OutputPort) it.next();
					int visualID = asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == asu.ser.capstone.pivi.diagram.edit.parts.OutputPortEditPart.VISUAL_ID) {
	result.add(new asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor(childElement, visualID));
	continue;
}
	}
			return result;
	}

	/**
 * @generated
 */
public static java.util.List<asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor> getMethodStartMethodStartFigureCompartment_7007SemanticChildren(org.eclipse.gmf.runtime.notation.View view) {
		if (false == view.eContainer() instanceof org.eclipse.gmf.runtime.notation.View) {
	return java.util.Collections.emptyList();
}
org.eclipse.gmf.runtime.notation.View containerView = (org.eclipse.gmf.runtime.notation.View) view.eContainer();
if (!containerView.isSetElement()) {
	return java.util.Collections.emptyList();
}
asu.ser.capstone.pivi.MethodStart modelElement = (asu.ser.capstone.pivi.MethodStart) containerView.getElement();
	java.util.LinkedList<asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor> result = new java.util.LinkedList<asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor>();
						for (java.util.Iterator<?> it = modelElement.getInputs().iterator(); it.hasNext();) {
		asu.ser.capstone.pivi.InputPort childElement = (asu.ser.capstone.pivi.InputPort) it.next();
					int visualID = asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == asu.ser.capstone.pivi.diagram.edit.parts.InputPortEditPart.VISUAL_ID) {
	result.add(new asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor(childElement, visualID));
	continue;
}
	}
						for (java.util.Iterator<?> it = modelElement.getOutputs().iterator(); it.hasNext();) {
		asu.ser.capstone.pivi.OutputPort childElement = (asu.ser.capstone.pivi.OutputPort) it.next();
					int visualID = asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == asu.ser.capstone.pivi.diagram.edit.parts.OutputPortEditPart.VISUAL_ID) {
	result.add(new asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor(childElement, visualID));
	continue;
}
	}
						for (java.util.Iterator<?> it = modelElement.getStart().iterator(); it.hasNext();) {
		asu.ser.capstone.pivi.StartPort childElement = (asu.ser.capstone.pivi.StartPort) it.next();
					int visualID = asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == asu.ser.capstone.pivi.diagram.edit.parts.StartPortEditPart.VISUAL_ID) {
	result.add(new asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor(childElement, visualID));
	continue;
}
	}
			return result;
	}

	/**
 * @generated
 */
public static java.util.List<asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor> getWhileStartWhileStartFigureCompartment_7008SemanticChildren(org.eclipse.gmf.runtime.notation.View view) {
		if (false == view.eContainer() instanceof org.eclipse.gmf.runtime.notation.View) {
	return java.util.Collections.emptyList();
}
org.eclipse.gmf.runtime.notation.View containerView = (org.eclipse.gmf.runtime.notation.View) view.eContainer();
if (!containerView.isSetElement()) {
	return java.util.Collections.emptyList();
}
asu.ser.capstone.pivi.WhileStart modelElement = (asu.ser.capstone.pivi.WhileStart) containerView.getElement();
	java.util.LinkedList<asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor> result = new java.util.LinkedList<asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor>();
						for (java.util.Iterator<?> it = modelElement.getInputs().iterator(); it.hasNext();) {
		asu.ser.capstone.pivi.InputPort childElement = (asu.ser.capstone.pivi.InputPort) it.next();
					int visualID = asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == asu.ser.capstone.pivi.diagram.edit.parts.InputPortEditPart.VISUAL_ID) {
	result.add(new asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor(childElement, visualID));
	continue;
}
	}
						for (java.util.Iterator<?> it = modelElement.getOutputs().iterator(); it.hasNext();) {
		asu.ser.capstone.pivi.OutputPort childElement = (asu.ser.capstone.pivi.OutputPort) it.next();
					int visualID = asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == asu.ser.capstone.pivi.diagram.edit.parts.OutputPortEditPart.VISUAL_ID) {
	result.add(new asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor(childElement, visualID));
	continue;
}
	}
						for (java.util.Iterator<?> it = modelElement.getStart().iterator(); it.hasNext();) {
		asu.ser.capstone.pivi.StartPort childElement = (asu.ser.capstone.pivi.StartPort) it.next();
					int visualID = asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == asu.ser.capstone.pivi.diagram.edit.parts.StartPortEditPart.VISUAL_ID) {
	result.add(new asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor(childElement, visualID));
	continue;
}
	}
			return result;
	}

	/**
 * @generated
 */
public static java.util.List<asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor> getThreadEndThreadEndFigureCompartment_7009SemanticChildren(org.eclipse.gmf.runtime.notation.View view) {
		if (false == view.eContainer() instanceof org.eclipse.gmf.runtime.notation.View) {
	return java.util.Collections.emptyList();
}
org.eclipse.gmf.runtime.notation.View containerView = (org.eclipse.gmf.runtime.notation.View) view.eContainer();
if (!containerView.isSetElement()) {
	return java.util.Collections.emptyList();
}
asu.ser.capstone.pivi.ThreadEnd modelElement = (asu.ser.capstone.pivi.ThreadEnd) containerView.getElement();
	java.util.LinkedList<asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor> result = new java.util.LinkedList<asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor>();
						for (java.util.Iterator<?> it = modelElement.getInputs().iterator(); it.hasNext();) {
		asu.ser.capstone.pivi.InputPort childElement = (asu.ser.capstone.pivi.InputPort) it.next();
					int visualID = asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == asu.ser.capstone.pivi.diagram.edit.parts.InputPortEditPart.VISUAL_ID) {
	result.add(new asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor(childElement, visualID));
	continue;
}
	}
						for (java.util.Iterator<?> it = modelElement.getOutputs().iterator(); it.hasNext();) {
		asu.ser.capstone.pivi.OutputPort childElement = (asu.ser.capstone.pivi.OutputPort) it.next();
					int visualID = asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == asu.ser.capstone.pivi.diagram.edit.parts.OutputPortEditPart.VISUAL_ID) {
	result.add(new asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor(childElement, visualID));
	continue;
}
	}
						for (java.util.Iterator<?> it = modelElement.getStart().iterator(); it.hasNext();) {
		asu.ser.capstone.pivi.StartPort childElement = (asu.ser.capstone.pivi.StartPort) it.next();
					int visualID = asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == asu.ser.capstone.pivi.diagram.edit.parts.StartPortEditPart.VISUAL_ID) {
	result.add(new asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor(childElement, visualID));
	continue;
}
	}
			return result;
	}

	/**
 * @generated
 */
public static java.util.List<asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor> getThreadStartThreadStartFigureCompartment_7010SemanticChildren(org.eclipse.gmf.runtime.notation.View view) {
		if (false == view.eContainer() instanceof org.eclipse.gmf.runtime.notation.View) {
	return java.util.Collections.emptyList();
}
org.eclipse.gmf.runtime.notation.View containerView = (org.eclipse.gmf.runtime.notation.View) view.eContainer();
if (!containerView.isSetElement()) {
	return java.util.Collections.emptyList();
}
asu.ser.capstone.pivi.ThreadStart modelElement = (asu.ser.capstone.pivi.ThreadStart) containerView.getElement();
	java.util.LinkedList<asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor> result = new java.util.LinkedList<asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor>();
						for (java.util.Iterator<?> it = modelElement.getInputs().iterator(); it.hasNext();) {
		asu.ser.capstone.pivi.InputPort childElement = (asu.ser.capstone.pivi.InputPort) it.next();
					int visualID = asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == asu.ser.capstone.pivi.diagram.edit.parts.InputPortEditPart.VISUAL_ID) {
	result.add(new asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor(childElement, visualID));
	continue;
}
	}
						for (java.util.Iterator<?> it = modelElement.getOutputs().iterator(); it.hasNext();) {
		asu.ser.capstone.pivi.OutputPort childElement = (asu.ser.capstone.pivi.OutputPort) it.next();
					int visualID = asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == asu.ser.capstone.pivi.diagram.edit.parts.OutputPortEditPart.VISUAL_ID) {
	result.add(new asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor(childElement, visualID));
	continue;
}
	}
						for (java.util.Iterator<?> it = modelElement.getStart().iterator(); it.hasNext();) {
		asu.ser.capstone.pivi.StartPort childElement = (asu.ser.capstone.pivi.StartPort) it.next();
					int visualID = asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == asu.ser.capstone.pivi.diagram.edit.parts.StartPortEditPart.VISUAL_ID) {
	result.add(new asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor(childElement, visualID));
	continue;
}
	}
			return result;
	}

	/**
 * @generated
 */
public static java.util.List<asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor> getSyncEndSyncEndFigureCompartment_7012SemanticChildren(org.eclipse.gmf.runtime.notation.View view) {
		if (false == view.eContainer() instanceof org.eclipse.gmf.runtime.notation.View) {
	return java.util.Collections.emptyList();
}
org.eclipse.gmf.runtime.notation.View containerView = (org.eclipse.gmf.runtime.notation.View) view.eContainer();
if (!containerView.isSetElement()) {
	return java.util.Collections.emptyList();
}
asu.ser.capstone.pivi.SyncEnd modelElement = (asu.ser.capstone.pivi.SyncEnd) containerView.getElement();
	java.util.LinkedList<asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor> result = new java.util.LinkedList<asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor>();
						for (java.util.Iterator<?> it = modelElement.getInputs().iterator(); it.hasNext();) {
		asu.ser.capstone.pivi.InputPort childElement = (asu.ser.capstone.pivi.InputPort) it.next();
					int visualID = asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == asu.ser.capstone.pivi.diagram.edit.parts.InputPortEditPart.VISUAL_ID) {
	result.add(new asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor(childElement, visualID));
	continue;
}
	}
						for (java.util.Iterator<?> it = modelElement.getOutputs().iterator(); it.hasNext();) {
		asu.ser.capstone.pivi.OutputPort childElement = (asu.ser.capstone.pivi.OutputPort) it.next();
					int visualID = asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == asu.ser.capstone.pivi.diagram.edit.parts.OutputPortEditPart.VISUAL_ID) {
	result.add(new asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor(childElement, visualID));
	continue;
}
	}
						for (java.util.Iterator<?> it = modelElement.getStart().iterator(); it.hasNext();) {
		asu.ser.capstone.pivi.StartPort childElement = (asu.ser.capstone.pivi.StartPort) it.next();
					int visualID = asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == asu.ser.capstone.pivi.diagram.edit.parts.StartPortEditPart.VISUAL_ID) {
	result.add(new asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor(childElement, visualID));
	continue;
}
	}
			return result;
	}

	/**
 * @generated
 */
public static java.util.List<asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor> getSyncStartSyncStartFigureCompartment_7013SemanticChildren(org.eclipse.gmf.runtime.notation.View view) {
		if (false == view.eContainer() instanceof org.eclipse.gmf.runtime.notation.View) {
	return java.util.Collections.emptyList();
}
org.eclipse.gmf.runtime.notation.View containerView = (org.eclipse.gmf.runtime.notation.View) view.eContainer();
if (!containerView.isSetElement()) {
	return java.util.Collections.emptyList();
}
asu.ser.capstone.pivi.SyncStart modelElement = (asu.ser.capstone.pivi.SyncStart) containerView.getElement();
	java.util.LinkedList<asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor> result = new java.util.LinkedList<asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor>();
						for (java.util.Iterator<?> it = modelElement.getInputs().iterator(); it.hasNext();) {
		asu.ser.capstone.pivi.InputPort childElement = (asu.ser.capstone.pivi.InputPort) it.next();
					int visualID = asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == asu.ser.capstone.pivi.diagram.edit.parts.InputPortEditPart.VISUAL_ID) {
	result.add(new asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor(childElement, visualID));
	continue;
}
	}
						for (java.util.Iterator<?> it = modelElement.getOutputs().iterator(); it.hasNext();) {
		asu.ser.capstone.pivi.OutputPort childElement = (asu.ser.capstone.pivi.OutputPort) it.next();
					int visualID = asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == asu.ser.capstone.pivi.diagram.edit.parts.OutputPortEditPart.VISUAL_ID) {
	result.add(new asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor(childElement, visualID));
	continue;
}
	}
						for (java.util.Iterator<?> it = modelElement.getStart().iterator(); it.hasNext();) {
		asu.ser.capstone.pivi.StartPort childElement = (asu.ser.capstone.pivi.StartPort) it.next();
					int visualID = asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == asu.ser.capstone.pivi.diagram.edit.parts.StartPortEditPart.VISUAL_ID) {
	result.add(new asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor(childElement, visualID));
	continue;
}
	}
			return result;
	}
	
		/**
 * @generated
 */
public static java.util.List<asu.ser.capstone.pivi.diagram.part.PiviLinkDescriptor> getContainedLinks(org.eclipse.gmf.runtime.notation.View view) {
		switch (asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getVisualID(view)) {
		case asu.ser.capstone.pivi.diagram.edit.parts.PiviDiagramEditPart.VISUAL_ID:
	return getPiviDiagram_1000ContainedLinks(view);
case asu.ser.capstone.pivi.diagram.edit.parts.IfStartEditPart.VISUAL_ID:
	return getIfStart_2001ContainedLinks(view);
case asu.ser.capstone.pivi.diagram.edit.parts.WhileEndEditPart.VISUAL_ID:
	return getWhileEnd_2002ContainedLinks(view);
case asu.ser.capstone.pivi.diagram.edit.parts.MethodEndEditPart.VISUAL_ID:
	return getMethodEnd_2003ContainedLinks(view);
case asu.ser.capstone.pivi.diagram.edit.parts.IfEndEditPart.VISUAL_ID:
	return getIfEnd_2004ContainedLinks(view);
case asu.ser.capstone.pivi.diagram.edit.parts.InstructionEditPart.VISUAL_ID:
	return getInstruction_2005ContainedLinks(view);
case asu.ser.capstone.pivi.diagram.edit.parts.MethodStartEditPart.VISUAL_ID:
	return getMethodStart_2006ContainedLinks(view);
case asu.ser.capstone.pivi.diagram.edit.parts.WhileStartEditPart.VISUAL_ID:
	return getWhileStart_2007ContainedLinks(view);
case asu.ser.capstone.pivi.diagram.edit.parts.StartEditPart.VISUAL_ID:
	return getStart_2008ContainedLinks(view);
case asu.ser.capstone.pivi.diagram.edit.parts.ThreadEndEditPart.VISUAL_ID:
	return getThreadEnd_2009ContainedLinks(view);
case asu.ser.capstone.pivi.diagram.edit.parts.ThreadStartEditPart.VISUAL_ID:
	return getThreadStart_2010ContainedLinks(view);
case asu.ser.capstone.pivi.diagram.edit.parts.PrintStatementEditPart.VISUAL_ID:
	return getPrintStatement_2011ContainedLinks(view);
case asu.ser.capstone.pivi.diagram.edit.parts.SyncEndEditPart.VISUAL_ID:
	return getSyncEnd_2012ContainedLinks(view);
case asu.ser.capstone.pivi.diagram.edit.parts.SyncStartEditPart.VISUAL_ID:
	return getSyncStart_2013ContainedLinks(view);
case asu.ser.capstone.pivi.diagram.edit.parts.InputPortEditPart.VISUAL_ID:
	return getInputPort_3001ContainedLinks(view);
case asu.ser.capstone.pivi.diagram.edit.parts.StartPortEditPart.VISUAL_ID:
	return getStartPort_3002ContainedLinks(view);
case asu.ser.capstone.pivi.diagram.edit.parts.OutputPortEditPart.VISUAL_ID:
	return getOutputPort_3003ContainedLinks(view);
	}
		return java.util.Collections.emptyList();
}
	
		/**
 * @generated
 */
public static java.util.List<asu.ser.capstone.pivi.diagram.part.PiviLinkDescriptor> getIncomingLinks(org.eclipse.gmf.runtime.notation.View view) {
		switch (asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getVisualID(view)) {
		case asu.ser.capstone.pivi.diagram.edit.parts.IfStartEditPart.VISUAL_ID:
	return getIfStart_2001IncomingLinks(view);
case asu.ser.capstone.pivi.diagram.edit.parts.WhileEndEditPart.VISUAL_ID:
	return getWhileEnd_2002IncomingLinks(view);
case asu.ser.capstone.pivi.diagram.edit.parts.MethodEndEditPart.VISUAL_ID:
	return getMethodEnd_2003IncomingLinks(view);
case asu.ser.capstone.pivi.diagram.edit.parts.IfEndEditPart.VISUAL_ID:
	return getIfEnd_2004IncomingLinks(view);
case asu.ser.capstone.pivi.diagram.edit.parts.InstructionEditPart.VISUAL_ID:
	return getInstruction_2005IncomingLinks(view);
case asu.ser.capstone.pivi.diagram.edit.parts.MethodStartEditPart.VISUAL_ID:
	return getMethodStart_2006IncomingLinks(view);
case asu.ser.capstone.pivi.diagram.edit.parts.WhileStartEditPart.VISUAL_ID:
	return getWhileStart_2007IncomingLinks(view);
case asu.ser.capstone.pivi.diagram.edit.parts.StartEditPart.VISUAL_ID:
	return getStart_2008IncomingLinks(view);
case asu.ser.capstone.pivi.diagram.edit.parts.ThreadEndEditPart.VISUAL_ID:
	return getThreadEnd_2009IncomingLinks(view);
case asu.ser.capstone.pivi.diagram.edit.parts.ThreadStartEditPart.VISUAL_ID:
	return getThreadStart_2010IncomingLinks(view);
case asu.ser.capstone.pivi.diagram.edit.parts.PrintStatementEditPart.VISUAL_ID:
	return getPrintStatement_2011IncomingLinks(view);
case asu.ser.capstone.pivi.diagram.edit.parts.SyncEndEditPart.VISUAL_ID:
	return getSyncEnd_2012IncomingLinks(view);
case asu.ser.capstone.pivi.diagram.edit.parts.SyncStartEditPart.VISUAL_ID:
	return getSyncStart_2013IncomingLinks(view);
case asu.ser.capstone.pivi.diagram.edit.parts.InputPortEditPart.VISUAL_ID:
	return getInputPort_3001IncomingLinks(view);
case asu.ser.capstone.pivi.diagram.edit.parts.StartPortEditPart.VISUAL_ID:
	return getStartPort_3002IncomingLinks(view);
case asu.ser.capstone.pivi.diagram.edit.parts.OutputPortEditPart.VISUAL_ID:
	return getOutputPort_3003IncomingLinks(view);
	}
		return java.util.Collections.emptyList();
}
	
		/**
 * @generated
 */
public static java.util.List<asu.ser.capstone.pivi.diagram.part.PiviLinkDescriptor> getOutgoingLinks(org.eclipse.gmf.runtime.notation.View view) {
		switch (asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getVisualID(view)) {
		case asu.ser.capstone.pivi.diagram.edit.parts.IfStartEditPart.VISUAL_ID:
	return getIfStart_2001OutgoingLinks(view);
case asu.ser.capstone.pivi.diagram.edit.parts.WhileEndEditPart.VISUAL_ID:
	return getWhileEnd_2002OutgoingLinks(view);
case asu.ser.capstone.pivi.diagram.edit.parts.MethodEndEditPart.VISUAL_ID:
	return getMethodEnd_2003OutgoingLinks(view);
case asu.ser.capstone.pivi.diagram.edit.parts.IfEndEditPart.VISUAL_ID:
	return getIfEnd_2004OutgoingLinks(view);
case asu.ser.capstone.pivi.diagram.edit.parts.InstructionEditPart.VISUAL_ID:
	return getInstruction_2005OutgoingLinks(view);
case asu.ser.capstone.pivi.diagram.edit.parts.MethodStartEditPart.VISUAL_ID:
	return getMethodStart_2006OutgoingLinks(view);
case asu.ser.capstone.pivi.diagram.edit.parts.WhileStartEditPart.VISUAL_ID:
	return getWhileStart_2007OutgoingLinks(view);
case asu.ser.capstone.pivi.diagram.edit.parts.StartEditPart.VISUAL_ID:
	return getStart_2008OutgoingLinks(view);
case asu.ser.capstone.pivi.diagram.edit.parts.ThreadEndEditPart.VISUAL_ID:
	return getThreadEnd_2009OutgoingLinks(view);
case asu.ser.capstone.pivi.diagram.edit.parts.ThreadStartEditPart.VISUAL_ID:
	return getThreadStart_2010OutgoingLinks(view);
case asu.ser.capstone.pivi.diagram.edit.parts.PrintStatementEditPart.VISUAL_ID:
	return getPrintStatement_2011OutgoingLinks(view);
case asu.ser.capstone.pivi.diagram.edit.parts.SyncEndEditPart.VISUAL_ID:
	return getSyncEnd_2012OutgoingLinks(view);
case asu.ser.capstone.pivi.diagram.edit.parts.SyncStartEditPart.VISUAL_ID:
	return getSyncStart_2013OutgoingLinks(view);
case asu.ser.capstone.pivi.diagram.edit.parts.InputPortEditPart.VISUAL_ID:
	return getInputPort_3001OutgoingLinks(view);
case asu.ser.capstone.pivi.diagram.edit.parts.StartPortEditPart.VISUAL_ID:
	return getStartPort_3002OutgoingLinks(view);
case asu.ser.capstone.pivi.diagram.edit.parts.OutputPortEditPart.VISUAL_ID:
	return getOutputPort_3003OutgoingLinks(view);
	}
		return java.util.Collections.emptyList();
}
		
/**
 * @generated
 */
public static java.util.List<asu.ser.capstone.pivi.diagram.part.PiviLinkDescriptor> getPiviDiagram_1000ContainedLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<asu.ser.capstone.pivi.diagram.part.PiviLinkDescriptor> getIfStart_2001ContainedLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<asu.ser.capstone.pivi.diagram.part.PiviLinkDescriptor> getWhileEnd_2002ContainedLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<asu.ser.capstone.pivi.diagram.part.PiviLinkDescriptor> getMethodEnd_2003ContainedLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<asu.ser.capstone.pivi.diagram.part.PiviLinkDescriptor> getIfEnd_2004ContainedLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<asu.ser.capstone.pivi.diagram.part.PiviLinkDescriptor> getInstruction_2005ContainedLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<asu.ser.capstone.pivi.diagram.part.PiviLinkDescriptor> getMethodStart_2006ContainedLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<asu.ser.capstone.pivi.diagram.part.PiviLinkDescriptor> getWhileStart_2007ContainedLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<asu.ser.capstone.pivi.diagram.part.PiviLinkDescriptor> getStart_2008ContainedLinks(org.eclipse.gmf.runtime.notation.View view) {
	asu.ser.capstone.pivi.Start modelElement = (asu.ser.capstone.pivi.Start) view.getElement();
		java.util.LinkedList<asu.ser.capstone.pivi.diagram.part.PiviLinkDescriptor> result = new java.util.LinkedList<asu.ser.capstone.pivi.diagram.part.PiviLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Start_StartPort_4004(modelElement));	
	return result;
}
	
/**
 * @generated
 */
public static java.util.List<asu.ser.capstone.pivi.diagram.part.PiviLinkDescriptor> getThreadEnd_2009ContainedLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<asu.ser.capstone.pivi.diagram.part.PiviLinkDescriptor> getThreadStart_2010ContainedLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<asu.ser.capstone.pivi.diagram.part.PiviLinkDescriptor> getPrintStatement_2011ContainedLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<asu.ser.capstone.pivi.diagram.part.PiviLinkDescriptor> getSyncEnd_2012ContainedLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<asu.ser.capstone.pivi.diagram.part.PiviLinkDescriptor> getSyncStart_2013ContainedLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<asu.ser.capstone.pivi.diagram.part.PiviLinkDescriptor> getInputPort_3001ContainedLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<asu.ser.capstone.pivi.diagram.part.PiviLinkDescriptor> getStartPort_3002ContainedLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<asu.ser.capstone.pivi.diagram.part.PiviLinkDescriptor> getOutputPort_3003ContainedLinks(org.eclipse.gmf.runtime.notation.View view) {
	asu.ser.capstone.pivi.OutputPort modelElement = (asu.ser.capstone.pivi.OutputPort) view.getElement();
		java.util.LinkedList<asu.ser.capstone.pivi.diagram.part.PiviLinkDescriptor> result = new java.util.LinkedList<asu.ser.capstone.pivi.diagram.part.PiviLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_OutputPort_InputPort_4002(modelElement));	
	return result;
}
		
/**
 * @generated
 */
public static java.util.List<asu.ser.capstone.pivi.diagram.part.PiviLinkDescriptor> getIfStart_2001IncomingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<asu.ser.capstone.pivi.diagram.part.PiviLinkDescriptor> getWhileEnd_2002IncomingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<asu.ser.capstone.pivi.diagram.part.PiviLinkDescriptor> getMethodEnd_2003IncomingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<asu.ser.capstone.pivi.diagram.part.PiviLinkDescriptor> getIfEnd_2004IncomingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<asu.ser.capstone.pivi.diagram.part.PiviLinkDescriptor> getInstruction_2005IncomingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<asu.ser.capstone.pivi.diagram.part.PiviLinkDescriptor> getMethodStart_2006IncomingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<asu.ser.capstone.pivi.diagram.part.PiviLinkDescriptor> getWhileStart_2007IncomingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<asu.ser.capstone.pivi.diagram.part.PiviLinkDescriptor> getStart_2008IncomingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<asu.ser.capstone.pivi.diagram.part.PiviLinkDescriptor> getThreadEnd_2009IncomingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<asu.ser.capstone.pivi.diagram.part.PiviLinkDescriptor> getThreadStart_2010IncomingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<asu.ser.capstone.pivi.diagram.part.PiviLinkDescriptor> getPrintStatement_2011IncomingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<asu.ser.capstone.pivi.diagram.part.PiviLinkDescriptor> getSyncEnd_2012IncomingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<asu.ser.capstone.pivi.diagram.part.PiviLinkDescriptor> getSyncStart_2013IncomingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<asu.ser.capstone.pivi.diagram.part.PiviLinkDescriptor> getInputPort_3001IncomingLinks(org.eclipse.gmf.runtime.notation.View view) {
	asu.ser.capstone.pivi.InputPort modelElement = (asu.ser.capstone.pivi.InputPort) view.getElement();
	java.util.Map<org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>> crossReferences = org.eclipse.emf.ecore.util.EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		java.util.LinkedList<asu.ser.capstone.pivi.diagram.part.PiviLinkDescriptor> result = new java.util.LinkedList<asu.ser.capstone.pivi.diagram.part.PiviLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_OutputPort_InputPort_4002(modelElement, crossReferences));	
	return result;
}
	
/**
 * @generated
 */
public static java.util.List<asu.ser.capstone.pivi.diagram.part.PiviLinkDescriptor> getStartPort_3002IncomingLinks(org.eclipse.gmf.runtime.notation.View view) {
	asu.ser.capstone.pivi.StartPort modelElement = (asu.ser.capstone.pivi.StartPort) view.getElement();
	java.util.Map<org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>> crossReferences = org.eclipse.emf.ecore.util.EcoreUtil.CrossReferencer.find(view.eResource().getResourceSet().getResources());
		java.util.LinkedList<asu.ser.capstone.pivi.diagram.part.PiviLinkDescriptor> result = new java.util.LinkedList<asu.ser.capstone.pivi.diagram.part.PiviLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Start_StartPort_4004(modelElement, crossReferences));	
	return result;
}
	
/**
 * @generated
 */
public static java.util.List<asu.ser.capstone.pivi.diagram.part.PiviLinkDescriptor> getOutputPort_3003IncomingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
		
/**
 * @generated
 */
public static java.util.List<asu.ser.capstone.pivi.diagram.part.PiviLinkDescriptor> getIfStart_2001OutgoingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<asu.ser.capstone.pivi.diagram.part.PiviLinkDescriptor> getWhileEnd_2002OutgoingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<asu.ser.capstone.pivi.diagram.part.PiviLinkDescriptor> getMethodEnd_2003OutgoingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<asu.ser.capstone.pivi.diagram.part.PiviLinkDescriptor> getIfEnd_2004OutgoingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<asu.ser.capstone.pivi.diagram.part.PiviLinkDescriptor> getInstruction_2005OutgoingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<asu.ser.capstone.pivi.diagram.part.PiviLinkDescriptor> getMethodStart_2006OutgoingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<asu.ser.capstone.pivi.diagram.part.PiviLinkDescriptor> getWhileStart_2007OutgoingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<asu.ser.capstone.pivi.diagram.part.PiviLinkDescriptor> getStart_2008OutgoingLinks(org.eclipse.gmf.runtime.notation.View view) {
	asu.ser.capstone.pivi.Start modelElement = (asu.ser.capstone.pivi.Start) view.getElement();
		java.util.LinkedList<asu.ser.capstone.pivi.diagram.part.PiviLinkDescriptor> result = new java.util.LinkedList<asu.ser.capstone.pivi.diagram.part.PiviLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Start_StartPort_4004(modelElement));	
	return result;
}
	
/**
 * @generated
 */
public static java.util.List<asu.ser.capstone.pivi.diagram.part.PiviLinkDescriptor> getThreadEnd_2009OutgoingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<asu.ser.capstone.pivi.diagram.part.PiviLinkDescriptor> getThreadStart_2010OutgoingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<asu.ser.capstone.pivi.diagram.part.PiviLinkDescriptor> getPrintStatement_2011OutgoingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<asu.ser.capstone.pivi.diagram.part.PiviLinkDescriptor> getSyncEnd_2012OutgoingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<asu.ser.capstone.pivi.diagram.part.PiviLinkDescriptor> getSyncStart_2013OutgoingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<asu.ser.capstone.pivi.diagram.part.PiviLinkDescriptor> getInputPort_3001OutgoingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<asu.ser.capstone.pivi.diagram.part.PiviLinkDescriptor> getStartPort_3002OutgoingLinks(org.eclipse.gmf.runtime.notation.View view) {
	return java.util.Collections.emptyList();
}
	
/**
 * @generated
 */
public static java.util.List<asu.ser.capstone.pivi.diagram.part.PiviLinkDescriptor> getOutputPort_3003OutgoingLinks(org.eclipse.gmf.runtime.notation.View view) {
	asu.ser.capstone.pivi.OutputPort modelElement = (asu.ser.capstone.pivi.OutputPort) view.getElement();
		java.util.LinkedList<asu.ser.capstone.pivi.diagram.part.PiviLinkDescriptor> result = new java.util.LinkedList<asu.ser.capstone.pivi.diagram.part.PiviLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_OutputPort_InputPort_4002(modelElement));	
	return result;
}
		
/**
 * @generated
 */
private static java.util.Collection<asu.ser.capstone.pivi.diagram.part.PiviLinkDescriptor> getIncomingFeatureModelFacetLinks_Start_StartPort_4004(asu.ser.capstone.pivi.StartPort target, java.util.Map<org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>> crossReferences) {
	java.util.LinkedList<asu.ser.capstone.pivi.diagram.part.PiviLinkDescriptor> result = new java.util.LinkedList<asu.ser.capstone.pivi.diagram.part.PiviLinkDescriptor>();
	java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting> settings = crossReferences.get(target);
	for (org.eclipse.emf.ecore.EStructuralFeature.Setting setting : settings) {
		if (setting.getEStructuralFeature() == asu.ser.capstone.pivi.PiviPackage.eINSTANCE.getStart_StartPort()) {
	result.add(new asu.ser.capstone.pivi.diagram.part.PiviLinkDescriptor(setting.getEObject(), target, asu.ser.capstone.pivi.diagram.providers.PiviElementTypes.StartStartPort_4004, asu.ser.capstone.pivi.diagram.edit.parts.StartStartPortEditPart.VISUAL_ID));
}
	}
	return result;	
}

/**
 * @generated
 */
private static java.util.Collection<asu.ser.capstone.pivi.diagram.part.PiviLinkDescriptor> getIncomingFeatureModelFacetLinks_OutputPort_InputPort_4002(asu.ser.capstone.pivi.InputPort target, java.util.Map<org.eclipse.emf.ecore.EObject, java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting>> crossReferences) {
	java.util.LinkedList<asu.ser.capstone.pivi.diagram.part.PiviLinkDescriptor> result = new java.util.LinkedList<asu.ser.capstone.pivi.diagram.part.PiviLinkDescriptor>();
	java.util.Collection<org.eclipse.emf.ecore.EStructuralFeature.Setting> settings = crossReferences.get(target);
	for (org.eclipse.emf.ecore.EStructuralFeature.Setting setting : settings) {
		if (setting.getEStructuralFeature() == asu.ser.capstone.pivi.PiviPackage.eINSTANCE.getOutputPort_InputPort()) {
	result.add(new asu.ser.capstone.pivi.diagram.part.PiviLinkDescriptor(setting.getEObject(), target, asu.ser.capstone.pivi.diagram.providers.PiviElementTypes.OutputPortInputPort_4002, asu.ser.capstone.pivi.diagram.edit.parts.OutputPortInputPortEditPart.VISUAL_ID));
}
	}
	return result;	
}
		
	/**
 * @generated
 */
private static java.util.Collection<asu.ser.capstone.pivi.diagram.part.PiviLinkDescriptor> getOutgoingFeatureModelFacetLinks_Start_StartPort_4004(asu.ser.capstone.pivi.Start source) {
	java.util.LinkedList<asu.ser.capstone.pivi.diagram.part.PiviLinkDescriptor> result = new java.util.LinkedList<asu.ser.capstone.pivi.diagram.part.PiviLinkDescriptor>();
		for (java.util.Iterator<?> destinations = source.getStartPort().iterator(); destinations.hasNext();) {
		asu.ser.capstone.pivi.StartPort destination = (asu.ser.capstone.pivi.StartPort) destinations.next();
		result.add(new asu.ser.capstone.pivi.diagram.part.PiviLinkDescriptor(source, destination, asu.ser.capstone.pivi.diagram.providers.PiviElementTypes.StartStartPort_4004, asu.ser.capstone.pivi.diagram.edit.parts.StartStartPortEditPart.VISUAL_ID));
		}
		return result;
}
	
	/**
 * @generated
 */
private static java.util.Collection<asu.ser.capstone.pivi.diagram.part.PiviLinkDescriptor> getOutgoingFeatureModelFacetLinks_OutputPort_InputPort_4002(asu.ser.capstone.pivi.OutputPort source) {
	java.util.LinkedList<asu.ser.capstone.pivi.diagram.part.PiviLinkDescriptor> result = new java.util.LinkedList<asu.ser.capstone.pivi.diagram.part.PiviLinkDescriptor>();
		asu.ser.capstone.pivi.InputPort destination = source.getInputPort();
	if (destination == null) {
		return result;
	}
		result.add(new asu.ser.capstone.pivi.diagram.part.PiviLinkDescriptor(source, destination, asu.ser.capstone.pivi.diagram.providers.PiviElementTypes.OutputPortInputPort_4002, asu.ser.capstone.pivi.diagram.edit.parts.OutputPortInputPortEditPart.VISUAL_ID));
		return result;
}
	
					/**
 * @generated
 */
	public static final org.eclipse.gmf.tooling.runtime.update.DiagramUpdater TYPED_INSTANCE = new org.eclipse.gmf.tooling.runtime.update.DiagramUpdater() {
				/**
 * @generated
 */
		@Override

		public java.util.List<asu.ser.capstone.pivi.diagram.part.PiviNodeDescriptor> getSemanticChildren(org.eclipse.gmf.runtime.notation.View view) {
			return PiviDiagramUpdater.getSemanticChildren(view);
		}

		/**
 * @generated
 */
		@Override

		public java.util.List<asu.ser.capstone.pivi.diagram.part.PiviLinkDescriptor> getContainedLinks(org.eclipse.gmf.runtime.notation.View view) {
			return PiviDiagramUpdater.getContainedLinks(view);
		}

		/**
 * @generated
 */
		@Override

		public java.util.List<asu.ser.capstone.pivi.diagram.part.PiviLinkDescriptor> getIncomingLinks(org.eclipse.gmf.runtime.notation.View view) {
			return PiviDiagramUpdater.getIncomingLinks(view);
		}

		/**
 * @generated
 */
		@Override

		public java.util.List<asu.ser.capstone.pivi.diagram.part.PiviLinkDescriptor> getOutgoingLinks(org.eclipse.gmf.runtime.notation.View view) {
			return PiviDiagramUpdater.getOutgoingLinks(view);
		}
	}; 
			
	}
