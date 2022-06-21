/**
 * @author AviralJanveja
 *
 */
public class For_FindPrime {

	public static void main(String[] args) {
		
		int num = 11;
		boolean isPrime = true;
		
		// When the loop control variable will not be needed elsewhere, most Java programmers
		// declare it inside the for.
		for(int i=2; i<=num/i; i++) {
			if ((num % i) == 0) {
				isPrime = false;
				break;
				// logic for prime number finding. check if the remainder on division is 0. start dividing by 2,
				// keep going till the quotient(num/i) is still bigger than the divisor(i).
				// Because as long as the above condition is true, there is a chance of finding a new factor. 
				// but once i becomes > than (num/i), that means all the factors till this point have been tried. 
				// for instance, for num = 11, there is no need to try 5*2, because 2*5 is already tried before. 
			}
		}
		
		if (isPrime) System.out.println("Prime");
		else System.out.println("Not Prime");

	}

}
