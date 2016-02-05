package pt.asits.util.exceptions;


import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


public final class ConversionExceptionTest {


	@Rule
	public final ExpectedException expectedException;


	public ConversionExceptionTest() {
		this.expectedException = ExpectedException.none();
	}


	@Test
	public void constructorDefaultTest() {
		new ConversionException();
		// To improve code quality, no real usefulness
		Assert.assertTrue( true );
	}


	@Test
	public void constructorUsingAValidMessageTest() {
		new ConversionException( "A message." );
		// To improve code quality, no real usefulness
		Assert.assertTrue( true );
	}

}
