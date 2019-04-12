package bilar;

import javafx.scene.paint.Color;

public class ferry extends Vehicle {

	private Loader loader;

	public ferry() {
		super(Color.WHITE, 5000, "Stena Line");
		loader = new Loader();
	}

	public void loadCar(Vehicle v) {
		loader.loadCar(v);
	}

	public void unloadCar() {
		loader.unloadFirstCar();
	}

	@Override
	public void move() {
		super.move();
		loader.move(getXpos(), getYpos());
	}

	@Override
	public double speedFactor() {
		return getEnginePower() * 0.0002;
	}

}
