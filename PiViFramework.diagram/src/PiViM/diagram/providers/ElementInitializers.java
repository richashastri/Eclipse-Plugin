package PiViM.diagram.providers;

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
		ElementInitializers cached = PiViM.diagram.part.PiViDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			PiViM.diagram.part.PiViDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
