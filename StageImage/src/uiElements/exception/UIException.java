package uiElements.exception;

import lang.Text;

@SuppressWarnings("serial")
public class UIException extends Exception {
	public static final int NOTENOUGHFILES = 0,
							INCORRECTANGLES = 1,
							CANNOTWRITE = 2
			;

	private static final String[] error = {
		""+Text.ERR_NOTENOUGHFILES,
		""+Text.ERR_INCORRECTANGLES,
		""+Text.ERR_CANNOTWRITE,
		"",
	};
	
	public UIException(){ super(); }
	
	public UIException(String message){ super(message); }
	
	public UIException(int err){
		super(error[err]);
	}
	
	public UIException(int err, Object cause){
		super(error[err] + cause.toString());
	}
	
}
