package ui.result.event;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import ui.result.ResultPanel;
import uiElements.Slider;

public class EventChangeSpin implements ChangeListener{
	ResultPanel 	resultPanel;

	public EventChangeSpin(ResultPanel resultPanel){
		this.resultPanel = resultPanel;
	}
	
	public void stateChanged(ChangeEvent event) {
		resultPanel.getPointCloudFrame().setAngle( ((Slider)(event.getSource())).getValue() );
	}

}
