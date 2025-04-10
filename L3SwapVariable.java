package l1;

public class L3SwapVariable {
	// Swap two variables
	public static void main(String[] args) {
		String x = "water";
		String y = "Kool-Aid";
		
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		
		// create a temporary variable
		String temp; // null type
		temp = x;
		x = y;
		y = temp;
		
		System.out.println("x: " + x);
		System.out.println("y: " + y);

	}

}
