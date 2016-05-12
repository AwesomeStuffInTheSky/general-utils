package pt.asits.util.assertion.assertions;


import org.junit.Assert;
import org.junit.Test;

import pt.asits.util.junit.AbstractSingletonEnumTest;


/**
 * 
 * @author Pedro Caleia
 *
 */
public final class NullAssertionTest extends AbstractSingletonEnumTest<NullAssertion> {


	@Test
	public void assertionShouldReturnTrueWhenArgumentIsNull() {
		Assert.assertTrue( NullAssertion.INSTANCE.assertion( null ) );
	}


	@Test
	public void assertionShouldReturnFalseWhenArgumentIsNotNull() {
		Assert.assertFalse( NullAssertion.INSTANCE.assertion( "a String object" ) );
	}

}
