package uiElements.combinedElement;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

import lang.Text;
import ui.selectImages.SelectImagesPanel;
import ui.selectImages.event.EventRemoveImage;
import uiElements.Button;
import uiElements.ImageScaled;
import uiElements.Panel;
import uiElements.Spinner;
import uiElements.TextLine;

public class LoadedImageFrame extends JPanel{
	private ImageScaled 		imageThumbnail;
	private ControlFrame 		controlFrame;
	private SelectImagesPanel 	selectImagePanel;
	private String 				file;
	
	public LoadedImageFrame(SelectImagesPanel parent, String file, int w, int h){
		super();
		setupLayout(w, h);
		
		this.selectImagePanel = parent;
		this.file = file;
		
		imageThumbnail = new ImageScaled(file, w, h/2);
		imageThumbnail.setHorizontalAlignment(JLabel.CENTER);
		controlFrame = new ControlFrame();
		
		this.add(imageThumbnail);
		this.add(controlFrame);
	}
	
	public String getFile(){
		return file;
	}
	
	public double getAngle(){
		return controlFrame.getAngle();
	}
	
	private void setupLayout(int w, int h){
		this.setLayout(new GridLayout(2,1));
		this.setBackground(Color.WHITE);
		this.setBorder(BorderFactory.createLineBorder(Color.black));
		this.setSize(w, h);
		this.setPreferredSize(new Dimension(w, h));
        this.setMinimumSize(new Dimension(w, h));
	}
	
	
	private class ControlFrame extends Panel{
		private TextLine 	path;
		private Spinner 	angleSpinner;
		private Button 		deleteButton;
		private Panel		anglePanel;
		
		public ControlFrame(){
			super(new GridLayout(3,1));
			
			angleSpinner = new Spinner(0.0, -360.0, 360.0, 0.1);
			anglePanel = new Panel(new TextLine("Angle ° "), angleSpinner);
			path = new TextLine(LoadedImageFrame.this.file, true);
			deleteButton = new Button(""+Text.BT_RMV_IMAGE, new EventRemoveImage(selectImagePanel, LoadedImageFrame.this));
			
			this.add(anglePanel);
			this.add(path);
			this.add(deleteButton);
		}
		
		public double getAngle(){
			return (double) angleSpinner.getValue();
		}
	}
}
