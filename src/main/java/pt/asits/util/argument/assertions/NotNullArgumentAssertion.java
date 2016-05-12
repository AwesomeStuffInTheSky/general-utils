package pt.asits.util.argument.assertions;


import pt.asits.util.assertion.ArgumentAssertion;
import pt.asits.util.assertion.ArgumentAssertions;
import pt.asits.util.assertion.Assertions;


/**
 * 
 * @author Pedro Caleia
 *
 */
public enum NotNullArgumentAssertion implements ArgumentAssertion<Object> {

	INSTANCE;


	@Override
	public void assertArgument( Object argument, String argumentName ) {
		ArgumentAssertions.assertNotEmpty( argumentName, "argumentName" );

		if( Assertions.assertNull( argument ) )
			throw new IllegalArgumentException( String.format( "The argument '%s' cannot be null.", argumentName ) );
	}

}
