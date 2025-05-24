package l7mathClass;

// array = used to store more than one value in a single variable
public class L15Arrays {

	public static void main(String[] args) {
		String[] cars = {"Camaro", "Corvette", "Tesla"}; // data type should be consistent
		
		// access elements: index
		cars[0] = "Mustang";
		
		System.out.println(cars[0]); // indexoutofbound exception
		
		// an additional way to create an array
		String[] newcars = new String[3]; // declare the amount of element
		
		newcars[0] = "Camaro"; // assign the element later on
		newcars[1] = "Corvette";
		newcars[2] = "Tesla";
		
		// use for loop to iterate through an array
		for(int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}
		

	}

}
