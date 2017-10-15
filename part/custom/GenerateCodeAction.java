package asu.ser.capstone.pivi.diagram.part.custom;
import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuCreator;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.swt.events.HelpListener;
import org.eclipse.swt.widgets.Event;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

import asu.ser.capstone.pivi.diagram.parser.PiviParser;

public class GenerateCodeAction implements IAction{
	
	private String text = "Generate Code";
	private String toolTip = "Generate Code";
	private IMenuCreator menuCreator;
//	private static String XML_FILE_NAME = "default.pivi"; 
	private String path;
	
	@Override
	public void addPropertyChangeListener(IPropertyChangeListener listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getAccelerator() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getActionDefinitionId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ImageDescriptor getDisabledImageDescriptor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HelpListener getHelpListener() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ImageDescriptor getHoverImageDescriptor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ImageDescriptor getImageDescriptor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IMenuCreator getMenuCreator() {
		// TODO Auto-generated method stub
		return this.menuCreator;
	}

	@Override
	public int getStyle() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getText() {
		// TODO Auto-generated method stub
		try {
			if (this.path == null){
				this.path = getProjectPath();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.text;
	}

	@Override
	public String getToolTipText() {
		// TODO Auto-generated method stub
		return this.toolTip;
	}

	@Override
	public boolean isChecked() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isHandled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void removePropertyChangeListener(IPropertyChangeListener listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void runWithEvent(Event event) {
		// TODO Auto-generated method stub
		// Fake code to test break point
		String fileName = getFileName();
		PiviParser pivi = new PiviParser();
		pivi.ParseDiagram(this.path, fileName);
		
//		File source = new File(this.path + "/" + XML_FILE_NAME);
		// Generate the code from this file here
	}

	@Override
	public void setAccelerator(int keycode) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setActionDefinitionId(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setChecked(boolean checked) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setDescription(String text) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setDisabledImageDescriptor(ImageDescriptor newImage) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setEnabled(boolean enabled) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setHelpListener(HelpListener listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setHoverImageDescriptor(ImageDescriptor newImage) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setId(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setImageDescriptor(ImageDescriptor newImage) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setMenuCreator(IMenuCreator creator) {
		// TODO Auto-generated method stub
		this.menuCreator = creator;
	}

	@Override
	public void setText(String text) {
		// TODO Auto-generated method stub
		this.text = text;
	}

	@Override
	public void setToolTipText(String text) {
		// TODO Auto-generated method stub
		this.toolTip = text;
	}

	protected String getProjectPath() throws IOException {
		
		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
        IWorkbenchPage page = window.getActivePage();
		IEditorPart editor = page.getActiveEditor();

		IFileEditorInput input = (IFileEditorInput)editor.getEditorInput();
		IFile file = input.getFile();
		IProject project = file.getProject();
		
		String projectName = project.getFullPath().toString();
		
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		
	    java.io.File workspaceDirectory = workspace.getRoot().getLocation()
	            .toFile();
	    
	    //System.out.println("my source : "+workspaceDirectory.getAbsoluteFile() + projectName.replace("/", "\\"));
	    String fp = Paths.get(workspaceDirectory.getAbsoluteFile().getPath(), projectName.substring(1, projectName.length())).toString();
	    return fp;
	    
	}
	
	protected String getFileName(){
		String fileName = "";
		File folder = new File(this.path);
//		FilenameFilter filter = new FileNameExtensionFilter(null, "pivi");
		File[] files = folder.listFiles();
		for(File file : files){
			if(file.getName().contains(".pivi")){
				fileName = file.getName();
				break;
			}
		}
		return fileName;
	}
}
