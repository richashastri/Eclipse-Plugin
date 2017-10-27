package PiViMM.diagram.part;

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

/**
 * @generated
 */
public class PiViDiagramUpdater {

	/**
	* @generated
	*/
	public static List<PiViMM.diagram.part.PiViNodeDescriptor> getSemanticChildren(View view) {
		switch (PiViMM.diagram.part.PiViVisualIDRegistry.getVisualID(view)) {
		case PiViMM.diagram.edit.parts.IconsEditPart.VISUAL_ID:
			return getIcons_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PiViMM.diagram.part.PiViNodeDescriptor> getIcons_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		PiViMM.Icons modelElement = (PiViMM.Icons) view.getElement();
		LinkedList<PiViMM.diagram.part.PiViNodeDescriptor> result = new LinkedList<PiViMM.diagram.part.PiViNodeDescriptor>();
		for (Iterator<?> it = modelElement.getCodeblocks().iterator(); it.hasNext();) {
			PiViMM.CodeBlock childElement = (PiViMM.CodeBlock) it.next();
			int visualID = PiViMM.diagram.part.PiViVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PiViMM.diagram.edit.parts.CodeBlockEditPart.VISUAL_ID) {
				result.add(new PiViMM.diagram.part.PiViNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PiViMM.diagram.part.PiViLinkDescriptor> getContainedLinks(View view) {
		switch (PiViMM.diagram.part.PiViVisualIDRegistry.getVisualID(view)) {
		case PiViMM.diagram.edit.parts.IconsEditPart.VISUAL_ID:
			return getIcons_1000ContainedLinks(view);
		case PiViMM.diagram.edit.parts.CodeBlockEditPart.VISUAL_ID:
			return getCodeBlock_2001ContainedLinks(view);
		case PiViMM.diagram.edit.parts.ConnectorEditPart.VISUAL_ID:
			return getConnector_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PiViMM.diagram.part.PiViLinkDescriptor> getIncomingLinks(View view) {
		switch (PiViMM.diagram.part.PiViVisualIDRegistry.getVisualID(view)) {
		case PiViMM.diagram.edit.parts.CodeBlockEditPart.VISUAL_ID:
			return getCodeBlock_2001IncomingLinks(view);
		case PiViMM.diagram.edit.parts.ConnectorEditPart.VISUAL_ID:
			return getConnector_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PiViMM.diagram.part.PiViLinkDescriptor> getOutgoingLinks(View view) {
		switch (PiViMM.diagram.part.PiViVisualIDRegistry.getVisualID(view)) {
		case PiViMM.diagram.edit.parts.CodeBlockEditPart.VISUAL_ID:
			return getCodeBlock_2001OutgoingLinks(view);
		case PiViMM.diagram.edit.parts.ConnectorEditPart.VISUAL_ID:
			return getConnector_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PiViMM.diagram.part.PiViLinkDescriptor> getIcons_1000ContainedLinks(View view) {
		PiViMM.Icons modelElement = (PiViMM.Icons) view.getElement();
		LinkedList<PiViMM.diagram.part.PiViLinkDescriptor> result = new LinkedList<PiViMM.diagram.part.PiViLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Connector_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PiViMM.diagram.part.PiViLinkDescriptor> getCodeBlock_2001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PiViMM.diagram.part.PiViLinkDescriptor> getConnector_4001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PiViMM.diagram.part.PiViLinkDescriptor> getCodeBlock_2001IncomingLinks(View view) {
		PiViMM.CodeBlock modelElement = (PiViMM.CodeBlock) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PiViMM.diagram.part.PiViLinkDescriptor> result = new LinkedList<PiViMM.diagram.part.PiViLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Connector_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PiViMM.diagram.part.PiViLinkDescriptor> getConnector_4001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PiViMM.diagram.part.PiViLinkDescriptor> getCodeBlock_2001OutgoingLinks(View view) {
		PiViMM.CodeBlock modelElement = (PiViMM.CodeBlock) view.getElement();
		LinkedList<PiViMM.diagram.part.PiViLinkDescriptor> result = new LinkedList<PiViMM.diagram.part.PiViLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Connector_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PiViMM.diagram.part.PiViLinkDescriptor> getConnector_4001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	private static Collection<PiViMM.diagram.part.PiViLinkDescriptor> getContainedTypeModelFacetLinks_Connector_4001(
			PiViMM.Icons container) {
		LinkedList<PiViMM.diagram.part.PiViLinkDescriptor> result = new LinkedList<PiViMM.diagram.part.PiViLinkDescriptor>();
		for (Iterator<?> links = container.getCodeconnections().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof PiViMM.Connector) {
				continue;
			}
			PiViMM.Connector link = (PiViMM.Connector) linkObject;
			if (PiViMM.diagram.edit.parts.ConnectorEditPart.VISUAL_ID != PiViMM.diagram.part.PiViVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			PiViMM.CodeBlock dst = link.getTarget();
			PiViMM.CodeBlock src = link.getSource();
			result.add(new PiViMM.diagram.part.PiViLinkDescriptor(src, dst, link,
					PiViMM.diagram.providers.PiViElementTypes.Connector_4001,
					PiViMM.diagram.edit.parts.ConnectorEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<PiViMM.diagram.part.PiViLinkDescriptor> getIncomingTypeModelFacetLinks_Connector_4001(
			PiViMM.CodeBlock target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<PiViMM.diagram.part.PiViLinkDescriptor> result = new LinkedList<PiViMM.diagram.part.PiViLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != PiViMM.PiViMMPackage.eINSTANCE.getConnector_Target()
					|| false == setting.getEObject() instanceof PiViMM.Connector) {
				continue;
			}
			PiViMM.Connector link = (PiViMM.Connector) setting.getEObject();
			if (PiViMM.diagram.edit.parts.ConnectorEditPart.VISUAL_ID != PiViMM.diagram.part.PiViVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			PiViMM.CodeBlock src = link.getSource();
			result.add(new PiViMM.diagram.part.PiViLinkDescriptor(src, target, link,
					PiViMM.diagram.providers.PiViElementTypes.Connector_4001,
					PiViMM.diagram.edit.parts.ConnectorEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<PiViMM.diagram.part.PiViLinkDescriptor> getOutgoingTypeModelFacetLinks_Connector_4001(
			PiViMM.CodeBlock source) {
		PiViMM.Icons container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof PiViMM.Icons) {
				container = (PiViMM.Icons) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<PiViMM.diagram.part.PiViLinkDescriptor> result = new LinkedList<PiViMM.diagram.part.PiViLinkDescriptor>();
		for (Iterator<?> links = container.getCodeconnections().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof PiViMM.Connector) {
				continue;
			}
			PiViMM.Connector link = (PiViMM.Connector) linkObject;
			if (PiViMM.diagram.edit.parts.ConnectorEditPart.VISUAL_ID != PiViMM.diagram.part.PiViVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			PiViMM.CodeBlock dst = link.getTarget();
			PiViMM.CodeBlock src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new PiViMM.diagram.part.PiViLinkDescriptor(src, dst, link,
					PiViMM.diagram.providers.PiViElementTypes.Connector_4001,
					PiViMM.diagram.edit.parts.ConnectorEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/

		public List<PiViMM.diagram.part.PiViNodeDescriptor> getSemanticChildren(View view) {
			return PiViDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/

		public List<PiViMM.diagram.part.PiViLinkDescriptor> getContainedLinks(View view) {
			return PiViDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/

		public List<PiViMM.diagram.part.PiViLinkDescriptor> getIncomingLinks(View view) {
			return PiViDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/

		public List<PiViMM.diagram.part.PiViLinkDescriptor> getOutgoingLinks(View view) {
			return PiViDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
