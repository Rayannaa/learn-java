package l23;

import java.util.Random;

public class DiceRoller {
	
	//method1: global variable instead of local
	//Random random = new Random();
	//int number;
	
	DiceRoller(){
		// random and number are local variables
		Random random = new Random();
		int number = 0;
		roll(random, number); //method 2: call the roll method with arguments
	}
	
	void roll(Random random, int number) {
		number = random.nextInt(6) + 1;
		System.out.println(number);
	}
}
