package utils;
import java.io.File;

import org.opencv.core.Mat;
import org.opencv.highgui.Highgui;

import utils.exception.ImageException;

/*
 * Image stocké sous la frome d'une Matrice Mat de OpenCV
 */
public abstract class ImageMat {
	static final int	COLOR = 1;
	static final int	GREYSCALE = 0;
	protected String	fileOutput;
	protected Mat		imMatrice;
	protected int		type;
	protected int		channel;
	
	public ImageMat(String file, int channel, int type) throws ImageException{
		this.channel = channel;
		this.type = type;
		if (!(new File(file)).exists()) throw new ImageException(ImageException.FILENOTFOUND, file);
		imMatrice = Highgui.imread(file, channel);
		type = imMatrice.type();
		fileOutput = file;
	}
	
	public ImageMat(int channel, int type){
		this.channel = channel;
		this.type = type;
		imMatrice = new Mat(1, 1, type);
		fileOutput = null;
	}
	
	public ImageMat(int w, int h, int channel, int type){
		this.channel = channel;
		this.type = type;
		imMatrice = new Mat(h, w, this.type);
		fileOutput = null;
	}

	public void write() throws ImageException{
		if (fileOutput != null) {
			Highgui.imwrite(fileOutput, imMatrice);
		} else {
			throw new ImageException(ImageException.WRITE, fileOutput);
		}
	}
	
	public void write(String output) throws ImageException{
		this.setOutput(output);
		this.write();
	}

	public int getHeight(){
		return imMatrice.rows();
	}

	public int getWidth(){
		return imMatrice.cols();
	}

	public String getFile() {
		return fileOutput;
	}

	public void setOutput(String file) {
		this.fileOutput = file;
	}

	public Mat getMat() {
		return imMatrice;
	}

	public void setMat(Mat imMatrice) throws ImageException {
		if (imMatrice.type() == this.type){
			this.imMatrice = imMatrice.clone();
		} else {
			throw new ImageException(ImageException.TYPE, imMatrice.type());
		}
	}

}
