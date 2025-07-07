package l46;

public class Fish extends Animal{
	// method overriding since fish don't run
	
	@Override
	void move() {
		System.out.println("swimming");
	}

}
