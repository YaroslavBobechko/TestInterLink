import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		List<CarFactory> carFactories = new ArrayList<>();
		carFactories.add(new SportCarFactory(SportCarBrand.BMW));
		carFactories.add(new SportCarFactory(SportCarBrand.Audi));
		carFactories.add(new TruckFactory(TruckBrand.MAN));
		carFactories.add(new TruckFactory(TruckBrand.SCANIA));
		
		List<Car> members = new ArrayList<>();
		
		for(CarFactory factory : carFactories) {
			members.add(factory.createCar());
		}
		
		Race crazyRace = new Race(members, 1000f);
		crazyRace.start();
		
	}
}
