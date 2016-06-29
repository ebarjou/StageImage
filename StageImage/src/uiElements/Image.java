package uiElements;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Image extends JLabel {
	
	public Image(){
		super("");
	}
	
	public Image(String file){
		super("");
		this.setIcon(new ImageIcon(file));
	}
}
