/**
 * @author AviralJanveja
 *
 */
public class While_NoBody {

	public static void main(String[] args) {
		int i, j;
		
		i = 100;
		j = 200;
		
		// Find the midpoint between i and j.
		while (++i < --j) ; // No body in this loop.
		// Note: Here it is important to use the increment/decrement operators in the prefix form because, 
		// the value must be incremented/decremented before it is assigned or returned. 
		// Change the above increment/decrement to postfix form to see exactly why it is necessary.
		System.out.println("Midpoint is " +i);

	}

}
