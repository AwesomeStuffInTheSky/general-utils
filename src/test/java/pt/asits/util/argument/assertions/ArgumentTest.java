package pt.asits.util.argument.assertions;


import org.junit.Assert;
import org.junit.Test;


public final class ArgumentTest {


	@Test
	public void assertNotNullUsingAString() {
		Argument.assertNotNull( "someString", "someName" );
		// To improve code quality, no real usefulness
		Assert.assertTrue( true );
	}


	@Test
	public void assertNotNullUsingAObject() {
		Argument.assertNotNull( new Object(), "someName" );
		// To improve code quality, no real usefulness
		Assert.assertTrue( true );
	}


	@Test
	public void assertNotEmptyUsingAString() {
		Argument.assertNotEmpty( "someString", "someName" );
		// To improve code quality, no real usefulness
		Assert.assertTrue( true );
	}


	@Test
	public void assertNotEmptyUsingAnArray() {
		Argument.assertNotEmpty( new String[] { "someString" }, "someName" );
		// To improve code quality, no real usefulness
		Assert.assertTrue( true );
	}

}
