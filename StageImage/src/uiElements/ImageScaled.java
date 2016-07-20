package uiElements;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import utils.exception.ImageException;

public class ImageScaled extends JLabel {
	
	public ImageScaled(){
		super("");
	}
	
	public ImageScaled(String file, int w, int h){
		super("");
		try {
			this.setIcon(resize(file, w, h));
		} catch (ImageException e) {
			this.setText("Err");
		}
	}
	
	private ImageIcon resize(String file, int w, int h) throws ImageException{
		BufferedImage	img;
		Image			dimg;
		double			ratio;
		
		try {
			img = ImageIO.read(new File(file));
			ratio = 1;
			if (img.getWidth() > w) ratio = img.getWidth()/w;
			if (img.getHeight() > h && ratio < img.getHeight()/h) ratio = img.getHeight()/h;
			
			dimg = img.getScaledInstance((int)Math.round(img.getWidth()/ratio), (int)Math.round(img.getHeight()/ratio), Image.SCALE_SMOOTH);
			return new ImageIcon(dimg);
		} catch (IOException e) {
			throw new ImageException(ImageException.FILENOTFOUND, file);
		}
		
	}
}
