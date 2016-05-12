package pt.asits.util.assertion.assertions;


import pt.asits.util.assertion.Assertion;


/**
 * 
 * Allows to assert that an array is empty.
 * 
 * A not null array is considered to be empty is all its positions are not null.
 * 
 * @author Pedro Caleia
 *
 */
public enum EmptyArrayAssertion implements Assertion<Object[]> {

	INSTANCE;


	@Override
	public boolean assertion( Object[] array ) {
		if( array.length == 0 || this.isEmpty( array ) ) {
			return true;
		}
		else {
			return false;
		}
	}


	private boolean isEmpty( Object[] array ) {
		for( Object object : array ) {
			if( object != null ) {
				return false;
			}
		}
		return true;
	}

}
