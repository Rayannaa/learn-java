package l29;

// toString() = special method that all object inherit
// returns a string that "textually represents" and object
// can be used both implicitly and explicitly
public class L30ToStringMethod {

	public static void main(String[] args) {
		// create a car object
		Car car = new Car();
		
		
		// implicitly: how to display all the attributes?
		// override the toString method in Car class
		System.out.println(car); // by default, we call the toString method behind this println statement
		
		// explicitly: no difference
		System.out.println(car.toString());
		

	}

}
