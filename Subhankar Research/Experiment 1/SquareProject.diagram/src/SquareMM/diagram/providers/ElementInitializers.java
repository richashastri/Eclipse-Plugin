package SquareMM.diagram.providers;

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
		ElementInitializers cached = SquareMM.diagram.part.SquareDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			SquareMM.diagram.part.SquareDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
