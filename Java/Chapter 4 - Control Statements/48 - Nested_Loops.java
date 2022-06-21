/**
 * @author AviralJanveja
 * Loops may be nested to achieve to achieve various results
 * for example - creating such patters as in this program, or to work with arrays and matrices, etc.
 */
public class Nested_Loops {

	public static void main(String[] args) {
		
		int i, j; 
		
		for (i=0; i<9; i++) {
			for (j=i; j<9; j++) {
				
					System.out.print(" *");
			}
			System.out.println();
		}

	}

}
