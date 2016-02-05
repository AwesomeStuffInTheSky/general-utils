package pt.asits.util;


public interface ArgumentAssertion<T> {


	public void assertArgument( T argument, String argumentName );


	default public void assertArgument( T argument1, String argumentName1, T argument2, String argumentName2 ) {
		assertArgument( argument1, argumentName1 );
		assertArgument( argument2, argumentName2 );
	}


	default public void assertArgument( T argument1, String argumentName1, T argument2, String argumentName2, T argument3,
			String argumentName3 ) {
		assertArgument( argument1, argumentName1 );
		assertArgument( argument2, argumentName2 );
		assertArgument( argument3, argumentName3 );
	}

}
