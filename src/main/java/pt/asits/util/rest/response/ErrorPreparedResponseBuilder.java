package pt.asits.util.rest.response;


import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import pt.asits.util.argument.assertions.Argument;


public final class ErrorPreparedResponseBuilder extends PreparedResponseBuilder {


	private final Errors errors;


	public ErrorPreparedResponseBuilder( Status status, String error, String ... errors ) {
		super( status );
		Argument.assertNotEmpty( error, "error" );
		Argument.assertNotNull( errors, "errors" );

		this.errors = new Errors( error, errors );
	}


	@Override
	public Response build() {
		return Response.status( super.status ).entity( this.errors ).build();
	}

}
