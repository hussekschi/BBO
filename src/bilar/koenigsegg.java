package bilar;

import javafx.scene.paint.Color;

public class koenigsegg extends car{
	
	public final static double trimFactor = 100.25;

	public double enginePower; // Engine power of the car
	public double currentSpeed; // The current speed of the car
	public Color color; // Color of the car
	public String modelName; // The car model name

	public koenigsegg() {
  
		color = Color.RED;
		enginePower = 400;
		modelName = "Koenigsegg";
		stopEngine();
	}

	

	public double speedFactor() {//speeddfactor  
		return enginePower * 3 * trimFactor;
	}

}
