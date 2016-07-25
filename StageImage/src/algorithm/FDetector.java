package algorithm;
import java.util.LinkedList;
import java.util.List;

import org.opencv.core.Mat;
import org.opencv.core.MatOfDMatch;
import org.opencv.core.MatOfKeyPoint;
import org.opencv.core.Point;
import org.opencv.features2d.DMatch;
import org.opencv.features2d.DescriptorExtractor;
import org.opencv.features2d.DescriptorMatcher;
import org.opencv.features2d.FeatureDetector;
import org.opencv.features2d.KeyPoint;

import utils.MatchList;


/*
 * Calcul la MatchList des images im1 et im2 en Mat par l'algorithme SIFT
 * Modifié à partir de : http://dummyscodes.blogspot.fr/2015/12/using-siftsurf-for-object-recognition.html
 */
public class FDetector {
	public static void sift(Mat im1, Mat im2, MatchList output) {
		FeatureDetector 	featureDetector;
		DescriptorMatcher 	descriptorMatcher;
		MatOfKeyPoint 		im1KeyPoints, im1Descriptors, im2KeyPoints, im2Descriptors;
		MatOfDMatch 		goodMatches, matofDMatch;
		List<MatOfDMatch>	matches;
		LinkedList<DMatch> 	goodMatchesList;
		List<KeyPoint> 		im1Keypointlist, im2Keypointlist;
		LinkedList<Point> 	im1Points, im2Points;
		DMatch[] 		dmatcharray;
		DMatch 			m1,m2;
		KeyPoint 		kpt;
		float 			nndrRatio = 0.7f; // Valeur hérité du code original
		
		//Recherche des points clé de la première image
		featureDetector = FeatureDetector.create(FeatureDetector.SIFT);
		
		im1KeyPoints = new MatOfKeyPoint();
		im1Descriptors = new MatOfKeyPoint();
		
		featureDetector.detect(im1, im1KeyPoints);

		DescriptorExtractor descriptorExtractor = DescriptorExtractor.create(DescriptorExtractor.SIFT);
		
		descriptorExtractor.compute(im1, im1KeyPoints, im1Descriptors);

		//Recherche des points clé de la deuxième image
		im2KeyPoints = new MatOfKeyPoint();
		im2Descriptors = new MatOfKeyPoint();
		
		featureDetector.detect(im2, im2KeyPoints);
		
		descriptorExtractor.compute(im2, im2KeyPoints, im2Descriptors);
		
		//Mise en corrélation des points clé de chaques images
		matches = new LinkedList<MatOfDMatch>();
		descriptorMatcher = DescriptorMatcher.create(DescriptorMatcher.FLANNBASED);
		
		descriptorMatcher.knnMatch(im1Descriptors, im2Descriptors, matches, 2);

		goodMatchesList = new LinkedList<DMatch>();

		for (int i = 0; i < matches.size(); i++) {
			matofDMatch = (MatOfDMatch) matches.get(i);
			dmatcharray = matofDMatch.toArray();
			m1 = dmatcharray[0];
			m2 = dmatcharray[1];

			if (m1.distance <= m2.distance * nndrRatio) goodMatchesList.addLast(m1);
		}
		
		//Si on trouve suffisemment de point (valeur fixé arbitrairement, hérité du code original)
		if (goodMatchesList.size() >= 7){

			im1Keypointlist = im1KeyPoints.toList();
			im2Keypointlist = im2KeyPoints.toList();

			im1Points = new LinkedList<Point>();
			im2Points = new LinkedList<Point>();

			for (int i = 0; i < goodMatchesList.size(); i++){
				kpt = (KeyPoint)(im1Keypointlist.get(((DMatch)goodMatchesList.get(i)).queryIdx));
				im1Points.addLast(kpt.pt);
				kpt = (KeyPoint)(im2Keypointlist.get(((DMatch)goodMatchesList.get(i)).trainIdx));
				im2Points.addLast(kpt.pt);
			}
			
			//Ajout des points trouvé à la liste ouput
			goodMatches = new MatOfDMatch();
			goodMatches.fromList(goodMatchesList);

			KeyPoint[] kpIm1 = (KeyPoint[]) im1Keypointlist.toArray();
			KeyPoint[] kpIm2 = (KeyPoint[]) im2Keypointlist.toArray();

			for (int i = 0; i < goodMatchesList.size(); ++i) {
				output.addIn1(kpIm1[((DMatch)(goodMatchesList.get(i))).queryIdx]);
				output.addIn2(kpIm2[((DMatch)(goodMatchesList.get(i))).trainIdx]);
			}
		}
		else
		{
			System.out.println("Not Found");
		}
		System.out.println("Ended");
	}
}
