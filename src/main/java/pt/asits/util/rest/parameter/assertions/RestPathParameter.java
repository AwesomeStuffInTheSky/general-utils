package pt.asits.util.rest.parameter.assertions;


public abstract class RestPathParameter {


	public static void assertNotNull( Object pathParameter, String pathParameterName ) {
		NotNullRestParameterAssertion.INSTANCE.assertPathParameter( pathParameter, pathParameterName );
	}


	public static void assertNotEmpty( String pathParameter, String pathParameterName ) {
		NotEmptyStringRestParameterAssertion.INSTANCE.assertPathParameter( pathParameter, pathParameterName );
	}

}
