package l43Static;

// static = makes a variable or method belong to the class NOT to a specific object
// commonly used for utility methods or shared resources

public class L43Static {

	public static void main(String[] args) {
		// create Friends objects
		Friend friend1 = new Friend("Spongebob");
		Friend friend2 = new Friend("Patrick");
		Friend friend3 = new Friend("Squidward");
		Friend friend4 = new Friend("Sandy");
		

		System.out.println(Friend.numOfFriends); // access through the class itself
		
		Friend.showFriends(); // call a static method
	}

}
