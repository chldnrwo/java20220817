package ch08.book.s0805;

import ch08.book.s0804.Bus;
import ch08.book.s0804.Vehicle;

public class Driver {
	public void drive(Vehicle vehicle) {
		if(vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			bus.checkFare();
		}
		vehicle.run();
	}
}
