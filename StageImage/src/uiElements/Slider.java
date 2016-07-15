package uiElements;

import javax.swing.JSlider;

public class Slider extends JSlider{
	public Slider(){
		super();
		this.setMaximum(360);
	    this.setMinimum(-360);
	    this.setValue(0);
	    this.setPaintTicks(true);
	    this.setPaintLabels(true);
	    this.setMinorTickSpacing(45);
	    this.setMajorTickSpacing(90);
	}
	public Slider(int min, int max){
		super();
		this.setMaximum(max);
	    this.setMinimum(min);
	    this.setValue((min+max)/2);
	}
}
