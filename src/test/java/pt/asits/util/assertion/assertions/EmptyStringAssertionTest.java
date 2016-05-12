package pt.asits.util.assertion.assertions;


import org.junit.Assert;
import org.junit.Test;

import pt.asits.util.junit.AbstractSingletonEnumTest;


/**
 * 
 * @author Pedro Caleia
 *
 */
public final class EmptyStringAssertionTest extends AbstractSingletonEnumTest<EmptyStringAssertion> {


	@Test
	public void assertionShouldReturnFalseWhenArgumentIsNull() {
		Assert.assertFalse( EmptyStringAssertion.INSTANCE.assertion( null ) );
	}


	@Test
	public void assertionShouldReturnTrueWhenArgumentIsAEmptyString() {
		Assert.assertTrue( EmptyStringAssertion.INSTANCE.assertion( "" ) );
	}


	@Test
	public void assertionShouldReturnTrueWhenArgumentIsAStringWithOnlySpaces() {
		Assert.assertTrue( EmptyStringAssertion.INSTANCE.assertion( "   " ) );
	}


	@Test
	public void assertionShouldReturnTrueWhenArgumentIsAStringWithOnlyTabs() {
		Assert.assertTrue( EmptyStringAssertion.INSTANCE.assertion( "\t\t\t" ) );
	}


	@Test
	public void assertionShouldReturnTrueWhenArgumentIsAStringWithSpacesAndTabs() {
		Assert.assertTrue( EmptyStringAssertion.INSTANCE.assertion( "\t \t \t" ) );
	}


	@Test
	public void assertionShouldReturnFalseWhenArgumentIsNotAEmptyString() {
		Assert.assertFalse( EmptyStringAssertion.INSTANCE.assertion( "not a empty string" ) );
	}

}
