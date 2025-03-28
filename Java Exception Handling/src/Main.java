import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		/* exception is an event that occurs during the execution of a program 
		 * that disrupts the normal flow of instructions.
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			
			System.out.println("Enter an integer number as a Dividend:");
			int x = scanner.nextInt();
		
			System.out.println("Enter an integer number as a Divisor:");
			int y = scanner.nextInt();
		
			int z = x/y;
		
			System.out.println("Quotient:" + z);
		
		}
		catch(ArithmeticException e) {
			
			System.out.println("You can't divide by zero...");
			
		}
		catch(InputMismatchException e) {
			
			System.out.println("Please enter an integer number...");
			
		}
		catch(Exception e) {
			
			System.out.println("Something went wrong...");
			
		}
		finally {
			
			scanner.close();
			
		}
		
	}

}
