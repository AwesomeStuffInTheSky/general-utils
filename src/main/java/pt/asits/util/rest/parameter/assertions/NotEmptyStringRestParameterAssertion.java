package pt.asits.util.rest.parameter.assertions;


import javax.ws.rs.BadRequestException;
import javax.ws.rs.ClientErrorException;

import pt.asits.util.argument.assertions.Argument;
import pt.asits.util.rest.parameter.RestParameterAssertion;
import pt.asits.util.rest.response.PreparedResponse;


public enum NotEmptyStringRestParameterAssertion implements RestParameterAssertion<String> {

	INSTANCE;


	@Override
	public void assertPathParameter( String parameter, String pathParameterName ) throws ClientErrorException {
		Argument.assertNotEmpty( pathParameterName, "pathParameterName" );

		if( parameter == null || parameter.trim().isEmpty() ) {
			String error = String.format( "The path parameter '%s' cannot be null or empty.", pathParameterName );
			throw new BadRequestException( PreparedResponse.badRequest( error ).build() );
		}
	}


	@Override
	public void assertQueryParameter( String parameter, String queryParameterName ) throws ClientErrorException {
		Argument.assertNotEmpty( queryParameterName, "queryParameterName" );

		if( parameter == null || parameter.trim().isEmpty() ) {
			String error = String.format( "The query parameter '%s' cannot be null or empty.", queryParameterName );
			throw new BadRequestException( PreparedResponse.badRequest( error ).build() );
		}
	}

}
