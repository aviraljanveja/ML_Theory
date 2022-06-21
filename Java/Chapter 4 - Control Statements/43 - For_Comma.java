/**
 * @author AviralJanveja
 * To allow two or more variables to control a for loop, Java permits you to include multiple
   statements in both the initialization and iteration portions of the for. Each statement is separated
   from the next by a comma.
 */
public class For_Comma {
	
	
	public static void main(String[] args) {
		
		for (int a=1,b=4; a<b; a++, b--) {
			
			System.out.println("a = " +a);
			System.out.println("b = " +b);
		}

	}

}
