package l43Static;

// inheritance = one class inherits the attributes and methods from another class
// child <- parents <- grandparents

public class L44Inheritance {

	public static void main(String[] args) {
		// create a dog object
		Dog dog = new Dog();
		Cat cat = new Cat();
		Plant plant = new Plant();
		
		System.out.println(dog.isAlive);
		System.out.println(cat.isAlive);
		System.out.println(plant.isAlive);
		
		System.out.println(dog.lives);
		System.out.println(cat.lives);
		
		dog.eat();
		cat.eat();
		
		dog.speak();
		cat.speak();
		plant.photosynthesize();

	}

}
