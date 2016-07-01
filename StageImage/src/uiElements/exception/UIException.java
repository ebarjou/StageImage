package uiElements.exception;

import lang.Text;

@SuppressWarnings("serial")
public class UIException extends Exception {
	public static final int NOTENOUGHFILES = 0;

	private static final String[] error = {
		""+Text.ERR_NOTENOUGHFILES,
		"",
	};
	
	public UIException(){ super(); }
	
	public UIException(String message){ super(message); }
	
	public UIException(int err, Object cause){
		super(error[err] + cause.toString());
	}
	
}
