package bilar;

import java.util.ArrayList;

import javafx.scene.paint.Color;

public abstract class vehicle {

	private int x; // beräknar bilens x kordinat
	private int y;// beräknar bilens y kordinat
	private int diraction; // beräknar bilens riktning
	private double enginePower; // Engine power of the car
	private double currentSpeed; // The current speed of the car
	private Color color; // Color of the car
	private String modelName; // The car model name

	public vehicle(Color c, double ep, String m) {
		color = c;
		enginePower = ep;
		modelName = m;
		x = 0;
		y = 0;
		diraction = 1;
	}

	public double getEnginePower() { // Den retuenar enginePower
		return enginePower;
	}

	public double getCurrentSpeed() { // Den returnar currentSpeed

		return currentSpeed;
	}

	public Color getColor() { // <den returnar color
		return color;
	}

	protected void startEngine() { // variabel för currentSpeed
		currentSpeed = 0.1;
	}

	protected void stopEngine() { // variabel för stopengine som gör att billen stannar
		currentSpeed = 0;
	}

	public abstract double speedFactor(); // kallar på speedfactor

	public void move() {// bestämmer riktnigen som bilen kör i
		switch (diraction) {

		case 0:
			y += currentSpeed;
			break;
		case 1:
			x += currentSpeed;
			break;
		case 2:
			y += currentSpeed;
			break;
		case 3:
			x += currentSpeed;
			break;
		}

	}

	private void incrementSpeed(double amount) { // Visar currentspeed och lägger ihop currentspeed med speedfacor
		currentSpeed = getCurrentSpeed() + speedFactor() * amount;
		if (currentSpeed > getEnginePower())
			currentSpeed = getEnginePower();
	}

	private void decrementSpeed(double amount) { // Visar currentspeed och suptraherar currentspeed med speedfacor
		currentSpeed = getCurrentSpeed() - speedFactor() * amount;
		if (currentSpeed < 0)
			currentSpeed = 0;
	}

	public void gas(double amount) { // variabel för hur mycket "gas" de finns
		if (amount <= 0 && amount >= 1) {
			incrementSpeed(amount);
		}

	}

	public void brake(double amount) { //
		if (amount >= 0 && amount <= 1) {
			decrementSpeed(amount);
		}
	}

	public void setYpos(int ypos) {

		y = ypos;
	}

	public void setXpos(int xpos) {

		x = xpos;

	}

	public int getYpos() {
		return y;
	}

	public int getXpos() {
		return x;
	}

	public static int size() {
		// TODO Auto-generated method stub
		return 0;
	}

}
