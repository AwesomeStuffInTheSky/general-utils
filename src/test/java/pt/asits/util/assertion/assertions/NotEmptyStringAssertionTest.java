package pt.asits.util.assertion.assertions;


import org.junit.Assert;
import org.junit.Test;

import pt.asits.util.junit.AbstractSingletonEnumTest;


/**
 * 
 * @author Pedro Caleia
 *
 */
public final class NotEmptyStringAssertionTest extends AbstractSingletonEnumTest<NotEmptyStringAssertion> {


	@Test
	public void assertionShouldReturnFalseWhenArgumentIsNull() {
		Assert.assertFalse( NotEmptyStringAssertion.INSTANCE.assertion( null ) );
	}


	@Test
	public void assertionShouldReturnFalseWhenArgumentIsEmptyString() {
		Assert.assertFalse( NotEmptyStringAssertion.INSTANCE.assertion( "" ) );
	}


	@Test
	public void assertionShouldReturnFalseWhenArgumentIsAStringWithOnlySpaces() {
		Assert.assertFalse( NotEmptyStringAssertion.INSTANCE.assertion( "   " ) );
	}


	@Test
	public void assertionShouldReturnFalseWhenArgumentIsAStringWithOnlyTabs() {
		Assert.assertFalse( NotEmptyStringAssertion.INSTANCE.assertion( "\t\t" ) );
	}


	@Test
	public void assertionShouldReturnFalseWhenArgumentIsAStringWithSpacesAndTabs() {
		Assert.assertFalse( NotEmptyStringAssertion.INSTANCE.assertion( "\t \t " ) );
	}


	@Test
	public void assertionShouldReturnTrueWhenArgumentIsANotEmptyString() {
		Assert.assertTrue( NotEmptyStringAssertion.INSTANCE.assertion( " a String object\t" ) );
	}

}
