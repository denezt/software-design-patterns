/*
* This Component is an example of a bad design pattern.
* We will have a method that is inherited from super class
* but is not implemented.
*/

import java.util.Random;

public class RacingCar extends Car {

	// This is a sign of a bad design because race cars do not have a cabin.
	@Override
	public double getCabinWidth(){
		// UNIMPLEMENTED
		throw new RuntimeException("Not Implemented");
	}

	public double getCockpitWidth(){
		// return cockpit width
		return new Random().nextDouble();
	}
}
