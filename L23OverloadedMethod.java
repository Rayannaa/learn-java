package l23;

// overloaded method = methods that share the same name but have different parameters
// method name + parameters = method signature
// each method need a unique method signature
public class L23OverloadedMethod {

	public static void main(String[] args) {
		double x = add(1,2,3,4.2);
		System.out.println(x);
		
	}
	
	// different number of parameters
	static int add(int a, int b) {
		System.out.println("Overloaded method 1");
		return a + b;
	}
	static int add(int a, int b, int c) {
		System.out.println("Overloaded method 2");
		return a + b + c;
	}
	static int add(int a, int b, int c, int d) {
		System.out.println("Overloaded method 3");
		return a + b + c + d;
	}
	
	// different data types
	static double add(double a, double b) {
		System.out.println("Overloaded method 4");
		return a + b;
	}
	static double add(double a, double b, double c) {
		System.out.println("Overloaded method 5");
		return a + b + c;
	}
	static double add(double a, double b, double c, double d) {
		System.out.println("Overloaded method 6");
		return a + b + c + d;
	}

}
