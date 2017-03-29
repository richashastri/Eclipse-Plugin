package SquareMM.diagram.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @generated
 */
public class DiagramPreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	* @generated
	*/
	public void initializeDefaultPreferences() {
		IPreferenceStore store = getPreferenceStore();
		SquareMM.diagram.preferences.DiagramGeneralPreferencePage.initDefaults(store);
		SquareMM.diagram.preferences.DiagramAppearancePreferencePage.initDefaults(store);
		SquareMM.diagram.preferences.DiagramConnectionsPreferencePage.initDefaults(store);
		SquareMM.diagram.preferences.DiagramPrintingPreferencePage.initDefaults(store);
		SquareMM.diagram.preferences.DiagramRulersAndGridPreferencePage.initDefaults(store);

	}

	/**
	* @generated
	*/
	protected IPreferenceStore getPreferenceStore() {
		return SquareMM.diagram.part.SquareDiagramEditorPlugin.getInstance().getPreferenceStore();
	}
}
