package ui.result.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import ui.result.ResultPanel;


public class EventChangeView implements ActionListener {
	public static enum action	{SCALE, MOVE};
	public static enum dir		{PLUS, LESS, UP, DOWN, RIGHT, LEFT};
	action 			a;
	dir 			d;
	ResultPanel 	resultPanel;
	
	public EventChangeView(ResultPanel resultPanel,action a, dir d){
		this.a= a;
		this.d = d;
		this.resultPanel = resultPanel;
	}

	public void actionPerformed(ActionEvent event){
		if (a == action.SCALE){
			if(d == dir.PLUS){
				resultPanel.getPointCloudFrame().multFactor(1.25);
			} else {
				resultPanel.getPointCloudFrame().multFactor(0.8);
			}
		} else if (a == action.MOVE){
			if(d == dir.UP) resultPanel.getPointCloudFrame().addY(-5);
			else if(d == dir.DOWN)  resultPanel.getPointCloudFrame().addY(5);
			else if(d == dir.RIGHT)  resultPanel.getPointCloudFrame().addX(5);
			else if(d == dir.LEFT)  resultPanel.getPointCloudFrame().addX(-5);
		}
	}
}
