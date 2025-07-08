package l49;

public class Rabbit implements Prey{ // implements from the prey interface
	
	@Override
	public void flee() {
		System.out.println("the rabbit is running away");
	}

}
