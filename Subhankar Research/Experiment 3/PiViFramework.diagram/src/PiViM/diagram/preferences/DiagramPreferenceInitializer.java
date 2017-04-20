package PiViM.diagram.preferences;

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
		PiViM.diagram.preferences.DiagramGeneralPreferencePage.initDefaults(store);
		PiViM.diagram.preferences.DiagramAppearancePreferencePage.initDefaults(store);
		PiViM.diagram.preferences.DiagramConnectionsPreferencePage.initDefaults(store);
		PiViM.diagram.preferences.DiagramPrintingPreferencePage.initDefaults(store);
		PiViM.diagram.preferences.DiagramRulersAndGridPreferencePage.initDefaults(store);

	}

	/**
	* @generated
	*/
	protected IPreferenceStore getPreferenceStore() {
		return PiViM.diagram.part.PiViDiagramEditorPlugin.getInstance().getPreferenceStore();
	}
}
