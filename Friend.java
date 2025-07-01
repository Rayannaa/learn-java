package l43Static;

//L43
public class Friend {
	
	static int numOfFriends; // static: this variable is for this whole class
	String name;
	
	Friend(String name){
		this.name = name;
		numOfFriends ++;
	}
	
	// create a static method
	static void showFriends() {
		System.out.println("You have " + numOfFriends + " total friends");
	}

}
