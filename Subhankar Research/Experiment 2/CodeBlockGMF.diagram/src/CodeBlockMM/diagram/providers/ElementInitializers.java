package CodeBlockMM.diagram.providers;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	* @generated
	*/
	public static ElementInitializers getInstance() {
		ElementInitializers cached = CodeBlockMM.diagram.part.CodeBlockDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			CodeBlockMM.diagram.part.CodeBlockDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
