
public class TruckFactory implements CarFactory {
	protected TruckBrand brand;
	
	public TruckFactory(TruckBrand brand) {
		this.brand = brand;
	}

	@Override
	public Car createCar() {
		Truck car;
		
		if (brand == TruckBrand.MAN) {
			car = new Truck("MAN", "Z-500", new Engine(10f, EngineType.DIESEL));
		} else {
			car = new Truck("SCANIA", "R1900", new Engine(7.5f, EngineType.DIESEL));
			try {
				car.loadTruck();
			} catch (Exception e) {
				return car;
			}
		}
		
		return car;
	}
}

enum TruckBrand {MAN, SCANIA}
