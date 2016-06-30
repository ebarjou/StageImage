package uiElements;

import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class Spinner extends JSpinner{
	
	public Spinner(double defVal, double min, double max, double step){
		super(new SpinnerNumberModel(defVal, min, max, step));
	}
	
}
