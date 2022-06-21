/**
 * @author AviralJanveja
 * Verification of the fact that the high order bit always determines the sign of the value. 
 * for Integer values while using Bitwise operators.
 */
public class HighOrderBitEffect {

	public static void main(String[] args) {
		
		byte b = 64; //b is 01000000 in Binary.
		b = (byte)(b << 1); // Now b should be 10000000 in Binary, which should be equal to -128.
		// as +128 is outside the range of byte: -128 to 127. (Thereby the fact that high order bit always 
		// determines the sign, no matter how it gets set.)
		
		System.out.println(b); // The output confirms this fact, just run it to see! ;)
		System.out.println(Integer.toBinaryString(b)); // Checkout the last byte = last 8 bits.

	}

}
