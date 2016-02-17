package pt.asits.util.rest.parameter.assertions;


import javax.ws.rs.BadRequestException;
import javax.ws.rs.ClientErrorException;

import pt.asits.util.argument.assertions.Argument;
import pt.asits.util.rest.parameter.RestParameterAssertion;
import pt.asits.util.rest.response.PreparedResponse;


public enum NotNullRestParameterAssertion implements RestParameterAssertion<Object> {

	INSTANCE;


	@Override
	public void assertPathParameter( Object parameter, String pathParameterName ) throws ClientErrorException {
		Argument.assertNotEmpty( pathParameterName, "pathParameterName" );

		if( parameter == null ) {
			String error = String.format( "The path parameter '%s' cannot be null.", pathParameterName );
			throw new BadRequestException( PreparedResponse.badRequest( error ).build() );
		}
	}


	@Override
	public void assertQueryParameter( Object parameter, String queryParameterName ) throws ClientErrorException {
		Argument.assertNotEmpty( queryParameterName, "pathParameterName" );

		if( parameter == null ) {
			String error = String.format( "The query parameter '%s' cannot be null.", queryParameterName );
			throw new BadRequestException( PreparedResponse.badRequest( error ).build() );
		}
	}

}
