package l7mathClass;

import java.util.Scanner;

// while loop: execute as long as the condition remains true
public class L12WhileLoop {

	public static void main(String[] args) {
		
		// example 1
		Scanner scanner = new Scanner(System.in);
		String name = "";
		
		while(name.isBlank()) { // as long as the while(condition) is evaluated to be true, enter the {}
			System.out.print("Enter your name: ");
			name = scanner.nextLine();
		}
		
		System.out.println("Hello " + name);
		
		// do loop: similar, but will always execute once before checking the condition
		do {
			System.out.print("Enter your name: ");
			name = scanner.nextLine();
		}while(name.isBlank());
		
		scanner.close();

	}

}
