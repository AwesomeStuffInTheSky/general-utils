package pt.asits.util.argument.assertions;


import pt.asits.util.ArgumentAssertion;


public enum NotEmptyArrayArgumentAssertion implements ArgumentAssertion<Object[]> {

	INSTANCE;


	@Override
	public void assertArgument( Object[] argument, String argumentName ) {
		if( argumentName == null || argumentName.trim().isEmpty() )
			throw new IllegalArgumentException( "The argument 'argumentName' cannot be null or empty." );
		if( argument == null || argument.length == 0 || this.isEmpty( argument ) )
			throw new IllegalArgumentException( String.format( "The argument '%s' cannot be null or empty.", argumentName ) );
	}
	
	
	private boolean isEmpty( Object[] array ) {
		for( Object object : array ) {
			if( object != null )
				return false;
		}
		return true;
	}

}
