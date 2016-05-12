package pt.asits.util.assertion;


/**
 * 
 * @author Pedro Caleia
 *
 * @param <T>
 */
public interface ArgumentAssertion<T> {


	public void assertArgument( T argument, String argumentName );

}
