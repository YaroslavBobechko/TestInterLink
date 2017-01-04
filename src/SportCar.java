public class SportCar extends Car {
	
	protected boolean turbo;
	protected boolean spoiler;

	public SportCar(String brand, String model, Engine engine) {
		super(brand, model, engine);
	}

	public boolean isTurbo() {
		return turbo;
	}

	public void setTurbo(boolean turbo) {
		this.turbo = turbo;
	}

	public boolean isSpoiler() {
		return spoiler;
	}

	public void setSpoiler(boolean spoiler) {
		this.spoiler = spoiler;
	}
	
	@Override
	public void setEngine(Engine engine) {
		super.setEngine(engine);
		super.setSpeed(super.getSpeed() + (isTurbo() ? 50 : 0) + (isSpoiler() ? 10 : 0));
	}
}
