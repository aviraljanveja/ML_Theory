/**
 * @author AviralJanveja
 * Using labeled break to exit from nested loops.
 */
public class Labeled_Break {

	
	public static void main(String[] args) {
		
		outer: for(int i=0; i<3; i++) {
			System.out.print("Pass "+ i +": ");
			for(int j=0; j<100; j++) {
				if(j==10) break outer; // Exit both loops.
				System.out.print(j + " ");
			}
			System.out.println("This will not print");
		}
		System.out.println();
		System.out.print("Loops Complete.");
		

	}

}
