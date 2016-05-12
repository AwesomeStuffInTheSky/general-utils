package pt.asits.util.assertion.assertions;


import org.junit.Assert;
import org.junit.Test;

import pt.asits.util.junit.AbstractSingletonEnumTest;


/**
 * 
 * @author Pedro Caleia
 *
 */
public final class NotNullAssertionTest extends AbstractSingletonEnumTest<NotNullAssertion> {


	@Test
	public void assertionShouldReturnFalseWhenArgumentIsNull() {
		Assert.assertFalse( NotNullAssertion.INSTANCE.assertion( null ) );
	}


	@Test
	public void assertionShouldReturnTrueWhenArgumentIsNotNull() {
		Assert.assertTrue( NotNullAssertion.INSTANCE.assertion( "a String object" ) );
	}

}
