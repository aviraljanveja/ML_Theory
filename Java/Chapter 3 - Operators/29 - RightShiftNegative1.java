/**
 * @author AviralJanveja
 * It is interesting to note that if you shift -1 right, the result always remains -1
 * since 'sign extension' keeps bringing in more '1s' in the high-order bits.
 */
public class RightShiftNegative1 {
	
	public static void main(String[] args) {
		
		int i;
		byte b = -128; // Binary value: 10000000 (in Byte, when automatically promoted to int, will give a 32 bit value.)
		
		for(i=0; i<10; i++) {
			
			System.out.println(b); 
			System.out.println(Integer.toBinaryString(b)); // Built in method to write an Integer in Binary format.
			b = (byte)(b >> 1);	// Right shifting the value -128 one by one and seeing how the binary representation works.
			// Also witnessing the effect of sign extension when right-shifting -1 brings no change in its value. 
			
		}	

	}

}
