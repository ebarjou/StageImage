package uiElements.exception;

import lang.Text;

@SuppressWarnings("serial")
public class UIException extends Exception {
	public static final int ERR = 0;
	
	private static final String[] error = {
		
		"",
	};
	
	public UIException(){ super(); }
	
	public UIException(String message){ super(message); }
	
	public UIException(int err, Object cause){
		super(error[err] + cause.toString());
	}
	
}
