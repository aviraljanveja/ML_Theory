/**
 * @author AviralJanveja
 * This is the Do-While loop basic demo.
 */
public class Do_While {
	
	public static void main (String[] args) {
		
		int n = 10;
		 do {
			 System.out.println("Tick Tick " +n);
			 //n--;
		 } while(--n > 0);
		 // A better way to implement decrement of n and comparison with zero
		 // is combined into one single expression (--n > 0).
	}

}
