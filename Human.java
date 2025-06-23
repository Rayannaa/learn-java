package l23;

public class Human {
	// declare attributes
	String name;
	int age;
	double weight;
	
	// create a constructor of a class
	Human(String name, int age, double weight){
		// assign attributes
		// use keyword "this" to refer to the specific object you are creating
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	// define methods
	void eat() {
		System.out.println(this.name + " is eating"); // access the attribute from the class itself
	}
	
	void drink() {
		System.out.println(this.name + " is drinking *burp*");
	}

}
