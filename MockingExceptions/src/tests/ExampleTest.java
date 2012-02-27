/**
 * 
 */
package tests;

import org.junit.Test;
import code.Divider;
import static org.mockito.Mockito.*;


/** 
 * @author oded
 *
 */
public class ExampleTest {

	@Test(expected = IllegalArgumentException.class)
	public void test1() {
		// Test without exception mocking
		Integer firstInput = 6;
		Integer secondInput = 0;

		Divider divider = new Divider();

		divider.divide(firstInput,secondInput); 
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void test2() {
		// Test with exception mocking
		Integer firstInput = 6;
		Integer secondInput = 0;
		
		Divider mockedDivider = mock(Divider.class);
		
		doThrow(new IllegalArgumentException()).when(mockedDivider).divide(anyInt(),eq(0));
		
		mockedDivider.divide(firstInput,secondInput);

	}
}
