/**
 * @author AviralJanveja
 * This program demonstrates the Ternary operator '?'
 */
public class Ternary {

	public static void main(String[] args) {
		 
		int i, k;
		i = 10;
		k = i<0 ? -i : i; // Gets absolute value of i
		System.out.println("Absolute Value of " + i + " is " + k);
		
		i =-10;
		k = i<0 ? -i : i; // Gets absolute value of i
		System.out.println("Absolute Value of " + i + " is " + k);

	}

}
