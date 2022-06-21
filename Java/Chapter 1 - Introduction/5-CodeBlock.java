/*
 Demonstrate a Block of code. 
 */

public class CodeBlock {
	
	public static void main(String args[]) {
		int x, y;
		y = 20;
		
		// the target for this loop is a block.
		for (x = 0; x <= 20; x++) { // Start a new block.
			System.out.println("This is x:" +x);
			System.out.println("This is y:" +y);
			y = y-1;
		} // End block.
	}
}
