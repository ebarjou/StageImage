package sift;
import java.util.LinkedList;
import java.util.List;

import org.opencv.core.Mat;
import org.opencv.core.MatOfByte;
import org.opencv.core.MatOfDMatch;
import org.opencv.core.MatOfKeyPoint;
import org.opencv.core.Scalar;
import org.opencv.features2d.DMatch;
import org.opencv.features2d.DescriptorExtractor;
import org.opencv.features2d.DescriptorMatcher;
import org.opencv.features2d.FeatureDetector;
import org.opencv.features2d.Features2d;
import org.opencv.features2d.KeyPoint;
import org.opencv.highgui.Highgui;


/*
 * Source : http://dummyscodes.blogspot.fr/2015/12/using-siftsurf-for-object-recognition.html
 */
public class SIFTDetector
{
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void sift(Mat im1, Mat im2)
	{
		System.out.println("Started....");
		Mat im1Image = im1;
		Mat im2Image = im2;

		MatOfKeyPoint im1KeyPoints = new MatOfKeyPoint();
		FeatureDetector featureDetector = FeatureDetector.create(FeatureDetector.SIFT);
		System.out.println("Detecting key points...");
		featureDetector.detect(im1Image, im1KeyPoints);
		KeyPoint[] keypoints = im1KeyPoints.toArray();
		System.out.println(keypoints);

		MatOfKeyPoint im1Descriptors = new MatOfKeyPoint();
		DescriptorExtractor descriptorExtractor = DescriptorExtractor.create(DescriptorExtractor.SIFT);
		System.out.println("Computing descriptors...");
		descriptorExtractor.compute(im1Image, im1KeyPoints, im1Descriptors);

		// Create the matrix for output image.
		Mat outputImage = new Mat(im1Image.rows(), im1Image.cols(), Highgui.CV_LOAD_IMAGE_COLOR);
		Scalar newKeypointColor = new Scalar(255, 0, 0);

		System.out.println("Drawing key points on im1 image...");
		Features2d.drawKeypoints(im1Image, im1KeyPoints, outputImage, newKeypointColor, 0);

		// Match im1 image with the im2 image
		MatOfKeyPoint im2KeyPoints = new MatOfKeyPoint();
		MatOfKeyPoint im2Descriptors = new MatOfKeyPoint();
		System.out.println("Detecting key points in background image...");
		featureDetector.detect(im2Image, im2KeyPoints);
		System.out.println("Computing descriptors in background image...");
		descriptorExtractor.compute(im2Image, im2KeyPoints, im2Descriptors);

		Mat matchoutput = new Mat(im2Image.rows() * 2, im2Image.cols() * 2, Highgui.CV_LOAD_IMAGE_COLOR);
		Scalar matchestColor = new Scalar(0, 255, 0);

		List matches = new LinkedList();
		DescriptorMatcher descriptorMatcher = DescriptorMatcher.create(DescriptorMatcher.FLANNBASED);
		System.out.println("Matching im1 and im2 images...");
		descriptorMatcher.knnMatch(im1Descriptors, im2Descriptors, matches, 2);

		System.out.println("Calculating good match list...");
		LinkedList goodMatchesList = new LinkedList();

		float nndrRatio = 0.7f;

		for (int i = 0; i < matches.size(); i++)
		{
			MatOfDMatch matofDMatch = (MatOfDMatch) matches.get(i);
			DMatch[] dmatcharray = matofDMatch.toArray();
			DMatch m1 = dmatcharray[0];
			DMatch m2 = dmatcharray[1];

			if (m1.distance <= m2.distance * nndrRatio)
			{
				goodMatchesList.addLast(m1);

			}
		}

		if (goodMatchesList.size() >= 7)
		{
			System.out.println("Found!");

			List im1Keypointlist = im1KeyPoints.toList();
			List im2Keypointlist = im2KeyPoints.toList();

			LinkedList im1Points = new LinkedList<>();
			LinkedList im2Points = new LinkedList<>();
			KeyPoint kpt;
			for (int i = 0; i < goodMatchesList.size(); i++)
			{
				kpt = (KeyPoint)(im1Keypointlist.get(((DMatch)goodMatchesList.get(i)).queryIdx));
				im1Points.addLast(kpt.pt);
				kpt = (KeyPoint)(im2Keypointlist.get(((DMatch)goodMatchesList.get(i)).trainIdx));
				im2Points.addLast(kpt.pt);
			}
			
			System.out.println("Drawing matches image...");
			MatOfDMatch goodMatches = new MatOfDMatch();
			goodMatches.fromList(goodMatchesList);

			///KeyPoint2DCloud PointCloud = new KeyPoint2DCloud();
			///KeyPoint[] kpIm1 = (KeyPoint[]) im1Keypointlist.toArray();
			///KeyPoint[] kpIm2 = (KeyPoint[]) im2Keypointlist.toArray();

			///for (int i = 0; i < goodMatchesList.size(); ++i) {
			///	PointCloud.add(kpIm1[((DMatch)(goodMatchesList.get(i))).queryIdx], kpIm2[((DMatch)(goodMatchesList.get(i))).trainIdx]);
			///}

			Features2d.drawMatches(im1Image, im1KeyPoints, im2Image, im2KeyPoints, goodMatches, matchoutput, matchestColor, newKeypointColor, new MatOfByte(), 2);

			//Highgui.imwrite("D:\\Images\\outputImage.jpg", outputImage);
			Highgui.imwrite("D:\\Images\\matchoutput.jpg", matchoutput);
			///return PointCloud;SIFTDetector.java
		}
		else
		{
			System.out.println("Not Found");
		}
		System.out.println("Ended....");
		//return null;
	}
}
