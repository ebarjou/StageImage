package images.exception;

import lang.Text;

@SuppressWarnings("serial")
public class ImageException extends Exception {
	public static final int FILENOTFOUND = 0,
							ACCESSOUTSIDEIMAGE = 1,
							TYPE = 2,
							WRITE = 3;
	
	private static final String[] error = {
		Text.ERR_FILENOTFOUND.toString(),
		Text.ERR_ACCESSOUTISEIMAGE.toString(),
		Text.ERR_TYPE.toString(),
		Text.ERR_WRITE.toString(),
		"",
	};
	
	public ImageException(){ super(); }
	
	public ImageException(String message){ super(message); }
	
	public ImageException(int err, Object cause){
		super(error[err] + cause.toString());
	}
	
}
