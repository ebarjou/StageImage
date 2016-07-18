package main.ui.result.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import main.ui.result.ResultPanel;
import sift.data.Point3D;

public class EventExport implements ActionListener{
	ResultPanel 	resultPanel;
	List<Point3D> 	points;
	
	public EventExport(ResultPanel resultPanel){
		this.resultPanel = resultPanel;
	}
	public void actionPerformed(ActionEvent arg0) {
		File file = new File("D://out.xyz");
		points = resultPanel.getPointCloudFrame().getPoints3D();
		try {
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
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
