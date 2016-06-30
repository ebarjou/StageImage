package uiElements;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class TabbedPane extends JTabbedPane{
	public TabbedPane(){
		super();
	}
	public TabbedPane(String[] name, JPanel... panel){
		super();
		for(int i = 0; i < Math.min(panel.length, name.length); ++i) this.add(panel[i], name[i]);
	}
	
	public void addTab(String name, JPanel panel){
		this.add(panel, name);
	}
	
	public void addTabs(String[] name, JPanel... panel){
		for(int i = 0; i < Math.min(panel.length, name.length); ++i) this.add(panel[i], name[i]);
	}
}
