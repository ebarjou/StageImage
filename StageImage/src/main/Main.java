package main;

import lang.Text;
import main.ui.MainTabbedPane;
import main.ui.calibration.CalibrationPanel;
import main.ui.result.ResultPanel;
import main.ui.selectImages.SelectImagesPanel;
import uiElements.Window;

public class Main {
	
	public static void main(String[] args) {
		Window 				mainWindow;
		MainTabbedPane		mainTabbedPane;
		SelectImagesPanel	selectImagePanel;
		CalibrationPanel	calibrationPanel;
		ResultPanel			resultPanel;
		
		mainWindow = new Window(""+Text.WIN_TITLE, 1600, 900);
		selectImagePanel = new SelectImagesPanel();
		calibrationPanel = new CalibrationPanel();
		resultPanel = new ResultPanel();
		mainTabbedPane = new MainTabbedPane(selectImagePanel, calibrationPanel, resultPanel);
		
		mainWindow.add(mainTabbedPane);
		
		mainWindow.setVisible(true);
		//mainWindow.add(new TabbedPane(new String[]{"1", "2"}, new JPanel(), new JPanel()));
	}

}
