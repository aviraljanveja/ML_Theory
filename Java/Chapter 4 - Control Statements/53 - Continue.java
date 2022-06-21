/**
 * @author AviralJanveja
 * Demonstrates the use of continue.
 */
public class Continue {

	public static void main(String[] args) {
		
		for(int i=0; i<10; i++) {
			System.out.print(i + " ");
			if (i%2 == 0) continue; // This code uses the % operator to check if i is even.
			// Is it is, then the loop continues without executing the next line.
			System.out.println("");
		}

	}

}
