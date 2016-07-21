package uiElements.combinedElement;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import ui.selectImages.SelectImagesPanel;
import uiElements.exception.UIException;
import utils.exception.ImageException;

public class CalibrationFrame extends JPanel{
	private double	axeLeft, axeRight;
	private Image	image;
	private int		fileNum;
	private int		w;
	private double	xL, xR;
	
	public CalibrationFrame(){
		super();
		fileNum = 0;
		axeLeft = 250;//this.getWidth()*0.25;
		axeRight = 750;
		this.setMinimumSize(new Dimension(640,480));
	}
	
	public int getImageWidth(){
		if (image != null) return image.getWidth(null);
		return 0;
	}
	
	public void paintComponent(Graphics g){
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		g.setColor(Color.GREEN);
		try {
			if (SelectImagesPanel.getImages() == null || SelectImagesPanel.getImages().size() <= fileNum) throw new UIException(); /*TODO popup si pas assez de fichiers ou angles identiques*/
			image = resize(SelectImagesPanel.getImages().get(0).getPath(), this.getWidth(), this.getHeight());
			w = image.getWidth(null);
			g.drawImage(image, 0, 0, null);
			
			xL = (axeLeft/1000)*(double)w;
			xR = (axeRight/1000)*(double)w;
			
			g.drawLine((int)xL, 0, (int)xL, this.getHeight());
			g.drawLine((int)xR, 0, (int)xR, this.getHeight()); 
		} catch (Exception e) {
			/* 
			 * TODO excepetion No image loaded
			 */
		}
		
	}
	
	public double getAxeLeft() {
		return axeLeft;
	}

	public void setAxeLeft(double axeLeft) {
		this.axeLeft = axeLeft;
		repaint();
	}

	public double getAxeRight() {
		return axeRight;
	}

	public void setAxeRight(double axeRight) {
		this.axeRight = axeRight;
		repaint();
	}

	private static Image resize(String file, int w, int h) throws ImageException{
		BufferedImage	img;
		Image			dimg;
		double			ratio;
		
		try {
			img = ImageIO.read(new File(file));
			ratio = 1;
			if (img.getWidth() > w) ratio = img.getWidth()/w;
			if (img.getHeight() > h && ratio < img.getHeight()/h) ratio = img.getHeight()/h;
			
			dimg = img.getScaledInstance((int)Math.round(img.getWidth()/ratio), (int)Math.round(img.getHeight()/ratio), Image.SCALE_SMOOTH);
			return dimg;
		} catch (IOException e) {
			throw new ImageException(ImageException.FILENOTFOUND, file);
		}
		
	}
	
	public void drawCross(Graphics g, int x, int y){
		g.drawLine(x-2, y, x+2, y);
		g.drawLine(x, y-2, x, y+2);
	}
	
}
