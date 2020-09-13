package edu.orangecoastcollege.cs170.fyilmaz.ic22;

public class InvalidTimeException extends Exception {

	public InvalidTimeException() {
		
	}

	public InvalidTimeException(String message) {
		super(message);
		
	}

	public InvalidTimeException(Throwable cause) {
		super(cause);
		
	}

	public InvalidTimeException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public InvalidTimeException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

}
