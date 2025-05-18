package l7mathClass;

// if statement: basic structure of decision making
public class L9IfStatement {

	public static void main(String[] args) {
		int age = 13;
		
		if(age >= 75) {// evaluate (this). True -> get into the {}
			System.out.println("Boomer");
		}
		else if(age >= 18) {
			System.out.println("Adult");
		}
		else if(age >= 13) {
			System.out.println("Teenager");
		}
		else {
			System.out.println("Not adult");
		}

	}

}
