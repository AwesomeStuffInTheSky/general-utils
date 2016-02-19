package pt.asits.util.rest.response;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;


final class Errors {


	@JsonProperty( "errors" )
	private final List<String> errors;


	public Errors( String error, String ... errors ) {
		this.errors = new ArrayList<>();
		this.errors.add( error );
		this.errors.addAll( Arrays.asList( errors ) );
	}


	public List<String> getErrors() {
		return new ArrayList<>( errors );
	}

}
