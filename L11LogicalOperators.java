package l7mathClass;


// logical operators: used to connect two or more expressions

import java.util.Scanner; // for user input

public class L11LogicalOperators {

	public static void main(String[] args) {
		/*
		 * && = (AND) both true
		 * || = (OR) either true
		 * ! = (NOT) reverses boolean
		 */
		
		// example for &&
		int temp = 25;
		if(temp > 30) {
			System.out.println("It is hot");
		}
		else if(temp >= 20 && temp <= 30) {
			System.out.println("It is warm");
		}
		else {
			System.out.println("It is cold");
		}
		
		// example for ||
		Scanner scanner = new Scanner(System.in);
		// simulate a game
		System.out.println("You are playing a game. Press q or Q to quit.");
		String response = scanner.next();
		
		// if q or Q, quit
		if(response.equals("q") || response.equals("Q")){
			System.out.println("You quit the game");			
		}
		else {
			System.out.println("You are still playing");
		}
		
		// example for ! (work the same as previously)
		if(!response.equals("q") && !response.equals("Q")){
			System.out.println("You are still playing");			
		}
		else {
			System.out.println("You quit the game");
		}

	}

}
