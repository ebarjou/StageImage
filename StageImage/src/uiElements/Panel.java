package uiElements;

import java.awt.Component;

import javax.swing.JPanel;

public class Panel extends JPanel{
	public Panel(){
		super();
	}
	public Panel(Component... comp){
		super();
		for(int i = 0; i < comp.length; ++i) this.add(comp[i]);
	}
	
}
