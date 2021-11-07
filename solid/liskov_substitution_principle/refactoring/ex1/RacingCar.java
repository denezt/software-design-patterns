import java.util.Random;

public class RacingCar extends Vehicle {
	@Override
	public double getInteriorWidth(){
		return this.getCockpitWidth();
	}

	public double getCockpitWidth(){
		// return cockpit width
		return new Random().nextDouble();
	}
}
