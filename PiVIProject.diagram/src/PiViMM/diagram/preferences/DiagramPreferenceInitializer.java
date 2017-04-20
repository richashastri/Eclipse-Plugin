package PiViMM.diagram.preferences;

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
		PiViMM.diagram.preferences.DiagramGeneralPreferencePage.initDefaults(store);
		PiViMM.diagram.preferences.DiagramAppearancePreferencePage.initDefaults(store);
		PiViMM.diagram.preferences.DiagramConnectionsPreferencePage.initDefaults(store);
		PiViMM.diagram.preferences.DiagramPrintingPreferencePage.initDefaults(store);
		PiViMM.diagram.preferences.DiagramRulersAndGridPreferencePage.initDefaults(store);

	}

	/**
	* @generated
	*/
	protected IPreferenceStore getPreferenceStore() {
		return PiViMM.diagram.part.PiViDiagramEditorPlugin.getInstance().getPreferenceStore();
	}
}
