package ui.selectImages.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import ui.selectImages.SelectImagesPanel;
import uiElements.combinedElement.LoadedImageFrame;

public class EventRemoveImage implements ActionListener{
	private SelectImagesPanel	selectImagePanel;
	private LoadedImageFrame	imageFrameToRemove;
	
	public EventRemoveImage(SelectImagesPanel selectImagePanel, LoadedImageFrame imageFrameToRemove){
		this.selectImagePanel = selectImagePanel;
		this.imageFrameToRemove = imageFrameToRemove;
	}

	public void actionPerformed(ActionEvent event){
		selectImagePanel.removeImageFrame(imageFrameToRemove);
	}
}
