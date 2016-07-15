package sift;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import org.opencv.core.Mat;
import org.opencv.highgui.Highgui;

import main.ui.result.ResultPanel;
import main.ui.selectImages.SelectImagesPanel;
import sift.data.ImageAttributes;
import sift.data.MatchList;
import uiElements.exception.UIException;

public class ActionExecuteSIFT implements ActionListener {
	MatchList 				matchList;
	List<MatchList> 		result;
	List<ImageAttributes> 	files;
	List<Double>			angles;
	Mat 					image1, image2;
	ResultPanel 			resultPanel;
	
	public ActionExecuteSIFT(List<MatchList> givenMatchList, ResultPanel resultPanel) {
		givenMatchList.clear();
		this.result = givenMatchList;
		this.resultPanel = resultPanel;
		files = new ArrayList<ImageAttributes>();/*TODO inutile ?*/
		this.matchList = new MatchList();
	}

	public void actionPerformed(ActionEvent event) {
		files.clear();
		files = SelectImagesPanel.getImages();
		angles = SelectImagesPanel.getAngles();
		try {
			if (files.size() < 2) throw new UIException(UIException.NOTENOUGHFILES, null);
			for(int i = 1; i < files.size(); ++i){
				image1 = Highgui.imread(files.get(i-1).getPath());
				image2 = Highgui.imread(files.get(i).getPath());
				//resultPanel.getPointCloudFrame().setAxeX(image1.cols()/2);
				resultPanel.getPointCloudFrame().addX((resultPanel.getPointCloudFrame().getWidth()/2)-(image1.cols()/2));
				matchList.clear();
				SIFTDetector.sift(image1, image2, matchList);
				matchList.setAngle1(angles.get(i-1));
				matchList.setAngle2(angles.get(i));
				matchList.axe = image1.cols()/2;
				result.add(matchList.clone());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		/*try {
			label_Preview.setAxe(new ImageRGB(files.get(0).toString()).getWidth()/2, new ImageRGB(files.get(0).toString()).getHeight()/2);
		} catch (ImageException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		label_Preview.setList(pointList);
		
		popup.close();*/
		
		resultPanel.ComputePoints();
	}

}
