package uiElements.combinedElement;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.List;

import javax.swing.JPanel;

import utils.Point3D;

public class PointCloudFrame extends JPanel{
	private double angle, angleRad;
	private double factor;
	private int xShift, yShift;
	private static int scaleShift = 20;
	private List<Point3D> points;
	
	public PointCloudFrame(){
		super();
		angle = 0;
		angleRad = toRad(angle);
		factor = 1;
		xShift = 0;
		yShift = 0;
		this.setMinimumSize(new Dimension(640,480));
	}
	
	public void setAngle(double angle){
		this.angle = angle;
		angleRad = toRad(angle);
		this.repaint();
	}
	
	public void multFactor(double factor){
		this.factor *= factor;
		this.repaint();
	}
	
	public void addX(int x){
		xShift += x;
		this.repaint();
	}
	
	public void addY(int y){
		yShift += y;
		this.repaint();
	}

	public void setPoints3D(List<Point3D> points){
		//if (this.points != null) this.points.clear();
		this.points = points;
		repaint();
	}
	
	public List<Point3D> getPoints3D(){
		return points;
	}
	
	public void paintComponent(Graphics g){
		//double x, dist;
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		//Affichage de la grille
		g.setColor(Color.DARK_GRAY);
		for (int i = (int)(xShift%(scaleShift*factor)); i < this.getWidth(); i+=scaleShift*factor) g.drawLine(i, 0, i, this.getHeight());
		for (int i = (int)(yShift%(scaleShift*factor)); i < this.getHeight(); i+=scaleShift*factor) g.drawLine(0, i, this.getWidth(), i);
		g.setColor(Color.GREEN);
		//affichage de chaque points
		if (points != null && points.size() > 0) 
			for (int i = 0; i < points.size(); ++i){
				points.get(i).RotateH(angleRad, (int)(this.getWidth()/4)); /*TODO min et max de point pour tourner autour de son centre*/ 
				drawCross(g,(int)((xShift+(int)points.get(i).x)*factor) ,(int)((yShift+(int)points.get(i).y)*factor) );
			}
	}
	
	public void drawCross(Graphics g, int x, int y){
		g.drawLine(x-2, y, x+2, y);
		g.drawLine(x, y-2, x, y+2);
	}
	
	public static double toRad(double deg){
		return deg*(2*Math.PI)/360;
	}
}
