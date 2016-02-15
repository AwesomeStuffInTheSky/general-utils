package pt.asits.util.argument.assertions;


import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


public final class NotEmptyArrayArgumentAssertionTest extends EnumTest<NotEmptyArrayArgumentAssertion> {


	@Rule
	public final ExpectedException expectedException;


	public NotEmptyArrayArgumentAssertionTest() {
		this.expectedException = ExpectedException.none();
	}


	@Test
	public void assertArgumentUsingAValidArgumentTest() {
		NotEmptyArrayArgumentAssertion.INSTANCE.assertArgument( new String[] { "aString" }, "someName" );
		// To improve code quality, no real usefulness
		Assert.assertTrue( true );
	}


	@Test
	public void assertArgumentUsingANullArgumentTest() {
		this.expectedException.expect( IllegalArgumentException.class );
		this.expectedException.expectMessage( "The argument 'someName' cannot be null." );
		NotEmptyArrayArgumentAssertion.INSTANCE.assertArgument( null, "someName" );
		Assert.fail( "An exception should have been throwed." );
	}
	
	
	@Test
	public void assertArgumentUsingAnEmptyArrayTest() {
		this.expectedException.expect( IllegalArgumentException.class );
		this.expectedException.expectMessage( "The argument 'someName' cannot be empty." );
		NotEmptyArrayArgumentAssertion.INSTANCE.assertArgument( new String[] {}, "someName" );
		Assert.fail( "An exception should have been throwed." );
	}


	@Test
	public void assertArgumentUsingAnArrayWithANullTest() {
		this.expectedException.expect( IllegalArgumentException.class );
		this.expectedException.expectMessage( "The argument 'someName' cannot be empty." );
		NotEmptyArrayArgumentAssertion.INSTANCE.assertArgument( new String[] { null }, "someName" );
		Assert.fail( "An exception should have been throwed." );
	}

}
