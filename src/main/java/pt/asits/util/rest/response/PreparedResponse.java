package pt.asits.util.rest.response;


import javax.ws.rs.core.Response.Status;


public abstract class PreparedResponse {


	public static PreparedResponseBuilder ok( Object Entity ) {
		return new OkPreparedResponseBuilder( Status.OK, Entity ); // 200
	}


	public static PreparedResponseBuilder badRequest( String error, String ... errors ) {
		return new ErrorPreparedResponseBuilder( Status.BAD_REQUEST, error, errors ); // 400
	}


	public static PreparedResponseBuilder unauthorized( String error, String ... errors ) {
		return new ErrorPreparedResponseBuilder( Status.UNAUTHORIZED, error, errors ); // 401
	}


	public static PreparedResponseBuilder forbidden( String error, String ... errors ) {
		return new ErrorPreparedResponseBuilder( Status.FORBIDDEN, error, errors ); // 403
	}


	public static PreparedResponseBuilder notFound( String error, String ... errors ) {
		return new ErrorPreparedResponseBuilder( Status.NOT_FOUND, error, errors ); // 404
	}


	public static PreparedResponseBuilder conflict( String error, String ... errors ) {
		return new ErrorPreparedResponseBuilder( Status.CONFLICT, error, errors ); // 409
	}

}
