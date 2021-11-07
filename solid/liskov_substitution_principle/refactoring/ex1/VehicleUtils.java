import java.util.List;
import java.util.ArrayList;

public class VehicleUtils {

	public static void main(String[] args){
		Vehicle first = new Car();
		Vehicle second = new Car();
		Vehicle third = new RacingCar();

		List<Vehicle> myVehicles = new ArrayList<>();
		myVehicles.add(first);
		myVehicles.add(second);
		myVehicles.add(third);

		for(Vehicle vehicle: myVehicles){
			System.out.println("Vehicle Interior Width: " + String.valueOf(vehicle.getInteriorWidth()));
		}
	}
}
