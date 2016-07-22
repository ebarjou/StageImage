package uiElements;

import javax.swing.JOptionPane;
/* 
 * TODO à implémenter correctement !
 */
public class PopupMessage {
	public static void draw(String text){
		JOptionPane.showMessageDialog(null, text);//e.getMessage()
	}
}
