package uiElements;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class Window extends JFrame{
	public Window(String name, int w, int h){
		setBestLookAndFeelAvailable();
		
		this.setTitle(name);
		this.setSize(w, h);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void add(JPanel... panel){
		for(int i = 0; i < panel.length; ++i) this.getContentPane().add(panel[i]);
	}

	public static void setBestLookAndFeelAvailable(){
		String system_lf = UIManager.getSystemLookAndFeelClassName().toLowerCase();
		if(system_lf.contains("metal")){
			try {
				UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
			}catch (Exception e) {}
		}else{
			try {
				UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			}catch (Exception e) {}
		}
	}
}
