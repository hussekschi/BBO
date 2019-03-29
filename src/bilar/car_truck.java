package bilar;

import java.util.ArrayList;

import javafx.scene.paint.Color;

public class car_truck extends vehicle {

	private Flatbed flatbed;
	private Loader loader;

	public car_truck() {
		super(Color.WHITE, 500, "Transport");
		flatbed = new Flatbed();
		

	}

	public void updateAllPositions() {
		for (vehicle c : cars) {
			c.setXpos(this.getXpos());
			c.setYpos(this.getYpos());

		}
	}

	public void loadcar(vehicle c) {
		if (flatbed.isOpen() && car.size() < 5 && c != this) {
			cars.add(c);

		}
	}

	public void unloadcard() {
		if (flatbed.isOpen() && vehicle.size() > 0)
			cars.remove(cars.size() - 1);

	}

	public void open() {
		if (0 == getCurrentSpeed())
			flatbed.open();

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

}
