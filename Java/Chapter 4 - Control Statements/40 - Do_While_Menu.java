/**
 * @author AviralJanveja
 * Using do-while loop's natural property to execute at least once, 
 * to process a menu selection.
 */
public class Do_While_Menu {

	public static void main(String[] args) 
		throws java.io.IOException { // As system.in.read is being used. The program must specify the 
		// throws java.io.IOException clause. It is necessary to handle input errors.
		// It is part of JAVA's exception handling features.
		
		char choice;
			
			do {
				System.out.println("Help on:");
				System.out.println(" 1. if");
				System.out.println(" 2. switch");
				System.out.println(" 3. while");
				System.out.println(" 4. do-while");
				System.out.println(" 5. for\n");
				System.out.println("Choose one:");
				choice = (char) System.in.read(); // system.in.read is one of JAVA's console IO functions.
				// It reads characters from from the standard input (returned as integers), which is why
				// the returned value is cast to char.
			} while(choice < '1' || choice > '5'); // The do-while is used to check if the user has entered
			// a valid choice, if not - then the user is re-prompted.
				
			System.out.println("\n");
			
			switch(choice) {
			case '1':
				System.out.println("The if:\n");
				System.out.println("if(condition) statement;");
				System.out.println("else statement;");
				break;
			case '2':
				System.out.println("The switch:\n");
				System.out.println("switch(expression) {");
				System.out.println(" case constant:");
				System.out.println(" statement sequence");
				System.out.println(" break;");
				System.out.println(" // ...");
				System.out.println("}");
				break;
			case '3':
				System.out.println("The while:\n");
				System.out.println("while(condition) statement;");
				break;
			case '4':
				System.out.println("The do-while:\n");
				System.out.println("do {");
				System.out.println(" statement;");
				System.out.println("} while (condition);");
				break;
			case '5':
				System.out.println("The for:\n");
				System.out.print("for(init; condition; iteration)");
				System.out.println(" statement;");
				break;
			}
		}
		
	}
