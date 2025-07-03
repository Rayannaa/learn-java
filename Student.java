package l45;

public class Student extends Person{
	
	double gpa;
	
	
	Student(String first, String last, double gpa){
		super(first, last); // super refer to the parent class
		// we past the first and last variable to this class
		this.gpa = gpa;
	}
	
	void showGPA() {
		System.out.println(this.first + "'s GPA is " + this.gpa);
	}

}
