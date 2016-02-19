package pt.asits.util.rest.parameter.assertions;


import javax.ws.rs.BadRequestException;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import pt.asits.util.argument.assertions.EnumTest;


public final class NotEmptyStringRestParameterAssertionTest extends EnumTest<NotEmptyStringRestParameterAssertion> {


	@Rule
	public final ExpectedException expectedException;


	public NotEmptyStringRestParameterAssertionTest() {
		this.expectedException = ExpectedException.none();
	}


	@Test
	public void assertPathParameterUsingAValidArgumentTest() {
		NotEmptyStringRestParameterAssertion.INSTANCE.assertPathParameter( "someString", "someName" );
		// To improve code quality, no real usefulness
		Assert.assertTrue( true );
	}


	@Test
	public void assertQueryParameterUsingAValidArgumentTest() {
		NotEmptyStringRestParameterAssertion.INSTANCE.assertQueryParameter( "someString", "someName" );
		// To improve code quality, no real usefulness
		Assert.assertTrue( true );
	}


	@Test
	public void assertPathParameterUsingANullArgumentTest() {
		this.expectedException.expect( BadRequestException.class );
		this.expectedException.expectMessage( "HTTP 400 Bad Request" );
		NotEmptyStringRestParameterAssertion.INSTANCE.assertPathParameter( null, "someName" );
		Assert.fail( "An exception should have been throwed." );
	}


	@Test
	public void assertQueryParameterUsingANullArgumentTest() {
		this.expectedException.expect( BadRequestException.class );
		this.expectedException.expectMessage( "HTTP 400 Bad Request" );
		NotEmptyStringRestParameterAssertion.INSTANCE.assertQueryParameter( null, "someName" );
		Assert.fail( "An exception should have been throwed." );
	}


	@Test
	public void assertPathParameterUsingAnEmptyStringTest() {
		this.expectedException.expect( BadRequestException.class );
		this.expectedException.expectMessage( "HTTP 400 Bad Request" );
		NotEmptyStringRestParameterAssertion.INSTANCE.assertPathParameter( "", "someName" );
		Assert.fail( "An exception should have been throwed." );
	}


	@Test
	public void assertQueryParameterUsingAnEmptyStringTest() {
		this.expectedException.expect( BadRequestException.class );
		this.expectedException.expectMessage( "HTTP 400 Bad Request" );
		NotEmptyStringRestParameterAssertion.INSTANCE.assertQueryParameter( "", "someName" );
		Assert.fail( "An exception should have been throwed." );
	}


	@Test
	public void assertPathParameterUsingAStringWithASpaceTest() {
		this.expectedException.expect( BadRequestException.class );
		this.expectedException.expectMessage( "HTTP 400 Bad Request" );
		NotEmptyStringRestParameterAssertion.INSTANCE.assertPathParameter( " ", "someName" );
		Assert.fail( "An exception should have been throwed." );
	}


	@Test
	public void assertQueryParameterUsingAStringWithASpaceTest() {
		this.expectedException.expect( BadRequestException.class );
		this.expectedException.expectMessage( "HTTP 400 Bad Request" );
		NotEmptyStringRestParameterAssertion.INSTANCE.assertQueryParameter( " ", "someName" );
		Assert.fail( "An exception should have been throwed." );
	}


	@Test
	public void assertPathParameterUsingAStringWithATabTest() {
		this.expectedException.expect( BadRequestException.class );
		this.expectedException.expectMessage( "HTTP 400 Bad Request" );
		NotEmptyStringRestParameterAssertion.INSTANCE.assertPathParameter( "\t", "someName" );
		Assert.fail( "An exception should have been throwed." );
	}


	@Test
	public void assertQueryParameterUsingAStringWithATabTest() {
		this.expectedException.expect( BadRequestException.class );
		this.expectedException.expectMessage( "HTTP 400 Bad Request" );
		NotEmptyStringRestParameterAssertion.INSTANCE.assertQueryParameter( "\t", "someName" );
		Assert.fail( "An exception should have been throwed." );
	}


	@Test
	public void assertPathParameterUsingAStringWithANewlineTest() {
		this.expectedException.expect( BadRequestException.class );
		this.expectedException.expectMessage( "HTTP 400 Bad Request" );
		NotEmptyStringRestParameterAssertion.INSTANCE.assertPathParameter( "\n", "someName" );
		Assert.fail( "An exception should have been throwed." );
	}


	@Test
	public void assertQueryParameterUsingAStringWithANewlineTest() {
		this.expectedException.expect( BadRequestException.class );
		this.expectedException.expectMessage( "HTTP 400 Bad Request" );
		NotEmptyStringRestParameterAssertion.INSTANCE.assertQueryParameter( "\n", "someName" );
		Assert.fail( "An exception should have been throwed." );
	}


	@Test
	public void assertPathParameterUsingANullArgumentNameTest() {
		this.expectedException.expect( IllegalArgumentException.class );
		this.expectedException.expectMessage( "The argument 'pathParameterName' cannot be null or empty." );
		NotEmptyStringRestParameterAssertion.INSTANCE.assertPathParameter( "someString", null );
		Assert.fail( "An exception should have been throwed." );
	}


	@Test
	public void assertQueryParameterUsingANullArgumentNameTest() {
		this.expectedException.expect( IllegalArgumentException.class );
		this.expectedException.expectMessage( "The argument 'queryParameterName' cannot be null or empty." );
		NotEmptyStringRestParameterAssertion.INSTANCE.assertQueryParameter( "someString", null );
		Assert.fail( "An exception should have been throwed." );
	}


	@Test
	public void assertPathParameterUsingAnEmptyArgumentNameTest() {
		this.expectedException.expect( IllegalArgumentException.class );
		this.expectedException.expectMessage( "The argument 'pathParameterName' cannot be null or empty." );
		NotEmptyStringRestParameterAssertion.INSTANCE.assertPathParameter( "someString", "" );
		Assert.fail( "An exception should have been throwed." );
	}


	@Test
	public void assertQueryParameterUsingAnEmptyArgumentNameTest() {
		this.expectedException.expect( IllegalArgumentException.class );
		this.expectedException.expectMessage( "The argument 'queryParameterName' cannot be null or empty." );
		NotEmptyStringRestParameterAssertion.INSTANCE.assertQueryParameter( "someString", "" );
		Assert.fail( "An exception should have been throwed." );
	}


	@Test
	public void assertPathParameterUsingAStringWithASpaceArgumentNameTest() {
		this.expectedException.expect( IllegalArgumentException.class );
		this.expectedException.expectMessage( "The argument 'pathParameterName' cannot be null or empty." );
		NotEmptyStringRestParameterAssertion.INSTANCE.assertPathParameter( "someString", " " );
		Assert.fail( "An exception should have been throwed." );
	}


	@Test
	public void assertQueryParameterUsingAStringWithASpaceArgumentNameTest() {
		this.expectedException.expect( IllegalArgumentException.class );
		this.expectedException.expectMessage( "The argument 'queryParameterName' cannot be null or empty." );
		NotEmptyStringRestParameterAssertion.INSTANCE.assertQueryParameter( "someString", " " );
		Assert.fail( "An exception should have been throwed." );
	}


	@Test
	public void assertPathParameterUsingAStringWithATabArgumentNameTest() {
		this.expectedException.expect( IllegalArgumentException.class );
		this.expectedException.expectMessage( "The argument 'pathParameterName' cannot be null or empty." );
		NotEmptyStringRestParameterAssertion.INSTANCE.assertPathParameter( "someString", "\t" );
		Assert.fail( "An exception should have been throwed." );
	}


	@Test
	public void assertQueryParameterUsingAStringWithATabArgumentNameTest() {
		this.expectedException.expect( IllegalArgumentException.class );
		this.expectedException.expectMessage( "The argument 'queryParameterName' cannot be null or empty." );
		NotEmptyStringRestParameterAssertion.INSTANCE.assertQueryParameter( "someString", "\t" );
		Assert.fail( "An exception should have been throwed." );
	}


	@Test
	public void assertPathParameterUsingAStringWithANewlineArgumentNameTest() {
		this.expectedException.expect( IllegalArgumentException.class );
		this.expectedException.expectMessage( "The argument 'pathParameterName' cannot be null or empty." );
		NotEmptyStringRestParameterAssertion.INSTANCE.assertPathParameter( "someString", "\n" );
		Assert.fail( "An exception should have been throwed." );
	}


	@Test
	public void assertQueryParameterUsingAStringWithANewlineArgumentNameTest() {
		this.expectedException.expect( IllegalArgumentException.class );
		this.expectedException.expectMessage( "The argument 'queryParameterName' cannot be null or empty." );
		NotEmptyStringRestParameterAssertion.INSTANCE.assertQueryParameter( "someString", "\n" );
		Assert.fail( "An exception should have been throwed." );
	}

}
