package CodeBlockMM.diagram.preferences;

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
		CodeBlockMM.diagram.preferences.DiagramGeneralPreferencePage.initDefaults(store);
		CodeBlockMM.diagram.preferences.DiagramAppearancePreferencePage.initDefaults(store);
		CodeBlockMM.diagram.preferences.DiagramConnectionsPreferencePage.initDefaults(store);
		CodeBlockMM.diagram.preferences.DiagramPrintingPreferencePage.initDefaults(store);
		CodeBlockMM.diagram.preferences.DiagramRulersAndGridPreferencePage.initDefaults(store);

	}

	/**
	* @generated
	*/
	protected IPreferenceStore getPreferenceStore() {
		return CodeBlockMM.diagram.part.CodeBlockDiagramEditorPlugin.getInstance().getPreferenceStore();
	}
}
