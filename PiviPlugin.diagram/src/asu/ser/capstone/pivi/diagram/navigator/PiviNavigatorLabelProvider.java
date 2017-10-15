package asu.ser.capstone.pivi.diagram.navigator;

import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import asu.ser.capstone.pivi.IfStart;
import asu.ser.capstone.pivi.Instruction;
import asu.ser.capstone.pivi.MethodStart;
import asu.ser.capstone.pivi.WhileStart;
import asu.ser.capstone.pivi.diagram.edit.parts.IfEndEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.IfStartEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.InputPortEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.InstructionEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.MethodEndEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.MethodStartEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.OutputPortEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.OutputPortInputPortEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.PiviDiagramEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.StartEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.StartPortEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.StartStartPortEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.WhileEndEditPart;
import asu.ser.capstone.pivi.diagram.edit.parts.WhileStartEditPart;
import asu.ser.capstone.pivi.diagram.part.PiviDiagramEditorPlugin;
import asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry;
import asu.ser.capstone.pivi.diagram.providers.PiviElementTypes;

/**
 * @generated
 */
public class PiviNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		PiviDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		PiviDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof PiviNavigatorItem
				&& !isOwnView(((PiviNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof PiviNavigatorGroup) {
			PiviNavigatorGroup group = (PiviNavigatorGroup) element;
			return PiviDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof PiviNavigatorItem) {
			PiviNavigatorItem navigatorItem = (PiviNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (PiviVisualIDRegistry.getVisualID(view)) {
		case OutputPortInputPortEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///asu/ser/capstone/pivi.ecore?OutputPort?inputPort", PiviElementTypes.OutputPortInputPort_4002); //$NON-NLS-1$
		case MethodStartEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///asu/ser/capstone/pivi.ecore?MethodStart", PiviElementTypes.MethodStart_2006); //$NON-NLS-1$
		case PiviDiagramEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http:///asu/ser/capstone/pivi.ecore?PiviDiagram", PiviElementTypes.PiviDiagram_1000); //$NON-NLS-1$
		case StartPortEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///asu/ser/capstone/pivi.ecore?StartPort", PiviElementTypes.StartPort_3002); //$NON-NLS-1$
		case WhileStartEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///asu/ser/capstone/pivi.ecore?WhileStart", PiviElementTypes.WhileStart_2007); //$NON-NLS-1$
		case InstructionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///asu/ser/capstone/pivi.ecore?Instruction", PiviElementTypes.Instruction_2005); //$NON-NLS-1$
		case IfStartEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///asu/ser/capstone/pivi.ecore?IfStart", PiviElementTypes.IfStart_2001); //$NON-NLS-1$
		case StartEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///asu/ser/capstone/pivi.ecore?Start", PiviElementTypes.Start_2008); //$NON-NLS-1$
		case InputPortEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///asu/ser/capstone/pivi.ecore?InputPort", PiviElementTypes.InputPort_3001); //$NON-NLS-1$
		case OutputPortEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http:///asu/ser/capstone/pivi.ecore?OutputPort", PiviElementTypes.OutputPort_3003); //$NON-NLS-1$
		case MethodEndEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///asu/ser/capstone/pivi.ecore?MethodEnd", PiviElementTypes.MethodEnd_2003); //$NON-NLS-1$
		case IfEndEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///asu/ser/capstone/pivi.ecore?IfEnd", PiviElementTypes.IfEnd_2004); //$NON-NLS-1$
		case WhileEndEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http:///asu/ser/capstone/pivi.ecore?WhileEnd", PiviElementTypes.WhileEnd_2002); //$NON-NLS-1$
		case StartStartPortEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http:///asu/ser/capstone/pivi.ecore?Start?startPort", PiviElementTypes.StartStartPort_4004); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = PiviDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& PiviElementTypes.isKnownElementType(elementType)) {
			image = PiviElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof PiviNavigatorGroup) {
			PiviNavigatorGroup group = (PiviNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof PiviNavigatorItem) {
			PiviNavigatorItem navigatorItem = (PiviNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (PiviVisualIDRegistry.getVisualID(view)) {
		case OutputPortInputPortEditPart.VISUAL_ID:
			return getOutputPortInputPort_4002Text(view);
		case MethodStartEditPart.VISUAL_ID:
			return getMethodStart_2006Text(view);
		case PiviDiagramEditPart.VISUAL_ID:
			return getPiviDiagram_1000Text(view);
		case StartPortEditPart.VISUAL_ID:
			return getStartPort_3002Text(view);
		case WhileStartEditPart.VISUAL_ID:
			return getWhileStart_2007Text(view);
		case InstructionEditPart.VISUAL_ID:
			return getInstruction_2005Text(view);
		case IfStartEditPart.VISUAL_ID:
			return getIfStart_2001Text(view);
		case StartEditPart.VISUAL_ID:
			return getStart_2008Text(view);
		case InputPortEditPart.VISUAL_ID:
			return getInputPort_3001Text(view);
		case OutputPortEditPart.VISUAL_ID:
			return getOutputPort_3003Text(view);
		case MethodEndEditPart.VISUAL_ID:
			return getMethodEnd_2003Text(view);
		case IfEndEditPart.VISUAL_ID:
			return getIfEnd_2004Text(view);
		case WhileEndEditPart.VISUAL_ID:
			return getWhileEnd_2002Text(view);
		case StartStartPortEditPart.VISUAL_ID:
			return getStartStartPort_4004Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getOutputPortInputPort_4002Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getMethodStart_2006Text(View view) {
		MethodStart domainModelElement = (MethodStart) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			PiviDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPiviDiagram_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getStartPort_3002Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getWhileStart_2007Text(View view) {
		WhileStart domainModelElement = (WhileStart) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getCondition();
		} else {
			PiviDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInstruction_2005Text(View view) {
		Instruction domainModelElement = (Instruction) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getInstructions();
		} else {
			PiviDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getIfStart_2001Text(View view) {
		IfStart domainModelElement = (IfStart) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getCondition();
		} else {
			PiviDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getStart_2008Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getInputPort_3001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getOutputPort_3003Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getMethodEnd_2003Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getIfEnd_2004Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getWhileEnd_2002Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getStartStartPort_4004Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return PiviDiagramEditPart.MODEL_ID.equals(PiviVisualIDRegistry
				.getModelID(view));
	}

}
