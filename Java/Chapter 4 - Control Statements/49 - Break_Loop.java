/**
 * @author AviralJanveja
 * Using break to immediately terminate a loop.
 */
public class Break_Loop {
	
	
	public static void main(String[] args) {
		
		for (int i=0; i<100; i++) {
			
			if (i ==10) break; 
			System.out.println("i: "+i);
		}
		
		System.out.println("Loop Complete!");
	}

}
