package l7mathClass;


// execute for a limited amount of times
public class L13ForLoop {

	public static void main(String[] args) {
		// 3 parts: declare a counter; condition; increment or decrement
		for(int i = 0; i <= 10; i++) { // total 11 times
			System.out.println(i);
		}
		
		// example: count down
		for(int i = 10; i >= 0; i--) { // total 11 times
			System.out.println(i);
		}
		System.out.println("Happy new year!");
		
		// increment by other number
		for(int i = 10; i >= 0; i-=2) { // total 11 times
			System.out.println(i);
		}

	}

}
