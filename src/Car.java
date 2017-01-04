import java.awt.Toolkit;

public abstract class Car {
	protected String brand;
    protected String model;
    protected Engine engine;
    protected int speed;
    
    protected Car(String brand, String model) {
    	setBrand(brand);
    	setModel(model);
    }
    
    protected Car(String brand, String model, Engine engine)
    {
    	this(brand, model);
    	setEngine(engine);
    }
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public Engine getEngine() {
		return engine;
	}
	
	public void setEngine(Engine engine) {
		this.engine = engine;
		
		if (engine == null) {
			this.speed = 0;
		} else {
			this.speed = (int)(this.engine.getCapacity() * 60) + (this.engine.getType() == EngineType.PETROL ? 15 : 0);
		}
	}

	public int getSpeed() {
		return this.speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void beep() {
		Toolkit.getDefaultToolkit().beep();
	}
}
