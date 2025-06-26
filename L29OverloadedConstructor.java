package l29;


// overloaded constructors = multiple constructors within a class with the sam ename,
// name + parameters = signature
public class L29OverloadedConstructor {

	public static void main(String[] args) {
		// example: baking pizza
		// create a pizza object
		Pizza pizza1 = new Pizza("thicc crust", "tomato", "mozzerella", "pepperoni");
		
		System.out.println("Here are the ingredients of your pizza: ");
		System.out.println(pizza1.bread);
		System.out.println(pizza1.sauce);
		System.out.println(pizza1.cheese);
		System.out.println(pizza1.topping);
		
		// create a pizza object with no cheese and topping
		Pizza pizza2 = new Pizza("thicc crust", "tomato");
		
		System.out.println("Here are the ingredients of your pizza: ");
		System.out.println(pizza2.bread);
		System.out.println(pizza2.sauce);
		System.out.println(pizza2.cheese); // null
		System.out.println(pizza2.topping);

	}

}
