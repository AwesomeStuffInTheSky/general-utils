package pt.asits.util.rest.parameter.assertions;


public abstract class RestQueryParameter {


	public static void assertNotNull( Object queryParameter, String queryParameterName ) {
		NotNullRestParameterAssertion.INSTANCE.assertPathParameter( queryParameter, queryParameterName );
	}


	public static void assertNotEmpty( String queryParameter, String queryParameterName ) {
		NotEmptyStringRestParameterAssertion.INSTANCE.assertPathParameter( queryParameter, queryParameterName );
	}

}
