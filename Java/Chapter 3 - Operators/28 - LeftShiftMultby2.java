/**
 * @author AviralJanveja
 * Left shifting as a quick way to multiply by 2, but with a Risk ! 
 */
public class LeftShiftMultby2 {

	public static void main(String[] args) {
		
		int i;
		int num = 268435454;
		//int num = 0xFFFFFFE; (Same value as above, but in HexaDecimal.)
		
		for (i=0; i<4; i++) {
			num = num << 1;
			System.out.println(num);
			System.out.println(Integer.toBinaryString(num)); // Note that Zeroes on the Left High order bit positions are not printed by Java.
			// Left shifting the value a 4th time puts 1 in the high order bit.
			// Thus making the value negative instead of multiplying by 2. 
		}

	}

}
