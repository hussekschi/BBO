package bilar;

import java.util.ArrayList;

import javafx.scene.paint.Color;

public abstract class car {

	int x; // ber�knar bilens x kordinat
	int y;// ber�knar bilens y kordinat
	int diraction; // ber�knar bilens riktning
	public double enginePower; // Engine power of the car
	public double currentSpeed; // The current speed of the car
	public Color color; // Color of the car
	public String modelName; // The car model name

	
	private double getEnginePower() { // Den retuenar enginePower

		return enginePower;
	}

	private double getCurrentSpeed() { // Den returnar currentSpeed
		if (0 >= enginePower && enginePower <= 0) {

		}

		return currentSpeed;
	}

	public Color getColor() { // <den returnar color
		return color;
	}

	protected void startEngine() { // variabel f�r currentSpeed
		currentSpeed = 0.1;
	}

	protected void stopEngine() { // variabel f�r stopengine som g�r att billen stannar
		currentSpeed = 0;
	}

	public abstract double speedFactor(); // kallar p� speedfactor

	public void move() {// best�mmer riktnigen som bilen k�r i
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

	private void incrementSpeed(double amount) { // Visar currentspeed och l�gger ihop currentspeed med speedfacor
		currentSpeed = getCurrentSpeed() + speedFactor() * amount;
	}

	private void decrementSpeed(double amount) { // Visar currentspeed och suptraherar currentspeed med speedfacor
		currentSpeed = getCurrentSpeed() - speedFactor() * amount;
	}

	public void gas(double amount) { // variabel f�r hur mycket "gas" de finns
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
