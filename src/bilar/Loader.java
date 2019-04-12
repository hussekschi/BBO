package bilar;

import java.util.ArrayList;

import sun.java2d.loops.Blit;

public class Loader {

	private ArrayList<Vehicle> cars;

	public void loadCar(Vehicle c) {
		cars.add(c);
	}

	public void unloadLastCar() {
		cars.remove(cars.size() - 1);
	}

	public void unloadFirstCar() {
		cars.remove(0);
	}

	public void move(double x, double y) {
		for (Vehicle vehicle : cars) {
			vehicle.setXpos(x);
			vehicle.setYpos(y);
		}
	}

}
