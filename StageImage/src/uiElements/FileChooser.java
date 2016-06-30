package uiElements;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class FileChooser extends JFileChooser{
	
	public FileChooser(){
		super();
	}
	public FileChooser(String typeName, String... extensions){
		super();
		//"Image Files", "jpg", "jpeg", "gif", "bmp", "png", "tif"
		this.addChoosableFileFilter(new FileNameExtensionFilter(typeName, extensions));
		this.setAcceptAllFileFilterUsed(false);
	}
}
