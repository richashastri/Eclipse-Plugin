package asu.ser.capstone.pivi.diagram.part;

import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import asu.ser.capstone.pivi.diagram.providers.PiviElementTypes;

/**
 * @generated
 */
public class PiviPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createNodes1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	 * Creates "nodes" palette tool group
	 * @generated
	 */
	private PaletteContainer createNodes1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Nodes1Group_title);
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
		return paletteContainer;
	}

	/**
	 * Creates "connections" palette tool group
	 * @generated
	 */
	private PaletteContainer createConnections2Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createOutputPortInputPort1CreationTool());
		paletteContainer.add(createStartStartPort2CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createIfEnd1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.IfEnd1CreationTool_title,
				Messages.IfEnd1CreationTool_desc,
				Collections.singletonList(PiviElementTypes.IfEnd_2004));
		entry.setId("createIfEnd1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PiviElementTypes
				.getImageDescriptor(PiviElementTypes.IfEnd_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createIfStart2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.IfStart2CreationTool_title,
				Messages.IfStart2CreationTool_desc,
				Collections.singletonList(PiviElementTypes.IfStart_2001));
		entry.setId("createIfStart2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PiviElementTypes
				.getImageDescriptor(PiviElementTypes.IfStart_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInstruction3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Instruction3CreationTool_title,
				Messages.Instruction3CreationTool_desc,
				Collections.singletonList(PiviElementTypes.Instruction_2005));
		entry.setId("createInstruction3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PiviElementTypes
				.getImageDescriptor(PiviElementTypes.Instruction_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMethodEnd4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.MethodEnd4CreationTool_title,
				Messages.MethodEnd4CreationTool_desc,
				Collections.singletonList(PiviElementTypes.MethodEnd_2003));
		entry.setId("createMethodEnd4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PiviElementTypes
				.getImageDescriptor(PiviElementTypes.MethodEnd_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMethodStart5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.MethodStart5CreationTool_title,
				Messages.MethodStart5CreationTool_desc,
				Collections.singletonList(PiviElementTypes.MethodStart_2006));
		entry.setId("createMethodStart5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PiviElementTypes
				.getImageDescriptor(PiviElementTypes.MethodStart_2006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOutputPort6CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.OutputPort6CreationTool_title,
				Messages.OutputPort6CreationTool_desc, null, null) {
		};
		entry.setId("createOutputPort6CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStart7CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Start7CreationTool_title,
				Messages.Start7CreationTool_desc,
				Collections.singletonList(PiviElementTypes.Start_2008));
		entry.setId("createStart7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PiviElementTypes
				.getImageDescriptor(PiviElementTypes.Start_2008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createWhileEnd8CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.WhileEnd8CreationTool_title,
				Messages.WhileEnd8CreationTool_desc,
				Collections.singletonList(PiviElementTypes.WhileEnd_2002));
		entry.setId("createWhileEnd8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PiviElementTypes
				.getImageDescriptor(PiviElementTypes.WhileEnd_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createWhileStart9CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.WhileStart9CreationTool_title,
				Messages.WhileStart9CreationTool_desc,
				Collections.singletonList(PiviElementTypes.WhileStart_2007));
		entry.setId("createWhileStart9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PiviElementTypes
				.getImageDescriptor(PiviElementTypes.WhileStart_2007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOutputPortInputPort1CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.OutputPortInputPort1CreationTool_title,
				Messages.OutputPortInputPort1CreationTool_desc,
				Collections
						.singletonList(PiviElementTypes.OutputPortInputPort_4002));
		entry.setId("createOutputPortInputPort1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PiviElementTypes
				.getImageDescriptor(PiviElementTypes.OutputPortInputPort_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStartStartPort2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.StartStartPort2CreationTool_title,
				Messages.StartStartPort2CreationTool_desc,
				Collections.singletonList(PiviElementTypes.StartStartPort_4004));
		entry.setId("createStartStartPort2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PiviElementTypes
				.getImageDescriptor(PiviElementTypes.StartStartPort_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
