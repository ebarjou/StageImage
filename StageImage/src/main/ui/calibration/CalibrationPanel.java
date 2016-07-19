package main.ui.calibration;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import main.ui.calibration.event.EventChangeDistance;
import main.ui.calibration.event.EventMoveCalLine;
import uiElements.Panel;
import uiElements.Slider;
import uiElements.Spinner;
import uiElements.TextLine;
import uiElements.combinedElement.CalibrationFrame;
/*
 * Panneau pour caliberer la prise de vue
 */
public class CalibrationPanel extends Panel{
	private CalibrationFrame	calibrationFrame;
	private ControlFrame		controlFrame;
	protected Slider			LeftSlider;
	protected Slider			RightSlider;
	private int					sizeInCm;
	
	public CalibrationPanel(){
		super(new BorderLayout());
		
		calibrationFrame = new CalibrationFrame();
		controlFrame = new ControlFrame();
		
		this.add(controlFrame, BorderLayout.NORTH);
		this.add(calibrationFrame, BorderLayout.CENTER);
		
	}
	
	public int getSizeInCm(){
		return sizeInCm;
	}
	
	public void setSizeInCm(double size){
		this.sizeInCm = (int)size;
	}
	
	public double getSizeInPx(){
		return ((double)(Math.abs(LeftSlider.getValue()-RightSlider.getValue())/1000.0))*calibrationFrame.getImageWidth();
	}
	/*
	 * Panneau de controle, comprend un selecteur pour renseigner une distance et 2 slider pour selectionner un zone
	 */
	private class ControlFrame extends Panel{
		private SpinControlFrame	spinControlFrame;
		
		public ControlFrame(){
			super(new FlowLayout(FlowLayout.LEFT));
			
			spinControlFrame = new SpinControlFrame();
			
			this.add(spinControlFrame);
		}
		private class SpinControlFrame extends Panel{
			private Spinner			sizeSpinner;
			public SpinControlFrame(){
				super();
				LeftSlider = new Slider(0, 500);
				LeftSlider.addChangeListener(new EventMoveCalLine(calibrationFrame, 0));
				this.add(new TextLine("Left : "));
				this.add(LeftSlider);
				RightSlider = new Slider(500, 1000);
				RightSlider.addChangeListener(new EventMoveCalLine(calibrationFrame, 1));
				this.add(new TextLine("Right : "));
				this.add(RightSlider);
				sizeSpinner = new Spinner(0, 0, 500, 0.1);
				sizeSpinner.addChangeListener(new EventChangeDistance(CalibrationPanel.this));
				this.add(new TextLine("Size (cm) : "));
				this.add(sizeSpinner);
			}
			
		}
	}
}
