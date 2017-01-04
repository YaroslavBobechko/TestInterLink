
public class SportCarFactory implements CarFactory {
	
	protected SportCarBrand brand;
	
	public SportCarFactory(SportCarBrand brand) {
		this.brand = brand;
	}

	@Override
	public Car createCar() {
		SportCar car;
		
		if (this.brand == SportCarBrand.BMW) {
			car = new SportCar("BMW", "M5", new Engine(4f, EngineType.PETROL));
			car.setSpoiler(true);
			car.setTurbo(true);
		} else {
			car = new SportCar("Audi", "RS7", new Engine(3.5f, EngineType.DIESEL));
			car.setSpoiler(true);
		}
		
		return car;
	}
}

enum SportCarBrand {BMW, Audi}
