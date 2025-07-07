package l48;

public class Rectangle extends Shape{
	
	Double length;
	Double width;
	
	// constructor
	Rectangle(double length, double width){
		this.length = length;
		this.width = width;
	}
	
	@Override
	double area() {
		return length * width;
	}

}
