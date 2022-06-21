/**
 * @author AviralJanveja
 * An improved version of the if-else-ef season program.
 * Using switch without the optional 'break' statement.
 */
public class Switch {
	
	
	public static void main(String[] args) {
		
		int month = 4;
		String season;
		
		switch (month) {
		case 12:
		case 1:
		case 2:
			season = "Winter";
			break;
		case 3:
		case 4:
		case 5:
			season = "Spring";
			break;
		case 6:
		case 7:
		case 8:
			season = "Summer";
			break;
		default:
			season = "No month like that!";
		}
	System.out.println("April falls in the " + season + " season.");

	}

}
