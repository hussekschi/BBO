	package bilar;

import javafx.scene.paint.Color;

public class Fiat extends car{

	public final static double trimFactor = 101;

	public double enginePower; // Engine power of the car
	public double currentSpeed; // The current speed of the car
	public Color color; // Color of the car
	public String modelName; // The car model name

	public Fiat() {  //Själva 
		color = Color.RED;
		enginePower = 500;
		modelName = ""
				+ "fiat";
		stopEngine();
	}

	

	public double speedFactor() {//speeddfactor  
		return enginePower * 3 * trimFactor;
	}
	
}


