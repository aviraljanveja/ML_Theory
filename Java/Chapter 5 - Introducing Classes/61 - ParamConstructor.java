/**
 * @author AviralJanveja
 * Same as the Class Constructor program, but able to handle barious dimensions of boxes 
 * with the help of parameters being added to the constructor. 
 */

class Box {
	
	double width;
	double height;
	double depth;
	
	// This is the constructor for Box.
	Box(double w, double h, double d) {
		
		width = w;
		height = h;
		depth = d;
	}
	
	// Compute and return volume
	double volume() {
		return width*height*depth;
	}
}

public class ParamConstructor {

	public static void main(String[] args) {
		
		// Declare, allocate and initialize Box objects
		Box mybox1 = new Box(10, 20, 15);
		Box mybox2 = new Box(3, 6, 9);
		
		double vol;
		
		// Get volume of first box
		vol = mybox1.volume();
		System.out.println("Volume is " +vol);
		
		// Get volume of second box
		vol = mybox2.volume();
		System.out.println("Volume is " +vol);

	}

}
