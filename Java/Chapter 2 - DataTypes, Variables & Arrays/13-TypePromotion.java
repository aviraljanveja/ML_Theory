/**
 * @author AviralJanveja
 * Demonstrates Type promotion in expressions.
 */
public class TypePromotion {

	public static void main(String[] args) {
		byte b = 42;
		char c = 'a';
		short s = 1024;
		int i = 50000;
		float f = 5.67f;
		double d = .1234;
		
		double result = (f*b) + (i/c) - (d*s);
		System.out.println((f*b) + "+" + (i/c) + "-" + (d*s)); // as per the promotion rules, this expression is finally 
		System.out.println("result = " +result);               // promoted to double. 
	}

}
