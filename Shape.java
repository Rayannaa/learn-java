package l48;

public abstract class Shape { // add abstract keywords
	
	// we can't create a shape object
	
	
	// abstract method: children class will define it
	abstract double area(); // children class must declared abstract or implement the area method

	// concrete method: we don't need to rewrite this 
	void display() {
		System.out.println("this is a shape");
	}

}
