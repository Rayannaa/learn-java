package l7mathClass;

// switch: statement that allows a variable to be tested for equality against a list of values
// use when you have a lot of if statements
public class L10Switches {

	
	public static void main(String[] args) {
		// test strings
		String day = "pizza";
		switch(day){ // create a switch to check if day = each case
			case "Sunday": System.out.println("It is Sunday!"); //if true, perform : this
			break; // if there is a match, break. Without "break", each of the print line after it will be performed
			// if not match, continue to the next case
			case "Monday": System.out.println("It is Monday!"); 
			break;
			case "Tuesday": System.out.println("It is Tuesday!"); 
			break;
			case "Wednesday": System.out.println("It is Wednesday!"); 
			break;
			case "Thursday": System.out.println("It is Thursday!"); 
			break;
			case "Friday": System.out.println("It is Friday!"); 
			break;
			case "Saturday": System.out.println("It is Saturday!"); 
			break;
			// if nothing match, nothing happen. Or add default.
			default: System.out.println("Not a day");
		
		}

	}

}
