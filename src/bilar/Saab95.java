package bilar;

import javafx.scene.paint.Color;

public class Saab95 extends Vehicle {

	public boolean turboOn;

	public Saab95() {
		super(Color.BLACK, 125, "Saab95");
		stopEngine();
		turboOn = false;
	}

	public void setTurboOn() {
		turboOn = true;
	}

	public void setTurboOff() {
		turboOn = false;
	}

	public double speedFactor() {
		double turbo = 1;
		if (turboOn)
			turbo = 1.3;
		return getEnginePower() * 0.01 * turbo;
	}

}