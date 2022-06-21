/**
 * @author AviralJanveja
 * Now Volume() method returns the volume of the box, without printing it.
 */

class Box {
	double width;
	double height;
	double depth;
	
	// Compute and return value.
	double volume( ) {
		return width*height*depth;
	}
}
public class MethodReturn {

	public static void main(String[] args) {
		
		Box mybox1 = new Box();
		Box mybox2 = new Box();
		Double vol;
		
		// Assign values to mybox1's instance variables.
		mybox1.width = 10;
		mybox1.height = 20;
		mybox1.depth = 15;
		
		// Assign values to mybox2's instance variables.
		mybox2.width = 3;
		mybox2.height = 6;
		mybox2.depth = 9;
		
		// Get volume of first box.
		vol = mybox1.volume();
		System.out.println("Volume is " + vol);
		
		// Get volume of second box.
		vol = mybox2.volume();
		System.out.println("Volume is " + vol);

	}

}
