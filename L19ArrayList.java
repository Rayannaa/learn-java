package l7mathClass;

// arraylist = a resizable array (store reference data types)
// can add or remove element after compilation phase

import java. util.ArrayList;
public class L19ArrayList {

	public static void main(String[] args) {
		// steps to create an arraylist
		ArrayList<String> food = new ArrayList<String>();
		// add elements
		food.add("pizza");
		food.add("hamburger");
		food.add("hotdog");
		
		// useful method of arraylist
		food.set(0,  "sushi");// .set = replace(this position, with this value)
		food.remove(2); // .remove = remove this position
		food.clear(); // .clear = clean all
		
		
		// display
		for (int i = 0; i < food.size(); i++) { // use .size to get the length of an arraylist
			System.out.println(food.get(i));
		}

	}

}
