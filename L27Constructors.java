package l23;

// constructor = special method that is called when an object is instantiated (created)
public class L27Constructors {

	public static void main(String[] args) {
		// create an object
		Human human1 = new Human("Rayanna", 18, 50);
		Human human2 = new Human("Lizz", 19, 50.5);
		
		// access attributes
		System.out.println(human1.name);
		System.out.println(human2.name);
		
		// call the method
		human2.eat();
		human1.drink();

	}

}
