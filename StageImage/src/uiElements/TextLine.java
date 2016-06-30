package uiElements;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JLabel;

public class TextLine extends JLabel{
	
	public TextLine(String text){
		super(text);
		this.setupLayout(false);
	}
	
	public TextLine(String text, boolean border){
		super(text);
		this.setupLayout(border);
	}
	
	private void setupLayout(boolean border){
		this.setBackground(Color.WHITE);
		if (border) this.setBorder(BorderFactory.createLineBorder(Color.lightGray));
	}
}