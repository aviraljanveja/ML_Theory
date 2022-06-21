/**
 * @author AviralJanveja
 * Here is a Program that illustrates 
 * the IF statement.
 */

public class DemoIF {

	public static void main(String[] args) {
		
		int x,y;
		x = 10;
		y = 20;
		
		if(x < y) System.out.println("x is less than y"); // if(boolean condition) statement; 
		//IF statement in simplest form.
		
		x = x * 2; // x value is 20 after this statement executes.
		if(x == y) System.out.println("x is now equal to y");
		
		x = x * 2; // x value is 40 after this statement executes.
		if (x > y) System.out.println("x is now greater than y");
		
		// These won't display anything. 
		if (x < y) System.out.println("you won't see this!");
		if (x == y) System.out.println("you won't see this either!");
		
	}

}
