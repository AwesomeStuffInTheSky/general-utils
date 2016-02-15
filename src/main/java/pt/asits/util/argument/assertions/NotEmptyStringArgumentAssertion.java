package pt.asits.util.argument.assertions;


import pt.asits.util.ArgumentAssertion;


public enum NotEmptyStringArgumentAssertion implements ArgumentAssertion<String> {

	INSTANCE;


	@Override
	public void assertArgument( String argument, String argumentName ) {
		if( argumentName == null || argumentName.trim().isEmpty() )
			throw new IllegalArgumentException( "The argument 'argumentName' cannot be null or empty." );
		if( argument == null || argument.trim().isEmpty() )
			throw new IllegalArgumentException( String.format( "The argument '%s' cannot be null or empty.", argumentName ) );
	}

}
