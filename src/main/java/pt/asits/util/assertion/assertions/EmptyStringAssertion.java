package pt.asits.util.assertion.assertions;


import pt.asits.util.assertion.Assertion;
import pt.asits.util.assertion.Assertions;


/**
 * 
 * @author Pedro Caleia
 *
 */
public enum EmptyStringAssertion implements Assertion<String> {

	INSTANCE;


	@Override
	public boolean assertion( String string ) {
		if( Assertions.assertNull( string ) )
			return false;

		if( string.trim().isEmpty() ) {
			return true;
		}
		else {
			return false;
		}
	}

}
