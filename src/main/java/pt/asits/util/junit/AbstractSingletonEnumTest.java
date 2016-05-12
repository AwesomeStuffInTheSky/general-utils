package pt.asits.util.junit;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;

import org.junit.Assert;
import org.junit.Test;


/**
 * 
 * @author Pedro Caleia
 *
 * @param <T>
 */
public abstract class AbstractSingletonEnumTest<T extends Enum<?>> {


	@Test
	public void valuesShouldReturnEnumArrayWithLengthOf1() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException,
			InvocationTargetException {
		@SuppressWarnings( "unchecked" )
		Class<T> clazz = (Class<T>)( (ParameterizedType)getClass().getGenericSuperclass() ).getActualTypeArguments()[ 0 ];
		Method method = clazz.getMethod( "values" );
		Object object = method.invoke( null );
		Assert.assertTrue( "The return type should be 'Enum[]'.", object instanceof Enum[] );
		Assert.assertEquals( "The array length should be 1.", 1, ( (Enum[])object ).length );
	}


	@Test
	public void valueOfShouldReturnInstanceOfEnum()
			throws NoSuchMethodException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		@SuppressWarnings( "unchecked" )
		Class<T> clazz = (Class<T>)( (ParameterizedType)getClass().getGenericSuperclass() ).getActualTypeArguments()[ 0 ];
		Method method = clazz.getMethod( "valueOf", String.class );
		Object object = method.invoke( null, "INSTANCE" );
		Assert.assertTrue( "The return type should be 'Enum'.", object instanceof Enum );
	}

}
