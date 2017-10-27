
package asu.ser.capstone.pivi.diagram.part;

/**
 * @generated
 */
public class PiviPaletteFactory {

	/**
 * @generated
 */
	public void fillPalette(org.eclipse.gef.palette.PaletteRoot paletteRoot) {
		paletteRoot.add(createNodes1Group());
paletteRoot.add(createConnections2Group());
	}

	/**
 * Creates "nodes" palette tool group
 * @generated
 */
	private org.eclipse.gef.palette.PaletteContainer createNodes1Group() {
				org.eclipse.gef.palette.PaletteGroup paletteContainer = new org.eclipse.gef.palette.PaletteGroup(asu.ser.capstone.pivi.diagram.part.Messages.Nodes1Group_title);
				 paletteContainer.setId("createNodes1Group"); //$NON-NLS-1$
								paletteContainer.add(createIfEnd1CreationTool());
paletteContainer.add(createIfStart2CreationTool());
paletteContainer.add(createInstruction3CreationTool());
paletteContainer.add(createMethodEnd4CreationTool());
paletteContainer.add(createMethodStart5CreationTool());
paletteContainer.add(createOutputPort6CreationTool());
paletteContainer.add(createStart7CreationTool());
paletteContainer.add(createWhileEnd8CreationTool());
paletteContainer.add(createWhileStart9CreationTool());
paletteContainer.add(createThreadEnd10CreationTool());
paletteContainer.add(createThreadStart11CreationTool());
paletteContainer.add(createPrintStatement12CreationTool());
		return paletteContainer;
	}
	/**
 * Creates "connections" palette tool group
 * @generated
 */
	private org.eclipse.gef.palette.PaletteContainer createConnections2Group() {
				org.eclipse.gef.palette.PaletteGroup paletteContainer = new org.eclipse.gef.palette.PaletteGroup(asu.ser.capstone.pivi.diagram.part.Messages.Connections2Group_title);
				 paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
								paletteContainer.add(createOutputPortInputPort1CreationTool());
paletteContainer.add(createStartStartPort2CreationTool());
		return paletteContainer;
	}

	/**
 * @generated
 */
	private org.eclipse.gef.palette.ToolEntry createIfEnd1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(asu.ser.capstone.pivi.diagram.part.Messages.IfEnd1CreationTool_title, asu.ser.capstone.pivi.diagram.part.Messages.IfEnd1CreationTool_desc, java.util.Collections.singletonList(asu.ser.capstone.pivi.diagram.providers.PiviElementTypes.IfEnd_2004));
				 entry.setId("createIfEnd1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(asu.ser.capstone.pivi.diagram.providers.PiviElementTypes.getImageDescriptor(asu.ser.capstone.pivi.diagram.providers.PiviElementTypes.IfEnd_2004));
		entry.setLargeIcon(entry.getSmallIcon());
						return entry;
	}
	/**
 * @generated
 */
	private org.eclipse.gef.palette.ToolEntry createIfStart2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(asu.ser.capstone.pivi.diagram.part.Messages.IfStart2CreationTool_title, asu.ser.capstone.pivi.diagram.part.Messages.IfStart2CreationTool_desc, java.util.Collections.singletonList(asu.ser.capstone.pivi.diagram.providers.PiviElementTypes.IfStart_2001));
				 entry.setId("createIfStart2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(asu.ser.capstone.pivi.diagram.providers.PiviElementTypes.getImageDescriptor(asu.ser.capstone.pivi.diagram.providers.PiviElementTypes.IfStart_2001));
		entry.setLargeIcon(entry.getSmallIcon());
						return entry;
	}
	/**
 * @generated
 */
	private org.eclipse.gef.palette.ToolEntry createInstruction3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(asu.ser.capstone.pivi.diagram.part.Messages.Instruction3CreationTool_title, asu.ser.capstone.pivi.diagram.part.Messages.Instruction3CreationTool_desc, java.util.Collections.singletonList(asu.ser.capstone.pivi.diagram.providers.PiviElementTypes.Instruction_2005));
				 entry.setId("createInstruction3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(asu.ser.capstone.pivi.diagram.providers.PiviElementTypes.getImageDescriptor(asu.ser.capstone.pivi.diagram.providers.PiviElementTypes.Instruction_2005));
		entry.setLargeIcon(entry.getSmallIcon());
						return entry;
	}
	/**
 * @generated
 */
	private org.eclipse.gef.palette.ToolEntry createMethodEnd4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(asu.ser.capstone.pivi.diagram.part.Messages.MethodEnd4CreationTool_title, asu.ser.capstone.pivi.diagram.part.Messages.MethodEnd4CreationTool_desc, java.util.Collections.singletonList(asu.ser.capstone.pivi.diagram.providers.PiviElementTypes.MethodEnd_2003));
				 entry.setId("createMethodEnd4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(asu.ser.capstone.pivi.diagram.providers.PiviElementTypes.getImageDescriptor(asu.ser.capstone.pivi.diagram.providers.PiviElementTypes.MethodEnd_2003));
		entry.setLargeIcon(entry.getSmallIcon());
						return entry;
	}
	/**
 * @generated
 */
	private org.eclipse.gef.palette.ToolEntry createMethodStart5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(asu.ser.capstone.pivi.diagram.part.Messages.MethodStart5CreationTool_title, asu.ser.capstone.pivi.diagram.part.Messages.MethodStart5CreationTool_desc, java.util.Collections.singletonList(asu.ser.capstone.pivi.diagram.providers.PiviElementTypes.MethodStart_2006));
				 entry.setId("createMethodStart5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(asu.ser.capstone.pivi.diagram.providers.PiviElementTypes.getImageDescriptor(asu.ser.capstone.pivi.diagram.providers.PiviElementTypes.MethodStart_2006));
		entry.setLargeIcon(entry.getSmallIcon());
						return entry;
	}
	/**
 * @generated
 */
	private org.eclipse.gef.palette.ToolEntry createOutputPort6CreationTool() {
		org.eclipse.gef.palette.ToolEntry entry = new org.eclipse.gef.palette.ToolEntry(asu.ser.capstone.pivi.diagram.part.Messages.OutputPort6CreationTool_title, asu.ser.capstone.pivi.diagram.part.Messages.OutputPort6CreationTool_desc, null, null) {};
				 entry.setId("createOutputPort6CreationTool"); //$NON-NLS-1$
										return entry;
	}
	/**
 * @generated
 */
	private org.eclipse.gef.palette.ToolEntry createStart7CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(asu.ser.capstone.pivi.diagram.part.Messages.Start7CreationTool_title, asu.ser.capstone.pivi.diagram.part.Messages.Start7CreationTool_desc, java.util.Collections.singletonList(asu.ser.capstone.pivi.diagram.providers.PiviElementTypes.Start_2008));
				 entry.setId("createStart7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(asu.ser.capstone.pivi.diagram.providers.PiviElementTypes.getImageDescriptor(asu.ser.capstone.pivi.diagram.providers.PiviElementTypes.Start_2008));
		entry.setLargeIcon(entry.getSmallIcon());
						return entry;
	}
	/**
 * @generated
 */
	private org.eclipse.gef.palette.ToolEntry createWhileEnd8CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(asu.ser.capstone.pivi.diagram.part.Messages.WhileEnd8CreationTool_title, asu.ser.capstone.pivi.diagram.part.Messages.WhileEnd8CreationTool_desc, java.util.Collections.singletonList(asu.ser.capstone.pivi.diagram.providers.PiviElementTypes.WhileEnd_2002));
				 entry.setId("createWhileEnd8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(asu.ser.capstone.pivi.diagram.providers.PiviElementTypes.getImageDescriptor(asu.ser.capstone.pivi.diagram.providers.PiviElementTypes.WhileEnd_2002));
		entry.setLargeIcon(entry.getSmallIcon());
						return entry;
	}
	/**
 * @generated
 */
	private org.eclipse.gef.palette.ToolEntry createWhileStart9CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(asu.ser.capstone.pivi.diagram.part.Messages.WhileStart9CreationTool_title, asu.ser.capstone.pivi.diagram.part.Messages.WhileStart9CreationTool_desc, java.util.Collections.singletonList(asu.ser.capstone.pivi.diagram.providers.PiviElementTypes.WhileStart_2007));
				 entry.setId("createWhileStart9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(asu.ser.capstone.pivi.diagram.providers.PiviElementTypes.getImageDescriptor(asu.ser.capstone.pivi.diagram.providers.PiviElementTypes.WhileStart_2007));
		entry.setLargeIcon(entry.getSmallIcon());
						return entry;
	}
	/**
 * @generated
 */
	private org.eclipse.gef.palette.ToolEntry createThreadEnd10CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(asu.ser.capstone.pivi.diagram.part.Messages.ThreadEnd10CreationTool_title, asu.ser.capstone.pivi.diagram.part.Messages.ThreadEnd10CreationTool_desc, java.util.Collections.singletonList(asu.ser.capstone.pivi.diagram.providers.PiviElementTypes.ThreadEnd_2009));
				 entry.setId("createThreadEnd10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(asu.ser.capstone.pivi.diagram.providers.PiviElementTypes.getImageDescriptor(asu.ser.capstone.pivi.diagram.providers.PiviElementTypes.ThreadEnd_2009));
		entry.setLargeIcon(entry.getSmallIcon());
						return entry;
	}
	/**
 * @generated
 */
	private org.eclipse.gef.palette.ToolEntry createThreadStart11CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(asu.ser.capstone.pivi.diagram.part.Messages.ThreadStart11CreationTool_title, asu.ser.capstone.pivi.diagram.part.Messages.ThreadStart11CreationTool_desc, java.util.Collections.singletonList(asu.ser.capstone.pivi.diagram.providers.PiviElementTypes.ThreadStart_2010));
				 entry.setId("createThreadStart11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(asu.ser.capstone.pivi.diagram.providers.PiviElementTypes.getImageDescriptor(asu.ser.capstone.pivi.diagram.providers.PiviElementTypes.ThreadStart_2010));
		entry.setLargeIcon(entry.getSmallIcon());
						return entry;
	}
	/**
 * @generated
 */
	private org.eclipse.gef.palette.ToolEntry createPrintStatement12CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(asu.ser.capstone.pivi.diagram.part.Messages.PrintStatement12CreationTool_title, asu.ser.capstone.pivi.diagram.part.Messages.PrintStatement12CreationTool_desc, java.util.Collections.singletonList(asu.ser.capstone.pivi.diagram.providers.PiviElementTypes.PrintStatement_2011));
				 entry.setId("createPrintStatement12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(asu.ser.capstone.pivi.diagram.providers.PiviElementTypes.getImageDescriptor(asu.ser.capstone.pivi.diagram.providers.PiviElementTypes.PrintStatement_2011));
		entry.setLargeIcon(entry.getSmallIcon());
						return entry;
	}
	/**
 * @generated
 */
	private org.eclipse.gef.palette.ToolEntry createOutputPortInputPort1CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(asu.ser.capstone.pivi.diagram.part.Messages.OutputPortInputPort1CreationTool_title, asu.ser.capstone.pivi.diagram.part.Messages.OutputPortInputPort1CreationTool_desc, java.util.Collections.singletonList(asu.ser.capstone.pivi.diagram.providers.PiviElementTypes.OutputPortInputPort_4002));
				 entry.setId("createOutputPortInputPort1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(asu.ser.capstone.pivi.diagram.providers.PiviElementTypes.getImageDescriptor(asu.ser.capstone.pivi.diagram.providers.PiviElementTypes.OutputPortInputPort_4002));
		entry.setLargeIcon(entry.getSmallIcon());
						return entry;
	}
	/**
 * @generated
 */
	private org.eclipse.gef.palette.ToolEntry createStartStartPort2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(asu.ser.capstone.pivi.diagram.part.Messages.StartStartPort2CreationTool_title, asu.ser.capstone.pivi.diagram.part.Messages.StartStartPort2CreationTool_desc, java.util.Collections.singletonList(asu.ser.capstone.pivi.diagram.providers.PiviElementTypes.StartStartPort_4004));
				 entry.setId("createStartStartPort2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(asu.ser.capstone.pivi.diagram.providers.PiviElementTypes.getImageDescriptor(asu.ser.capstone.pivi.diagram.providers.PiviElementTypes.StartStartPort_4004));
		entry.setLargeIcon(entry.getSmallIcon());
						return entry;
	}



	/**
 * @generated
 */
	private static class NodeToolEntry extends org.eclipse.gef.palette.ToolEntry {

		/**
 * @generated
 */
		private final java.util.List<org.eclipse.gmf.runtime.emf.type.core.IElementType> elementTypes;

		/**
 * @generated
 */
		private NodeToolEntry(String title, String description, java.util.List<org.eclipse.gmf.runtime.emf.type.core.IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
 * @generated
 */
		public org.eclipse.gef.Tool createTool() {
			org.eclipse.gef.Tool tool = new org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
 * @generated
 */
	private static class LinkToolEntry extends org.eclipse.gef.palette.ToolEntry {

		/**
 * @generated
 */
		private final java.util.List<org.eclipse.gmf.runtime.emf.type.core.IElementType> relationshipTypes;

		/**
 * @generated
 */
		private LinkToolEntry(String title, String description, java.util.List<org.eclipse.gmf.runtime.emf.type.core.IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
 * @generated
 */
		public org.eclipse.gef.Tool createTool() {
			org.eclipse.gef.Tool tool = new org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
