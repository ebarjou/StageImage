package main.ui.selectImages.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JFileChooser;

import main.ui.selectImages.SelectImagesPanel;


public class EventAddImage implements ActionListener {
	private SelectImagesPanel	selectImagePanel;
	private JFileChooser		fileChooser;
	private File				file;
	
	public EventAddImage(SelectImagesPanel selectImagePanel, JFileChooser fileChooser){
		this.fileChooser = fileChooser;
		this.selectImagePanel = selectImagePanel;
	}

	public void actionPerformed(ActionEvent event){
		if (fileChooser.showOpenDialog(null)== JFileChooser.APPROVE_OPTION){
			selectImagePanel.addImageFrame(fileChooser.getSelectedFile().toString());
		}
	}
}
