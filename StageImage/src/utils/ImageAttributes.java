package utils;

/*
 * Contient les données nécessaires au SIFT pour un image
 */
public class ImageAttributes {
	private String path;
	private double angle;
	public ImageAttributes(String path, double angle) {
		super();
		this.path = path;
		this.angle = angle;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public double getAngle() {
		return angle;
	}
	public void setAngle(double angle) {
		this.angle = angle;
	};
	public String toString(){
		return "["+path+" ; "+angle+"�]";
	}
}
