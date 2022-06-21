/**
 * @author AviralJanveja
 * Dynamic Initialization of Variables.
 */
public class DynInit {

	public static void main(String[] args) {
		float a = 3f, b = 4f; // Initialized by constants. 
		
		// c is dynamically initialized.
		double c = Math.sqrt(a*a + b*b); // Using built in method sqrt() of the Math class to compute the square root of its argument.
		
		System.out.println("Hypotenuse length is " +c);

	}

}
