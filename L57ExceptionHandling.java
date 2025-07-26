package l57;



// exception = interrupts the normal flow of a program
// try{}, catch{}, finally{}

import java.util.InputMismatchException;
import java.util.Scanner;

public class L57ExceptionHandling {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.print("enter a number: ");
			int number = scanner.nextInt();
			System.out.println(number);
			System.out.println(1 / 0);
		}
		catch(ArithmeticException e){
			System.out.println("you can't divide by 0!");
		}
		catch(InputMismatchException i) {
			System.out.println("that wasn't a number");
		}
		
		// catch all (not encouraged)
		catch(Exception e) {
			System.out.println("sth went wrong");
		}

		finally {
			// always execute
			scanner.close();
			System.out.println("this always execute");
		}

	}

}
