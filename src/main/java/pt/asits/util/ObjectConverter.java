package pt.asits.util;


import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import pt.asits.util.argument.assertions.NotNullArgumentAssertion;
import pt.asits.util.exceptions.ConversionException;


public interface ObjectConverter<T, K> {


	public K convert( T t ) throws ConversionException;


	default public Set<K> convertSet( Set<T> tSet ) throws ConversionException {
		NotNullArgumentAssertion.INSTANCE.assertArgument( tSet, "tSet" );
		Set<K> kSet = new LinkedHashSet<>();
		for( T t : tSet ) {
			if( t != null )
				kSet.add( this.convert( t ) );
			else
				kSet.add( null );
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

}
