package pt.asits.util.assertion.assertions;


import pt.asits.util.assertion.Assertion;


/**
 * 
 * Allows to assert that an array is not empty.
 * 
 * If at least one of the array's positions is not null, then the array is considered to not be empty.
 * 
 * @author Pedro Caleia
 *
 */
public enum NotEmptyArrayAssertion implements Assertion<Object[]> {

	INSTANCE;


	@Override
	public boolean assertion( Object[] array ) {
		if( array == null || array.length == 0 || this.isEmpty( array ) ) {
			return false;
		}
		else {
			return true;
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
