package ui.result.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.List;

import javax.swing.JFileChooser;

import ui.result.ResultPanel;
import uiElements.FileChooser;
import uiElements.PopupMessage;
import uiElements.exception.UIException;
import utils.Point3D;

public class EventExport implements ActionListener{
	ResultPanel 	resultPanel;
	FileChooser 	fileChooser;
	List<Point3D> 	points;
	
	public EventExport(ResultPanel resultPanel, FileChooser fileChooser){
		this.resultPanel = resultPanel;
		this.fileChooser = fileChooser;
	}
	public void actionPerformed(ActionEvent arg0) {
		File file = new File("");
		if (fileChooser.showOpenDialog(null)== JFileChooser.APPROVE_OPTION){
			file = new File(fileChooser.getSelectedFile().toString());
		}
		points = resultPanel.getPointCloudFrame().getPoints3D();
		try {
			if (file.toString() == "") throw new Exception();
			if (!file.exists()) file.createNewFile();
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			if (points != null){
				for (int i = 0; i < points.size(); ++i){
					bw.write(points.get(i).x+" "+points.get(i).y+" "+points.get(i).z+"\n");
				}
			}
			bw.close();
			System.out.println("Writing done");
		} catch (Exception e) {
			PopupMessage.draw((new UIException(UIException.CANNOTWRITE)).toString());
		}

	}

}
