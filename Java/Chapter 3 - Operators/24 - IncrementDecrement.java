/**
 * @author AviralJanveja
 *
 */
public class IncrementDecrement {

	public static void main(String[] args) {
		 
		int a = 1;
		int b = 1;
		int c, d; 
		
		c = a++; // c should be 1 here. First Assignment, then Increment. (a will be 2 anyway)
		System.out.println("a = "+a);
		System.out.println("c = "+c);
		
		
		d = ++b; // d should be 2 here. First Increment, then Assignment. (b will be 2 anyway)
		System.out.println("\nb = "+b);
		System.out.println("d = "+d);
		

	}

}
