package pt.asits.util.argument.assertions;


public abstract class Argument {


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
