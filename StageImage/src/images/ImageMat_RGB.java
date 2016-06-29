package images;

import org.opencv.core.CvType;

import images.exception.ImageException;


public class ImageMat_RGB extends ImageMat{
	public ImageMat_RGB(){
		super(COLOR,CvType.CV_8UC3);
	}
	
	public ImageMat_RGB(String file) throws ImageException{
		super(file, COLOR,CvType.CV_8UC3);
	}
	
	public ImageMat_RGB(int w, int h){
		super(w, h, COLOR,CvType.CV_8UC3);
	}
	
	public double[] getPixel(int x, int y) throws ImageException{
		if (x>=0 && y >=0 && x<this.getWidth() && y < this.getHeight()){
			return imMatrice.get(y, x);
		} else {
			throw new ImageException("setPixel outside of the matrice");
		}
	}
	
	public void setPixel(int x, int y, int r, int g, int b) throws ImageException{
		if (x>=0 && y >=0 && x<this.getWidth() && y < this.getHeight()){
			double[] val = {b,g,r};
			imMatrice.put(y, x, val);
		} else {
			throw new ImageException("setPixel outside of the matrice");
		}
	}
	
	
	public void drawLine(int x, int y, int t, int l, int r, int g, int b){
		for(int i = 0; i < l; ++i){
			try {
				setPixel((int)(i*Math.cos(t)+x), (int)(i*Math.sin(t)+y), r, g, b);
			} catch (ImageException e) {
				
			}
		}
	}
	/*
	 * Traduced from https://fr.wikipedia.org/wiki/Algorithme_de_trac%C3%A9_d%27arc_de_cercle_de_Bresenham
	 */
	public void drawCircle(int x0, int y0, int radius, int r, int g, int b){
		int x = radius;
		int y = 0;
		int err = 0;

		while (x >= y) {
			try {
				setPixel(x0 + x, y0 + y, r, g ,b);
				setPixel(x0 + y, y0 + x, r, g ,b);
				setPixel(x0 - y, y0 + x, r, g ,b);
				setPixel(x0 - x, y0 + y, r, g ,b);
				setPixel(x0 - x, y0 - y, r, g ,b);
				setPixel(x0 - y, y0 - x, r, g ,b);
				setPixel(x0 + y, y0 - x, r, g ,b);
				setPixel(x0 + x, y0 - y, r, g ,b);
			} catch (ImageException e){
				
			}
			y += 1;
			err += 1 + 2*y;
			if (2*(err-x) + 1 > 0) {
				x -= 1;
				err += 1 - 2*x;
			}
		}
	}
}
