package asu.ser.capstone.pivi.diagram.providers;

/**
 * @generated
 */
public class PiviElementTypes {

		/**
 * @generated
 */
private PiviElementTypes() {
}
	
		/**
 * @generated
 */
private static java.util.Map<org.eclipse.gmf.runtime.emf.type.core.IElementType, org.eclipse.emf.ecore.ENamedElement> elements;

	/**
 * @generated
 */
private static org.eclipse.jface.resource.ImageRegistry imageRegistry;

	/**
 * @generated
 */
private static java.util.Set<org.eclipse.gmf.runtime.emf.type.core.IElementType> KNOWN_ELEMENT_TYPES;
	
				/**
 * @generated
 */
public static final org.eclipse.gmf.runtime.emf.type.core.IElementType PiviDiagram_1000 = getElementType("PiviPlugin.diagram.PiviDiagram_1000");  //$NON-NLS-1$
				/**
 * @generated
 */
public static final org.eclipse.gmf.runtime.emf.type.core.IElementType IfStart_2001 = getElementType("PiviPlugin.diagram.IfStart_2001");  //$NON-NLS-1$
				/**
 * @generated
 */
public static final org.eclipse.gmf.runtime.emf.type.core.IElementType WhileEnd_2002 = getElementType("PiviPlugin.diagram.WhileEnd_2002");  //$NON-NLS-1$
				/**
 * @generated
 */
public static final org.eclipse.gmf.runtime.emf.type.core.IElementType MethodEnd_2003 = getElementType("PiviPlugin.diagram.MethodEnd_2003");  //$NON-NLS-1$
				/**
 * @generated
 */
public static final org.eclipse.gmf.runtime.emf.type.core.IElementType IfEnd_2004 = getElementType("PiviPlugin.diagram.IfEnd_2004");  //$NON-NLS-1$
				/**
 * @generated
 */
public static final org.eclipse.gmf.runtime.emf.type.core.IElementType Instruction_2005 = getElementType("PiviPlugin.diagram.Instruction_2005");  //$NON-NLS-1$
				/**
 * @generated
 */
public static final org.eclipse.gmf.runtime.emf.type.core.IElementType MethodStart_2006 = getElementType("PiviPlugin.diagram.MethodStart_2006");  //$NON-NLS-1$
				/**
 * @generated
 */
public static final org.eclipse.gmf.runtime.emf.type.core.IElementType WhileStart_2007 = getElementType("PiviPlugin.diagram.WhileStart_2007");  //$NON-NLS-1$
				/**
 * @generated
 */
public static final org.eclipse.gmf.runtime.emf.type.core.IElementType Start_2008 = getElementType("PiviPlugin.diagram.Start_2008");  //$NON-NLS-1$
				/**
 * @generated
 */
public static final org.eclipse.gmf.runtime.emf.type.core.IElementType ThreadEnd_2009 = getElementType("PiviPlugin.diagram.ThreadEnd_2009");  //$NON-NLS-1$
				/**
 * @generated
 */
public static final org.eclipse.gmf.runtime.emf.type.core.IElementType ThreadStart_2010 = getElementType("PiviPlugin.diagram.ThreadStart_2010");  //$NON-NLS-1$
				/**
 * @generated
 */
public static final org.eclipse.gmf.runtime.emf.type.core.IElementType PrintStatement_2011 = getElementType("PiviPlugin.diagram.PrintStatement_2011");  //$NON-NLS-1$
				/**
 * @generated
 */
public static final org.eclipse.gmf.runtime.emf.type.core.IElementType SyncEnd_2012 = getElementType("PiviPlugin.diagram.SyncEnd_2012");  //$NON-NLS-1$
				/**
 * @generated
 */
public static final org.eclipse.gmf.runtime.emf.type.core.IElementType SyncStart_2013 = getElementType("PiviPlugin.diagram.SyncStart_2013");  //$NON-NLS-1$
				/**
 * @generated
 */
public static final org.eclipse.gmf.runtime.emf.type.core.IElementType InputPort_3001 = getElementType("PiviPlugin.diagram.InputPort_3001");  //$NON-NLS-1$
				/**
 * @generated
 */
public static final org.eclipse.gmf.runtime.emf.type.core.IElementType StartPort_3002 = getElementType("PiviPlugin.diagram.StartPort_3002");  //$NON-NLS-1$
				/**
 * @generated
 */
public static final org.eclipse.gmf.runtime.emf.type.core.IElementType OutputPort_3003 = getElementType("PiviPlugin.diagram.OutputPort_3003");  //$NON-NLS-1$
				/**
 * @generated
 */
public static final org.eclipse.gmf.runtime.emf.type.core.IElementType StartStartPort_4004 = getElementType("PiviPlugin.diagram.StartStartPort_4004");  //$NON-NLS-1$
				/**
 * @generated
 */
public static final org.eclipse.gmf.runtime.emf.type.core.IElementType OutputPortInputPort_4002 = getElementType("PiviPlugin.diagram.OutputPortInputPort_4002");  //$NON-NLS-1$
		
		/**
 * @generated
 */
private static org.eclipse.jface.resource.ImageRegistry getImageRegistry() {
	if (imageRegistry == null) {
		imageRegistry = new org.eclipse.jface.resource.ImageRegistry();
	}
	return imageRegistry;
}

		/**
 * @generated
 */
private static String getImageRegistryKey(org.eclipse.emf.ecore.ENamedElement element) {
	return element.getName();
}

		/**
 * @generated
 */
private static org.eclipse.jface.resource.ImageDescriptor getProvidedImageDescriptor(org.eclipse.emf.ecore.ENamedElement element) {
	if (element instanceof org.eclipse.emf.ecore.EStructuralFeature) {
		org.eclipse.emf.ecore.EStructuralFeature feature = ((org.eclipse.emf.ecore.EStructuralFeature) element);
		org.eclipse.emf.ecore.EClass eContainingClass = feature.getEContainingClass();
		org.eclipse.emf.ecore.EClassifier eType = feature.getEType();
		if (eContainingClass != null && !eContainingClass.isAbstract()){
			element = eContainingClass;
		} else if (eType instanceof org.eclipse.emf.ecore.EClass && !((org.eclipse.emf.ecore.EClass)eType).isAbstract()){
			element = eType;
		}
	}
	if (element instanceof org.eclipse.emf.ecore.EClass) {
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) element;
		if (!eClass.isAbstract()) {
			return asu.ser.capstone.pivi.diagram.part.PiviDiagramEditorPlugin.getInstance().getItemImageDescriptor(
				eClass.getEPackage().getEFactoryInstance().create(eClass));
		}
	}
	// TODO : support structural features
	return null;
}

		/**
 * @generated
 */
public static org.eclipse.jface.resource.ImageDescriptor getImageDescriptor(org.eclipse.emf.ecore.ENamedElement element) {
	String key = getImageRegistryKey(element);
	org.eclipse.jface.resource.ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
	if (imageDescriptor == null) {
		imageDescriptor = getProvidedImageDescriptor(element);
if (imageDescriptor == null) {
	imageDescriptor = org.eclipse.jface.resource.ImageDescriptor.getMissingImageDescriptor();
}
getImageRegistry().put(key, imageDescriptor);
	}
	return imageDescriptor;
}

		/**
 * @generated
 */
public static org.eclipse.swt.graphics.Image getImage(org.eclipse.emf.ecore.ENamedElement element) {
	String key = getImageRegistryKey(element);
	org.eclipse.swt.graphics.Image image = getImageRegistry().get(key);
	if (image == null) {
		org.eclipse.jface.resource.ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
if (imageDescriptor == null) {
	imageDescriptor = org.eclipse.jface.resource.ImageDescriptor.getMissingImageDescriptor();
}
getImageRegistry().put(key, imageDescriptor);
		image = getImageRegistry().get(key);
	}
	return image;
}

		/**
 * @generated
 */
public static org.eclipse.jface.resource.ImageDescriptor getImageDescriptor(org.eclipse.core.runtime.IAdaptable hint) {
	org.eclipse.emf.ecore.ENamedElement element = getElement(hint);
if (element == null) {
	return null;
}
	return getImageDescriptor(element);
}

		/**
 * @generated
 */
public static org.eclipse.swt.graphics.Image getImage(org.eclipse.core.runtime.IAdaptable hint) {
	org.eclipse.emf.ecore.ENamedElement element = getElement(hint);
if (element == null) {
	return null;
}
	return getImage(element);
}

		/**
 * Returns 'type' of the ecore object associated with the hint.
 * 
 * @generated
 */
public static org.eclipse.emf.ecore.ENamedElement getElement(org.eclipse.core.runtime.IAdaptable hint) {
	Object type = hint.getAdapter(org.eclipse.gmf.runtime.emf.type.core.IElementType.class);
	if (elements == null) {
		elements = new java.util.IdentityHashMap<org.eclipse.gmf.runtime.emf.type.core.IElementType, org.eclipse.emf.ecore.ENamedElement>();
		
	elements.put(PiviDiagram_1000, asu.ser.capstone.pivi.PiviPackage.eINSTANCE.getPiviDiagram());
					
	
	elements.put(IfStart_2001, asu.ser.capstone.pivi.PiviPackage.eINSTANCE.getIfStart());
					
	
	elements.put(WhileEnd_2002, asu.ser.capstone.pivi.PiviPackage.eINSTANCE.getWhileEnd());
					
	
	elements.put(MethodEnd_2003, asu.ser.capstone.pivi.PiviPackage.eINSTANCE.getMethodEnd());
					
	
	elements.put(IfEnd_2004, asu.ser.capstone.pivi.PiviPackage.eINSTANCE.getIfEnd());
					
	
	elements.put(Instruction_2005, asu.ser.capstone.pivi.PiviPackage.eINSTANCE.getInstruction());
					
	
	elements.put(MethodStart_2006, asu.ser.capstone.pivi.PiviPackage.eINSTANCE.getMethodStart());
					
	
	elements.put(WhileStart_2007, asu.ser.capstone.pivi.PiviPackage.eINSTANCE.getWhileStart());
					
	
	elements.put(Start_2008, asu.ser.capstone.pivi.PiviPackage.eINSTANCE.getStart());
					
	
	elements.put(ThreadEnd_2009, asu.ser.capstone.pivi.PiviPackage.eINSTANCE.getThreadEnd());
					
	
	elements.put(ThreadStart_2010, asu.ser.capstone.pivi.PiviPackage.eINSTANCE.getThreadStart());
					
	
	elements.put(PrintStatement_2011, asu.ser.capstone.pivi.PiviPackage.eINSTANCE.getPrintStatement());
					
	
	elements.put(SyncEnd_2012, asu.ser.capstone.pivi.PiviPackage.eINSTANCE.getSyncEnd());
					
	
	elements.put(SyncStart_2013, asu.ser.capstone.pivi.PiviPackage.eINSTANCE.getSyncStart());
					
	
	elements.put(InputPort_3001, asu.ser.capstone.pivi.PiviPackage.eINSTANCE.getInputPort());
					
	
	elements.put(StartPort_3002, asu.ser.capstone.pivi.PiviPackage.eINSTANCE.getStartPort());
					
	
	elements.put(OutputPort_3003, asu.ser.capstone.pivi.PiviPackage.eINSTANCE.getOutputPort());
							
	elements.put(StartStartPort_4004, asu.ser.capstone.pivi.PiviPackage.eINSTANCE.getStart_StartPort());
					
	elements.put(OutputPortInputPort_4002, asu.ser.capstone.pivi.PiviPackage.eINSTANCE.getOutputPort_InputPort());
			}
	return (org.eclipse.emf.ecore.ENamedElement) elements.get(type);
}

		/**
 * @generated
 */
private static org.eclipse.gmf.runtime.emf.type.core.IElementType getElementType(String id) {
	return org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry.getInstance().getType(id);
}

		/**
 * @generated
 */
public static boolean isKnownElementType(org.eclipse.gmf.runtime.emf.type.core.IElementType elementType) {
	if (KNOWN_ELEMENT_TYPES == null) {
		KNOWN_ELEMENT_TYPES = new java.util.HashSet<org.eclipse.gmf.runtime.emf.type.core.IElementType>();
			KNOWN_ELEMENT_TYPES.add(PiviDiagram_1000);
		KNOWN_ELEMENT_TYPES.add(IfStart_2001);
		KNOWN_ELEMENT_TYPES.add(WhileEnd_2002);
		KNOWN_ELEMENT_TYPES.add(MethodEnd_2003);
		KNOWN_ELEMENT_TYPES.add(IfEnd_2004);
		KNOWN_ELEMENT_TYPES.add(Instruction_2005);
		KNOWN_ELEMENT_TYPES.add(MethodStart_2006);
		KNOWN_ELEMENT_TYPES.add(WhileStart_2007);
		KNOWN_ELEMENT_TYPES.add(Start_2008);
		KNOWN_ELEMENT_TYPES.add(ThreadEnd_2009);
		KNOWN_ELEMENT_TYPES.add(ThreadStart_2010);
		KNOWN_ELEMENT_TYPES.add(PrintStatement_2011);
		KNOWN_ELEMENT_TYPES.add(SyncEnd_2012);
		KNOWN_ELEMENT_TYPES.add(SyncStart_2013);
		KNOWN_ELEMENT_TYPES.add(InputPort_3001);
		KNOWN_ELEMENT_TYPES.add(StartPort_3002);
		KNOWN_ELEMENT_TYPES.add(OutputPort_3003);
		KNOWN_ELEMENT_TYPES.add(StartStartPort_4004);
		KNOWN_ELEMENT_TYPES.add(OutputPortInputPort_4002);
		}
	return KNOWN_ELEMENT_TYPES.contains(elementType);
}
	
		/**
 * @generated
 */
	public static org.eclipse.gmf.runtime.emf.type.core.IElementType getElementType(int visualID) {
		switch (visualID) {
				case asu.ser.capstone.pivi.diagram.edit.parts.PiviDiagramEditPart.VISUAL_ID:		return PiviDiagram_1000;
	case asu.ser.capstone.pivi.diagram.edit.parts.IfStartEditPart.VISUAL_ID:		return IfStart_2001;
	case asu.ser.capstone.pivi.diagram.edit.parts.WhileEndEditPart.VISUAL_ID:		return WhileEnd_2002;
	case asu.ser.capstone.pivi.diagram.edit.parts.MethodEndEditPart.VISUAL_ID:		return MethodEnd_2003;
	case asu.ser.capstone.pivi.diagram.edit.parts.IfEndEditPart.VISUAL_ID:		return IfEnd_2004;
	case asu.ser.capstone.pivi.diagram.edit.parts.InstructionEditPart.VISUAL_ID:		return Instruction_2005;
	case asu.ser.capstone.pivi.diagram.edit.parts.MethodStartEditPart.VISUAL_ID:		return MethodStart_2006;
	case asu.ser.capstone.pivi.diagram.edit.parts.WhileStartEditPart.VISUAL_ID:		return WhileStart_2007;
	case asu.ser.capstone.pivi.diagram.edit.parts.StartEditPart.VISUAL_ID:		return Start_2008;
	case asu.ser.capstone.pivi.diagram.edit.parts.ThreadEndEditPart.VISUAL_ID:		return ThreadEnd_2009;
	case asu.ser.capstone.pivi.diagram.edit.parts.ThreadStartEditPart.VISUAL_ID:		return ThreadStart_2010;
	case asu.ser.capstone.pivi.diagram.edit.parts.PrintStatementEditPart.VISUAL_ID:		return PrintStatement_2011;
	case asu.ser.capstone.pivi.diagram.edit.parts.SyncEndEditPart.VISUAL_ID:		return SyncEnd_2012;
	case asu.ser.capstone.pivi.diagram.edit.parts.SyncStartEditPart.VISUAL_ID:		return SyncStart_2013;
	case asu.ser.capstone.pivi.diagram.edit.parts.InputPortEditPart.VISUAL_ID:		return InputPort_3001;
	case asu.ser.capstone.pivi.diagram.edit.parts.StartPortEditPart.VISUAL_ID:		return StartPort_3002;
	case asu.ser.capstone.pivi.diagram.edit.parts.OutputPortEditPart.VISUAL_ID:		return OutputPort_3003;
	case asu.ser.capstone.pivi.diagram.edit.parts.StartStartPortEditPart.VISUAL_ID:		return StartStartPort_4004;
	case asu.ser.capstone.pivi.diagram.edit.parts.OutputPortInputPortEditPart.VISUAL_ID:		return OutputPortInputPort_4002;
		}
		return null;
	}

	}
