package pt.asits.util.argument.assertions;


import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import pt.asits.util.argument.assertions.NotNullArgumentAssertion;


public final class NotNullArgumentAssertionTest extends EnumTest<NotNullArgumentAssertion> {


	@Rule
	public final ExpectedException expectedException;


	public NotNullArgumentAssertionTest() {
		this.expectedException = ExpectedException.none();
	}


	@Test
	public void assertArgumentUsingAStringArgumentTest() {
		NotNullArgumentAssertion.INSTANCE.assertArgument( "someString", "someName" );
		// To improve code quality, no real usefulness
		Assert.assertTrue( true );
	}


	@Test
	public void assertArgumentUsingAObjectArgumentTest() {
		NotNullArgumentAssertion.INSTANCE.assertArgument( new Object(), "someName" );
		// To improve code quality, no real usefulness
		Assert.assertTrue( true );
	}


	@Test
	public void assertArgumentUsingAStringArgumentAndANullNameTest() {
		this.expectedException.expect( IllegalArgumentException.class );
		this.expectedException.expectMessage( "The argument 'someName' cannot be null." );
		NotNullArgumentAssertion.INSTANCE.assertArgument( null, "someName" );
		Assert.fail( "An exception should have been throwed." );
	}


	@Test
	public void assertArgumentUsingANullArgumentNameTest() {
		this.expectedException.expect( IllegalArgumentException.class );
		this.expectedException.expectMessage( "The argument 'argumentName' cannot be null or empty." );
		NotNullArgumentAssertion.INSTANCE.assertArgument( "someString", null );
		Assert.fail( "An exception should have been throwed." );
	}


	@Test
	public void assertArgumentUsingAnEmptyArgumentNameTest() {
		this.expectedException.expect( IllegalArgumentException.class );
		this.expectedException.expectMessage( "The argument 'argumentName' cannot be null or empty." );
		NotNullArgumentAssertion.INSTANCE.assertArgument( "someString", "" );
		Assert.fail( "An exception should have been throwed." );
	}


	@Test
	public void assertArgumentUsingAStringWithASpaceArgumentNameTest() {
		this.expectedException.expect( IllegalArgumentException.class );
		this.expectedException.expectMessage( "The argument 'argumentName' cannot be null or empty." );
		NotNullArgumentAssertion.INSTANCE.assertArgument( "someString", " " );
		Assert.fail( "An exception should have been throwed." );
	}


	@Test
	public void assertArgumentUsingAStringWithATabArgumentNameTest() {
		this.expectedException.expect( IllegalArgumentException.class );
		this.expectedException.expectMessage( "The argument 'argumentName' cannot be null or empty." );
		NotNullArgumentAssertion.INSTANCE.assertArgument( "someString", "\t" );
		Assert.fail( "An exception should have been throwed." );
	}


	@Test
	public void assertArgumentUsingAStringWithANewlineArgumentNameTest() {
		this.expectedException.expect( IllegalArgumentException.class );
		this.expectedException.expectMessage( "The argument 'argumentName' cannot be null or empty." );
		NotNullArgumentAssertion.INSTANCE.assertArgument( "someString", "\n" );
		Assert.fail( "An exception should have been throwed." );
	}

}
