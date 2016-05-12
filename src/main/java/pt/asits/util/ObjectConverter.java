package pt.asits.util;


import java.lang.reflect.Array;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import pt.asits.util.argument.assertions.NotNullArgumentAssertion;
import pt.asits.util.exceptions.ConversionException;


/**
 * 
 * @author Pedro Caleia
 *
 * @param <T>
 * @param <K>
 */
public interface ObjectConverter<T, K> {


	public K convert( T object ) throws ConversionException;


	public default Set<K> convertSet( Set<T> tSet ) throws ConversionException {
		NotNullArgumentAssertion.INSTANCE.assertArgument( tSet, "tSet" );
		Set<K> kSet = new LinkedHashSet<>();
		for( T t : tSet ) {
			if( t == null )
				kSet.add( null );
			else
				kSet.add( this.convert( t ) );
		}
		return kSet;
	}


	default public List<K> convertList( List<T> tList ) throws ConversionException {
		NotNullArgumentAssertion.INSTANCE.assertArgument( tList, "tList" );
		List<K> kList = new LinkedList<>();
		for( T t : tList ) {
			if( t != null )
				kList.add( this.convert( t ) );
			else
				kList.add( null );
		}
		return kList;
	}


	@SuppressWarnings( "unchecked" )
	default public K[] convertArray( Class<K> clazz, T ... tArray ) throws ConversionException {
		NotNullArgumentAssertion.INSTANCE.assertArgument( clazz, "clazz" );
		NotNullArgumentAssertion.INSTANCE.assertArgument( tArray, "tArray" );
		K[] kArray = (K[])Array.newInstance( clazz, tArray.length );
		for( int n = 0; n < tArray.length; n++ ) {
			if( tArray[ n ] == null )
				kArray[ n ] = null;
			else
				kArray[ n ] = this.convert( tArray[ n ] );
		}
		return kArray;
	}

}
