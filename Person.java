package l45;

// L45 parent class
public class Person {
	
	String first;
	String last;
	
	Person(String first, String last){
		this.first = first;
		this.last = last;
	}
	
	void showName(){
		System.out.println(this.first + " " + this.last);
	}

}
