package l7mathClass;

// 2D array = an array in an array
public class L162DArray {

	public static void main(String[] args) {
		
		// declare a 2D array
		String[][] cars = { {"Camaro", "Corvette", "Silverado"}, 
							{"Mustang","Ranger", "F-150"}, 
							{"Ferrari", "Lambo", "Tesla"}};
		

		// iterate through it
		for(int i = 0; i < cars.length; i++) {
			System.out.println();
			for(int j = 0; j < cars[i].length; j++) { // condition: length for each inner array
				System.out.print(cars[i][j] + " ");
			}
		}

	}

}
