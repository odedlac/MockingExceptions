/**
 * 
 */
package code;

/**
 * @author oded
 *
 */
public class Divider {

	public Integer divide(Integer i, Integer j) throws IllegalArgumentException{	
		Integer k = 0;
		try {
			k = i / j;
		} catch (Exception IllegalArgumentException) {
			System.out.println("Division by zero");
			throw new IllegalArgumentException();
		}
		return k;
	}
}
