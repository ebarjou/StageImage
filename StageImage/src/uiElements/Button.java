package uiElements;

import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Button extends JButton {
	public Button(String name){
		super(name);
	}
	
	public Button(String name, ActionListener action){
		super(name);
		this.addActionListener(action);
	}
	
}
