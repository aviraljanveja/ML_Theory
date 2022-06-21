/**
 * @author AviralJanveja
 * Using continue with a label.
 */
public class Continue_Label {

	public static void main(String[] args) {
		
		outer: for (int i=0; i<10; i++) {
			for (int j=0; j<10; j++) {
				if (j > i) {
					System.out.println();
					continue outer; // The continue statement in this example terminates the the loop counting j, 
					// and continues with the next iteration of the loop counting i.
				}
				System.out.print(" " + (i*j));
			}
		}

	}

}
