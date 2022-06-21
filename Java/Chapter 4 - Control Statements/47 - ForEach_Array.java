/**
 * @author AviralJanveja
 * Using for-each loop for a 2D array.
 */
public class ForEach_Array {

	public static void main(String[] args) {
		
		int sum = 0; 
		int nums [][] = new int [3][5];
		
		// Give value to nums' Elements
		
		for (int i=0; i<3; i++)
			for (int j=0; j<5; j++)
				nums[i][j] = (i)*(j);
		
		// Use for-each to display the array like an actual matrix looks and also the sum of all elements.
		for(int x[] : nums) {
			System.out.println();
			for (int y : x) {
				System.out.print(" "+y+" ");
				sum += y;
		}
		
		}
		System.out.println();
		System.out.print("Summation: " +sum);

	}

}
