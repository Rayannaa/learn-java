package l48;

public class Triangle extends Shape{
	
	Double base;
	Double height;
	
	// constructor
	Triangle(Double base, Double height){
		this.base = base;
		this.height = height;
	}
	
	@Override
	double area() {
		return 0.5 * base * height;
	}

}
