package ui.result.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import ui.selectImages.SelectImagesPanel;


public class EventStartCompute implements ActionListener {
	
	public EventStartCompute(){
		
	}

	public void actionPerformed(ActionEvent event){
		System.out.println(SelectImagesPanel.getImages());
	}
}
