/**
 * @author AviralJanveja
 * This program demonstrates defining a class along with its instance variables and objects(instances).
 * It also shows that each object gets its own copies of the class' instance variable. Both of these copies
 * of data are separate and unique and have no effect of one another.
 */

class Box {
	double width;
	double height;
	double depth;
}

public class ClassDemo {

	public static void main(String[] args) {
		
		double vol;
		// Declaring 2 objects of type Box. 
		Box mybox1 = new Box();
		Box mybox2 = new Box();
		
		
		
		// Assign values to mybox1's instance variables.
		mybox1.width = 10;
		mybox1.height = 20;
		mybox1.depth = 15;
		
		// Assign other values to mybox2's instance variables.
		mybox2.width = 3;
		mybox2.height = 6;
		mybox2.depth = 9;
		
		// Compute the volume of first box.
		vol = mybox1.width * mybox1.height * mybox1.depth;
		System.out.println("Volume is " + vol);
		
		// compute the volume of the second box.
		vol = mybox2.width * mybox2.height * mybox2.depth;
		System.out.println("Volume is " + vol);

	}

}
