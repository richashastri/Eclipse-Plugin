
package PiViM.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

/**
 * @generated
 */
public class PiViPaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createPiViM1Group());
	}

	/**
	* Creates "PiViM" palette tool group
	* @generated
	*/
	private PaletteContainer createPiViM1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(PiViM.diagram.part.Messages.PiViM1Group_title);
		paletteContainer.setId("createPiViM1Group"); //$NON-NLS-1$
		paletteContainer.add(createCodeBlock1CreationTool());
		paletteContainer.add(createConnector2CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createCodeBlock1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(PiViM.diagram.part.Messages.CodeBlock1CreationTool_title,
				PiViM.diagram.part.Messages.CodeBlock1CreationTool_desc,
				Collections.singletonList(PiViM.diagram.providers.PiViElementTypes.Connector_4001));
		entry.setId("createCodeBlock1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PiViM.diagram.providers.PiViElementTypes
				.getImageDescriptor(PiViM.diagram.providers.PiViElementTypes.Connector_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createConnector2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(PiViM.diagram.part.Messages.Connector2CreationTool_title,
				PiViM.diagram.part.Messages.Connector2CreationTool_desc,
				Collections.singletonList(PiViM.diagram.providers.PiViElementTypes.CodeBlock_2001));
		entry.setId("createConnector2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PiViM.diagram.providers.PiViElementTypes
				.getImageDescriptor(PiViM.diagram.providers.PiViElementTypes.CodeBlock_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
