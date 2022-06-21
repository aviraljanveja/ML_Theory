/**
 * @author AviralJanveja
 * Declaring the 'loop control variable' inside the for loop.
 */
public class For_Tick {

	public static void main(String[] args) {
		
		// here n is declared inside the initialization portion of the for loop.
		// and thereby scope of n is limited to the scope of the for loop.
		for (int n=10; n>0; n--)
			System.out.println("Tick Tick " +n);

	}

}
