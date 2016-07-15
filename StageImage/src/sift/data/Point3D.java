package sift.data;

public class Point3D {
	public double x, y, z;
	public double ox, oy, oz;
	public double angle;
	
	public Point3D(){
		this.x = 0;
		this.y = 0;
		this.z = 0;
		this.ox = 0;
		this.oy = 0;
		this.oz = 0;
		angle = 0;
	}
	public Point3D(double x, double y, double z){
		this.x = x;
		this.y = y;
		this.z = z;
		this.ox = x;
		this.oy = y;
		this.oz = z;
		angle = 0;
	}
	public double getDistance(int axe){
		return Math.abs(axe-ox);
	}
	public void RotateH(double angleRad, int axeX){
		x = axeX - this.getDistance(axeX)*(Math.cos(angleRad)) + oz*Math.sin(angleRad);
	}
	public void DeepRotateH(double angleRad, double axeX){
		x = ox;
		ox = Math.cos(angleRad)*(ox-axeX) - Math.sin(angleRad)*(oz)+axeX;
		oz = Math.sin(angleRad)*(x-axeX) - Math.cos(angleRad)*(oz);
	}
}
