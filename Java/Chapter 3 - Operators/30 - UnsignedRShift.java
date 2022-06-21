/**
 * @author AviralJanveja
 * The following code demonstrates the unsigned right shift operator.
 */
public class UnsignedRShift {

	public static void main(String[] args) {
		
		int a = -1; 
		System.out.println(a);
		System.out.println(Integer.toBinaryString(a));
		
		a = a  >>> 24; 
		System.out.println(a);
		System.out.println(Integer.toBinaryString(a));

	}

}
