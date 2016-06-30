package uiElements.combinedElement;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import lang.Text;
import main.ui.selectImages.SelectImagesPanel;
import uiElements.Button;
import uiElements.ImageScaled;
import uiElements.Panel;
import uiElements.Spinner;
import uiElements.TextLine;

public class LoadedImageFrame extends JPanel{
	ImageScaled 				imageThumbnail;
	ControlFrame 		controlFrame;
	SelectImagesPanel 	selectImagePanel;
	String 				file;
	int 				w, h;
	
	public LoadedImageFrame(SelectImagesPanel parent, String file, int w, int h){
		super();
		setupLayout(w, h);
		
		this.selectImagePanel = parent;
		this.file = file;
		this.w = w;
		this.h = h;
		
		imageThumbnail = new ImageScaled(file, w, h/2);
		controlFrame = new ControlFrame();
		
		this.add(imageThumbnail);
		this.add(controlFrame);
	}
	
	private void setupLayout(int w, int h){
		this.setLayout(new GridLayout(2,1));
		this.setBackground(Color.WHITE);
		this.setBorder(BorderFactory.createLineBorder(Color.black));
		this.setSize(w, h);
		this.setPreferredSize(new Dimension(w, h));
        this.setMinimumSize(new Dimension(w, h));
	}
	
	
	private class ControlFrame extends JPanel{
		TextLine 	path;
		Spinner 	angleSpinner;
		Button 		deleteButton;
		Panel		anglePanel;
		
		public ControlFrame(){
			super(new GridLayout(3,1));
			
			angleSpinner = new Spinner(0.0, -360.0, 360.0, 0.1);
			anglePanel = new Panel(new TextLine("Angle ° "), angleSpinner);
			path = new TextLine(LoadedImageFrame.this.file, true);
			deleteButton = new Button(""+Text.BT_RMV_IMAGE);
			
			this.add(anglePanel);
			this.add(path);
			this.add(deleteButton);
		}
	}
}
