package images;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import images.exception.ImageException;

/*
 * Image stocké sous la frome d'un BufferedImage de Java2D
 */
public class ImageBuffer {
	BufferedImage buffer;
	
	public ImageBuffer(String file) throws ImageException{
		
		try {
			buffer = ImageIO.read(new File(file));
		} catch (IOException e) {
			throw new ImageException(ImageException.FILENOTFOUND, file);
		}
		
	}
	
	public BufferedImage getBuffer(){
		return buffer;
	}
}
