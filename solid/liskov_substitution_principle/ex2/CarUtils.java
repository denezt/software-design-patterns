import java.util.List;
import java.util.ArrayList;

public class CarUtils {

	public static void main(String[] args){
		Car first = new Car();
		Car second = new Car();
		Car third = new RacingCar();

		List<Car> myCars = new ArrayList<>();
		myCars.add(first);
		myCars.add(second);
		myCars.add(third);	// This will throw a RuntimeException

		for(Car car: myCars){
			System.out.println("Car Cabin: " + String.valueOf(car.getCabinWidth()));
		}
	}
}
