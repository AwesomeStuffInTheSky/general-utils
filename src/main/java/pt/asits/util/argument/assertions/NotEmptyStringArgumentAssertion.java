package pt.asits.util.argument.assertions;


import pt.asits.util.assertion.ArgumentAssertion;
import pt.asits.util.assertion.Assertions;


/**
 * 
 * @author Pedro Caleia
 *
 */
public enum NotEmptyStringArgumentAssertion implements ArgumentAssertion<String> {

	INSTANCE;


	@Override
	public void assertArgument( String argument, String argumentName ) {
		if( Assertions.assertEmpty( argumentName ) )
			throw new IllegalArgumentException( "The argument 'argumentName' cannot be null or empty." );
		if( Assertions.assertEmpty( argumentName ) )
			throw new IllegalArgumentException(
					String.format( "The argument '%s' cannot be null or empty.", argumentName ) );
	}

}
