package SquareMM.diagram.part;

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
public class SquareDiagramUpdater {

	/**
	* @generated
	*/
	public static List<SquareMM.diagram.part.SquareNodeDescriptor> getSemanticChildren(View view) {
		switch (SquareMM.diagram.part.SquareVisualIDRegistry.getVisualID(view)) {
		case SquareMM.diagram.edit.parts.ArchitectureEditPart.VISUAL_ID:
			return getArchitecture_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<SquareMM.diagram.part.SquareNodeDescriptor> getArchitecture_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		SquareMM.Architecture modelElement = (SquareMM.Architecture) view.getElement();
		LinkedList<SquareMM.diagram.part.SquareNodeDescriptor> result = new LinkedList<SquareMM.diagram.part.SquareNodeDescriptor>();
		for (Iterator<?> it = modelElement.getSquares().iterator(); it.hasNext();) {
			SquareMM.Square childElement = (SquareMM.Square) it.next();
			int visualID = SquareMM.diagram.part.SquareVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == SquareMM.diagram.edit.parts.SquareEditPart.VISUAL_ID) {
				result.add(new SquareMM.diagram.part.SquareNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<SquareMM.diagram.part.SquareLinkDescriptor> getContainedLinks(View view) {
		switch (SquareMM.diagram.part.SquareVisualIDRegistry.getVisualID(view)) {
		case SquareMM.diagram.edit.parts.ArchitectureEditPart.VISUAL_ID:
			return getArchitecture_1000ContainedLinks(view);
		case SquareMM.diagram.edit.parts.SquareEditPart.VISUAL_ID:
			return getSquare_2001ContainedLinks(view);
		case SquareMM.diagram.edit.parts.RelationEditPart.VISUAL_ID:
			return getRelation_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<SquareMM.diagram.part.SquareLinkDescriptor> getIncomingLinks(View view) {
		switch (SquareMM.diagram.part.SquareVisualIDRegistry.getVisualID(view)) {
		case SquareMM.diagram.edit.parts.SquareEditPart.VISUAL_ID:
			return getSquare_2001IncomingLinks(view);
		case SquareMM.diagram.edit.parts.RelationEditPart.VISUAL_ID:
			return getRelation_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<SquareMM.diagram.part.SquareLinkDescriptor> getOutgoingLinks(View view) {
		switch (SquareMM.diagram.part.SquareVisualIDRegistry.getVisualID(view)) {
		case SquareMM.diagram.edit.parts.SquareEditPart.VISUAL_ID:
			return getSquare_2001OutgoingLinks(view);
		case SquareMM.diagram.edit.parts.RelationEditPart.VISUAL_ID:
			return getRelation_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SquareMM.diagram.part.SquareLinkDescriptor> getArchitecture_1000ContainedLinks(View view) {
		SquareMM.Architecture modelElement = (SquareMM.Architecture) view.getElement();
		LinkedList<SquareMM.diagram.part.SquareLinkDescriptor> result = new LinkedList<SquareMM.diagram.part.SquareLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Relation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SquareMM.diagram.part.SquareLinkDescriptor> getSquare_2001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SquareMM.diagram.part.SquareLinkDescriptor> getRelation_4001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SquareMM.diagram.part.SquareLinkDescriptor> getSquare_2001IncomingLinks(View view) {
		SquareMM.Square modelElement = (SquareMM.Square) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<SquareMM.diagram.part.SquareLinkDescriptor> result = new LinkedList<SquareMM.diagram.part.SquareLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Relation_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SquareMM.diagram.part.SquareLinkDescriptor> getRelation_4001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SquareMM.diagram.part.SquareLinkDescriptor> getSquare_2001OutgoingLinks(View view) {
		SquareMM.Square modelElement = (SquareMM.Square) view.getElement();
		LinkedList<SquareMM.diagram.part.SquareLinkDescriptor> result = new LinkedList<SquareMM.diagram.part.SquareLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Relation_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SquareMM.diagram.part.SquareLinkDescriptor> getRelation_4001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	private static Collection<SquareMM.diagram.part.SquareLinkDescriptor> getContainedTypeModelFacetLinks_Relation_4001(
			SquareMM.Architecture container) {
		LinkedList<SquareMM.diagram.part.SquareLinkDescriptor> result = new LinkedList<SquareMM.diagram.part.SquareLinkDescriptor>();
		for (Iterator<?> links = container.getRelations().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof SquareMM.Relation) {
				continue;
			}
			SquareMM.Relation link = (SquareMM.Relation) linkObject;
			if (SquareMM.diagram.edit.parts.RelationEditPart.VISUAL_ID != SquareMM.diagram.part.SquareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			SquareMM.Square dst = link.getTarget();
			SquareMM.Square src = link.getSource();
			result.add(new SquareMM.diagram.part.SquareLinkDescriptor(src, dst, link,
					SquareMM.diagram.providers.SquareElementTypes.Relation_4001,
					SquareMM.diagram.edit.parts.RelationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<SquareMM.diagram.part.SquareLinkDescriptor> getIncomingTypeModelFacetLinks_Relation_4001(
			SquareMM.Square target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<SquareMM.diagram.part.SquareLinkDescriptor> result = new LinkedList<SquareMM.diagram.part.SquareLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != SquareMM.SquareMMPackage.eINSTANCE.getRelation_Target()
					|| false == setting.getEObject() instanceof SquareMM.Relation) {
				continue;
			}
			SquareMM.Relation link = (SquareMM.Relation) setting.getEObject();
			if (SquareMM.diagram.edit.parts.RelationEditPart.VISUAL_ID != SquareMM.diagram.part.SquareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			SquareMM.Square src = link.getSource();
			result.add(new SquareMM.diagram.part.SquareLinkDescriptor(src, target, link,
					SquareMM.diagram.providers.SquareElementTypes.Relation_4001,
					SquareMM.diagram.edit.parts.RelationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<SquareMM.diagram.part.SquareLinkDescriptor> getOutgoingTypeModelFacetLinks_Relation_4001(
			SquareMM.Square source) {
		SquareMM.Architecture container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof SquareMM.Architecture) {
				container = (SquareMM.Architecture) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<SquareMM.diagram.part.SquareLinkDescriptor> result = new LinkedList<SquareMM.diagram.part.SquareLinkDescriptor>();
		for (Iterator<?> links = container.getRelations().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof SquareMM.Relation) {
				continue;
			}
			SquareMM.Relation link = (SquareMM.Relation) linkObject;
			if (SquareMM.diagram.edit.parts.RelationEditPart.VISUAL_ID != SquareMM.diagram.part.SquareVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			SquareMM.Square dst = link.getTarget();
			SquareMM.Square src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new SquareMM.diagram.part.SquareLinkDescriptor(src, dst, link,
					SquareMM.diagram.providers.SquareElementTypes.Relation_4001,
					SquareMM.diagram.edit.parts.RelationEditPart.VISUAL_ID));
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

		public List<SquareMM.diagram.part.SquareNodeDescriptor> getSemanticChildren(View view) {
			return SquareDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/

		public List<SquareMM.diagram.part.SquareLinkDescriptor> getContainedLinks(View view) {
			return SquareDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/

		public List<SquareMM.diagram.part.SquareLinkDescriptor> getIncomingLinks(View view) {
			return SquareDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/

		public List<SquareMM.diagram.part.SquareLinkDescriptor> getOutgoingLinks(View view) {
			return SquareDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
