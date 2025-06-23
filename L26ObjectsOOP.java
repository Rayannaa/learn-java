package l23;

// object = an instance of a class that may contain attributes (characteristics) and methods(actions)
public class L26ObjectsOOP {

	public static void main(String[] args) {
		// define a car class in another file called "Car"
		
		// create a car object here
		Car myCar1 = new Car();
		Car myCar2 = new Car();
		
		// access the attributes
		System.out.println(myCar1.make);
		System.out.println(myCar1.model);
		
		System.out.println(myCar2.make);
		System.out.println(myCar2.model);
		
		// apply methods
		myCar1.drive();
		myCar1.brake();
		myCar2.drive();
		myCar2.brake();
		
		// create another object
	}

}
