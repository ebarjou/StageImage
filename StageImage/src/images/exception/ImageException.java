package images.exception;

import lang.Text;

@SuppressWarnings("serial")
public class ImageException extends Exception {
	public static final int FILENOTFOUND = 0;
	
	private static final String[] error = {
		Text.ERR_FILENOTFOUND.toString(),
		"",
	};
	
	public ImageException(){ super(); }
	
	public ImageException(String message){ super(message); }
	
	public ImageException(int err, Object cause){
		super(error[err] + cause.toString());
	}
	
}
