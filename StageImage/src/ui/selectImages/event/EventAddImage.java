package ui.selectImages.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFileChooser;

import ui.selectImages.SelectImagesPanel;
import uiElements.FileChooser;


public class EventAddImage implements ActionListener {
	private SelectImagesPanel	selectImagePanel;
	private JFileChooser		fileChooser;
	
	public EventAddImage(SelectImagesPanel selectImagePanel, FileChooser fileChooser){
		this.fileChooser = fileChooser;
		this.selectImagePanel = selectImagePanel;
	}

	public void actionPerformed(ActionEvent event){
		if (fileChooser.showOpenDialog(null)== JFileChooser.APPROVE_OPTION){
			selectImagePanel.addImageFrame(fileChooser.getSelectedFile().toString());
		}
	}
}
