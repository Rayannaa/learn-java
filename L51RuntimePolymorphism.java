package l50;

import java.util.Scanner;
// runtime polymorphism = when the method that gets executed is decided at runtime based on the actual type of the object
public class L51RuntimePolymorphism {

	public static void main(String[] args) {
		
		// user will pick a type of animal as their pet: cat or dog		
		Scanner scanner = new Scanner(System.in);
	
		Animal animal; // declare but not instantiate
		
		System.out.print("Would you like a dog or a cat? (1 = dog. 2 = cat)");
		int choice = scanner.nextInt();
		
		if (choice == 1) {
			animal = new Dog();
			animal.speak();
		}
		else if (choice == 2) {
			animal = new Cat();
			animal.speak();
		}

	}

}
