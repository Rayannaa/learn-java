package l7mathClass;

// string = a reference data type that can store one or more characters
// reference data types have access to useful methods
public class L17StringMethods {

	public static void main(String[] args) {
		String name = "Rayanna";
		String name_for_trim = "  Rayanna    ";
		
		boolean result = name.equals("rayanna"); // .equals(boolean): check equal(case sensitive)
		System.out.println(result);
		result = name.equalsIgnoreCase("rayanna"); // .equals(boolean): check equal(NON case sensitive)
		System.out.println(result);
		
		int length = name.length(); // .length(int): number of characters
		System.out.println(length);
		
		char character = name.charAt(0); //.charAt(char): character at index
		System.out.println(character);
		
		int index = name.indexOf("a"); // .indexOf(int):the index the character id found
		System.out.println(index);
		
		boolean empty = name.isEmpty();// .isEmpty (boolean): see if a string is empty
		System.out.println(empty);
		
		String upper = name.toUpperCase();// .toUpperCase(Sting) & .toLowerCase(String)
		System.out.println(upper);
		
		String trim = name_for_trim.trim(); // .trim(String): remove all the spaces before and after
		System.out.println(trim);
		
		String replace = name.replace("n", "w"); // .replace(String): replace all n with w 
		System.out.println(replace);
	}

}
