import java.util.Random;

public class Car extends Vehicle {

	@Override
	public double getInteriorWidth(){
		return this.getCabinWidth();
	}

	public double getCabinWidth(){
		// return cabin width
		return new Random().nextDouble();
	}
}
