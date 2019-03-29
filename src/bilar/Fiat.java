package bilar;

import javafx.scene.paint.Color;

public class Fiat extends vehicle {

	public final static double trimFactor = 101;

	public Fiat() { // Själva
		color = Color.RED;
		enginePower = 500;
		modelName = "" + "fiat";
		stopEngine();
	}

	public double speedFactor() {// speeddfactor
		return enginePower * 3 * trimFactor;
	}

}
