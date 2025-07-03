package l45;

// super = refers to the parent class
// used in constructors and method overriding
// calls the parent constructor to initialize attributes

public class L45Super {

	public static void main(String[] args) {
		// create a person object
		Person person = new Person("Rayanna", "Xu");
		Student student = new Student("Harry", "Potter", 3.99);
		Employee employee = new Employee("Rubeus", "Hagrid", 50000);
		
		person.showName();
		student.showName();
		
		student.showGPA();
		employee.showSalary();

	}

}
