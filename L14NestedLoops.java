package l7mathClass;

import java.util.Scanner;

// nested loop = a loop inside a loop
public class L14NestedLoops {

	public static void main(String[] args) {
		// set a number of rows and columns and display a rectangle
		Scanner scanner = new Scanner(System.in);
		
		int rows;
		int columns;
		String symbol = "";
		
		System.out.println("Enter # of rows: ");
		rows = scanner.nextInt();
		
		System.out.println("Enter # of cols: ");
		columns = scanner.nextInt();
		
		System.out.println("Enter symbol to use: ");
		symbol = scanner.next();
		
		for(int i = 1;i <= rows; i++) {
			System.out.println();
			for(int j = 1;j <= columns; j++) {
				System.out.print(symbol);
			}
		}
		
		scanner.close();

	}

}
