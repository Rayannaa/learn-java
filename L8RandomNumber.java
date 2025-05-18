package l7mathClass;

// generate random numbers

import java.util.Random;//import the random class

public class L8RandomNumber {

	public static void main(String[] args) {
		// create an instance of the random class
		Random random = new Random();
		
		int x = random.nextInt();
		System.out.println(x);
		
		int y = random.nextInt(6) + 1;
		System.out.println(y);
		
		double z = random.nextDouble();
		System.out.println(z);
		
		boolean b = random.nextBoolean();
		System.out.println(b);
		

	}

}
