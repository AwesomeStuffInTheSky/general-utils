package pt.asits.util;


import pt.asits.util.exceptions.ConversionException;


class AToBConverter implements ObjectConverter<A, B> {


	@Override
	public B convert( A a ) throws ConversionException {
		return new B();
	}

}
