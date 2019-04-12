package bilar;

import javafx.scene.paint.Color;

public class Koenigsegg extends Vehicle {

	public final static double trimFactor = 100.25;

	public Koenigsegg() {
		super(Color.RED, 500, "Koeningsegg");
		stopEngine();
	}

	public double speedFactor() {// speeddfactor
		return getEnginePower() * 3 * trimFactor;
	}

}
