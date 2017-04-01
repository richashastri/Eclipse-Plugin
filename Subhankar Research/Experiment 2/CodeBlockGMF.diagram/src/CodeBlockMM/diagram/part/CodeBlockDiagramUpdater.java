package CodeBlockMM.diagram.part;

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
public class CodeBlockDiagramUpdater {

	/**
	* @generated
	*/
	public static List<CodeBlockMM.diagram.part.CodeBlockNodeDescriptor> getSemanticChildren(View view) {
		switch (CodeBlockMM.diagram.part.CodeBlockVisualIDRegistry.getVisualID(view)) {
		case CodeBlockMM.diagram.edit.parts.ArchitectureEditPart.VISUAL_ID:
			return getArchitecture_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CodeBlockMM.diagram.part.CodeBlockNodeDescriptor> getArchitecture_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		CodeBlockMM.Architecture modelElement = (CodeBlockMM.Architecture) view.getElement();
		LinkedList<CodeBlockMM.diagram.part.CodeBlockNodeDescriptor> result = new LinkedList<CodeBlockMM.diagram.part.CodeBlockNodeDescriptor>();
		for (Iterator<?> it = modelElement.getCodeblocks().iterator(); it.hasNext();) {
			CodeBlockMM.CodeBlock childElement = (CodeBlockMM.CodeBlock) it.next();
			int visualID = CodeBlockMM.diagram.part.CodeBlockVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == CodeBlockMM.diagram.edit.parts.CodeBlockEditPart.VISUAL_ID) {
				result.add(new CodeBlockMM.diagram.part.CodeBlockNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<CodeBlockMM.diagram.part.CodeBlockLinkDescriptor> getContainedLinks(View view) {
		switch (CodeBlockMM.diagram.part.CodeBlockVisualIDRegistry.getVisualID(view)) {
		case CodeBlockMM.diagram.edit.parts.ArchitectureEditPart.VISUAL_ID:
			return getArchitecture_1000ContainedLinks(view);
		case CodeBlockMM.diagram.edit.parts.CodeBlockEditPart.VISUAL_ID:
			return getCodeBlock_2001ContainedLinks(view);
		case CodeBlockMM.diagram.edit.parts.ConnectionEditPart.VISUAL_ID:
			return getConnection_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CodeBlockMM.diagram.part.CodeBlockLinkDescriptor> getIncomingLinks(View view) {
		switch (CodeBlockMM.diagram.part.CodeBlockVisualIDRegistry.getVisualID(view)) {
		case CodeBlockMM.diagram.edit.parts.CodeBlockEditPart.VISUAL_ID:
			return getCodeBlock_2001IncomingLinks(view);
		case CodeBlockMM.diagram.edit.parts.ConnectionEditPart.VISUAL_ID:
			return getConnection_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<CodeBlockMM.diagram.part.CodeBlockLinkDescriptor> getOutgoingLinks(View view) {
		switch (CodeBlockMM.diagram.part.CodeBlockVisualIDRegistry.getVisualID(view)) {
		case CodeBlockMM.diagram.edit.parts.CodeBlockEditPart.VISUAL_ID:
			return getCodeBlock_2001OutgoingLinks(view);
		case CodeBlockMM.diagram.edit.parts.ConnectionEditPart.VISUAL_ID:
			return getConnection_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CodeBlockMM.diagram.part.CodeBlockLinkDescriptor> getArchitecture_1000ContainedLinks(View view) {
		CodeBlockMM.Architecture modelElement = (CodeBlockMM.Architecture) view.getElement();
		LinkedList<CodeBlockMM.diagram.part.CodeBlockLinkDescriptor> result = new LinkedList<CodeBlockMM.diagram.part.CodeBlockLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Connection_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CodeBlockMM.diagram.part.CodeBlockLinkDescriptor> getCodeBlock_2001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CodeBlockMM.diagram.part.CodeBlockLinkDescriptor> getConnection_4001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CodeBlockMM.diagram.part.CodeBlockLinkDescriptor> getCodeBlock_2001IncomingLinks(View view) {
		CodeBlockMM.CodeBlock modelElement = (CodeBlockMM.CodeBlock) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CodeBlockMM.diagram.part.CodeBlockLinkDescriptor> result = new LinkedList<CodeBlockMM.diagram.part.CodeBlockLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Connection_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CodeBlockMM.diagram.part.CodeBlockLinkDescriptor> getConnection_4001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CodeBlockMM.diagram.part.CodeBlockLinkDescriptor> getCodeBlock_2001OutgoingLinks(View view) {
		CodeBlockMM.CodeBlock modelElement = (CodeBlockMM.CodeBlock) view.getElement();
		LinkedList<CodeBlockMM.diagram.part.CodeBlockLinkDescriptor> result = new LinkedList<CodeBlockMM.diagram.part.CodeBlockLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Connection_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CodeBlockMM.diagram.part.CodeBlockLinkDescriptor> getConnection_4001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	private static Collection<CodeBlockMM.diagram.part.CodeBlockLinkDescriptor> getContainedTypeModelFacetLinks_Connection_4001(
			CodeBlockMM.Architecture container) {
		LinkedList<CodeBlockMM.diagram.part.CodeBlockLinkDescriptor> result = new LinkedList<CodeBlockMM.diagram.part.CodeBlockLinkDescriptor>();
		for (Iterator<?> links = container.getConnections().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof CodeBlockMM.Connection) {
				continue;
			}
			CodeBlockMM.Connection link = (CodeBlockMM.Connection) linkObject;
			if (CodeBlockMM.diagram.edit.parts.ConnectionEditPart.VISUAL_ID != CodeBlockMM.diagram.part.CodeBlockVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			CodeBlockMM.CodeBlock dst = link.getTarget();
			CodeBlockMM.CodeBlock src = link.getSource();
			result.add(new CodeBlockMM.diagram.part.CodeBlockLinkDescriptor(src, dst, link,
					CodeBlockMM.diagram.providers.CodeBlockElementTypes.Connection_4001,
					CodeBlockMM.diagram.edit.parts.ConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CodeBlockMM.diagram.part.CodeBlockLinkDescriptor> getIncomingTypeModelFacetLinks_Connection_4001(
			CodeBlockMM.CodeBlock target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<CodeBlockMM.diagram.part.CodeBlockLinkDescriptor> result = new LinkedList<CodeBlockMM.diagram.part.CodeBlockLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != CodeBlockMM.CodeBlockMMPackage.eINSTANCE.getConnection_Target()
					|| false == setting.getEObject() instanceof CodeBlockMM.Connection) {
				continue;
			}
			CodeBlockMM.Connection link = (CodeBlockMM.Connection) setting.getEObject();
			if (CodeBlockMM.diagram.edit.parts.ConnectionEditPart.VISUAL_ID != CodeBlockMM.diagram.part.CodeBlockVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			CodeBlockMM.CodeBlock src = link.getSource();
			result.add(new CodeBlockMM.diagram.part.CodeBlockLinkDescriptor(src, target, link,
					CodeBlockMM.diagram.providers.CodeBlockElementTypes.Connection_4001,
					CodeBlockMM.diagram.edit.parts.ConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<CodeBlockMM.diagram.part.CodeBlockLinkDescriptor> getOutgoingTypeModelFacetLinks_Connection_4001(
			CodeBlockMM.CodeBlock source) {
		CodeBlockMM.Architecture container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof CodeBlockMM.Architecture) {
				container = (CodeBlockMM.Architecture) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<CodeBlockMM.diagram.part.CodeBlockLinkDescriptor> result = new LinkedList<CodeBlockMM.diagram.part.CodeBlockLinkDescriptor>();
		for (Iterator<?> links = container.getConnections().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof CodeBlockMM.Connection) {
				continue;
			}
			CodeBlockMM.Connection link = (CodeBlockMM.Connection) linkObject;
			if (CodeBlockMM.diagram.edit.parts.ConnectionEditPart.VISUAL_ID != CodeBlockMM.diagram.part.CodeBlockVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			CodeBlockMM.CodeBlock dst = link.getTarget();
			CodeBlockMM.CodeBlock src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new CodeBlockMM.diagram.part.CodeBlockLinkDescriptor(src, dst, link,
					CodeBlockMM.diagram.providers.CodeBlockElementTypes.Connection_4001,
					CodeBlockMM.diagram.edit.parts.ConnectionEditPart.VISUAL_ID));
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

		public List<CodeBlockMM.diagram.part.CodeBlockNodeDescriptor> getSemanticChildren(View view) {
			return CodeBlockDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/

		public List<CodeBlockMM.diagram.part.CodeBlockLinkDescriptor> getContainedLinks(View view) {
			return CodeBlockDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/

		public List<CodeBlockMM.diagram.part.CodeBlockLinkDescriptor> getIncomingLinks(View view) {
			return CodeBlockDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/

		public List<CodeBlockMM.diagram.part.CodeBlockLinkDescriptor> getOutgoingLinks(View view) {
			return CodeBlockDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
