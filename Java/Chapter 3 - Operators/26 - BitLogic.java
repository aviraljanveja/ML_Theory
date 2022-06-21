/**
 * @author AviralJanveja
 * Demonstrates the Bitwise operators.
 */
public class BitLogic {
	
	public static void main(String[] args) {
		
		String binary[] = {
				"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111",
				"1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111" };
		
		int a = 3; // 0011 in Binary.  
		int b = 6; // 0110 in Binary.
		int c = a | b; // 7 in Decimal, 0111 in Binary.
		int d = a & b; // 2 in Decimal, 0010 in Binary.
		int e = a ^ b; // 5 in Decimal, 0101 in Binary.
		int x = 0x0f; // 15 in decimal // 0000 1111 in one byte Binary.
		int f = ~a & x; // 1100 in Binary. ~a is masked with x to reduce its value to less than 16,
		// so that it can be printed using the Binary array.
		
		System.out.println(" a = " + binary[a]);
		System.out.println(" b = " + binary[b]);
		System.out.println(" a|b = " + binary[c]);
		System.out.println(" a&b = " + binary[d]);
		System.out.println(" a^b = " + binary[e]);
		System.out.println(" ~a = " + binary[f]);
		// 1. The array is indexed by the Decimal values of a, b, c, d, e & f in such a away
		// that it shows the binary representation of each result.
		// 2. The array is constructed such that the correct Binary value of n is stored in binary[n]. 
		// for instance, the correct binary value of a=3 (0011) is stored in binary[a] = binary[3] = 4th position of the array. 
		// check the 4th index position of the array to see this fact. Similarly for b, c, d, e & f.
		

	}

}
