package algorithm;

import java.util.ArrayList;
import java.util.List;

import org.opencv.core.Point;

import uiElements.combinedElement.PointCloudFrame;
import utils.MatchList;
import utils.Point3D;

public class MatchlistToPoint3D {
	public static List<Point3D> convert(MatchList... matchLists){
		List<Point3D> 		listPoint3D;
		MatchList			matchList;
		Point				p1, p2;
		Point3D				point3D;
		
		listPoint3D = new ArrayList<Point3D>();
		
		for (int i = 0; i < matchLists.length; ++i){
			matchList = matchLists[i];
			for (int j = 0; j < matchList.getSize(); ++j){
				p1 = matchList.getPoint1(j);
				p2 = matchList.getPoint2(j);
				
				point3D = PointsToPoint3D(p1, p2, matchList.getAngle1(), matchList.getAngle2());
				point3D.DeepRotateH(PointCloudFrame.toRad((matchList.getAngle1()+matchList.getAngle2())/2), matchList.axe);
				
				listPoint3D.add(point3D);
			}
		}
		
		return listPoint3D;
	}
	
	private static Point3D PointsToPoint3D(Point p1, Point p2, double angle1, double angle2){
		Point3D		point3D;
		double		x,y,z;
		x = ( p1.x + p2.x )/2;
		y = ( p1.y + p2.y )/2;
		z = (p1.x - p2.x)*(angle1-angle2); /* TODO à corriger */
		point3D = new Point3D(x,y,z);
		return point3D;
	}
}
