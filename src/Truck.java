
public class Truck extends Car {
	protected boolean isTruckLoaded;
	
	public Truck(String brand, String model, Engine engine) {
		super(brand, model, engine);
	}
	
	public boolean isTruckLoaded() {
		return isTruckLoaded;
	}
	
	public void loadTruck() throws Exception {
		if (isTruckLoaded) {
			throw new Exception("Truck is full!");
		}
		
		this.isTruckLoaded = true;
	}
	
	@Override
	public void setEngine(Engine engine) {
		super.setEngine(engine);
		super.setSpeed(super.getSpeed() / 4 - (isTruckLoaded ? 50 : 0));
	}
	
	@Override
	public void beep() {
		for(int i = 0; i < 3; i++) {
			super.beep();
			
			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
