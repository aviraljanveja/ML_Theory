/**
 * @author AviralJanveja
 * Manually allocating differing size second dimensions.
 */
public class ArrayTree {

	public static void main(String[] args) {
		
		char twoD[][] = new char [6][];
		
		twoD[0] = new char [1]; // manual allocation of the second dimension.
		twoD[1] = new char [2];
		twoD[2] = new char [3];
		twoD[3] = new char [4];
		twoD[4] = new char [5];
		twoD[5] = new char [6];
		
		int i, j;
		char k = '*';
		
		for (i=0; i<6; i++)
			for (j=0; j<i+1; j++) {
				twoD[i][j] = k;
				//k++;
			}
		
		for(i=0; i<6; i++) {
			for (j=0; j<i+1; j++)
				System.out.print(twoD[i][j] + " ");
			System.out.println();
		}

	}

}
