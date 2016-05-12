package pt.asits.util.assertion;


import pt.asits.util.argument.assertions.NotEmptyArrayArgumentAssertion;
import pt.asits.util.argument.assertions.NotEmptyStringArgumentAssertion;
import pt.asits.util.argument.assertions.NotNullArgumentAssertion;


/**
 * 
 * @author Pedro Caleia
 *
 */
public final class ArgumentAssertions {


	public static void assertNotNull( Object argument, String argumentName ) {
		NotNullArgumentAssertion.INSTANCE.assertArgument( argument, argumentName );
	}


	public static void assertNotEmpty( String argument, String argumentName ) {
		NotEmptyStringArgumentAssertion.INSTANCE.assertArgument( argument, argumentName );
	}


	public static void assertNotEmpty( Object[] argument, String argumentName ) {
		NotEmptyArrayArgumentAssertion.INSTANCE.assertArgument( argument, argumentName );
	}

}
