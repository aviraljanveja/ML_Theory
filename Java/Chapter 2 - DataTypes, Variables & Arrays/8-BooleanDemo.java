/**
 * @author AviralJanveja
 * Demonstrate Boolean Values.
 */
public class BooleanDemo {

	public static void main(String[] args) {
		
		boolean b;
		
		// When a boolean value is output by println(), "true/false" is displayed. 
		b = false;
		System.out.println("b is "+b);
		
		b = true;
		System.out.println("b is "+b);
		
		// A boolean value by itself can control the If statement. 
		if(b) System.out.println("This is executed.");
		
		b = false;
		if(b) System.out.println("This is not executed.");
		
		// Outcome of a relational operator is always a boolean value.
		System.out.println("10 > 9 is " + (10>9));

	}

}
