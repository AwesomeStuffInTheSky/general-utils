package pt.asits.util.exceptions;


public class ConversionException extends RuntimeException {


	private static final long serialVersionUID = 1L;


	public ConversionException() {
		// Default constructor
	}


	public ConversionException( String message ) {
		super( message );
	}


	public ConversionException( String message, Throwable cause ) {
		super( message, cause );
	}

}
