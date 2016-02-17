package pt.asits.util.rest.parameter;


import javax.ws.rs.ClientErrorException;


public interface RestParameterAssertion<T> {


	public void assertPathParameter( T parameter, String pathParameterName ) throws ClientErrorException;


	public void assertQueryParameter( T parameter, String queryParameterName ) throws ClientErrorException;

}
