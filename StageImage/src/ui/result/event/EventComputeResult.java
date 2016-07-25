package ui.result.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import org.opencv.core.Mat;
import org.opencv.highgui.Highgui;

import algorithm.FDetector;
import ui.result.ResultPanel;
import ui.selectImages.SelectImagesPanel;
import uiElements.PopupMessage;
import uiElements.exception.UIException;
import utils.ImageAttributes;
import utils.MatchList;

/*
 * Action déclenchée pour calculer le SIFT
 */
public class EventComputeResult implements ActionListener {
	MatchList 				matchList;
	List<MatchList> 		result;
	List<ImageAttributes> 	files;
	List<Double>			angles;
	Mat 					image1, image2;
	ResultPanel 			resultPanel;
	
	public EventComputeResult(List<MatchList> givenMatchList, ResultPanel resultPanel) {
		givenMatchList.clear();
		this.result = givenMatchList;
		this.resultPanel = resultPanel;
		files = new ArrayList<ImageAttributes>();/*TODO inutile ?*/
		this.matchList = new MatchList();
	}
	/*
	 * méthode appelé par le bouton "calculer"
	 */
	public void actionPerformed(ActionEvent event) {
		files.clear();
		result.clear();
		files = SelectImagesPanel.getImages();
		angles = SelectImagesPanel.getAngles();
		try {
			if (files.size() < 2) throw new UIException(UIException.NOTENOUGHFILES);
			for(int i = 0; i < files.size(); ++i)
				for(int j = 0; j < files.size(); ++j)
					if (i != j && Math.abs(angles.get(i)-angles.get(j)) < 1 ) throw new UIException(UIException.INCORRECTANGLES);
			/* TODO : trier les point par angle croissant*/
			for(int i = 1; i < files.size(); ++i){
				image1 = Highgui.imread(files.get(i-1).getPath());
				image2 = Highgui.imread(files.get(i).getPath());
				//réglage du décalage du nuage de point pour l'afficher centré dans la fenêtre
				resultPanel.getPointCloudFrame().addX((resultPanel.getPointCloudFrame().getWidth()/2)-(image1.cols()/2));
				//Execution du sift pour image1 et image2 dont le résultat sera stocké dans matchList
				matchList.clear();
				FDetector.sift(image1, image2, matchList);
				matchList.setAngle1(angles.get(i-1));
				matchList.setAngle2(angles.get(i));
				/*
				 * TODO : trouver précisément l'axe de rotation
				 */
				matchList.axe = image1.cols()/2;
				//Ajout des points trouvé dans la liste result
				result.add(matchList.clone());
			}
		} catch (UIException e) {
			PopupMessage.draw(e.toString());
		}
		//Appel de la méthode de resultPanel pour calculer la position des points dans l'espace
		resultPanel.ComputePoints();
	}

}
