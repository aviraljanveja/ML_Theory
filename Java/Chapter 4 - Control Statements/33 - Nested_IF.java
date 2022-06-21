/**
 * @author AviralJanveja
 * Nested If - When an if-statement that is target of another if/else.
 */
public class Nested_IF {

	public static void main(String[] args) {
		
		int i = 10, j = 15, k = 150, a = 0, b = 1, c = 0, d = 2; 
		
		if (i == 10) {   // Change this condition to (i != 10) and see how the values of a,b,c,d change ! 
			if (j < 20) a = b; 
			if (k >100) c = d; // This If is 
			else a = c; // associated with this else.
		}
		else a = d; // This else refers to if (i == 10)
		
		System.out.println("These are the variables: " + i);
		System.out.println("These are the variables: " + j);
		System.out.println("These are the variables: " + k);
		System.out.println("These are the variables: " + a);
		System.out.println("These are the variables: " + b);
		System.out.println("These are the variables: " + c);
		System.out.println("These are the variables: " + d);
	}

}