package pt.asits.util.rest.response;


import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import pt.asits.util.argument.assertions.Argument;


public final class OkPreparedResponseBuilder extends PreparedResponseBuilder {


	private final Object entity;


	public OkPreparedResponseBuilder( Status status, Object entity ) {
		super( status );
		Argument.assertNotNull( entity, "entity" );
		this.entity = entity;
	}


	@Override
	public Response build() {
		return Response.status( super.status ).entity( this.entity ).build();
	}

}
