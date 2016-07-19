package main;

import org.opencv.core.Core;

import lang.Text;
import main.ui.MainTabbedPane;
import main.ui.calibration.CalibrationPanel;
import main.ui.result.ResultPanel;
import main.ui.selectImages.SelectImagesPanel;
import uiElements.Window;

public class Main {
	/*
	 * Première méthode appelée, initialise la fenêtre du programme et y ajoute le panneau d'onglets
	 */
	public static void main(String[] args) {
		Window 				mainWindow;
		MainTabbedPane		mainTabbedPane;
		
		SelectImagesPanel	selectImagePanel;
		CalibrationPanel	calibrationPanel;
		ResultPanel			resultPanel;
		
		System.loadLibrary( Core.NATIVE_LIBRARY_NAME );
		
		mainWindow = new Window(""+Text.WIN_TITLE, 1600, 900);
		
		selectImagePanel = new SelectImagesPanel();
		calibrationPanel = new CalibrationPanel();
		resultPanel = new ResultPanel(calibrationPanel);
		mainTabbedPane = new MainTabbedPane(selectImagePanel, calibrationPanel, resultPanel);
		
		mainWindow.add(mainTabbedPane);
		
		mainWindow.setVisible(true);
	}

}
