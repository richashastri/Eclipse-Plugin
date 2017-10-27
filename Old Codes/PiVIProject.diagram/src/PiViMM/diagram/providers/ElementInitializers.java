package PiViMM.diagram.providers;

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
		ElementInitializers cached = PiViMM.diagram.part.PiViDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			PiViMM.diagram.part.PiViDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
