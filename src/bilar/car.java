package bilar;

import javafx.scene.paint.Color;

public abstract class car {
	
	
	public double enginePower; // Engine power of the car
	public double currentSpeed; // The current speed of the car
	public Color color; // Color of the car
	public String modelName; // The car model name
	
	
	private double getEnginePower() {   
		return enginePower;
	}

	private double getCurrentSpeed() {
		return currentSpeed;
	}

	public Color getColor() {
		return color;
	}

	protected void startEngine() {
		currentSpeed = 0.1;
	}

	protected void stopEngine() {
		currentSpeed = 0;
	}

	
	
	public abstract double speedFactor();
	
	
	
	
	private void incrementSpeed(double amount) {
		currentSpeed = getCurrentSpeed() + speedFactor() * amount;
	}
	private void decrementSpeed(double amount) {
		currentSpeed = getCurrentSpeed() - speedFactor() * amount;
	}

	private void gas(double amount) {
		incrementSpeed(amount);
	}

	private void brake(double amount) {
		decrementSpeed(amount);
	}


}
