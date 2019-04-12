package bilar;

import javafx.scene.paint.Color;

public class CarTruck extends Vehicle {

	private Flatbed flatbed;
	private Loader loader;

	public CarTruck() {
		super(Color.WHITE, 500, "Transport");
		flatbed = new Flatbed();
		loader = new Loader();

	}

	public void open() {
		if (0 == getCurrentSpeed())
			flatbed.open();

	}

	public void loadCar(Vehicle v) {
		if (flatbed.isOpen())
			loader.loadCar(v);
	}

	public void unloadCar() {
		if (flatbed.isOpen())
			loader.unloadLastCar();
	}

	public void close() {
		if (0 == getCurrentSpeed())
			flatbed.close();
	}

	@Override
	public void gas(double amount) {
		if (!flatbed.isOpen())
			super.gas(amount);

	}

	@Override
	public double speedFactor() {
		return getEnginePower() * 0.002;
	}

	@Override
	public void move() {
		super.move();
		loader.move(this.getXpos(), this.getYpos());
	}
}
