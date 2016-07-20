package ui.calibration.event;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import uiElements.Slider;
import uiElements.combinedElement.CalibrationFrame;

public class EventMoveCalLine implements ChangeListener{
	CalibrationFrame calibrationFrame;
	int axe;
	
	public EventMoveCalLine(CalibrationFrame calibrationFrame, int axe){
		this.calibrationFrame = calibrationFrame;
		this.axe = axe;
	}
	public void stateChanged(ChangeEvent event) {
		if (axe == 0) calibrationFrame.setAxeLeft(((Slider)(event.getSource())).getValue());
		else calibrationFrame.setAxeRight(((Slider)(event.getSource())).getValue());
	}

}
