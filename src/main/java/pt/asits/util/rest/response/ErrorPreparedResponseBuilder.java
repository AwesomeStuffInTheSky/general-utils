package pt.asits.util.rest.response;


import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;

import pt.asits.util.argument.assertions.Argument;


public final class ErrorPreparedResponseBuilder extends PreparedResponseBuilder {


	private final String[] errors;


	public ErrorPreparedResponseBuilder( Status status, String error, String ... errors ) {
		super( status );
		Argument.assertNotEmpty( error, "error" );
		Argument.assertNotNull( errors, "errors" );

		this.errors = new String[ errors.length + 1 ];
		this.errors[ 0 ] = error;
		System.arraycopy( errors, 0, this.errors, 1, errors.length );
	}


	@Override
	public Response build() {
		JsonNodeFactory factory = JsonNodeFactory.instance;
		ArrayNode errors = factory.arrayNode();
		for( String error : this.errors ) {
			errors.add( factory.objectNode().set( "error", factory.textNode( error ) ) );
		}
		JsonNode json = factory.objectNode().set( "errors", errors );
		return Response.status( super.status ).entity( json ).build();
	}

}
