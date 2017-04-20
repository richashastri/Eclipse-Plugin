
package PiViMM.diagram.part;

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
		paletteRoot.add(createPiViMM1Group());
	}

	/**
	* Creates "PiViMM" palette tool group
	* @generated
	*/
	private PaletteContainer createPiViMM1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(PiViMM.diagram.part.Messages.PiViMM1Group_title);
		paletteContainer.setId("createPiViMM1Group"); //$NON-NLS-1$
		paletteContainer.add(createCodeBlock1CreationTool());
		paletteContainer.add(createConnector2CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createCodeBlock1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(PiViMM.diagram.part.Messages.CodeBlock1CreationTool_title,
				PiViMM.diagram.part.Messages.CodeBlock1CreationTool_desc,
				Collections.singletonList(PiViMM.diagram.providers.PiViElementTypes.CodeBlock_2001));
		entry.setId("createCodeBlock1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PiViMM.diagram.providers.PiViElementTypes
				.getImageDescriptor(PiViMM.diagram.providers.PiViElementTypes.CodeBlock_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createConnector2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(PiViMM.diagram.part.Messages.Connector2CreationTool_title,
				PiViMM.diagram.part.Messages.Connector2CreationTool_desc,
				Collections.singletonList(PiViMM.diagram.providers.PiViElementTypes.Connector_4001));
		entry.setId("createConnector2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PiViMM.diagram.providers.PiViElementTypes
				.getImageDescriptor(PiViMM.diagram.providers.PiViElementTypes.Connector_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
