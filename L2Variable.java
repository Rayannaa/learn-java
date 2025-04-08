package l1;

public class L2Variable {
	// variable: a placeholder for a value. Behave as the value it contains.
	public static void main(String[] args) {
		/*
		 * @@@Data Type
		 * primitive vs. reference (user defined, more memory)
		 * important ones: boolean, int, double (15digits), char (single), string (reference data type)
		 * others: byte, short, long, float (6-7digits)
		 */
		// @@@How to create a variable: declaration + assignment = initialization
		int x; // declare
		x = 123;  // assign
		int y = 123; // initialization
		System.out.println(x); 
		System.out.println("My number is: " +  x);  // can concatenate str and int. Magic.
		long z = 1223763287137397931L; // long type
		double a = 3.14; // double has more precision
		boolean b = true; // only hold true & false
		char symbol = '@'; // single character
		String name = "Rayanna"; // reference data type start with capital
		System.out.println("Hello " +  name); 
		

	}

}
