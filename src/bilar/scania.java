package bilar;

import javafx.scene.paint.Color;

public class scania extends vehicle {

	private Flatbed flatbed;

	public scania() {
		super(Color.BLUE, 500, "Scania");
		flatbed = new Flatbed();	
	}

	public void raise() {
		if (getCurrentSpeed() == 0)
			flatbed.raise();
	}

	public void lower() {
		if (getCurrentSpeed() == 0)
			flatbed.lower();
	}

	@Override
	public void gas(double amount) {
		if (flatbed.isDown())
			super.gas(amount);
	}

	@Override
	public double speedFactor() {
		return getEnginePower() * 0.002;
	}

}
