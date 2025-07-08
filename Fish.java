package l49;

public class Fish implements Prey, Predator{
	// can be considered both prey and predator
	
	@Override
	public void flee() {
		System.out.println("the fish is swimming away");
	}
	
	@Override
	public void hunt() {
		System.out.println("the fish is hunting");
	}
}
