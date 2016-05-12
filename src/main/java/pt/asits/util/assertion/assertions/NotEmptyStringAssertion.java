package pt.asits.util.assertion.assertions;


import pt.asits.util.assertion.Assertion;


/**
 * 
 * @author Pedro Caleia
 *
 */
public enum NotEmptyStringAssertion implements Assertion<String> {

	INSTANCE;


	@Override
	public boolean assertion( String string ) {
		if( string == null || string.trim().isEmpty() ) {
			return false;
		}
		else {
			return true;
		}
	}

}
