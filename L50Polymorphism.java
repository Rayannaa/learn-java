package l50;

// Polymorphism = objects can be identify as other objects
// objects can be treated as objects of a common superclass

public class L50Polymorphism {

	public static void main(String[] args) {
		Car car = new Car();
		Bike bike = new Bike();
		Boat boat =  new Boat();
		
		car.go();
		bike.go();
		boat.go();
		
		Vehicle[] vehicles = {car, bike, boat}; // polymorphism: they are all vehicles since extension
		
		for(Vehicle vehicle : vehicles) {
			vehicle.go();	
		}

	}

}
