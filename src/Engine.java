public class Engine {
	protected float capacity;
	protected EngineType type;
	
	public Engine(float capacity, EngineType type) {
		setCapacity(capacity);
		setType(type);
	}

	public float getCapacity() {
		return capacity;
	}

	public void setCapacity(float capacity) {
		this.capacity = capacity;
	}

	public EngineType getType() {
		return type;
	}

	public void setType(EngineType type) {
		this.type = type;
	}
}

enum EngineType {PETROL, DIESEL, GAS}
