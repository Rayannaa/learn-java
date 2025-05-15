package l7mathClass;

// use the math functions
public class L7 {

	public static void main(String[] args) {
		double x = 3.14;
		double y = -10;
		
		// max & min method
		double z = Math.max(x, y);
		System.out.println(z);
		// absolute function method
		double a = Math.abs(y);
		System.out.println(a);
		// square root function method
		double s = Math.sqrt(x);
		System.out.println(s);
		// rounding & floor (down) & ceiling (up)
		double r = Math.round(x);
		System.out.println(r);
		double d = Math.floor(x);
		System.out.println(d);
		double c = Math.ceil(x);
		System.out.println(c);
		

	}

}
