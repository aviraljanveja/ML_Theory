/**
 * @author AviralJanveja
 * Demonstrates the return method.
 */
public class Return {

	public static void main(String[] args) {
		
		boolean t = true;
				System.out.println("Before the return.");
				if (t) return; // return to caller
				System.out.println("This won't execute.");
	}
	
	/*Note: The if(t) statement is necessary. Without it, the Java compiler would flag an "unreachable code" error because
	 * the complier would know that the the last println() statement would never be executed.
	 * To prevent this error, the if statement is used here to trick the compiler for the sake of this demonstration.
	*/

}
