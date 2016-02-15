package pt.asits.util.argument.assertions;


import pt.asits.util.ArgumentAssertion;


public enum NotEmptyArrayArgumentAssertion implements ArgumentAssertion<Object[]> {

	INSTANCE;


	@Override
	public void assertArgument( Object[] argument, String argumentName ) {
		Argument.assertNotEmpty( argumentName, "argumentName" );
		Argument.assertNotNull( argument, argumentName );
		if( argument.length == 0 || this.isEmpty( argument ) )
			throw new IllegalArgumentException( String.format( "The argument '%s' cannot be empty.", argumentName ) );
	}
	
	
	private boolean isEmpty( Object[] array ) {
		for( Object object : array ) {
			if( object != null )
				return false;
		}
		return true;
	}

}
