/**
 * @author AviralJanveja
 * Here, the Box classes uses a constructor to initialize the dimensions of the box.
 */

class Box {
	
	double width;
	double height;
	double depth;
	
	// This is the constructor for Box.
	Box(){
		System.out.println("Constructing Box!");
		width = 10;
		height = 10;
		depth = 10;
	}
	
	// Compute and return volume
	double volume() {
		return width*height*depth;
	}
}

public class ClassConstructor {

	public static void main(String[] args) {
		
		// Declare, allocate and initialize Box objects.
		Box mybox1 = new Box(); // "new Box();" is calling the "Box()" constructor.
		Box mybox2 = new Box();
		double vol;
		
		// Get volume of first box
		vol = mybox1.volume();
		System.out.println("Volume is " +vol);
		
		// Get volume of second box
		vol = mybox2.volume();
		System.out.println("Volume is " +vol);
	}

	/*
	 * Look at the output. The statement "Constructing Box" is printed twice before the volumes of the 2 box objects are printed.
	 * This is because the call to print is given as soon as the constructor to the class is called in the "Box mybox1 = new Box();" statement.
	 * Therefore, as the 2 box objects are constructed, the 2 lines are printed simultaneously.
	 */
	
}
