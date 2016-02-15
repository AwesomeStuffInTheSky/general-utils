package pt.asits.util.argument.assertions;


import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


public final class NotEmptyStringArgumentAssertionTest extends EnumTest<NotEmptyStringArgumentAssertion> {


	@Rule
	public final ExpectedException expectedException;


	public NotEmptyStringArgumentAssertionTest() {
		this.expectedException = ExpectedException.none();
	}


	@Test
	public void assertArgumentUsingAValidArgumentTest() {
		NotEmptyStringArgumentAssertion.INSTANCE.assertArgument( "someString", "someName" );
		// To improve code quality, no real usefulness
		Assert.assertTrue( true );
	}


	@Test
	public void assertArgumentUsingANullArgumentTest() {
		this.expectedException.expect( IllegalArgumentException.class );
		this.expectedException.expectMessage( "The argument 'someName' cannot be null or empty." );
		NotEmptyStringArgumentAssertion.INSTANCE.assertArgument( null, "someName" );
		Assert.fail( "An exception should have been throwed." );
	}


	@Test
	public void assertArgumentUsingAnEmptyStringTest() {
		this.expectedException.expect( IllegalArgumentException.class );
		this.expectedException.expectMessage( "The argument 'someName' cannot be null or empty." );
		NotEmptyStringArgumentAssertion.INSTANCE.assertArgument( "", "someName" );
		Assert.fail( "An exception should have been throwed." );
	}


	@Test
	public void assertArgumentUsingAStringWithASpaceTest() {
		this.expectedException.expect( IllegalArgumentException.class );
		this.expectedException.expectMessage( "The argument 'someName' cannot be null or empty." );
		NotEmptyStringArgumentAssertion.INSTANCE.assertArgument( " ", "someName" );
		Assert.fail( "An exception should have been throwed." );
	}


	@Test
	public void assertArgumentUsingAStringWithATabTest() {
		this.expectedException.expect( IllegalArgumentException.class );
		this.expectedException.expectMessage( "The argument 'someName' cannot be null or empty." );
		NotEmptyStringArgumentAssertion.INSTANCE.assertArgument( "\t", "someName" );
		Assert.fail( "An exception should have been throwed." );
	}


	@Test
	public void assertArgumentUsingAStringWithANewlineTest() {
		this.expectedException.expect( IllegalArgumentException.class );
		this.expectedException.expectMessage( "The argument 'someName' cannot be null or empty." );
		NotEmptyStringArgumentAssertion.INSTANCE.assertArgument( "\n", "someName" );
		Assert.fail( "An exception should have been throwed." );
	}


	@Test
	public void assertArgumentUsingANullArgumentNameTest() {
		this.expectedException.expect( IllegalArgumentException.class );
		this.expectedException.expectMessage( "The argument 'argumentName' cannot be null or empty." );
		NotEmptyStringArgumentAssertion.INSTANCE.assertArgument( "someString", null );
		Assert.fail( "An exception should have been throwed." );
	}


	@Test
	public void assertArgumentUsingAnEmptyArgumentNameTest() {
		this.expectedException.expect( IllegalArgumentException.class );
		this.expectedException.expectMessage( "The argument 'argumentName' cannot be null or empty." );
		NotEmptyStringArgumentAssertion.INSTANCE.assertArgument( "someString", "" );
		Assert.fail( "An exception should have been throwed." );
	}


	@Test
	public void assertArgumentUsingAStringWithASpaceArgumentNameTest() {
		this.expectedException.expect( IllegalArgumentException.class );
		this.expectedException.expectMessage( "The argument 'argumentName' cannot be null or empty." );
		NotEmptyStringArgumentAssertion.INSTANCE.assertArgument( "someString", " " );
		Assert.fail( "An exception should have been throwed." );
	}


	@Test
	public void assertArgumentUsingAStringWithATabArgumentNameTest() {
		this.expectedException.expect( IllegalArgumentException.class );
		this.expectedException.expectMessage( "The argument 'argumentName' cannot be null or empty." );
		NotEmptyStringArgumentAssertion.INSTANCE.assertArgument( "someString", "\t" );
		Assert.fail( "An exception should have been throwed." );
	}


	@Test
	public void assertArgumentUsingAStringWithANewlineArgumentNameTest() {
		this.expectedException.expect( IllegalArgumentException.class );
		this.expectedException.expectMessage( "The argument 'argumentName' cannot be null or empty." );
		NotEmptyStringArgumentAssertion.INSTANCE.assertArgument( "someString", "\n" );
		Assert.fail( "An exception should have been throwed." );
	}

}
