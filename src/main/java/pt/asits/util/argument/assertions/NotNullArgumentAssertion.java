package pt.asits.util.argument.assertions;


import pt.asits.util.ArgumentAssertion;


public enum NotNullArgumentAssertion implements ArgumentAssertion<Object> {

	INSTANCE;


	@Override
	public void assertArgument( Object argument, String argumentName ) {
		if( argumentName == null || argumentName.trim().isEmpty() )
			throw new IllegalArgumentException( "The argument 'argumentName' cannot be null or empty." );
		if( argument == null )
			throw new IllegalArgumentException( String.format( "The argument '%s' cannot be null.", argumentName ) );
	}

}
