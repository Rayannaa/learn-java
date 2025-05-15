package l7mathClass;

import java.util.Scanner;

// ask for length and calculate the hyp of a triangle
public class L7Project {

	public static void main(String[] args) {
		// declare variables
		double x;
		double y;
		double z;
		
		// ask for inputs
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter side x: ");
		x = scanner.nextDouble();
		System.out.println("Enter side y: ");
		y = scanner.nextDouble();
		
		// calculate and display the result
		z = Math.sqrt(x * x + y * y);
		System.out.println("The hypotenuese is " + z);
		
		scanner.close();

	}

}
