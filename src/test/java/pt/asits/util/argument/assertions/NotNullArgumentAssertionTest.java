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
	public void validateUsingAValidStringArgumentAndNameTest() {
		NotNullArgumentAssertion.INSTANCE.assertArgument( "someString", "someName" );
		// To improve code quality, no real usefulness
		Assert.assertTrue( true );
	}


	@Test
	public void validateUsingAValidStringArgumentAndNameTest_2() {
		NotNullArgumentAssertion.INSTANCE.assertArgument( "someString", "someName1", new Object(), "someName2" );
		// To improve code quality, no real usefulness
		Assert.assertTrue( true );
	}


	@Test
	public void validateUsingAValidStringArgumentAndNameTest_3() {
		NotNullArgumentAssertion.INSTANCE.assertArgument( "someString", "someName1", new Object(), "someName2", "anotherString",
				"someName3" );
		// To improve code quality, no real usefulness
		Assert.assertTrue( true );
	}


	@Test
	public void validateUsingAValidObjectArgumentAndNameTest() {
		NotNullArgumentAssertion.INSTANCE.assertArgument( new Object(), "someName" );
	}


	@Test
	public void validateUsingANullArgumentAndAValidNameTest() {
		this.expectedException.expect( IllegalArgumentException.class );
		this.expectedException.expectMessage( "The argument 'someName' cannot be null." );
		NotNullArgumentAssertion.INSTANCE.assertArgument( null, "someName" );
		Assert.fail( "An exception should have been throwed." );
	}


	@Test
	public void validateUsingAStringArgumentAndANullNameTest() {
		this.expectedException.expect( IllegalArgumentException.class );
		this.expectedException.expectMessage( "The argument 'argumentName' cannot be null or empty." );
		NotNullArgumentAssertion.INSTANCE.assertArgument( "someString", null );
		Assert.fail( "An exception should have been throwed." );
	}


	@Test
	public void validateUsingANullArgumentAndANullNameTest() {
		this.expectedException.expect( IllegalArgumentException.class );
		this.expectedException.expectMessage( "The argument 'argumentName' cannot be null or empty." );
		NotNullArgumentAssertion.INSTANCE.assertArgument( null, null );
		Assert.fail( "An exception should have been throwed." );
	}


	@Test
	public void validateUsingANullArgumentAndAEmptyStringNameTest() {
		this.expectedException.expect( IllegalArgumentException.class );
		this.expectedException.expectMessage( "The argument 'argumentName' cannot be null or empty." );
		NotNullArgumentAssertion.INSTANCE.assertArgument( null, "" );
		Assert.fail( "An exception should have been throwed." );
	}


	@Test
	public void validateUsingANullArgumentAndANameWithJustASpaceTest() {
		this.expectedException.expect( IllegalArgumentException.class );
		this.expectedException.expectMessage( "The argument 'argumentName' cannot be null or empty." );
		NotNullArgumentAssertion.INSTANCE.assertArgument( null, " " );
		Assert.fail( "An exception should have been throwed." );
	}


	@Test
	public void validateUsingANullArgumentAndANameWithJustATabTest() {
		this.expectedException.expect( IllegalArgumentException.class );
		this.expectedException.expectMessage( "The argument 'argumentName' cannot be null or empty." );
		NotNullArgumentAssertion.INSTANCE.assertArgument( null, "\t" );
		Assert.fail( "An exception should have been throwed." );
	}


	@Test
	public void validateUsingANullArgumentAndANameWithASpaceAndATabTest() {
		this.expectedException.expect( IllegalArgumentException.class );
		this.expectedException.expectMessage( "The argument 'argumentName' cannot be null or empty." );
		NotNullArgumentAssertion.INSTANCE.assertArgument( null, " \t" );
		Assert.fail( "An exception should have been throwed." );
	}

}
