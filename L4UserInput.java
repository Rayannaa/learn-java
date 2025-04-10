package l1;

// @@@ import the Scanner class in java.util before the class
import java.util.Scanner; // java project, util package, Scanner class

public class L4UserInput {
	// user input
	public static void main(String[] args) {
		// OOP: create an object of class Scanner
		// we use this object "scanner" to get user input
		Scanner scanner = new Scanner(System.in);
		// @@@get name
		System.out.println("What is your name? "); // let the user know what we expect
		String name = scanner.nextLine(); // use the "nextLine" method of scanner object for str input
		// @@@get age
		System.out.println("How old are you? ");
		int age = scanner.nextInt(); // use the "nextInt" method of scanner object for int input
		// if our input does not match the right type -> InputMismatchException
		
		scanner.nextLine(); // ***
		// @@@Common mistake: get favorite food
		System.out.println("What is your favorite food? "); 
		// If you do: String food = scanner.nextLine(); 
		/*
		 *  result: direcly print "You like " without asking for input.
		 *  Why?
		 *  1. when we hit enter after typing, "\n" is added at the end
		 *  1. the .newLine method get the input including "\n"
		 *  2. the .newInt method (and others) get the input before "\n" and leave it there
		 *  3. the .newLine sees the remain "\n" immediately and skip
		 */
		//*** in line 20: this is the correct way, clear the "\n" first
		String food = scanner.nextLine(); 
		
		
		// display
		System.out.println("Hello " + name);
		System.out.println("You are " + age + " years old");
		System.out.println("You like " + food);

	}

}
