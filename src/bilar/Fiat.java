package bilar;

import javafx.scene.paint.Color;

public class Fiat extends Vehicle {

	public final static double trimFactor = 101;

	public Fiat() { // Sj�lva
		super(Color.RED, 500, "Fiat");
		stopEngine();
	}

	public double speedFactor() {// speeddfactor
		return getEnginePower() * 3 * trimFactor;
	}

}
