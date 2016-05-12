package pt.asits.util.assertion;


import pt.asits.util.assertion.assertions.EmptyArrayAssertion;
import pt.asits.util.assertion.assertions.EmptyStringAssertion;
import pt.asits.util.assertion.assertions.NotEmptyArrayAssertion;
import pt.asits.util.assertion.assertions.NotEmptyStringAssertion;
import pt.asits.util.assertion.assertions.NotNullAssertion;
import pt.asits.util.assertion.assertions.NullAssertion;


/**
 * 
 * @author Pedro Caleia
 *
 */
public final class Assertions {


	public static boolean assertNotNull( Object object ) {
		return NotNullAssertion.INSTANCE.assertion( object );
	}


	public static boolean assertNull( Object object ) {
		return NullAssertion.INSTANCE.assertion( object );
	}


	public static boolean assertNotEmpty( String string ) {
		return NotEmptyStringAssertion.INSTANCE.assertion( string );
	}


	public static boolean assertNotEmpty( Object[] array ) {
		return NotEmptyArrayAssertion.INSTANCE.assertion( array );
	}


	public static boolean assertEmpty( String string ) {
		return EmptyStringAssertion.INSTANCE.assertion( string );
	}


	public static boolean assertEmpty( Object[] array ) {
		return EmptyArrayAssertion.INSTANCE.assertion( array );
	}

}
