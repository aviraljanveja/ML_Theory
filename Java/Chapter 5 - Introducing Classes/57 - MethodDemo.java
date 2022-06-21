/**
 * @author AviralJanveja
 * This method includes a simple 'method' inside the box class.
 * Most of the time, you will use methods to access the instance variables defined by the class.
 * In fact, methods define the interface to most classes.
 * This allows the class implementor to hide the specific layout of internal data structures 
   behind cleaner method abstractions.
 * In addition to defining methods that provide access to data, you can also define methods that are used 
   internally by the class itself.
 */
class Box {
	double width;
	double height;
	double depth;
	
	// Display volume of a box.
	void volume() {
		System.out.print("Volume is ");
		System.out.println(width*height*depth);
	}
}

public class MethodDemo {
	
	public static void main(String[] args) {
		
		Box mybox1 = new Box();
		Box mybox2 = new Box();
		
		// Assign values to mybox1's instance variables
		mybox1.width = 10;
		mybox1.height = 20;
		mybox1.depth = 15;
		
		// Assign values to mybox2's instance variables 
		mybox2.width = 3;
		mybox2.height = 6;
		mybox2.depth = 9;
		
		// Display volume of first box
		mybox1.volume();
		
		// Display volume of second box
		mybox2.volume();

	}

}
