/**
 * @author AviralJanveja
 * initialize 2D Array.
 */
public class Array2DInit{
	
	public static void main(String[] args) {
		
		int m [][] = {
				{1,2}, {3,4}, {5,6}, {7,8}
		};
		
		int i, j;
		
		for(i=0; i<4; i++) {
			for(j=0; j<2; j++)
				System.out.print(m[i][j] + "");
			System.out.println();
		}

	}

}
