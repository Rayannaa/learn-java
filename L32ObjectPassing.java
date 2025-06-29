package l32objectPassing;

// pass an object as an argument to a method
// send some cars to garage
public class L32ObjectPassing {

	public static void main(String[] args) {
		// create a garage object and a car object
		Garage garage = new Garage();
		Car car1 = new Car("BMW");
		Car car2 = new Car("Tesla");
		
		// park the car BMW
		garage.park(car1);
		garage.park(car2);

	}

}
