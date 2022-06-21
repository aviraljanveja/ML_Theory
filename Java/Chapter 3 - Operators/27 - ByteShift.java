/**
 * @author AviralJanveja
 * Left shifting a Byte Value. 
 */
public class ByteShift {

	public static void main(String[] args) {
		byte a = 64; //(0100 0000 in Binary) 
		byte b;
		int i; 
		
		i = a << 2; // a promoted to int. thus Binary value = 1 0000 0000 = 256.
		b = (byte) (a << 2); // Cast back into byte, so '1' bit is shifted out and the 'lower byte' (last 8 bits) value in now zero.
		
		System.out.println("Original value of a: "+a); // values
		System.out.println("Original value of a in Binary: "+Integer.toBinaryString(a)); // value in binary.
		
		System.out.println("\ni: "+i);
		System.out.println("value of i in Binary: "+Integer.toBinaryString(i));
		
		System.out.println("\nb: "+b);
		System.out.println("value of b in Binary: "+Integer.toBinaryString(b));

	}

}
