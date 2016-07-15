package sift.data;

import java.util.ArrayList;
import java.util.List;

import org.opencv.features2d.KeyPoint;

import main.ui.calibration.CalibrationPanel;
import uiElements.combinedElement.PointCloudFrame;

public class MatchList {
	private List<KeyPoint> img1;
	private List<KeyPoint> img2;
	private double angle1, angle2;
	public double axe;
	
	public MatchList(){
		img1 = new ArrayList<KeyPoint>();
		img2 = new ArrayList<KeyPoint>();
	}
	public void addIn1(KeyPoint p){
		img1.add(p);
	}
	public void addIn2(KeyPoint p){
		img2.add(p);
	}
	public double getAngle1() {
		return angle1;
	}
	public void setAngle1(double angle1) {
		this.angle1 = angle1;
	}
	public double getAngle2() {
		return angle2;
	}
	public void setAngle2(double angle2) {
		this.angle2 = angle2;
	}
	public void clear(){
		img1.clear();
		img2.clear();
	}
	public MatchList clone(){
		MatchList output = new MatchList();
		for(int i = 0; i < img1.size(); ++i) output.addIn1(img1.get(i));
		for(int i = 0; i < img2.size(); ++i) output.addIn2(img2.get(i));
		output.setAngle1(angle1);
		output.setAngle2(angle2);
		return output;
	}
	
	public List<Point3D> to3DPoints(int axe, CalibrationPanel calibrationPanel){
		List<Point3D> output = new ArrayList<Point3D>();
		System.out.println(calibrationPanel.getSizeInCm()+"cm = "+calibrationPanel.getSizeInPx()+"px" );
		Point3D p;
		double x = 0, y = 0, z = -1;
		double pixSize = calibrationPanel.getSizeInCm()/calibrationPanel.getSizeInPx()*50; // en Cm/px
		for (int i = 0; i < Math.min(img1.size(), img2.size()); ++i){
			z = (img2.get(i).pt.x - img1.get(i).pt.x)/Math.tan((Math.abs(angle1-angle2))/2)*50;
			p = new Point3D(img1.get(i).pt.x, img1.get(i).pt.y, z);
			p.DeepRotateH(PointCloudFrame.toRad(angle1), this.axe);
			output.add(p);
		}
		
		return output;
	}
}
