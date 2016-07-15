package uiElements;

import java.awt.Component;
import java.awt.LayoutManager;

import javax.swing.JPanel;

public class Panel extends JPanel{
	public Panel(){
		super();
	}
	public Panel(LayoutManager layout){
		super(layout);
	}
	public Panel(Component... comp){
		super();
		for(int i = 0; i < comp.length; ++i) this.add(comp[i]);
	}
	
}
