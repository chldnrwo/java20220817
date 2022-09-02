package ch08.book.s0802;

import ch08.book.s0801.HankookTire;
import ch08.book.s0801.Tire;

public class Car {
	Tire[] tires = {
			new HankookTire(),
			new HankookTire(),
			new HankookTire(),
			new HankookTire()
	};
	
	void run() {
		for(Tire tire : tires) {
			tire.roll();
		}
	}
}
