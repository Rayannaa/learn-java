package l7mathClass;


// methods = a block of code that is executed whenever it is called upon
public class L22Methods {
	
	// belongs to the main method
	public static void main(String[] args) {
		// you can pass argument to a method
		String name1 = "Rayanna";
		String name2 = "Lizz";
		String name3 = "Gloria";
		
		int age1 = 18;
		int age2 = 19;
		int age3 = 19;
		
		int x = 3;
		int y = 4;
		
		// call the method
		hello(name1,age1);
		hello(name2,age2);
		hello(name3,age3);
		
		int sum = add(x,y); // store in a variable if it is a fruitful method
		System.out.println(sum);
		
	}
	// create our own method: display a message hello name
	// void: no return
	static void hello(String title, int age) { // title and age are the parameters
		System.out.println("Hello " + title);
		System.out.println("You are " + age + " years old");
	}
	
	// return type: 
	static int add(int x, int y) {
		int z = x + y;
		return z;
	}
	
	
	
	

}
