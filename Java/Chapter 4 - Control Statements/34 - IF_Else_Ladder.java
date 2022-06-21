/**
 * @author AviralJanveja
 * This demonstrates the if-else-if ladder.
 */
public class IF_Else_Ladder {
	
	public static void main(String[] args) {
		int month = 4; // April
		String season; 
		
		if (month == 12 || month == 1 || month == 2)
			season = "Winter";
		else if (month == 3 || month == 4 || month ==5)
			season= "Spring";
		else if (month == 6 || month == 7 || month == 8)
			season = "Summer";
		else if (month == 9 || month == 10 || month == 11)
			season = "Autumn";
		else
			season = "No Month Like that !";
		
		System.out.println("April falls in the " + season + " season.");

	}

}
