package asu.ser.capstone.pivi.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import asu.ser.capstone.pivi.IfEnd;
import asu.ser.capstone.pivi.IfStart;
import asu.ser.capstone.pivi.InputPort;
import asu.ser.capstone.pivi.Instruction;
import asu.ser.capstone.pivi.MethodEnd;
import asu.ser.capstone.pivi.MethodStart;
import asu.ser.capstone.pivi.OutputPort;
import asu.ser.capstone.pivi.PiviDiagram;
import asu.ser.capstone.pivi.PiviPackage;
import asu.ser.capstone.pivi.Start;
import asu.ser.capstone.pivi.StartPort;
import asu.ser.capstone.pivi.Statement;
import asu.ser.capstone.pivi.WhileEnd;
import asu.ser.capstone.pivi.WhileStart;
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
import asu.ser.capstone.pivi.diagram.edit.parts.OutputPortInputPortEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.PiviDiagramEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.StartEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.StartPortEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.StartStartPortEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.WhileEndEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.WhileEndWhileEndFigureCompartmentEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.WhileStartEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.WhileStartWhileStartFigureCompartmentEditPart;
import asu.ser.capstone.pivi.diagram.providers.PiviElementTypes;

/**
 * @generated
 */
public class PiviDiagramUpdater {

	/**
	* @generated
	*/
	public static List<PiviNodeDescriptor> getSemanticChildren(View view) {
		switch (PiviVisualIDRegistry.getVisualID(view)) {
		case PiviDiagramEditPart.VISUAL_ID:
			return getPiviDiagram_1000SemanticChildren(view);
		case IfStartIfStartFigureCompartmentEditPart.VISUAL_ID:
			return getIfStartIfStartFigureCompartment_7001SemanticChildren(view);
		case WhileEndWhileEndFigureCompartmentEditPart.VISUAL_ID:
			return getWhileEndWhileEndFigureCompartment_7002SemanticChildren(view);
		case MethodEndMethodEndFigureCompartmentEditPart.VISUAL_ID:
			return getMethodEndMethodEndFigureCompartment_7003SemanticChildren(view);
		case IfEndIfEndFigureCompartmentEditPart.VISUAL_ID:
			return getIfEndIfEndFigureCompartment_7004SemanticChildren(view);
		case InstructionInstructionFigureCompartmentEditPart.VISUAL_ID:
			return getInstructionInstructionFigureCompartment_7005SemanticChildren(view);
		case MethodStartMethodStartFigureCompartmentEditPart.VISUAL_ID:
			return getMethodStartMethodStartFigureCompartment_7007SemanticChildren(view);
		case WhileStartWhileStartFigureCompartmentEditPart.VISUAL_ID:
			return getWhileStartWhileStartFigureCompartment_7008SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PiviNodeDescriptor> getPiviDiagram_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		PiviDiagram modelElement = (PiviDiagram) view.getElement();
		LinkedList<PiviNodeDescriptor> result = new LinkedList<PiviNodeDescriptor>();
		for (Iterator<?> it = modelElement.getStatements().iterator(); it.hasNext();) {
			Statement childElement = (Statement) it.next();
			int visualID = PiviVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == IfStartEditPart.VISUAL_ID) {
				result.add(new PiviNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == WhileEndEditPart.VISUAL_ID) {
				result.add(new PiviNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MethodEndEditPart.VISUAL_ID) {
				result.add(new PiviNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == IfEndEditPart.VISUAL_ID) {
				result.add(new PiviNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InstructionEditPart.VISUAL_ID) {
				result.add(new PiviNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MethodStartEditPart.VISUAL_ID) {
				result.add(new PiviNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == WhileStartEditPart.VISUAL_ID) {
				result.add(new PiviNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			Start childElement = modelElement.getStart();
			int visualID = PiviVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == StartEditPart.VISUAL_ID) {
				result.add(new PiviNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PiviNodeDescriptor> getIfStartIfStartFigureCompartment_7001SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		IfStart modelElement = (IfStart) containerView.getElement();
		LinkedList<PiviNodeDescriptor> result = new LinkedList<PiviNodeDescriptor>();
		for (Iterator<?> it = modelElement.getInputs().iterator(); it.hasNext();) {
			InputPort childElement = (InputPort) it.next();
			int visualID = PiviVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == InputPortEditPart.VISUAL_ID) {
				result.add(new PiviNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getStart().iterator(); it.hasNext();) {
			StartPort childElement = (StartPort) it.next();
			int visualID = PiviVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == StartPortEditPart.VISUAL_ID) {
				result.add(new PiviNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getOutputs().iterator(); it.hasNext();) {
			OutputPort childElement = (OutputPort) it.next();
			int visualID = PiviVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == OutputPortEditPart.VISUAL_ID) {
				result.add(new PiviNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PiviNodeDescriptor> getWhileEndWhileEndFigureCompartment_7002SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		WhileEnd modelElement = (WhileEnd) containerView.getElement();
		LinkedList<PiviNodeDescriptor> result = new LinkedList<PiviNodeDescriptor>();
		for (Iterator<?> it = modelElement.getInputs().iterator(); it.hasNext();) {
			InputPort childElement = (InputPort) it.next();
			int visualID = PiviVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == InputPortEditPart.VISUAL_ID) {
				result.add(new PiviNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getOutputs().iterator(); it.hasNext();) {
			OutputPort childElement = (OutputPort) it.next();
			int visualID = PiviVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == OutputPortEditPart.VISUAL_ID) {
				result.add(new PiviNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getStart().iterator(); it.hasNext();) {
			StartPort childElement = (StartPort) it.next();
			int visualID = PiviVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == StartPortEditPart.VISUAL_ID) {
				result.add(new PiviNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PiviNodeDescriptor> getMethodEndMethodEndFigureCompartment_7003SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		MethodEnd modelElement = (MethodEnd) containerView.getElement();
		LinkedList<PiviNodeDescriptor> result = new LinkedList<PiviNodeDescriptor>();
		for (Iterator<?> it = modelElement.getInputs().iterator(); it.hasNext();) {
			InputPort childElement = (InputPort) it.next();
			int visualID = PiviVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == InputPortEditPart.VISUAL_ID) {
				result.add(new PiviNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getStart().iterator(); it.hasNext();) {
			StartPort childElement = (StartPort) it.next();
			int visualID = PiviVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == StartPortEditPart.VISUAL_ID) {
				result.add(new PiviNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getOutputs().iterator(); it.hasNext();) {
			OutputPort childElement = (OutputPort) it.next();
			int visualID = PiviVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == OutputPortEditPart.VISUAL_ID) {
				result.add(new PiviNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PiviNodeDescriptor> getIfEndIfEndFigureCompartment_7004SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		IfEnd modelElement = (IfEnd) containerView.getElement();
		LinkedList<PiviNodeDescriptor> result = new LinkedList<PiviNodeDescriptor>();
		for (Iterator<?> it = modelElement.getInputs().iterator(); it.hasNext();) {
			InputPort childElement = (InputPort) it.next();
			int visualID = PiviVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == InputPortEditPart.VISUAL_ID) {
				result.add(new PiviNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getOutputs().iterator(); it.hasNext();) {
			OutputPort childElement = (OutputPort) it.next();
			int visualID = PiviVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == OutputPortEditPart.VISUAL_ID) {
				result.add(new PiviNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getStart().iterator(); it.hasNext();) {
			StartPort childElement = (StartPort) it.next();
			int visualID = PiviVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == StartPortEditPart.VISUAL_ID) {
				result.add(new PiviNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PiviNodeDescriptor> getInstructionInstructionFigureCompartment_7005SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Instruction modelElement = (Instruction) containerView.getElement();
		LinkedList<PiviNodeDescriptor> result = new LinkedList<PiviNodeDescriptor>();
		for (Iterator<?> it = modelElement.getInputs().iterator(); it.hasNext();) {
			InputPort childElement = (InputPort) it.next();
			int visualID = PiviVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == InputPortEditPart.VISUAL_ID) {
				result.add(new PiviNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getStart().iterator(); it.hasNext();) {
			StartPort childElement = (StartPort) it.next();
			int visualID = PiviVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == StartPortEditPart.VISUAL_ID) {
				result.add(new PiviNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getOutputs().iterator(); it.hasNext();) {
			OutputPort childElement = (OutputPort) it.next();
			int visualID = PiviVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == OutputPortEditPart.VISUAL_ID) {
				result.add(new PiviNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PiviNodeDescriptor> getMethodStartMethodStartFigureCompartment_7007SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		MethodStart modelElement = (MethodStart) containerView.getElement();
		LinkedList<PiviNodeDescriptor> result = new LinkedList<PiviNodeDescriptor>();
		for (Iterator<?> it = modelElement.getInputs().iterator(); it.hasNext();) {
			InputPort childElement = (InputPort) it.next();
			int visualID = PiviVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == InputPortEditPart.VISUAL_ID) {
				result.add(new PiviNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getOutputs().iterator(); it.hasNext();) {
			OutputPort childElement = (OutputPort) it.next();
			int visualID = PiviVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == OutputPortEditPart.VISUAL_ID) {
				result.add(new PiviNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getStart().iterator(); it.hasNext();) {
			StartPort childElement = (StartPort) it.next();
			int visualID = PiviVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == StartPortEditPart.VISUAL_ID) {
				result.add(new PiviNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PiviNodeDescriptor> getWhileStartWhileStartFigureCompartment_7008SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		WhileStart modelElement = (WhileStart) containerView.getElement();
		LinkedList<PiviNodeDescriptor> result = new LinkedList<PiviNodeDescriptor>();
		for (Iterator<?> it = modelElement.getInputs().iterator(); it.hasNext();) {
			InputPort childElement = (InputPort) it.next();
			int visualID = PiviVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == InputPortEditPart.VISUAL_ID) {
				result.add(new PiviNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getOutputs().iterator(); it.hasNext();) {
			OutputPort childElement = (OutputPort) it.next();
			int visualID = PiviVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == OutputPortEditPart.VISUAL_ID) {
				result.add(new PiviNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getStart().iterator(); it.hasNext();) {
			StartPort childElement = (StartPort) it.next();
			int visualID = PiviVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == StartPortEditPart.VISUAL_ID) {
				result.add(new PiviNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PiviLinkDescriptor> getContainedLinks(View view) {
		switch (PiviVisualIDRegistry.getVisualID(view)) {
		case PiviDiagramEditPart.VISUAL_ID:
			return getPiviDiagram_1000ContainedLinks(view);
		case IfStartEditPart.VISUAL_ID:
			return getIfStart_2001ContainedLinks(view);
		case WhileEndEditPart.VISUAL_ID:
			return getWhileEnd_2002ContainedLinks(view);
		case MethodEndEditPart.VISUAL_ID:
			return getMethodEnd_2003ContainedLinks(view);
		case IfEndEditPart.VISUAL_ID:
			return getIfEnd_2004ContainedLinks(view);
		case InstructionEditPart.VISUAL_ID:
			return getInstruction_2005ContainedLinks(view);
		case MethodStartEditPart.VISUAL_ID:
			return getMethodStart_2006ContainedLinks(view);
		case WhileStartEditPart.VISUAL_ID:
			return getWhileStart_2007ContainedLinks(view);
		case StartEditPart.VISUAL_ID:
			return getStart_2008ContainedLinks(view);
		case InputPortEditPart.VISUAL_ID:
			return getInputPort_3001ContainedLinks(view);
		case StartPortEditPart.VISUAL_ID:
			return getStartPort_3002ContainedLinks(view);
		case OutputPortEditPart.VISUAL_ID:
			return getOutputPort_3003ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PiviLinkDescriptor> getIncomingLinks(View view) {
		switch (PiviVisualIDRegistry.getVisualID(view)) {
		case IfStartEditPart.VISUAL_ID:
			return getIfStart_2001IncomingLinks(view);
		case WhileEndEditPart.VISUAL_ID:
			return getWhileEnd_2002IncomingLinks(view);
		case MethodEndEditPart.VISUAL_ID:
			return getMethodEnd_2003IncomingLinks(view);
		case IfEndEditPart.VISUAL_ID:
			return getIfEnd_2004IncomingLinks(view);
		case InstructionEditPart.VISUAL_ID:
			return getInstruction_2005IncomingLinks(view);
		case MethodStartEditPart.VISUAL_ID:
			return getMethodStart_2006IncomingLinks(view);
		case WhileStartEditPart.VISUAL_ID:
			return getWhileStart_2007IncomingLinks(view);
		case StartEditPart.VISUAL_ID:
			return getStart_2008IncomingLinks(view);
		case InputPortEditPart.VISUAL_ID:
			return getInputPort_3001IncomingLinks(view);
		case StartPortEditPart.VISUAL_ID:
			return getStartPort_3002IncomingLinks(view);
		case OutputPortEditPart.VISUAL_ID:
			return getOutputPort_3003IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PiviLinkDescriptor> getOutgoingLinks(View view) {
		switch (PiviVisualIDRegistry.getVisualID(view)) {
		case IfStartEditPart.VISUAL_ID:
			return getIfStart_2001OutgoingLinks(view);
		case WhileEndEditPart.VISUAL_ID:
			return getWhileEnd_2002OutgoingLinks(view);
		case MethodEndEditPart.VISUAL_ID:
			return getMethodEnd_2003OutgoingLinks(view);
		case IfEndEditPart.VISUAL_ID:
			return getIfEnd_2004OutgoingLinks(view);
		case InstructionEditPart.VISUAL_ID:
			return getInstruction_2005OutgoingLinks(view);
		case MethodStartEditPart.VISUAL_ID:
			return getMethodStart_2006OutgoingLinks(view);
		case WhileStartEditPart.VISUAL_ID:
			return getWhileStart_2007OutgoingLinks(view);
		case StartEditPart.VISUAL_ID:
			return getStart_2008OutgoingLinks(view);
		case InputPortEditPart.VISUAL_ID:
			return getInputPort_3001OutgoingLinks(view);
		case StartPortEditPart.VISUAL_ID:
			return getStartPort_3002OutgoingLinks(view);
		case OutputPortEditPart.VISUAL_ID:
			return getOutputPort_3003OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getPiviDiagram_1000ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getIfStart_2001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getWhileEnd_2002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getMethodEnd_2003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getIfEnd_2004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getInstruction_2005ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getMethodStart_2006ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getWhileStart_2007ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getStart_2008ContainedLinks(View view) {
		Start modelElement = (Start) view.getElement();
		LinkedList<PiviLinkDescriptor> result = new LinkedList<PiviLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Start_StartPort_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getInputPort_3001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getStartPort_3002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getOutputPort_3003ContainedLinks(View view) {
		OutputPort modelElement = (OutputPort) view.getElement();
		LinkedList<PiviLinkDescriptor> result = new LinkedList<PiviLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_OutputPort_InputPort_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getIfStart_2001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getWhileEnd_2002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getMethodEnd_2003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getIfEnd_2004IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getInstruction_2005IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getMethodStart_2006IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getWhileStart_2007IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getStart_2008IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getInputPort_3001IncomingLinks(View view) {
		InputPort modelElement = (InputPort) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PiviLinkDescriptor> result = new LinkedList<PiviLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_OutputPort_InputPort_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getStartPort_3002IncomingLinks(View view) {
		StartPort modelElement = (StartPort) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PiviLinkDescriptor> result = new LinkedList<PiviLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Start_StartPort_4004(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getOutputPort_3003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getIfStart_2001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getWhileEnd_2002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getMethodEnd_2003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getIfEnd_2004OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getInstruction_2005OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getMethodStart_2006OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getWhileStart_2007OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getStart_2008OutgoingLinks(View view) {
		Start modelElement = (Start) view.getElement();
		LinkedList<PiviLinkDescriptor> result = new LinkedList<PiviLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Start_StartPort_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getInputPort_3001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getStartPort_3002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PiviLinkDescriptor> getOutputPort_3003OutgoingLinks(View view) {
		OutputPort modelElement = (OutputPort) view.getElement();
		LinkedList<PiviLinkDescriptor> result = new LinkedList<PiviLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_OutputPort_InputPort_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<PiviLinkDescriptor> getIncomingFeatureModelFacetLinks_Start_StartPort_4004(
			StartPort target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<PiviLinkDescriptor> result = new LinkedList<PiviLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == PiviPackage.eINSTANCE.getStart_StartPort()) {
				result.add(new PiviLinkDescriptor(setting.getEObject(), target, PiviElementTypes.StartStartPort_4004,
						StartStartPortEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<PiviLinkDescriptor> getIncomingFeatureModelFacetLinks_OutputPort_InputPort_4002(
			InputPort target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<PiviLinkDescriptor> result = new LinkedList<PiviLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == PiviPackage.eINSTANCE.getOutputPort_InputPort()) {
				result.add(new PiviLinkDescriptor(setting.getEObject(), target,
						PiviElementTypes.OutputPortInputPort_4002, OutputPortInputPortEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<PiviLinkDescriptor> getOutgoingFeatureModelFacetLinks_Start_StartPort_4004(Start source) {
		LinkedList<PiviLinkDescriptor> result = new LinkedList<PiviLinkDescriptor>();
		for (Iterator<?> destinations = source.getStartPort().iterator(); destinations.hasNext();) {
			StartPort destination = (StartPort) destinations.next();
			result.add(new PiviLinkDescriptor(source, destination, PiviElementTypes.StartStartPort_4004,
					StartStartPortEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<PiviLinkDescriptor> getOutgoingFeatureModelFacetLinks_OutputPort_InputPort_4002(
			OutputPort source) {
		LinkedList<PiviLinkDescriptor> result = new LinkedList<PiviLinkDescriptor>();
		InputPort destination = source.getInputPort();
		if (destination == null) {
			return result;
		}
		result.add(new PiviLinkDescriptor(source, destination, PiviElementTypes.OutputPortInputPort_4002,
				OutputPortInputPortEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<PiviNodeDescriptor> getSemanticChildren(View view) {
			return PiviDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<PiviLinkDescriptor> getContainedLinks(View view) {
			return PiviDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<PiviLinkDescriptor> getIncomingLinks(View view) {
			return PiviDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<PiviLinkDescriptor> getOutgoingLinks(View view) {
			return PiviDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
