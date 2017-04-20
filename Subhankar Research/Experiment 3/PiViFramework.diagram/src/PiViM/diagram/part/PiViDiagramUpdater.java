package PiViM.diagram.part;

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
	public static List<PiViM.diagram.part.PiViNodeDescriptor> getSemanticChildren(View view) {
		switch (PiViM.diagram.part.PiViVisualIDRegistry.getVisualID(view)) {
		case PiViM.diagram.edit.parts.IconsEditPart.VISUAL_ID:
			return getIcons_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PiViM.diagram.part.PiViNodeDescriptor> getIcons_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		PiViM.Icons modelElement = (PiViM.Icons) view.getElement();
		LinkedList<PiViM.diagram.part.PiViNodeDescriptor> result = new LinkedList<PiViM.diagram.part.PiViNodeDescriptor>();
		for (Iterator<?> it = modelElement.getCodeblocks().iterator(); it.hasNext();) {
			PiViM.CodeBlock childElement = (PiViM.CodeBlock) it.next();
			int visualID = PiViM.diagram.part.PiViVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == PiViM.diagram.edit.parts.CodeBlockEditPart.VISUAL_ID) {
				result.add(new PiViM.diagram.part.PiViNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<PiViM.diagram.part.PiViLinkDescriptor> getContainedLinks(View view) {
		switch (PiViM.diagram.part.PiViVisualIDRegistry.getVisualID(view)) {
		case PiViM.diagram.edit.parts.IconsEditPart.VISUAL_ID:
			return getIcons_1000ContainedLinks(view);
		case PiViM.diagram.edit.parts.CodeBlockEditPart.VISUAL_ID:
			return getCodeBlock_2001ContainedLinks(view);
		case PiViM.diagram.edit.parts.ConnectorEditPart.VISUAL_ID:
			return getConnector_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PiViM.diagram.part.PiViLinkDescriptor> getIncomingLinks(View view) {
		switch (PiViM.diagram.part.PiViVisualIDRegistry.getVisualID(view)) {
		case PiViM.diagram.edit.parts.CodeBlockEditPart.VISUAL_ID:
			return getCodeBlock_2001IncomingLinks(view);
		case PiViM.diagram.edit.parts.ConnectorEditPart.VISUAL_ID:
			return getConnector_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<PiViM.diagram.part.PiViLinkDescriptor> getOutgoingLinks(View view) {
		switch (PiViM.diagram.part.PiViVisualIDRegistry.getVisualID(view)) {
		case PiViM.diagram.edit.parts.CodeBlockEditPart.VISUAL_ID:
			return getCodeBlock_2001OutgoingLinks(view);
		case PiViM.diagram.edit.parts.ConnectorEditPart.VISUAL_ID:
			return getConnector_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PiViM.diagram.part.PiViLinkDescriptor> getIcons_1000ContainedLinks(View view) {
		PiViM.Icons modelElement = (PiViM.Icons) view.getElement();
		LinkedList<PiViM.diagram.part.PiViLinkDescriptor> result = new LinkedList<PiViM.diagram.part.PiViLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Connector_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PiViM.diagram.part.PiViLinkDescriptor> getCodeBlock_2001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PiViM.diagram.part.PiViLinkDescriptor> getConnector_4001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PiViM.diagram.part.PiViLinkDescriptor> getCodeBlock_2001IncomingLinks(View view) {
		PiViM.CodeBlock modelElement = (PiViM.CodeBlock) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<PiViM.diagram.part.PiViLinkDescriptor> result = new LinkedList<PiViM.diagram.part.PiViLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Connector_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PiViM.diagram.part.PiViLinkDescriptor> getConnector_4001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<PiViM.diagram.part.PiViLinkDescriptor> getCodeBlock_2001OutgoingLinks(View view) {
		PiViM.CodeBlock modelElement = (PiViM.CodeBlock) view.getElement();
		LinkedList<PiViM.diagram.part.PiViLinkDescriptor> result = new LinkedList<PiViM.diagram.part.PiViLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Connector_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<PiViM.diagram.part.PiViLinkDescriptor> getConnector_4001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	private static Collection<PiViM.diagram.part.PiViLinkDescriptor> getContainedTypeModelFacetLinks_Connector_4001(
			PiViM.Icons container) {
		LinkedList<PiViM.diagram.part.PiViLinkDescriptor> result = new LinkedList<PiViM.diagram.part.PiViLinkDescriptor>();
		for (Iterator<?> links = container.getConnectors().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof PiViM.Connector) {
				continue;
			}
			PiViM.Connector link = (PiViM.Connector) linkObject;
			if (PiViM.diagram.edit.parts.ConnectorEditPart.VISUAL_ID != PiViM.diagram.part.PiViVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			PiViM.CodeBlock dst = link.getTarget();
			PiViM.CodeBlock src = link.getSource();
			result.add(new PiViM.diagram.part.PiViLinkDescriptor(src, dst, link,
					PiViM.diagram.providers.PiViElementTypes.Connector_4001,
					PiViM.diagram.edit.parts.ConnectorEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<PiViM.diagram.part.PiViLinkDescriptor> getIncomingTypeModelFacetLinks_Connector_4001(
			PiViM.CodeBlock target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<PiViM.diagram.part.PiViLinkDescriptor> result = new LinkedList<PiViM.diagram.part.PiViLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != PiViM.PiViMPackage.eINSTANCE.getConnector_Target()
					|| false == setting.getEObject() instanceof PiViM.Connector) {
				continue;
			}
			PiViM.Connector link = (PiViM.Connector) setting.getEObject();
			if (PiViM.diagram.edit.parts.ConnectorEditPart.VISUAL_ID != PiViM.diagram.part.PiViVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			PiViM.CodeBlock src = link.getSource();
			result.add(new PiViM.diagram.part.PiViLinkDescriptor(src, target, link,
					PiViM.diagram.providers.PiViElementTypes.Connector_4001,
					PiViM.diagram.edit.parts.ConnectorEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<PiViM.diagram.part.PiViLinkDescriptor> getOutgoingTypeModelFacetLinks_Connector_4001(
			PiViM.CodeBlock source) {
		PiViM.Icons container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof PiViM.Icons) {
				container = (PiViM.Icons) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<PiViM.diagram.part.PiViLinkDescriptor> result = new LinkedList<PiViM.diagram.part.PiViLinkDescriptor>();
		for (Iterator<?> links = container.getConnectors().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof PiViM.Connector) {
				continue;
			}
			PiViM.Connector link = (PiViM.Connector) linkObject;
			if (PiViM.diagram.edit.parts.ConnectorEditPart.VISUAL_ID != PiViM.diagram.part.PiViVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			PiViM.CodeBlock dst = link.getTarget();
			PiViM.CodeBlock src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new PiViM.diagram.part.PiViLinkDescriptor(src, dst, link,
					PiViM.diagram.providers.PiViElementTypes.Connector_4001,
					PiViM.diagram.edit.parts.ConnectorEditPart.VISUAL_ID));
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

		public List<PiViM.diagram.part.PiViNodeDescriptor> getSemanticChildren(View view) {
			return PiViDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/

		public List<PiViM.diagram.part.PiViLinkDescriptor> getContainedLinks(View view) {
			return PiViDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/

		public List<PiViM.diagram.part.PiViLinkDescriptor> getIncomingLinks(View view) {
			return PiViDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/

		public List<PiViM.diagram.part.PiViLinkDescriptor> getOutgoingLinks(View view) {
			return PiViDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
