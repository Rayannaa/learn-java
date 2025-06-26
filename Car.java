package l29;

// for L30
public class Car {
	
	String make = "Ford";
	String model = "Mustang";
	String color = "red";
	int year = 2021;
	
	// override the toString method
	public String toString() {
		// must return a string
		return make + "\n" + model + "\n" + color + "\n" + year;

	}

}
