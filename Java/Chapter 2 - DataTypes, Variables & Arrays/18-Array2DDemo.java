/**
 * @author AviralJanveja
 * A 2D array-matrix demo. 
 */
public class Array2DDemo {

	public static void main(String[] args) {
		 int twoD [][] = new int [4][5]; //declaring the 2D array.
		 
		 int i, j, k=10; 
		 
		 for (i=0; i<4; i++)  // This nested for loop, is used to number the array elements. row by row.
			 for (j=0; j<5; j++) {
				 twoD[i][j] = k;
				 k++;
			 }
		 
		 for (i=0; i<4; i++) {  // This nested loop is used to print the 4X5 array in the matrix form.
			 for (j=0; j<5; j++)
				 System.out.print(twoD[i][j] + " "); // Print the elements of a single row with space between.
			 System.out.println(); // Go to next line to print the next row. 
		 }

	}

}
