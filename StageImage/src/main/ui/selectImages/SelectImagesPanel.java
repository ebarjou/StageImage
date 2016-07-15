package main.ui.selectImages;

import java.util.ArrayList;
import java.util.List;

import lang.Text;
import main.ui.selectImages.event.EventAddImage;
import sift.data.ImageAttributes;
import uiElements.Button;
import uiElements.FileChooser;
import uiElements.Panel;
import uiElements.combinedElement.LoadedImageFrame;

public class SelectImagesPanel extends Panel{
	private static List<LoadedImageFrame>	listLoadedImageFrame;
	private FileChooser 					fileChooserImage;
	private Button							buttonAddImage;
	private int								index;
	
	public SelectImagesPanel(){
		super();
		
		index = 0;
		listLoadedImageFrame = new ArrayList<LoadedImageFrame>();
		//"Image Files", "jpg", "jpeg", "gif", "bmp", "png", "tif"
		fileChooserImage = new FileChooser("Image Files", "jpg", "jpeg", "gif", "bmp", "png", "tif");
		
		buttonAddImage = new Button(""+Text.BT_ADD_IMAGE, new EventAddImage(this, fileChooserImage));
		
		this.add(buttonAddImage);
	}
	
	public static List<ImageAttributes> getImages(){
		List<ImageAttributes> output = new ArrayList<ImageAttributes>();
		for (int i = 0; i < listLoadedImageFrame.size(); ++i) 
			output.add(new ImageAttributes(listLoadedImageFrame.get(i).getFile(), listLoadedImageFrame.get(i).getAngle()));
		return output;
	}
	
	public static List<Double> getAngles(){
		List<Double> output = new ArrayList<Double>();
		for (int i = 0; i < listLoadedImageFrame.size(); ++i) 
			output.add(listLoadedImageFrame.get(i).getAngle());
		return output;
	}
	
	
	public void addImageFrame(String file){
		listLoadedImageFrame.add(new LoadedImageFrame(this, file, 196, 256));
		this.remove(buttonAddImage);
		this.add(listLoadedImageFrame.get(index++));
		this.add(buttonAddImage);
		this.repaint();
		this.revalidate();
	}
	
	public void removeImageFrame(LoadedImageFrame imageFrameToRemove){
		this.remove(imageFrameToRemove);
		listLoadedImageFrame.remove(imageFrameToRemove);
		this.repaint();
		this.revalidate();
		--index;
	}
}
