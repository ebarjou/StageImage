package main.ui.selectImages;

import java.util.ArrayList;
import java.util.List;

import lang.Text;
import main.ui.selectImages.event.EventAddImage;
import uiElements.Button;
import uiElements.FileChooser;
import uiElements.Panel;
import uiElements.combinedElement.LoadedImageFrame;

public class SelectImagesPanel extends Panel{
	List<LoadedImageFrame>		listLoadedImageFrame;
	FileChooser 				fileChooserImage;
	Button						buttonAddImage;
	int							index;
	
	public SelectImagesPanel(){
		super();
		
		index = 0;
		listLoadedImageFrame = new ArrayList<LoadedImageFrame>();
		//"Image Files", "jpg", "jpeg", "gif", "bmp", "png", "tif"
		fileChooserImage = new FileChooser("Image Files", "jpg", "jpeg", "gif", "bmp", "png", "tif");
		
		buttonAddImage = new Button(""+Text.BT_ADD_IMAGE, new EventAddImage(this, fileChooserImage));
		
		this.add(buttonAddImage);
	}
	
	public void addImageFrame(String file){
		listLoadedImageFrame.add(new LoadedImageFrame(this, file, 256, 256));
		this.remove(buttonAddImage);
		this.add(listLoadedImageFrame.get(index++));
		this.add(buttonAddImage);
		this.repaint();
		this.revalidate();
	}
}
