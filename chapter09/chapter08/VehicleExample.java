package chapter08;

public class VehicleExample {
	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
//		vehicle.checkfare(); (x)
		
		Bus bus = (Bus) vehicle;
		
		bus.run();
		bus.checkFare();
	}
}
