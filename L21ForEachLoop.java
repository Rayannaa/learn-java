package l7mathClass;

import java.util.ArrayList;
// for-each loop = traversing through elements in an array/collection
// less steps, more readable, less flexible
public class L21ForEachLoop {

	public static void main(String[] args) {
		// create an array
		String[] animals = {"cat", "dog", "rat", "bird"};
		// create a for-each loop
		for(String i : animals) { // iterating through String at index i in array animals
			System.out.println(i);
		}
		
		// create a collection (arraylist)
		ArrayList<String> newanimals = new ArrayList<String>();
		
		newanimals.add("snake");
		newanimals.add("fish");
		
		for(String i : newanimals) {
			System.out.println(i);
		}
		
		

	}

}
