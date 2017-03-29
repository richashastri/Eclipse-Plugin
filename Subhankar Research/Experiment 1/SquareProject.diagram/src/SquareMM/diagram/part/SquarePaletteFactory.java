
package SquareMM.diagram.part;

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
public class SquarePaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createSquareMM1Group());
	}

	/**
	* Creates "SquareMM" palette tool group
	* @generated
	*/
	private PaletteContainer createSquareMM1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(SquareMM.diagram.part.Messages.SquareMM1Group_title);
		paletteContainer.setId("createSquareMM1Group"); //$NON-NLS-1$
		paletteContainer.add(createSquare1CreationTool());
		paletteContainer.add(createRelation2CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createSquare1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(SquareMM.diagram.part.Messages.Square1CreationTool_title,
				SquareMM.diagram.part.Messages.Square1CreationTool_desc,
				Collections.singletonList(SquareMM.diagram.providers.SquareElementTypes.Square_2001));
		entry.setId("createSquare1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SquareMM.diagram.providers.SquareElementTypes
				.getImageDescriptor(SquareMM.diagram.providers.SquareElementTypes.Square_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createRelation2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				SquareMM.diagram.part.Messages.Relation2CreationTool_title,
				SquareMM.diagram.part.Messages.Relation2CreationTool_desc,
				Collections.singletonList(SquareMM.diagram.providers.SquareElementTypes.Relation_4001));
		entry.setId("createRelation2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SquareMM.diagram.providers.SquareElementTypes
				.getImageDescriptor(SquareMM.diagram.providers.SquareElementTypes.Relation_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
