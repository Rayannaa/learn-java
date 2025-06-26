package l29;

// for L29
public class Pizza {
	// declare variables
	String bread;
	String sauce;
	String cheese;
	String topping;
	
	// constructor
	Pizza(String bread, String sauce, String cheese, String topping){
		this.bread = bread;
		this.sauce = sauce;
		this.cheese = cheese;
		this.topping = topping;
	
	}
	// overloaded constructor
	Pizza(String bread, String sauce){
		this.bread = bread;
		this.sauce = sauce;
	
	}

}
