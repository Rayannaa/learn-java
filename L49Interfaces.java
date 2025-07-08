package l49;

// interface = a blueprint for a class that specifies a set of abstract methods that implementing classes must define
// key difference = multiple parents

public class L49Interfaces {

	public static void main(String[] args) {
		Rabbit rabbit = new Rabbit();
		Hawk hawk = new Hawk();
		Fish fish = new Fish();
		
		rabbit.flee();
		hawk.hunt();
		fish.flee();
		fish.hunt();

	}

}
