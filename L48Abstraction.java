package l48;

// abstract = used to define abstract classes and methods
// abstraction = the process of hiding implementation details
// abstract classes = can't be instantiated directly
				   // can contain 'abstract' methods
                   // can contain 'concrete' methods

public class L48Abstraction {

	public static void main(String[] args) {
		// create objects
		Circle circle = new Circle(3);
		Triangle triangle = new Triangle(4.5,5.5);
		Rectangle rectangle = new Rectangle(6,7);
		
		circle.display();
		triangle.display();
		rectangle.display();
		
		System.out.println(circle.area());
		System.out.println(triangle.area());
		System.out.println(rectangle.area());
		

	}

}
