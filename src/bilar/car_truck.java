package bilar;

import java.util.ArrayList;

public abstract class car_truck extends truck {

	ArrayList<car> cars;

	public car_truck() {
		cars = new ArrayList<car>();
	}

	int ramp_uppe = 1;
	int ramp_nere = 0;
	int ramp;

	public void updateAllPositions() {
		for (car c : cars) {

			c.setXpos(this.getXpos());
			c.setYpos(this.getYpos());

		}
	}

	public void loadcar(car c) {
		if (ramp_nere == 1 && cars.size() < 5 && c != this) {
			cars.add(c);

		}
	}

	public void unloadcard() {
		if (ramp_nere == 1 && car.size() > 0)
			cars.remove(cars.size() - 1);

	}

	public void rampraise() {
		if (0 == currentSpeed)
			ramp++;

		if (ramp > ramp_uppe)
			ramp = ramp_uppe;
	}

	public void ramplower() {
		if (0 == currentSpeed)
			ramp--;

		if (ramp < ramp_nere)
			ramp = ramp_nere;

	}

	public boolean candrive() {
		return ramp == 1;
	}

	@Override
	public void gas(double amount) {
		if (candrive())
			super.gas(amount);

	}

}
