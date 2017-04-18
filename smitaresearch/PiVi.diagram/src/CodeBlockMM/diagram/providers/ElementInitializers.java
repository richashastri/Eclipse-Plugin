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
		ElementInitializers cached = CodeBlockMM.diagram.part.PivicodeDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			CodeBlockMM.diagram.part.PivicodeDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
