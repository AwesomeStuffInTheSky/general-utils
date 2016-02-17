package pt.asits.util.rest.response;


import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import pt.asits.util.argument.assertions.Argument;


public abstract class PreparedResponseBuilder {


	protected final Status status;


	public PreparedResponseBuilder( Status status ) {
		Argument.assertNotNull( status, "status" );
		this.status = status;
	}


	public abstract Response build();

}
