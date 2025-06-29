package l29;

// how to create an array of a self-defined object
public class L31ArrayOfObject {

	public static void main(String[] args) {
		// Method 1:ClassName[] arrayname = new ClassName[size];
		Food[] refrigerator = new Food[3];
		
		// create some food objects
		Food food1 = new Food("pizza");
		Food food2 = new Food("hamburger");
		Food food3 = new Food("hotdog");
		
		// Method2: store rightaway
		// Food[] refrigerator = {food1, food2, food3};
		
		// store items into array
		refrigerator[0] = food1;
		refrigerator[1] = food2;
		refrigerator[2] = food3;
		
		// access and display
		System.out.println(refrigerator[0].name);
		System.out.println(refrigerator[1].name);
		System.out.println(refrigerator[2].name);
	}

}
