package asu.ser.capstone.pivi.diagram.providers;

/**
 * @generated
 */
public class PiviViewProvider extends org.eclipse.gmf.runtime.common.core.service.AbstractProvider implements org.eclipse.gmf.runtime.diagram.core.providers.IViewProvider {

	/**
 * @generated
 */
	public final boolean provides(org.eclipse.gmf.runtime.common.core.service.IOperation operation) {
		if (operation instanceof org.eclipse.gmf.runtime.diagram.core.services.view.CreateViewForKindOperation) {
			return provides((org.eclipse.gmf.runtime.diagram.core.services.view.CreateViewForKindOperation) operation);
		}
		assert operation instanceof org.eclipse.gmf.runtime.diagram.core.services.view.CreateViewOperation;
		if (operation instanceof org.eclipse.gmf.runtime.diagram.core.services.view.CreateDiagramViewOperation) {
			return provides((org.eclipse.gmf.runtime.diagram.core.services.view.CreateDiagramViewOperation) operation);
		} else if (operation instanceof org.eclipse.gmf.runtime.diagram.core.services.view.CreateEdgeViewOperation) {
			return provides((org.eclipse.gmf.runtime.diagram.core.services.view.CreateEdgeViewOperation) operation);
		} else if (operation instanceof org.eclipse.gmf.runtime.diagram.core.services.view.CreateNodeViewOperation) {
			return provides((org.eclipse.gmf.runtime.diagram.core.services.view.CreateNodeViewOperation) operation);
		}
		return false;
	}

	/**
 * @generated
 */
	protected boolean provides(org.eclipse.gmf.runtime.diagram.core.services.view.CreateViewForKindOperation op) {
/*
		if (op.getViewKind() == Node.class)
			return getNodeViewClass(op.getSemanticAdapter(), op.getContainerView(), op.getSemanticHint()) != null;
		if (op.getViewKind() == Edge.class)
			return getEdgeViewClass(op.getSemanticAdapter(), op.getContainerView(), op.getSemanticHint()) != null;
*/
		return true;
	}

	/**
 * @generated
 */
	protected boolean provides(org.eclipse.gmf.runtime.diagram.core.services.view.CreateDiagramViewOperation op) {
		return asu.ser.capstone.pivi.diagram.edit.parts.PiviDiagramEditPart.MODEL_ID.equals(op.getSemanticHint()) && asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getDiagramVisualID(getSemanticElement(op.getSemanticAdapter())) != -1;
	}

	/**
 * @generated
 */
	protected boolean provides(org.eclipse.gmf.runtime.diagram.core.services.view.CreateNodeViewOperation op) {
		if (op.getContainerView() == null) {
			return false;
		}
		org.eclipse.gmf.runtime.emf.type.core.IElementType elementType = getSemanticElementType(op.getSemanticAdapter());
		org.eclipse.emf.ecore.EObject domainElement = getSemanticElement(op.getSemanticAdapter());
		int visualID;
		if (op.getSemanticHint() == null) {
			// Semantic hint is not specified. Can be a result of call from CanonicalEditPolicy.
			// In this situation there should be NO elementType, visualID will be determined
			// by VisualIDRegistry.getNodeVisualID() for domainElement.
			if (elementType != null || domainElement == null) {
				return false;
			}
			visualID = asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getNodeVisualID(op.getContainerView(), domainElement);
		} else {
			visualID = asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getVisualID(op.getSemanticHint());
			if (elementType != null) {
				if (!asu.ser.capstone.pivi.diagram.providers.PiviElementTypes.isKnownElementType(elementType) || (!(elementType instanceof org.eclipse.gmf.runtime.emf.type.core.IHintedType))) {
					return false; // foreign element type
				}
				String elementTypeHint = ((org.eclipse.gmf.runtime.emf.type.core.IHintedType) elementType).getSemanticHint();
				if (!op.getSemanticHint().equals(elementTypeHint)) {
					return false; // if semantic hint is specified it should be the same as in element type
				}
				if (domainElement != null && visualID != asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getNodeVisualID(op.getContainerView(), domainElement)) {
					return false; // visual id for node EClass should match visual id from element type
				}
			} else {
				if (!asu.ser.capstone.pivi.diagram.edit.parts.PiviDiagramEditPart.MODEL_ID.equals(asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getModelID(op.getContainerView()))) {
					return false; // foreign diagram
				}
				switch (visualID) {
						case asu.ser.capstone.pivi.diagram.edit.parts.IfStartEditPart.VISUAL_ID:case asu.ser.capstone.pivi.diagram.edit.parts.WhileEndEditPart.VISUAL_ID:case asu.ser.capstone.pivi.diagram.edit.parts.MethodEndEditPart.VISUAL_ID:case asu.ser.capstone.pivi.diagram.edit.parts.IfEndEditPart.VISUAL_ID:case asu.ser.capstone.pivi.diagram.edit.parts.InstructionEditPart.VISUAL_ID:case asu.ser.capstone.pivi.diagram.edit.parts.MethodStartEditPart.VISUAL_ID:case asu.ser.capstone.pivi.diagram.edit.parts.WhileStartEditPart.VISUAL_ID:case asu.ser.capstone.pivi.diagram.edit.parts.StartEditPart.VISUAL_ID:case asu.ser.capstone.pivi.diagram.edit.parts.ThreadEndEditPart.VISUAL_ID:case asu.ser.capstone.pivi.diagram.edit.parts.ThreadStartEditPart.VISUAL_ID:case asu.ser.capstone.pivi.diagram.edit.parts.PrintStatementEditPart.VISUAL_ID:case asu.ser.capstone.pivi.diagram.edit.parts.InputPortEditPart.VISUAL_ID:case asu.ser.capstone.pivi.diagram.edit.parts.StartPortEditPart.VISUAL_ID:case asu.ser.capstone.pivi.diagram.edit.parts.OutputPortEditPart.VISUAL_ID:									if (domainElement == null || visualID != asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getNodeVisualID(op.getContainerView(), domainElement)) {
						return false; // visual id in semantic hint should match visual id for domain element
					}
					break;
					default:
					return false;
				}
			}
		}
		return asu.ser.capstone.pivi.diagram.edit.parts.IfStartEditPart.VISUAL_ID == visualID||asu.ser.capstone.pivi.diagram.edit.parts.WhileEndEditPart.VISUAL_ID == visualID||asu.ser.capstone.pivi.diagram.edit.parts.MethodEndEditPart.VISUAL_ID == visualID||asu.ser.capstone.pivi.diagram.edit.parts.IfEndEditPart.VISUAL_ID == visualID||asu.ser.capstone.pivi.diagram.edit.parts.InstructionEditPart.VISUAL_ID == visualID||asu.ser.capstone.pivi.diagram.edit.parts.MethodStartEditPart.VISUAL_ID == visualID||asu.ser.capstone.pivi.diagram.edit.parts.WhileStartEditPart.VISUAL_ID == visualID||asu.ser.capstone.pivi.diagram.edit.parts.StartEditPart.VISUAL_ID == visualID||asu.ser.capstone.pivi.diagram.edit.parts.ThreadEndEditPart.VISUAL_ID == visualID||asu.ser.capstone.pivi.diagram.edit.parts.ThreadStartEditPart.VISUAL_ID == visualID||asu.ser.capstone.pivi.diagram.edit.parts.PrintStatementEditPart.VISUAL_ID == visualID||asu.ser.capstone.pivi.diagram.edit.parts.InputPortEditPart.VISUAL_ID == visualID||asu.ser.capstone.pivi.diagram.edit.parts.StartPortEditPart.VISUAL_ID == visualID||asu.ser.capstone.pivi.diagram.edit.parts.OutputPortEditPart.VISUAL_ID == visualID;
	}

	/**
 * @generated
 */
	protected boolean provides(org.eclipse.gmf.runtime.diagram.core.services.view.CreateEdgeViewOperation op) {
		org.eclipse.gmf.runtime.emf.type.core.IElementType elementType = getSemanticElementType(op.getSemanticAdapter());
		if (!asu.ser.capstone.pivi.diagram.providers.PiviElementTypes.isKnownElementType(elementType) || (!(elementType instanceof org.eclipse.gmf.runtime.emf.type.core.IHintedType))) {
			return false; // foreign element type
		}
		String elementTypeHint = ((org.eclipse.gmf.runtime.emf.type.core.IHintedType) elementType).getSemanticHint();
		if (elementTypeHint == null || (op.getSemanticHint() != null && !elementTypeHint.equals(op.getSemanticHint()))) {
			return false; // our hint is visual id and must be specified, and it should be the same as in element type
		}
		int visualID = asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getVisualID(elementTypeHint);
		org.eclipse.emf.ecore.EObject domainElement = getSemanticElement(op.getSemanticAdapter());
		if (domainElement != null && visualID != asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getLinkWithClassVisualID(domainElement)) {
			return false; // visual id for link EClass should match visual id from element type
		}
		return true; 
	}

	/**
 * @generated
 */
	public org.eclipse.gmf.runtime.notation.Diagram createDiagram(org.eclipse.core.runtime.IAdaptable semanticAdapter, String diagramKind, org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint preferencesHint) {
		org.eclipse.gmf.runtime.notation.Diagram diagram = org.eclipse.gmf.runtime.notation.NotationFactory.eINSTANCE.createDiagram();
		diagram.getStyles().add(org.eclipse.gmf.runtime.notation.NotationFactory.eINSTANCE.createDiagramStyle());
				diagram.setType(asu.ser.capstone.pivi.diagram.edit.parts.PiviDiagramEditPart.MODEL_ID);
		diagram.setElement(getSemanticElement(semanticAdapter));
		diagram.setMeasurementUnit(org.eclipse.gmf.runtime.notation.MeasurementUnit.PIXEL_LITERAL);
		return diagram;
	}

	/**
 * @generated
 */
	public org.eclipse.gmf.runtime.notation.Node createNode(org.eclipse.core.runtime.IAdaptable semanticAdapter, org.eclipse.gmf.runtime.notation.View containerView, String semanticHint, int index, boolean persisted, org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint preferencesHint) {
		final org.eclipse.emf.ecore.EObject domainElement = getSemanticElement(semanticAdapter);
		final int visualID;
		if (semanticHint == null) {
			visualID = asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		} else {
			visualID = asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getVisualID(semanticHint);
		}
		switch(visualID) {
				case asu.ser.capstone.pivi.diagram.edit.parts.IfStartEditPart.VISUAL_ID: return createIfStart_2001(domainElement, containerView, index, persisted, preferencesHint);
				case asu.ser.capstone.pivi.diagram.edit.parts.WhileEndEditPart.VISUAL_ID: return createWhileEnd_2002(domainElement, containerView, index, persisted, preferencesHint);
				case asu.ser.capstone.pivi.diagram.edit.parts.MethodEndEditPart.VISUAL_ID: return createMethodEnd_2003(domainElement, containerView, index, persisted, preferencesHint);
				case asu.ser.capstone.pivi.diagram.edit.parts.IfEndEditPart.VISUAL_ID: return createIfEnd_2004(domainElement, containerView, index, persisted, preferencesHint);
				case asu.ser.capstone.pivi.diagram.edit.parts.InstructionEditPart.VISUAL_ID: return createInstruction_2005(domainElement, containerView, index, persisted, preferencesHint);
				case asu.ser.capstone.pivi.diagram.edit.parts.MethodStartEditPart.VISUAL_ID: return createMethodStart_2006(domainElement, containerView, index, persisted, preferencesHint);
				case asu.ser.capstone.pivi.diagram.edit.parts.WhileStartEditPart.VISUAL_ID: return createWhileStart_2007(domainElement, containerView, index, persisted, preferencesHint);
				case asu.ser.capstone.pivi.diagram.edit.parts.StartEditPart.VISUAL_ID: return createStart_2008(domainElement, containerView, index, persisted, preferencesHint);
				case asu.ser.capstone.pivi.diagram.edit.parts.ThreadEndEditPart.VISUAL_ID: return createThreadEnd_2009(domainElement, containerView, index, persisted, preferencesHint);
				case asu.ser.capstone.pivi.diagram.edit.parts.ThreadStartEditPart.VISUAL_ID: return createThreadStart_2010(domainElement, containerView, index, persisted, preferencesHint);
				case asu.ser.capstone.pivi.diagram.edit.parts.PrintStatementEditPart.VISUAL_ID: return createPrintStatement_2011(domainElement, containerView, index, persisted, preferencesHint);
				case asu.ser.capstone.pivi.diagram.edit.parts.InputPortEditPart.VISUAL_ID: return createInputPort_3001(domainElement, containerView, index, persisted, preferencesHint);
				case asu.ser.capstone.pivi.diagram.edit.parts.StartPortEditPart.VISUAL_ID: return createStartPort_3002(domainElement, containerView, index, persisted, preferencesHint);
				case asu.ser.capstone.pivi.diagram.edit.parts.OutputPortEditPart.VISUAL_ID: return createOutputPort_3003(domainElement, containerView, index, persisted, preferencesHint);
				}
		// can't happen, provided #provides(CreateNodeViewOperation) is correct
		return null;
	}

	/**
 * @generated
 */
	public org.eclipse.gmf.runtime.notation.Edge createEdge(org.eclipse.core.runtime.IAdaptable semanticAdapter, org.eclipse.gmf.runtime.notation.View containerView, String semanticHint, int index, boolean persisted, org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint preferencesHint) {
		org.eclipse.gmf.runtime.emf.type.core.IElementType elementType = getSemanticElementType(semanticAdapter);
		String elementTypeHint = ((org.eclipse.gmf.runtime.emf.type.core.IHintedType) elementType).getSemanticHint();
		switch (asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getVisualID(elementTypeHint)) {
				case asu.ser.capstone.pivi.diagram.edit.parts.StartStartPortEditPart.VISUAL_ID: return createStartStartPort_4004(containerView, index, persisted, preferencesHint);
				case asu.ser.capstone.pivi.diagram.edit.parts.OutputPortInputPortEditPart.VISUAL_ID: return createOutputPortInputPort_4002(containerView, index, persisted, preferencesHint);
				}
		// can never happen, provided #provides(CreateEdgeViewOperation) is correct
		return null;
	}

	/**
 * @generated
 */
	public org.eclipse.gmf.runtime.notation.Node createIfStart_2001(org.eclipse.emf.ecore.EObject domainElement, org.eclipse.gmf.runtime.notation.View containerView, int index, boolean persisted, org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint preferencesHint) {
		org.eclipse.gmf.runtime.notation.Shape node = org.eclipse.gmf.runtime.notation.NotationFactory.eINSTANCE.createShape();
						node.setLayoutConstraint(org.eclipse.gmf.runtime.notation.NotationFactory.eINSTANCE.createBounds());
		node.setType(asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.IfStartEditPart.VISUAL_ID));
		org.eclipse.gmf.runtime.diagram.core.util.ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		stampShortcut(containerView, node);
		// initializeFromPreferences 
		final org.eclipse.jface.preference.IPreferenceStore prefStore = (org.eclipse.jface.preference.IPreferenceStore) preferencesHint.getPreferenceStore();
			
				org.eclipse.swt.graphics.RGB lineRGB = org.eclipse.jface.preference.PreferenceConverter.getColor(prefStore, org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants.PREF_LINE_COLOR);
	org.eclipse.gmf.runtime.diagram.core.util.ViewUtil.setStructuralFeatureValue(node, org.eclipse.gmf.runtime.notation.NotationPackage.eINSTANCE.getLineStyle_LineColor(), org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities.RGBToInteger(lineRGB));
				org.eclipse.gmf.runtime.notation.FontStyle nodeFontStyle = (org.eclipse.gmf.runtime.notation.FontStyle) node.getStyle(org.eclipse.gmf.runtime.notation.NotationPackage.Literals.FONT_STYLE);
	if (nodeFontStyle != null) {
		org.eclipse.swt.graphics.FontData fontData = org.eclipse.jface.preference.PreferenceConverter.getFontData(prefStore, org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants.PREF_DEFAULT_FONT);
		nodeFontStyle.setFontName(fontData.getName());
		nodeFontStyle.setFontHeight(fontData.getHeight());
		nodeFontStyle.setBold((fontData.getStyle() & org.eclipse.swt.SWT.BOLD) != 0);
		nodeFontStyle.setItalic((fontData.getStyle() & org.eclipse.swt.SWT.ITALIC) != 0);
		org.eclipse.swt.graphics.RGB fontRGB = org.eclipse.jface.preference.PreferenceConverter.getColor(prefStore, org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants.PREF_FONT_COLOR);
		nodeFontStyle.setFontColor(org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities.RGBToInteger(fontRGB).intValue());
	}
				org.eclipse.swt.graphics.RGB fillRGB = org.eclipse.jface.preference.PreferenceConverter.getColor(prefStore, org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants.PREF_FILL_COLOR);
	org.eclipse.gmf.runtime.diagram.core.util.ViewUtil.setStructuralFeatureValue(node, org.eclipse.gmf.runtime.notation.NotationPackage.eINSTANCE.getFillStyle_FillColor(), org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities.RGBToInteger(fillRGB));
							createCompartment(node, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.IfStartIfStartFigureCompartmentEditPart.VISUAL_ID), false, false, true, true);
						return node;
	}
	/**
 * @generated
 */
	public org.eclipse.gmf.runtime.notation.Node createWhileEnd_2002(org.eclipse.emf.ecore.EObject domainElement, org.eclipse.gmf.runtime.notation.View containerView, int index, boolean persisted, org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint preferencesHint) {
		org.eclipse.gmf.runtime.notation.Shape node = org.eclipse.gmf.runtime.notation.NotationFactory.eINSTANCE.createShape();
						node.setLayoutConstraint(org.eclipse.gmf.runtime.notation.NotationFactory.eINSTANCE.createBounds());
		node.setType(asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.WhileEndEditPart.VISUAL_ID));
		org.eclipse.gmf.runtime.diagram.core.util.ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		stampShortcut(containerView, node);
		// initializeFromPreferences 
		final org.eclipse.jface.preference.IPreferenceStore prefStore = (org.eclipse.jface.preference.IPreferenceStore) preferencesHint.getPreferenceStore();
			
				org.eclipse.swt.graphics.RGB lineRGB = org.eclipse.jface.preference.PreferenceConverter.getColor(prefStore, org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants.PREF_LINE_COLOR);
	org.eclipse.gmf.runtime.diagram.core.util.ViewUtil.setStructuralFeatureValue(node, org.eclipse.gmf.runtime.notation.NotationPackage.eINSTANCE.getLineStyle_LineColor(), org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities.RGBToInteger(lineRGB));
				org.eclipse.gmf.runtime.notation.FontStyle nodeFontStyle = (org.eclipse.gmf.runtime.notation.FontStyle) node.getStyle(org.eclipse.gmf.runtime.notation.NotationPackage.Literals.FONT_STYLE);
	if (nodeFontStyle != null) {
		org.eclipse.swt.graphics.FontData fontData = org.eclipse.jface.preference.PreferenceConverter.getFontData(prefStore, org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants.PREF_DEFAULT_FONT);
		nodeFontStyle.setFontName(fontData.getName());
		nodeFontStyle.setFontHeight(fontData.getHeight());
		nodeFontStyle.setBold((fontData.getStyle() & org.eclipse.swt.SWT.BOLD) != 0);
		nodeFontStyle.setItalic((fontData.getStyle() & org.eclipse.swt.SWT.ITALIC) != 0);
		org.eclipse.swt.graphics.RGB fontRGB = org.eclipse.jface.preference.PreferenceConverter.getColor(prefStore, org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants.PREF_FONT_COLOR);
		nodeFontStyle.setFontColor(org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities.RGBToInteger(fontRGB).intValue());
	}
				org.eclipse.swt.graphics.RGB fillRGB = org.eclipse.jface.preference.PreferenceConverter.getColor(prefStore, org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants.PREF_FILL_COLOR);
	org.eclipse.gmf.runtime.diagram.core.util.ViewUtil.setStructuralFeatureValue(node, org.eclipse.gmf.runtime.notation.NotationPackage.eINSTANCE.getFillStyle_FillColor(), org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities.RGBToInteger(fillRGB));
							createCompartment(node, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.WhileEndWhileEndFigureCompartmentEditPart.VISUAL_ID), false, false, true, true);
						return node;
	}
	/**
 * @generated
 */
	public org.eclipse.gmf.runtime.notation.Node createMethodEnd_2003(org.eclipse.emf.ecore.EObject domainElement, org.eclipse.gmf.runtime.notation.View containerView, int index, boolean persisted, org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint preferencesHint) {
		org.eclipse.gmf.runtime.notation.Shape node = org.eclipse.gmf.runtime.notation.NotationFactory.eINSTANCE.createShape();
						node.setLayoutConstraint(org.eclipse.gmf.runtime.notation.NotationFactory.eINSTANCE.createBounds());
		node.setType(asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.MethodEndEditPart.VISUAL_ID));
		org.eclipse.gmf.runtime.diagram.core.util.ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		stampShortcut(containerView, node);
		// initializeFromPreferences 
		final org.eclipse.jface.preference.IPreferenceStore prefStore = (org.eclipse.jface.preference.IPreferenceStore) preferencesHint.getPreferenceStore();
			
				org.eclipse.swt.graphics.RGB lineRGB = org.eclipse.jface.preference.PreferenceConverter.getColor(prefStore, org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants.PREF_LINE_COLOR);
	org.eclipse.gmf.runtime.diagram.core.util.ViewUtil.setStructuralFeatureValue(node, org.eclipse.gmf.runtime.notation.NotationPackage.eINSTANCE.getLineStyle_LineColor(), org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities.RGBToInteger(lineRGB));
				org.eclipse.gmf.runtime.notation.FontStyle nodeFontStyle = (org.eclipse.gmf.runtime.notation.FontStyle) node.getStyle(org.eclipse.gmf.runtime.notation.NotationPackage.Literals.FONT_STYLE);
	if (nodeFontStyle != null) {
		org.eclipse.swt.graphics.FontData fontData = org.eclipse.jface.preference.PreferenceConverter.getFontData(prefStore, org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants.PREF_DEFAULT_FONT);
		nodeFontStyle.setFontName(fontData.getName());
		nodeFontStyle.setFontHeight(fontData.getHeight());
		nodeFontStyle.setBold((fontData.getStyle() & org.eclipse.swt.SWT.BOLD) != 0);
		nodeFontStyle.setItalic((fontData.getStyle() & org.eclipse.swt.SWT.ITALIC) != 0);
		org.eclipse.swt.graphics.RGB fontRGB = org.eclipse.jface.preference.PreferenceConverter.getColor(prefStore, org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants.PREF_FONT_COLOR);
		nodeFontStyle.setFontColor(org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities.RGBToInteger(fontRGB).intValue());
	}
				org.eclipse.swt.graphics.RGB fillRGB = org.eclipse.jface.preference.PreferenceConverter.getColor(prefStore, org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants.PREF_FILL_COLOR);
	org.eclipse.gmf.runtime.diagram.core.util.ViewUtil.setStructuralFeatureValue(node, org.eclipse.gmf.runtime.notation.NotationPackage.eINSTANCE.getFillStyle_FillColor(), org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities.RGBToInteger(fillRGB));
							createCompartment(node, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.MethodEndMethodEndFigureCompartmentEditPart.VISUAL_ID), false, false, true, true);
						return node;
	}
	/**
 * @generated
 */
	public org.eclipse.gmf.runtime.notation.Node createIfEnd_2004(org.eclipse.emf.ecore.EObject domainElement, org.eclipse.gmf.runtime.notation.View containerView, int index, boolean persisted, org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint preferencesHint) {
		org.eclipse.gmf.runtime.notation.Shape node = org.eclipse.gmf.runtime.notation.NotationFactory.eINSTANCE.createShape();
						node.setLayoutConstraint(org.eclipse.gmf.runtime.notation.NotationFactory.eINSTANCE.createBounds());
		node.setType(asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.IfEndEditPart.VISUAL_ID));
		org.eclipse.gmf.runtime.diagram.core.util.ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		stampShortcut(containerView, node);
		// initializeFromPreferences 
		final org.eclipse.jface.preference.IPreferenceStore prefStore = (org.eclipse.jface.preference.IPreferenceStore) preferencesHint.getPreferenceStore();
			
				org.eclipse.swt.graphics.RGB lineRGB = org.eclipse.jface.preference.PreferenceConverter.getColor(prefStore, org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants.PREF_LINE_COLOR);
	org.eclipse.gmf.runtime.diagram.core.util.ViewUtil.setStructuralFeatureValue(node, org.eclipse.gmf.runtime.notation.NotationPackage.eINSTANCE.getLineStyle_LineColor(), org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities.RGBToInteger(lineRGB));
				org.eclipse.gmf.runtime.notation.FontStyle nodeFontStyle = (org.eclipse.gmf.runtime.notation.FontStyle) node.getStyle(org.eclipse.gmf.runtime.notation.NotationPackage.Literals.FONT_STYLE);
	if (nodeFontStyle != null) {
		org.eclipse.swt.graphics.FontData fontData = org.eclipse.jface.preference.PreferenceConverter.getFontData(prefStore, org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants.PREF_DEFAULT_FONT);
		nodeFontStyle.setFontName(fontData.getName());
		nodeFontStyle.setFontHeight(fontData.getHeight());
		nodeFontStyle.setBold((fontData.getStyle() & org.eclipse.swt.SWT.BOLD) != 0);
		nodeFontStyle.setItalic((fontData.getStyle() & org.eclipse.swt.SWT.ITALIC) != 0);
		org.eclipse.swt.graphics.RGB fontRGB = org.eclipse.jface.preference.PreferenceConverter.getColor(prefStore, org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants.PREF_FONT_COLOR);
		nodeFontStyle.setFontColor(org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities.RGBToInteger(fontRGB).intValue());
	}
				org.eclipse.swt.graphics.RGB fillRGB = org.eclipse.jface.preference.PreferenceConverter.getColor(prefStore, org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants.PREF_FILL_COLOR);
	org.eclipse.gmf.runtime.diagram.core.util.ViewUtil.setStructuralFeatureValue(node, org.eclipse.gmf.runtime.notation.NotationPackage.eINSTANCE.getFillStyle_FillColor(), org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities.RGBToInteger(fillRGB));
							createCompartment(node, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.IfEndIfEndFigureCompartmentEditPart.VISUAL_ID), false, false, true, true);
						return node;
	}
	/**
 * @generated
 */
	public org.eclipse.gmf.runtime.notation.Node createInstruction_2005(org.eclipse.emf.ecore.EObject domainElement, org.eclipse.gmf.runtime.notation.View containerView, int index, boolean persisted, org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint preferencesHint) {
		org.eclipse.gmf.runtime.notation.Shape node = org.eclipse.gmf.runtime.notation.NotationFactory.eINSTANCE.createShape();
						node.setLayoutConstraint(org.eclipse.gmf.runtime.notation.NotationFactory.eINSTANCE.createBounds());
		node.setType(asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.InstructionEditPart.VISUAL_ID));
		org.eclipse.gmf.runtime.diagram.core.util.ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		stampShortcut(containerView, node);
		// initializeFromPreferences 
		final org.eclipse.jface.preference.IPreferenceStore prefStore = (org.eclipse.jface.preference.IPreferenceStore) preferencesHint.getPreferenceStore();
			
				org.eclipse.swt.graphics.RGB lineRGB = org.eclipse.jface.preference.PreferenceConverter.getColor(prefStore, org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants.PREF_LINE_COLOR);
	org.eclipse.gmf.runtime.diagram.core.util.ViewUtil.setStructuralFeatureValue(node, org.eclipse.gmf.runtime.notation.NotationPackage.eINSTANCE.getLineStyle_LineColor(), org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities.RGBToInteger(lineRGB));
				org.eclipse.gmf.runtime.notation.FontStyle nodeFontStyle = (org.eclipse.gmf.runtime.notation.FontStyle) node.getStyle(org.eclipse.gmf.runtime.notation.NotationPackage.Literals.FONT_STYLE);
	if (nodeFontStyle != null) {
		org.eclipse.swt.graphics.FontData fontData = org.eclipse.jface.preference.PreferenceConverter.getFontData(prefStore, org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants.PREF_DEFAULT_FONT);
		nodeFontStyle.setFontName(fontData.getName());
		nodeFontStyle.setFontHeight(fontData.getHeight());
		nodeFontStyle.setBold((fontData.getStyle() & org.eclipse.swt.SWT.BOLD) != 0);
		nodeFontStyle.setItalic((fontData.getStyle() & org.eclipse.swt.SWT.ITALIC) != 0);
		org.eclipse.swt.graphics.RGB fontRGB = org.eclipse.jface.preference.PreferenceConverter.getColor(prefStore, org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants.PREF_FONT_COLOR);
		nodeFontStyle.setFontColor(org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities.RGBToInteger(fontRGB).intValue());
	}
				org.eclipse.swt.graphics.RGB fillRGB = org.eclipse.jface.preference.PreferenceConverter.getColor(prefStore, org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants.PREF_FILL_COLOR);
	org.eclipse.gmf.runtime.diagram.core.util.ViewUtil.setStructuralFeatureValue(node, org.eclipse.gmf.runtime.notation.NotationPackage.eINSTANCE.getFillStyle_FillColor(), org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities.RGBToInteger(fillRGB));
							createCompartment(node, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.InstructionInstructionFigureCompartmentEditPart.VISUAL_ID), false, false, true, true);
						return node;
	}
	/**
 * @generated
 */
	public org.eclipse.gmf.runtime.notation.Node createMethodStart_2006(org.eclipse.emf.ecore.EObject domainElement, org.eclipse.gmf.runtime.notation.View containerView, int index, boolean persisted, org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint preferencesHint) {
		org.eclipse.gmf.runtime.notation.Shape node = org.eclipse.gmf.runtime.notation.NotationFactory.eINSTANCE.createShape();
						node.setLayoutConstraint(org.eclipse.gmf.runtime.notation.NotationFactory.eINSTANCE.createBounds());
		node.setType(asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.MethodStartEditPart.VISUAL_ID));
		org.eclipse.gmf.runtime.diagram.core.util.ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		stampShortcut(containerView, node);
		// initializeFromPreferences 
		final org.eclipse.jface.preference.IPreferenceStore prefStore = (org.eclipse.jface.preference.IPreferenceStore) preferencesHint.getPreferenceStore();
			
				org.eclipse.swt.graphics.RGB lineRGB = org.eclipse.jface.preference.PreferenceConverter.getColor(prefStore, org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants.PREF_LINE_COLOR);
	org.eclipse.gmf.runtime.diagram.core.util.ViewUtil.setStructuralFeatureValue(node, org.eclipse.gmf.runtime.notation.NotationPackage.eINSTANCE.getLineStyle_LineColor(), org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities.RGBToInteger(lineRGB));
				org.eclipse.gmf.runtime.notation.FontStyle nodeFontStyle = (org.eclipse.gmf.runtime.notation.FontStyle) node.getStyle(org.eclipse.gmf.runtime.notation.NotationPackage.Literals.FONT_STYLE);
	if (nodeFontStyle != null) {
		org.eclipse.swt.graphics.FontData fontData = org.eclipse.jface.preference.PreferenceConverter.getFontData(prefStore, org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants.PREF_DEFAULT_FONT);
		nodeFontStyle.setFontName(fontData.getName());
		nodeFontStyle.setFontHeight(fontData.getHeight());
		nodeFontStyle.setBold((fontData.getStyle() & org.eclipse.swt.SWT.BOLD) != 0);
		nodeFontStyle.setItalic((fontData.getStyle() & org.eclipse.swt.SWT.ITALIC) != 0);
		org.eclipse.swt.graphics.RGB fontRGB = org.eclipse.jface.preference.PreferenceConverter.getColor(prefStore, org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants.PREF_FONT_COLOR);
		nodeFontStyle.setFontColor(org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities.RGBToInteger(fontRGB).intValue());
	}
				org.eclipse.swt.graphics.RGB fillRGB = org.eclipse.jface.preference.PreferenceConverter.getColor(prefStore, org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants.PREF_FILL_COLOR);
	org.eclipse.gmf.runtime.diagram.core.util.ViewUtil.setStructuralFeatureValue(node, org.eclipse.gmf.runtime.notation.NotationPackage.eINSTANCE.getFillStyle_FillColor(), org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities.RGBToInteger(fillRGB));
							createCompartment(node, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.MethodStartMethodStartFigureCompartmentEditPart.VISUAL_ID), false, false, true, true);
						return node;
	}
	/**
 * @generated
 */
	public org.eclipse.gmf.runtime.notation.Node createWhileStart_2007(org.eclipse.emf.ecore.EObject domainElement, org.eclipse.gmf.runtime.notation.View containerView, int index, boolean persisted, org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint preferencesHint) {
		org.eclipse.gmf.runtime.notation.Shape node = org.eclipse.gmf.runtime.notation.NotationFactory.eINSTANCE.createShape();
						node.setLayoutConstraint(org.eclipse.gmf.runtime.notation.NotationFactory.eINSTANCE.createBounds());
		node.setType(asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.WhileStartEditPart.VISUAL_ID));
		org.eclipse.gmf.runtime.diagram.core.util.ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		stampShortcut(containerView, node);
		// initializeFromPreferences 
		final org.eclipse.jface.preference.IPreferenceStore prefStore = (org.eclipse.jface.preference.IPreferenceStore) preferencesHint.getPreferenceStore();
			
				org.eclipse.swt.graphics.RGB lineRGB = org.eclipse.jface.preference.PreferenceConverter.getColor(prefStore, org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants.PREF_LINE_COLOR);
	org.eclipse.gmf.runtime.diagram.core.util.ViewUtil.setStructuralFeatureValue(node, org.eclipse.gmf.runtime.notation.NotationPackage.eINSTANCE.getLineStyle_LineColor(), org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities.RGBToInteger(lineRGB));
				org.eclipse.gmf.runtime.notation.FontStyle nodeFontStyle = (org.eclipse.gmf.runtime.notation.FontStyle) node.getStyle(org.eclipse.gmf.runtime.notation.NotationPackage.Literals.FONT_STYLE);
	if (nodeFontStyle != null) {
		org.eclipse.swt.graphics.FontData fontData = org.eclipse.jface.preference.PreferenceConverter.getFontData(prefStore, org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants.PREF_DEFAULT_FONT);
		nodeFontStyle.setFontName(fontData.getName());
		nodeFontStyle.setFontHeight(fontData.getHeight());
		nodeFontStyle.setBold((fontData.getStyle() & org.eclipse.swt.SWT.BOLD) != 0);
		nodeFontStyle.setItalic((fontData.getStyle() & org.eclipse.swt.SWT.ITALIC) != 0);
		org.eclipse.swt.graphics.RGB fontRGB = org.eclipse.jface.preference.PreferenceConverter.getColor(prefStore, org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants.PREF_FONT_COLOR);
		nodeFontStyle.setFontColor(org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities.RGBToInteger(fontRGB).intValue());
	}
				org.eclipse.swt.graphics.RGB fillRGB = org.eclipse.jface.preference.PreferenceConverter.getColor(prefStore, org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants.PREF_FILL_COLOR);
	org.eclipse.gmf.runtime.diagram.core.util.ViewUtil.setStructuralFeatureValue(node, org.eclipse.gmf.runtime.notation.NotationPackage.eINSTANCE.getFillStyle_FillColor(), org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities.RGBToInteger(fillRGB));
							createCompartment(node, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.WhileStartWhileStartFigureCompartmentEditPart.VISUAL_ID), false, false, true, true);
						return node;
	}
	/**
 * @generated
 */
	public org.eclipse.gmf.runtime.notation.Node createStart_2008(org.eclipse.emf.ecore.EObject domainElement, org.eclipse.gmf.runtime.notation.View containerView, int index, boolean persisted, org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint preferencesHint) {
		org.eclipse.gmf.runtime.notation.Shape node = org.eclipse.gmf.runtime.notation.NotationFactory.eINSTANCE.createShape();
						node.setLayoutConstraint(org.eclipse.gmf.runtime.notation.NotationFactory.eINSTANCE.createBounds());
		node.setType(asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.StartEditPart.VISUAL_ID));
		org.eclipse.gmf.runtime.diagram.core.util.ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		stampShortcut(containerView, node);
		// initializeFromPreferences 
		final org.eclipse.jface.preference.IPreferenceStore prefStore = (org.eclipse.jface.preference.IPreferenceStore) preferencesHint.getPreferenceStore();
			
				org.eclipse.swt.graphics.RGB lineRGB = org.eclipse.jface.preference.PreferenceConverter.getColor(prefStore, org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants.PREF_LINE_COLOR);
	org.eclipse.gmf.runtime.diagram.core.util.ViewUtil.setStructuralFeatureValue(node, org.eclipse.gmf.runtime.notation.NotationPackage.eINSTANCE.getLineStyle_LineColor(), org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities.RGBToInteger(lineRGB));
				org.eclipse.gmf.runtime.notation.FontStyle nodeFontStyle = (org.eclipse.gmf.runtime.notation.FontStyle) node.getStyle(org.eclipse.gmf.runtime.notation.NotationPackage.Literals.FONT_STYLE);
	if (nodeFontStyle != null) {
		org.eclipse.swt.graphics.FontData fontData = org.eclipse.jface.preference.PreferenceConverter.getFontData(prefStore, org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants.PREF_DEFAULT_FONT);
		nodeFontStyle.setFontName(fontData.getName());
		nodeFontStyle.setFontHeight(fontData.getHeight());
		nodeFontStyle.setBold((fontData.getStyle() & org.eclipse.swt.SWT.BOLD) != 0);
		nodeFontStyle.setItalic((fontData.getStyle() & org.eclipse.swt.SWT.ITALIC) != 0);
		org.eclipse.swt.graphics.RGB fontRGB = org.eclipse.jface.preference.PreferenceConverter.getColor(prefStore, org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants.PREF_FONT_COLOR);
		nodeFontStyle.setFontColor(org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities.RGBToInteger(fontRGB).intValue());
	}
				org.eclipse.swt.graphics.RGB fillRGB = org.eclipse.jface.preference.PreferenceConverter.getColor(prefStore, org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants.PREF_FILL_COLOR);
	org.eclipse.gmf.runtime.diagram.core.util.ViewUtil.setStructuralFeatureValue(node, org.eclipse.gmf.runtime.notation.NotationPackage.eINSTANCE.getFillStyle_FillColor(), org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities.RGBToInteger(fillRGB));
							return node;
	}
	/**
 * @generated
 */
	public org.eclipse.gmf.runtime.notation.Node createThreadEnd_2009(org.eclipse.emf.ecore.EObject domainElement, org.eclipse.gmf.runtime.notation.View containerView, int index, boolean persisted, org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint preferencesHint) {
		org.eclipse.gmf.runtime.notation.Shape node = org.eclipse.gmf.runtime.notation.NotationFactory.eINSTANCE.createShape();
						node.setLayoutConstraint(org.eclipse.gmf.runtime.notation.NotationFactory.eINSTANCE.createBounds());
		node.setType(asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.ThreadEndEditPart.VISUAL_ID));
		org.eclipse.gmf.runtime.diagram.core.util.ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		stampShortcut(containerView, node);
		// initializeFromPreferences 
		final org.eclipse.jface.preference.IPreferenceStore prefStore = (org.eclipse.jface.preference.IPreferenceStore) preferencesHint.getPreferenceStore();
			
				org.eclipse.swt.graphics.RGB lineRGB = org.eclipse.jface.preference.PreferenceConverter.getColor(prefStore, org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants.PREF_LINE_COLOR);
	org.eclipse.gmf.runtime.diagram.core.util.ViewUtil.setStructuralFeatureValue(node, org.eclipse.gmf.runtime.notation.NotationPackage.eINSTANCE.getLineStyle_LineColor(), org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities.RGBToInteger(lineRGB));
				org.eclipse.gmf.runtime.notation.FontStyle nodeFontStyle = (org.eclipse.gmf.runtime.notation.FontStyle) node.getStyle(org.eclipse.gmf.runtime.notation.NotationPackage.Literals.FONT_STYLE);
	if (nodeFontStyle != null) {
		org.eclipse.swt.graphics.FontData fontData = org.eclipse.jface.preference.PreferenceConverter.getFontData(prefStore, org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants.PREF_DEFAULT_FONT);
		nodeFontStyle.setFontName(fontData.getName());
		nodeFontStyle.setFontHeight(fontData.getHeight());
		nodeFontStyle.setBold((fontData.getStyle() & org.eclipse.swt.SWT.BOLD) != 0);
		nodeFontStyle.setItalic((fontData.getStyle() & org.eclipse.swt.SWT.ITALIC) != 0);
		org.eclipse.swt.graphics.RGB fontRGB = org.eclipse.jface.preference.PreferenceConverter.getColor(prefStore, org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants.PREF_FONT_COLOR);
		nodeFontStyle.setFontColor(org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities.RGBToInteger(fontRGB).intValue());
	}
				org.eclipse.swt.graphics.RGB fillRGB = org.eclipse.jface.preference.PreferenceConverter.getColor(prefStore, org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants.PREF_FILL_COLOR);
	org.eclipse.gmf.runtime.diagram.core.util.ViewUtil.setStructuralFeatureValue(node, org.eclipse.gmf.runtime.notation.NotationPackage.eINSTANCE.getFillStyle_FillColor(), org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities.RGBToInteger(fillRGB));
							createCompartment(node, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.ThreadEndThreadEndFigureCompartmentEditPart.VISUAL_ID), false, false, true, true);
						return node;
	}
	/**
 * @generated
 */
	public org.eclipse.gmf.runtime.notation.Node createThreadStart_2010(org.eclipse.emf.ecore.EObject domainElement, org.eclipse.gmf.runtime.notation.View containerView, int index, boolean persisted, org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint preferencesHint) {
		org.eclipse.gmf.runtime.notation.Shape node = org.eclipse.gmf.runtime.notation.NotationFactory.eINSTANCE.createShape();
						node.setLayoutConstraint(org.eclipse.gmf.runtime.notation.NotationFactory.eINSTANCE.createBounds());
		node.setType(asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.ThreadStartEditPart.VISUAL_ID));
		org.eclipse.gmf.runtime.diagram.core.util.ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		stampShortcut(containerView, node);
		// initializeFromPreferences 
		final org.eclipse.jface.preference.IPreferenceStore prefStore = (org.eclipse.jface.preference.IPreferenceStore) preferencesHint.getPreferenceStore();
			
				org.eclipse.swt.graphics.RGB lineRGB = org.eclipse.jface.preference.PreferenceConverter.getColor(prefStore, org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants.PREF_LINE_COLOR);
	org.eclipse.gmf.runtime.diagram.core.util.ViewUtil.setStructuralFeatureValue(node, org.eclipse.gmf.runtime.notation.NotationPackage.eINSTANCE.getLineStyle_LineColor(), org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities.RGBToInteger(lineRGB));
				org.eclipse.gmf.runtime.notation.FontStyle nodeFontStyle = (org.eclipse.gmf.runtime.notation.FontStyle) node.getStyle(org.eclipse.gmf.runtime.notation.NotationPackage.Literals.FONT_STYLE);
	if (nodeFontStyle != null) {
		org.eclipse.swt.graphics.FontData fontData = org.eclipse.jface.preference.PreferenceConverter.getFontData(prefStore, org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants.PREF_DEFAULT_FONT);
		nodeFontStyle.setFontName(fontData.getName());
		nodeFontStyle.setFontHeight(fontData.getHeight());
		nodeFontStyle.setBold((fontData.getStyle() & org.eclipse.swt.SWT.BOLD) != 0);
		nodeFontStyle.setItalic((fontData.getStyle() & org.eclipse.swt.SWT.ITALIC) != 0);
		org.eclipse.swt.graphics.RGB fontRGB = org.eclipse.jface.preference.PreferenceConverter.getColor(prefStore, org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants.PREF_FONT_COLOR);
		nodeFontStyle.setFontColor(org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities.RGBToInteger(fontRGB).intValue());
	}
				org.eclipse.swt.graphics.RGB fillRGB = org.eclipse.jface.preference.PreferenceConverter.getColor(prefStore, org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants.PREF_FILL_COLOR);
	org.eclipse.gmf.runtime.diagram.core.util.ViewUtil.setStructuralFeatureValue(node, org.eclipse.gmf.runtime.notation.NotationPackage.eINSTANCE.getFillStyle_FillColor(), org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities.RGBToInteger(fillRGB));
							createCompartment(node, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.ThreadStartThreadStartFigureCompartmentEditPart.VISUAL_ID), false, false, true, true);
						return node;
	}
	/**
 * @generated
 */
	public org.eclipse.gmf.runtime.notation.Node createPrintStatement_2011(org.eclipse.emf.ecore.EObject domainElement, org.eclipse.gmf.runtime.notation.View containerView, int index, boolean persisted, org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint preferencesHint) {
		org.eclipse.gmf.runtime.notation.Shape node = org.eclipse.gmf.runtime.notation.NotationFactory.eINSTANCE.createShape();
						node.setLayoutConstraint(org.eclipse.gmf.runtime.notation.NotationFactory.eINSTANCE.createBounds());
		node.setType(asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.PrintStatementEditPart.VISUAL_ID));
		org.eclipse.gmf.runtime.diagram.core.util.ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		stampShortcut(containerView, node);
		// initializeFromPreferences 
		final org.eclipse.jface.preference.IPreferenceStore prefStore = (org.eclipse.jface.preference.IPreferenceStore) preferencesHint.getPreferenceStore();
			
				org.eclipse.swt.graphics.RGB lineRGB = org.eclipse.jface.preference.PreferenceConverter.getColor(prefStore, org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants.PREF_LINE_COLOR);
	org.eclipse.gmf.runtime.diagram.core.util.ViewUtil.setStructuralFeatureValue(node, org.eclipse.gmf.runtime.notation.NotationPackage.eINSTANCE.getLineStyle_LineColor(), org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities.RGBToInteger(lineRGB));
				org.eclipse.gmf.runtime.notation.FontStyle nodeFontStyle = (org.eclipse.gmf.runtime.notation.FontStyle) node.getStyle(org.eclipse.gmf.runtime.notation.NotationPackage.Literals.FONT_STYLE);
	if (nodeFontStyle != null) {
		org.eclipse.swt.graphics.FontData fontData = org.eclipse.jface.preference.PreferenceConverter.getFontData(prefStore, org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants.PREF_DEFAULT_FONT);
		nodeFontStyle.setFontName(fontData.getName());
		nodeFontStyle.setFontHeight(fontData.getHeight());
		nodeFontStyle.setBold((fontData.getStyle() & org.eclipse.swt.SWT.BOLD) != 0);
		nodeFontStyle.setItalic((fontData.getStyle() & org.eclipse.swt.SWT.ITALIC) != 0);
		org.eclipse.swt.graphics.RGB fontRGB = org.eclipse.jface.preference.PreferenceConverter.getColor(prefStore, org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants.PREF_FONT_COLOR);
		nodeFontStyle.setFontColor(org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities.RGBToInteger(fontRGB).intValue());
	}
				org.eclipse.swt.graphics.RGB fillRGB = org.eclipse.jface.preference.PreferenceConverter.getColor(prefStore, org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants.PREF_FILL_COLOR);
	org.eclipse.gmf.runtime.diagram.core.util.ViewUtil.setStructuralFeatureValue(node, org.eclipse.gmf.runtime.notation.NotationPackage.eINSTANCE.getFillStyle_FillColor(), org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities.RGBToInteger(fillRGB));
							createCompartment(node, asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.PrintStatementPrintStatementFigureCompartmentEditPart.VISUAL_ID), false, false, true, true);
						return node;
	}
	/**
 * @generated
 */
	public org.eclipse.gmf.runtime.notation.Node createInputPort_3001(org.eclipse.emf.ecore.EObject domainElement, org.eclipse.gmf.runtime.notation.View containerView, int index, boolean persisted, org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint preferencesHint) {
		org.eclipse.gmf.runtime.notation.Shape node = org.eclipse.gmf.runtime.notation.NotationFactory.eINSTANCE.createShape();
						node.setLayoutConstraint(org.eclipse.gmf.runtime.notation.NotationFactory.eINSTANCE.createBounds());
		node.setType(asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.InputPortEditPart.VISUAL_ID));
		org.eclipse.gmf.runtime.diagram.core.util.ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final org.eclipse.jface.preference.IPreferenceStore prefStore = (org.eclipse.jface.preference.IPreferenceStore) preferencesHint.getPreferenceStore();
			
				org.eclipse.swt.graphics.RGB lineRGB = org.eclipse.jface.preference.PreferenceConverter.getColor(prefStore, org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants.PREF_LINE_COLOR);
	org.eclipse.gmf.runtime.diagram.core.util.ViewUtil.setStructuralFeatureValue(node, org.eclipse.gmf.runtime.notation.NotationPackage.eINSTANCE.getLineStyle_LineColor(), org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities.RGBToInteger(lineRGB));
				org.eclipse.gmf.runtime.notation.FontStyle nodeFontStyle = (org.eclipse.gmf.runtime.notation.FontStyle) node.getStyle(org.eclipse.gmf.runtime.notation.NotationPackage.Literals.FONT_STYLE);
	if (nodeFontStyle != null) {
		org.eclipse.swt.graphics.FontData fontData = org.eclipse.jface.preference.PreferenceConverter.getFontData(prefStore, org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants.PREF_DEFAULT_FONT);
		nodeFontStyle.setFontName(fontData.getName());
		nodeFontStyle.setFontHeight(fontData.getHeight());
		nodeFontStyle.setBold((fontData.getStyle() & org.eclipse.swt.SWT.BOLD) != 0);
		nodeFontStyle.setItalic((fontData.getStyle() & org.eclipse.swt.SWT.ITALIC) != 0);
		org.eclipse.swt.graphics.RGB fontRGB = org.eclipse.jface.preference.PreferenceConverter.getColor(prefStore, org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants.PREF_FONT_COLOR);
		nodeFontStyle.setFontColor(org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities.RGBToInteger(fontRGB).intValue());
	}
				org.eclipse.swt.graphics.RGB fillRGB = org.eclipse.jface.preference.PreferenceConverter.getColor(prefStore, org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants.PREF_FILL_COLOR);
	org.eclipse.gmf.runtime.diagram.core.util.ViewUtil.setStructuralFeatureValue(node, org.eclipse.gmf.runtime.notation.NotationPackage.eINSTANCE.getFillStyle_FillColor(), org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities.RGBToInteger(fillRGB));
							return node;
	}
	/**
 * @generated
 */
	public org.eclipse.gmf.runtime.notation.Node createStartPort_3002(org.eclipse.emf.ecore.EObject domainElement, org.eclipse.gmf.runtime.notation.View containerView, int index, boolean persisted, org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint preferencesHint) {
		org.eclipse.gmf.runtime.notation.Shape node = org.eclipse.gmf.runtime.notation.NotationFactory.eINSTANCE.createShape();
						node.setLayoutConstraint(org.eclipse.gmf.runtime.notation.NotationFactory.eINSTANCE.createBounds());
		node.setType(asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.StartPortEditPart.VISUAL_ID));
		org.eclipse.gmf.runtime.diagram.core.util.ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final org.eclipse.jface.preference.IPreferenceStore prefStore = (org.eclipse.jface.preference.IPreferenceStore) preferencesHint.getPreferenceStore();
			
				org.eclipse.swt.graphics.RGB lineRGB = org.eclipse.jface.preference.PreferenceConverter.getColor(prefStore, org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants.PREF_LINE_COLOR);
	org.eclipse.gmf.runtime.diagram.core.util.ViewUtil.setStructuralFeatureValue(node, org.eclipse.gmf.runtime.notation.NotationPackage.eINSTANCE.getLineStyle_LineColor(), org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities.RGBToInteger(lineRGB));
				org.eclipse.gmf.runtime.notation.FontStyle nodeFontStyle = (org.eclipse.gmf.runtime.notation.FontStyle) node.getStyle(org.eclipse.gmf.runtime.notation.NotationPackage.Literals.FONT_STYLE);
	if (nodeFontStyle != null) {
		org.eclipse.swt.graphics.FontData fontData = org.eclipse.jface.preference.PreferenceConverter.getFontData(prefStore, org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants.PREF_DEFAULT_FONT);
		nodeFontStyle.setFontName(fontData.getName());
		nodeFontStyle.setFontHeight(fontData.getHeight());
		nodeFontStyle.setBold((fontData.getStyle() & org.eclipse.swt.SWT.BOLD) != 0);
		nodeFontStyle.setItalic((fontData.getStyle() & org.eclipse.swt.SWT.ITALIC) != 0);
		org.eclipse.swt.graphics.RGB fontRGB = org.eclipse.jface.preference.PreferenceConverter.getColor(prefStore, org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants.PREF_FONT_COLOR);
		nodeFontStyle.setFontColor(org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities.RGBToInteger(fontRGB).intValue());
	}
				org.eclipse.swt.graphics.RGB fillRGB = org.eclipse.jface.preference.PreferenceConverter.getColor(prefStore, org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants.PREF_FILL_COLOR);
	org.eclipse.gmf.runtime.diagram.core.util.ViewUtil.setStructuralFeatureValue(node, org.eclipse.gmf.runtime.notation.NotationPackage.eINSTANCE.getFillStyle_FillColor(), org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities.RGBToInteger(fillRGB));
							return node;
	}
	/**
 * @generated
 */
	public org.eclipse.gmf.runtime.notation.Node createOutputPort_3003(org.eclipse.emf.ecore.EObject domainElement, org.eclipse.gmf.runtime.notation.View containerView, int index, boolean persisted, org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint preferencesHint) {
		org.eclipse.gmf.runtime.notation.Shape node = org.eclipse.gmf.runtime.notation.NotationFactory.eINSTANCE.createShape();
						node.setLayoutConstraint(org.eclipse.gmf.runtime.notation.NotationFactory.eINSTANCE.createBounds());
		node.setType(asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.OutputPortEditPart.VISUAL_ID));
		org.eclipse.gmf.runtime.diagram.core.util.ViewUtil.insertChildView(containerView, node, index, persisted);
		node.setElement(domainElement);
		// initializeFromPreferences 
		final org.eclipse.jface.preference.IPreferenceStore prefStore = (org.eclipse.jface.preference.IPreferenceStore) preferencesHint.getPreferenceStore();
			
				org.eclipse.swt.graphics.RGB lineRGB = org.eclipse.jface.preference.PreferenceConverter.getColor(prefStore, org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants.PREF_LINE_COLOR);
	org.eclipse.gmf.runtime.diagram.core.util.ViewUtil.setStructuralFeatureValue(node, org.eclipse.gmf.runtime.notation.NotationPackage.eINSTANCE.getLineStyle_LineColor(), org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities.RGBToInteger(lineRGB));
				org.eclipse.gmf.runtime.notation.FontStyle nodeFontStyle = (org.eclipse.gmf.runtime.notation.FontStyle) node.getStyle(org.eclipse.gmf.runtime.notation.NotationPackage.Literals.FONT_STYLE);
	if (nodeFontStyle != null) {
		org.eclipse.swt.graphics.FontData fontData = org.eclipse.jface.preference.PreferenceConverter.getFontData(prefStore, org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants.PREF_DEFAULT_FONT);
		nodeFontStyle.setFontName(fontData.getName());
		nodeFontStyle.setFontHeight(fontData.getHeight());
		nodeFontStyle.setBold((fontData.getStyle() & org.eclipse.swt.SWT.BOLD) != 0);
		nodeFontStyle.setItalic((fontData.getStyle() & org.eclipse.swt.SWT.ITALIC) != 0);
		org.eclipse.swt.graphics.RGB fontRGB = org.eclipse.jface.preference.PreferenceConverter.getColor(prefStore, org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants.PREF_FONT_COLOR);
		nodeFontStyle.setFontColor(org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities.RGBToInteger(fontRGB).intValue());
	}
				org.eclipse.swt.graphics.RGB fillRGB = org.eclipse.jface.preference.PreferenceConverter.getColor(prefStore, org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants.PREF_FILL_COLOR);
	org.eclipse.gmf.runtime.diagram.core.util.ViewUtil.setStructuralFeatureValue(node, org.eclipse.gmf.runtime.notation.NotationPackage.eINSTANCE.getFillStyle_FillColor(), org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities.RGBToInteger(fillRGB));
							return node;
	}

	/**
 * @generated
 */
	public org.eclipse.gmf.runtime.notation.Edge createStartStartPort_4004(org.eclipse.gmf.runtime.notation.View containerView, int index, boolean persisted, org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint preferencesHint) {
			org.eclipse.gmf.runtime.notation.Connector edge = org.eclipse.gmf.runtime.notation.NotationFactory.eINSTANCE.createConnector();
				edge.getStyles().add(org.eclipse.gmf.runtime.notation.NotationFactory.eINSTANCE.createFontStyle());
					org.eclipse.gmf.runtime.notation.RelativeBendpoints bendpoints = org.eclipse.gmf.runtime.notation.NotationFactory.eINSTANCE.createRelativeBendpoints();
		java.util.ArrayList<org.eclipse.gmf.runtime.notation.datatype.RelativeBendpoint> points = new java.util.ArrayList<org.eclipse.gmf.runtime.notation.datatype.RelativeBendpoint>(2);
		points.add(new org.eclipse.gmf.runtime.notation.datatype.RelativeBendpoint());
		points.add(new org.eclipse.gmf.runtime.notation.datatype.RelativeBendpoint());
		bendpoints.setPoints(points);
		edge.setBendpoints(bendpoints);
		org.eclipse.gmf.runtime.diagram.core.util.ViewUtil.insertChildView(containerView, edge, index, persisted);
		edge.setType(asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.StartStartPortEditPart.VISUAL_ID));
		edge.setElement(null);
		// initializePreferences
		final org.eclipse.jface.preference.IPreferenceStore prefStore = (org.eclipse.jface.preference.IPreferenceStore) preferencesHint.getPreferenceStore();
			
				org.eclipse.swt.graphics.RGB lineRGB = org.eclipse.jface.preference.PreferenceConverter.getColor(prefStore, org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants.PREF_LINE_COLOR);
	org.eclipse.gmf.runtime.diagram.core.util.ViewUtil.setStructuralFeatureValue(edge, org.eclipse.gmf.runtime.notation.NotationPackage.eINSTANCE.getLineStyle_LineColor(), org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities.RGBToInteger(lineRGB));
				org.eclipse.gmf.runtime.notation.FontStyle edgeFontStyle = (org.eclipse.gmf.runtime.notation.FontStyle) edge.getStyle(org.eclipse.gmf.runtime.notation.NotationPackage.Literals.FONT_STYLE);
	if (edgeFontStyle != null) {
		org.eclipse.swt.graphics.FontData fontData = org.eclipse.jface.preference.PreferenceConverter.getFontData(prefStore, org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants.PREF_DEFAULT_FONT);
		edgeFontStyle.setFontName(fontData.getName());
		edgeFontStyle.setFontHeight(fontData.getHeight());
		edgeFontStyle.setBold((fontData.getStyle() & org.eclipse.swt.SWT.BOLD) != 0);
		edgeFontStyle.setItalic((fontData.getStyle() & org.eclipse.swt.SWT.ITALIC) != 0);
		org.eclipse.swt.graphics.RGB fontRGB = org.eclipse.jface.preference.PreferenceConverter.getColor(prefStore, org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants.PREF_FONT_COLOR);
		edgeFontStyle.setFontColor(org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities.RGBToInteger(fontRGB).intValue());
	}
		org.eclipse.gmf.runtime.notation.Routing routing = org.eclipse.gmf.runtime.notation.Routing.get(prefStore.getInt(org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants.PREF_LINE_STYLE));
		if (routing != null) {
			org.eclipse.gmf.runtime.diagram.core.util.ViewUtil.setStructuralFeatureValue(edge, org.eclipse.gmf.runtime.notation.NotationPackage.eINSTANCE.getRoutingStyle_Routing(), routing);
		}
		return edge;
	}
	/**
 * @generated
 */
	public org.eclipse.gmf.runtime.notation.Edge createOutputPortInputPort_4002(org.eclipse.gmf.runtime.notation.View containerView, int index, boolean persisted, org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint preferencesHint) {
			org.eclipse.gmf.runtime.notation.Connector edge = org.eclipse.gmf.runtime.notation.NotationFactory.eINSTANCE.createConnector();
				edge.getStyles().add(org.eclipse.gmf.runtime.notation.NotationFactory.eINSTANCE.createFontStyle());
					org.eclipse.gmf.runtime.notation.RelativeBendpoints bendpoints = org.eclipse.gmf.runtime.notation.NotationFactory.eINSTANCE.createRelativeBendpoints();
		java.util.ArrayList<org.eclipse.gmf.runtime.notation.datatype.RelativeBendpoint> points = new java.util.ArrayList<org.eclipse.gmf.runtime.notation.datatype.RelativeBendpoint>(2);
		points.add(new org.eclipse.gmf.runtime.notation.datatype.RelativeBendpoint());
		points.add(new org.eclipse.gmf.runtime.notation.datatype.RelativeBendpoint());
		bendpoints.setPoints(points);
		edge.setBendpoints(bendpoints);
		org.eclipse.gmf.runtime.diagram.core.util.ViewUtil.insertChildView(containerView, edge, index, persisted);
		edge.setType(asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getType(asu.ser.capstone.pivi.diagram.edit.parts.OutputPortInputPortEditPart.VISUAL_ID));
		edge.setElement(null);
		// initializePreferences
		final org.eclipse.jface.preference.IPreferenceStore prefStore = (org.eclipse.jface.preference.IPreferenceStore) preferencesHint.getPreferenceStore();
			
				org.eclipse.swt.graphics.RGB lineRGB = org.eclipse.jface.preference.PreferenceConverter.getColor(prefStore, org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants.PREF_LINE_COLOR);
	org.eclipse.gmf.runtime.diagram.core.util.ViewUtil.setStructuralFeatureValue(edge, org.eclipse.gmf.runtime.notation.NotationPackage.eINSTANCE.getLineStyle_LineColor(), org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities.RGBToInteger(lineRGB));
				org.eclipse.gmf.runtime.notation.FontStyle edgeFontStyle = (org.eclipse.gmf.runtime.notation.FontStyle) edge.getStyle(org.eclipse.gmf.runtime.notation.NotationPackage.Literals.FONT_STYLE);
	if (edgeFontStyle != null) {
		org.eclipse.swt.graphics.FontData fontData = org.eclipse.jface.preference.PreferenceConverter.getFontData(prefStore, org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants.PREF_DEFAULT_FONT);
		edgeFontStyle.setFontName(fontData.getName());
		edgeFontStyle.setFontHeight(fontData.getHeight());
		edgeFontStyle.setBold((fontData.getStyle() & org.eclipse.swt.SWT.BOLD) != 0);
		edgeFontStyle.setItalic((fontData.getStyle() & org.eclipse.swt.SWT.ITALIC) != 0);
		org.eclipse.swt.graphics.RGB fontRGB = org.eclipse.jface.preference.PreferenceConverter.getColor(prefStore, org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants.PREF_FONT_COLOR);
		edgeFontStyle.setFontColor(org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities.RGBToInteger(fontRGB).intValue());
	}
		org.eclipse.gmf.runtime.notation.Routing routing = org.eclipse.gmf.runtime.notation.Routing.get(prefStore.getInt(org.eclipse.gmf.runtime.diagram.ui.preferences.IPreferenceConstants.PREF_LINE_STYLE));
		if (routing != null) {
			org.eclipse.gmf.runtime.diagram.core.util.ViewUtil.setStructuralFeatureValue(edge, org.eclipse.gmf.runtime.notation.NotationPackage.eINSTANCE.getRoutingStyle_Routing(), routing);
		}
		return edge;
	}



	/**
 * @generated
 */
	private void stampShortcut(org.eclipse.gmf.runtime.notation.View containerView, org.eclipse.gmf.runtime.notation.Node target) {
		if (!asu.ser.capstone.pivi.diagram.edit.parts.PiviDiagramEditPart.MODEL_ID.equals(asu.ser.capstone.pivi.diagram.part.PiviVisualIDRegistry.getModelID(containerView))) {
				org.eclipse.emf.ecore.EAnnotation shortcutAnnotation = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEAnnotation();
	shortcutAnnotation.setSource("Shortcut"); //$NON-NLS-1$
	shortcutAnnotation.getDetails().put("modelID", asu.ser.capstone.pivi.diagram.edit.parts.PiviDiagramEditPart.MODEL_ID); //$NON-NLS-1$
	target.getEAnnotations().add(shortcutAnnotation);
		}
	}



	/**
 * @generated
 */
	private org.eclipse.gmf.runtime.notation.Node createCompartment(org.eclipse.gmf.runtime.notation.View owner, String hint, boolean canCollapse, boolean hasTitle, boolean canSort, boolean canFilter) {
		//SemanticListCompartment rv = NotationFactory.eINSTANCE.createSemanticListCompartment();
		//rv.setShowTitle(showTitle);
		//rv.setCollapsed(isCollapsed);
		org.eclipse.gmf.runtime.notation.Node rv;
		if (canCollapse) {
			rv = org.eclipse.gmf.runtime.notation.NotationFactory.eINSTANCE.createBasicCompartment();
		} else {
			rv = org.eclipse.gmf.runtime.notation.NotationFactory.eINSTANCE.createDecorationNode();
		}
		if (hasTitle) {
			org.eclipse.gmf.runtime.notation.TitleStyle ts = org.eclipse.gmf.runtime.notation.NotationFactory.eINSTANCE.createTitleStyle();
			ts.setShowTitle(true);
			rv.getStyles().add(ts);
		}
		if (canSort) {
			rv.getStyles().add(org.eclipse.gmf.runtime.notation.NotationFactory.eINSTANCE.createSortingStyle());
		}
		if (canFilter) {
			rv.getStyles().add(org.eclipse.gmf.runtime.notation.NotationFactory.eINSTANCE.createFilteringStyle());
		}
		rv.setType(hint);
		org.eclipse.gmf.runtime.diagram.core.util.ViewUtil.insertChildView(owner, rv, org.eclipse.gmf.runtime.diagram.core.util.ViewUtil.APPEND, true);
		return rv;
	}
	
	/**
 * @generated
 */
	private org.eclipse.emf.ecore.EObject getSemanticElement(org.eclipse.core.runtime.IAdaptable semanticAdapter) {
		if (semanticAdapter == null) {
			return null;
		}
		org.eclipse.emf.ecore.EObject eObject = (org.eclipse.emf.ecore.EObject) semanticAdapter.getAdapter(org.eclipse.emf.ecore.EObject.class);
		if (eObject != null) {
			return org.eclipse.gmf.runtime.emf.core.util.EMFCoreUtil.resolve(org.eclipse.emf.transaction.util.TransactionUtil.getEditingDomain(eObject), eObject);
		}
		return null;
	}

	
/**
 * @generated
 */
private org.eclipse.gmf.runtime.emf.type.core.IElementType getSemanticElementType(org.eclipse.core.runtime.IAdaptable semanticAdapter) {
	if (semanticAdapter == null) {
		return null;
	}
	return (org.eclipse.gmf.runtime.emf.type.core.IElementType) semanticAdapter.getAdapter(org.eclipse.gmf.runtime.emf.type.core.IElementType.class);
}
	}
