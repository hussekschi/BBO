package Volvo740;
import javafx.scene.paint.Color;

public class Volvo740 extends car {

	public final static double trimFactor = 1.25;

	public double enginePower; // Engine power of the car
	public double currentSpeed; // The current speed of the car
	public Color color; // Color of the car
	public String modelName; // The car model name

	public Volvo740() {
		color = Color.RED;
		enginePower = 100;
		modelName = "Volvo740";
		stopEngine();
	}


	public double speedFactor() {
		return enginePower * 0.01 * trimFactor;
	}


}