package main.ui.result;

import lang.Text;
import uiElements.Button;
import uiElements.Panel;

public class ResultPanel extends Panel{
	private Button	startComputingButton;
	
	public ResultPanel(){
		super();
		
		startComputingButton = new Button(""+Text.BT_COMPUTE);
		
		this.add(startComputingButton);
	}
}
