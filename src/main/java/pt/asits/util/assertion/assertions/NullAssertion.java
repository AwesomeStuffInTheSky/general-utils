package pt.asits.util.assertion.assertions;


import pt.asits.util.assertion.Assertion;


public enum NullAssertion implements Assertion<Object> {

	INSTANCE;


	@Override
	public boolean assertion( Object object ) {
		return object == null;
	}

}
