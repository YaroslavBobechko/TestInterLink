import java.util.List;

public class Race implements Runnable {
	
	protected List<Car> cars;
	protected float distance;
	
	public Race(List<Car> members, float distance) {
		this.cars = members;
		this.distance = distance;
	}
	
	@Override
	public void run() {
		int sec = 0;
		float distances[] = new float[cars.size()];
		boolean winner = false;

		for (int i = 5; i > 0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			};
		}
		
		System.out.println("GO!");
		
		while (!winner) {
			
			
			for(int i = 0; i < cars.size(); i++) {
				distances[i] += cars.get(i).getSpeed() / 3.6f;
				if (distances[i] >= this.distance) {
					System.out.println("Winner: " + cars.get(i).getBrand() + " " + cars.get(i).getModel());
					winner = true;
					cars.get(i).beep();
					break;
				}
			}
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			};
			
			for(int i = 0; i < cars.size(); i++) {
				Car c = cars.get(i);
				System.out.println(c.brand + " " + c.model + " speed: " + c.getSpeed() + " distance: " + distances[i]);
			}
			
			System.out.println("second: " + ++sec);
			
		}
	}

	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}
	
	public void start() {
		new Thread(this).start();
	}

	public float getDistance() {
		return distance;
	}

	public void setDistance(float distance) {
		this.distance = distance;
	}

}
