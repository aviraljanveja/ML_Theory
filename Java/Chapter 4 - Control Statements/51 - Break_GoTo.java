/**
 * @author AviralJanveja
 * Using labeled break as a civilized form of GoTo.
 */
public class Break_GoTo {

	public static void main(String[] args) {
		
		boolean t = true; 
		
		first: {
			second: {
				third: {
					System.out.println("Before the break.");
					if (t) break second; // break out of the block labeled second.
					System.out.println("This won't execute");
		}
		System.out.println("This won't execute");
		}
		System.out.println("This is after second block.");
		
		}

	}

}
