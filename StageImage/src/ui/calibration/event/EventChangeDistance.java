package ui.calibration.event;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import ui.calibration.CalibrationPanel;
import uiElements.Spinner;

public class EventChangeDistance implements ChangeListener{
	CalibrationPanel 	calibrationPanel;
	
	public EventChangeDistance(CalibrationPanel calibrationPanel){
		this.calibrationPanel = calibrationPanel;
	}
	public void stateChanged(ChangeEvent arg0) {
		calibrationPanel.setSizeInCm((double)((Spinner)(arg0.getSource())).getValue());
	}

}
