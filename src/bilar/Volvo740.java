package bilar;

import javafx.scene.paint.Color;

public class Volvo740 extends vehicle {

	public final static double trimFactor = 1.25;

	public Volvo740() { // Själva
		super(Color.RED, 100, "Volvo740");
		stopEngine();
	}

	public double speedFactor() {// speeddfactor
		return getEnginePower() * 0.01 * trimFactor;
	}

}