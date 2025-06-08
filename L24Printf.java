package l23;

// printf = control, format, and display text to the console window
// need two arguments = format string + (object/variable/value)
// % + [flags][precision][width][conversion-character]
public class L24Printf {

	public static void main(String[] args) {
		// conversion-character
		System.out.printf("This is a format string %d", 123); // %d means to put the second argument to this place as a decimal
		System.out.printf("%d This is a format string", 123);
		
		boolean myBoolean = true;
		String myString = "Rayanna";
		int myInt = 50;
		double myDouble = 1000;
		
		System.out.printf("%b", myBoolean); // display the myBoolean variable as a data type boolean
		System.out.printf("%s", myString);
		System.out.printf("%f", myDouble);
		
		// width
		System.out.printf("Hello %10s", myString); // with a minimum of 10 chars
		System.out.printf("Hello %-10s", myString); // space comes after
		
		// precision
		System.out.printf("You have this much money %.2f", myDouble); // precision: 2 decimal numbers
		
		// flags
		System.out.printf("You have this much money %+f", myDouble); // pad up with + or -
		System.out.printf("You have this much money %020f", myDouble);
		System.out.printf("You have this much money %,f", myDouble); // add comma between thousands
		
		
	}

}
