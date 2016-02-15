package pt.asits.util;


import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


public final class ObjectConverterTest {


	@Rule
	public final ExpectedException expectedException;

	private final AToBConverter converter;


	public ObjectConverterTest() {
		this.expectedException = ExpectedException.none();
		this.converter = new AToBConverter();
	}


	@Test
	public void convertSetUsingAValidSetTest() {
		Set<B> bSet = this.converter.convertSet( new HashSet<A>( Arrays.asList( new A(), new A() ) ) );

		Assert.assertEquals( "The returned set should have a size of 2.", 2, bSet.size() );
	}


	@Test
	public void convertListUsingAValidListTest() {
		List<B> bList = this.converter.convertList( Arrays.asList( new A(), new A() ) );

		Assert.assertEquals( "The returned list should have a size of 2.", 2, bList.size() );
	}


	@Test
	public void convertArrayUsingAValidArrayTest() {
		B[] bArray = this.converter.convertArray( B.class, new A(), new A() );

		Assert.assertEquals( "The returned array should have a size of 2.", 2, bArray.length );
	}


	@Test
	public void convertSetUsingASetWithANullTest() {
		Set<B> bSet = this.converter.convertSet( new HashSet<A>( Arrays.asList( null, new A() ) ) );

		Assert.assertEquals( "The returned set should have a size of 2.", 2, bSet.size() );
	}


	@Test
	public void convertListUsingAListWithANullTest() {
		List<B> bList = this.converter.convertList( Arrays.asList( null, new A() ) );

		Assert.assertEquals( "The returned list should have a size of 2.", 2, bList.size() );
	}


	@Test
	public void convertListUsingAListWithTwoNullsTest() {
		List<B> bList = this.converter.convertList( Arrays.asList( null, new A(), null ) );

		Assert.assertEquals( "The returned list should have a size of 3.", 3, bList.size() );
	}


	@Test
	public void convertArrayUsingAnArrayWithANullTest() {
		B[] bArray = this.converter.convertArray( B.class, null, new A() );

		Assert.assertEquals( "The returned array should have a size of 2.", 2, bArray.length );
	}


	@Test
	public void convertArrayUsingAnArrayTwoNullsTest() {
		B[] bArray = this.converter.convertArray( B.class, null, new A(), null );

		Assert.assertEquals( "The returned array should have a size of 3.", 3, bArray.length );
	}

}
