package sift;
import java.util.LinkedList;
import java.util.List;

import org.opencv.core.Mat;
import org.opencv.core.MatOfByte;
import org.opencv.core.MatOfDMatch;
import org.opencv.core.MatOfKeyPoint;
import org.opencv.core.Point;
import org.opencv.core.Scalar;
import org.opencv.features2d.DMatch;
import org.opencv.features2d.DescriptorExtractor;
import org.opencv.features2d.DescriptorMatcher;
import org.opencv.features2d.FeatureDetector;
import org.opencv.features2d.Features2d;
import org.opencv.features2d.KeyPoint;
import org.opencv.highgui.Highgui;

import sift.data.MatchList;


/*
 * Source : http://dummyscodes.blogspot.fr/2015/12/using-siftsurf-for-object-recognition.html
 */
public class SIFTDetector {
	public static void sift(Mat im1, Mat im2, MatchList output) {
		FeatureDetector 	featureDetector;
		DescriptorMatcher 	descriptorMatcher;
		MatOfKeyPoint 		im1KeyPoints, im1Descriptors, im2KeyPoints, im2Descriptors;
		MatOfDMatch 		goodMatches, matofDMatch;
		List<MatOfDMatch>	matches;
		LinkedList<DMatch> 	goodMatchesList;
		List<KeyPoint> 		im1Keypointlist, im2Keypointlist;
		LinkedList<Point> 	im1Points, im2Points;
		KeyPoint[] 		keypoints;
		DMatch[] 		dmatcharray;
		DMatch 			m1,m2;
		Mat 			matchoutput, outputImage;
		Scalar 			matchestColor;
		KeyPoint 		kpt;
		Scalar 			newKeypointColor;
		float 			nndrRatio = 0.7f;
		
		System.out.println("Started....");

		im1KeyPoints = new MatOfKeyPoint();
		featureDetector = FeatureDetector.create(FeatureDetector.SIFT);
		System.out.println("Detecting key points...");
		featureDetector.detect(im1, im1KeyPoints);
		keypoints = im1KeyPoints.toArray();
		System.out.println(keypoints);

		im1Descriptors = new MatOfKeyPoint();
		DescriptorExtractor descriptorExtractor = DescriptorExtractor.create(DescriptorExtractor.SIFT);
		System.out.println("Computing descriptors...");
		descriptorExtractor.compute(im1, im1KeyPoints, im1Descriptors);

		// Create the matrix for output image.
		outputImage = new Mat(im1.rows(), im1.cols(), Highgui.CV_LOAD_IMAGE_COLOR);
		newKeypointColor = new Scalar(255, 0, 0);

		System.out.println("Drawing key points on im1 image...");
		Features2d.drawKeypoints(im1, im1KeyPoints, outputImage, newKeypointColor, 0);

		// Match im1 image with the im2 image
		im2KeyPoints = new MatOfKeyPoint();
		im2Descriptors = new MatOfKeyPoint();
		System.out.println("Detecting key points in background image...");
		featureDetector.detect(im2, im2KeyPoints);
		System.out.println("Computing descriptors in background image...");
		descriptorExtractor.compute(im2, im2KeyPoints, im2Descriptors);

		matchoutput = new Mat(im2.rows() * 2, im2.cols() * 2, Highgui.CV_LOAD_IMAGE_COLOR);
		matchestColor = new Scalar(0, 255, 0);

		matches = new LinkedList<MatOfDMatch>();
		descriptorMatcher = DescriptorMatcher.create(DescriptorMatcher.FLANNBASED);
		System.out.println("Matching im1 and im2 images...");
		descriptorMatcher.knnMatch(im1Descriptors, im2Descriptors, matches, 2);

		System.out.println("Calculating good match list...");
		goodMatchesList = new LinkedList<DMatch>();

		for (int i = 0; i < matches.size(); i++) {
			matofDMatch = (MatOfDMatch) matches.get(i);
			dmatcharray = matofDMatch.toArray();
			m1 = dmatcharray[0];
			m2 = dmatcharray[1];

			if (m1.distance <= m2.distance * nndrRatio) goodMatchesList.addLast(m1);
		}

		if (goodMatchesList.size() >= 7){
			System.out.println("Found!");

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
			
			System.out.println("Drawing matches image...");
			goodMatches = new MatOfDMatch();
			goodMatches.fromList(goodMatchesList);

			KeyPoint[] kpIm1 = (KeyPoint[]) im1Keypointlist.toArray();
			KeyPoint[] kpIm2 = (KeyPoint[]) im2Keypointlist.toArray();

			for (int i = 0; i < goodMatchesList.size(); ++i) {
				output.addIn1(kpIm1[((DMatch)(goodMatchesList.get(i))).queryIdx]);
				output.addIn2(kpIm2[((DMatch)(goodMatchesList.get(i))).trainIdx]);
			}
			
			Features2d.drawMatches(im1, im1KeyPoints, im2, im2KeyPoints, goodMatches, matchoutput, matchestColor, newKeypointColor, new MatOfByte(), 2);

			//Highgui.imwrite("D:\\Images\\outputImage.jpg", outputImage);
			Highgui.imwrite("D:\\Images\\matchoutput.jpg", matchoutput);
		}
		else
		{
			System.out.println("Not Found");
		}
		System.out.println("Ended....");
	}
}
