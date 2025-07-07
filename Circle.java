package l48;

public class Circle extends Shape{
	
	Double radius;
	
	// constructor
	Circle(double radius){
		this.radius = radius;
	}
	
	@Override
	double area() {
		return Math.PI * radius * radius;
	}

}
