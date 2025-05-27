package l7mathClass;

// wrapper class = use primitive data types as reference data types
// (advantages: the latter contain useful methods & can be used with collections)
// (disadvantages: slower to access)

// primitive   // wrapper
// --------    // --------
// boolean     // Boolean
// char        // Character
// int         // Integer
// double      // Double
public class L18WrapperClasses {

	public static void main(String[] args) {
		// assign primitive data types and use the wrapper class to create a reference data type
		
		// autoboxing: automatic conversion the compiler makes from primitive to wrapper
		
		Boolean a = true;
		Integer c = 123;
		Double d = 3.14;
		String e = "Rayanna";
		
		// unboxing: the reverse(still treat them as primitive)
		if (a == true) {
			System.out.println("This is true");
		}

	}

}
