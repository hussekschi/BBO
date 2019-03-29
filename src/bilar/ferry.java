package bilar;

import javafx.scene.paint.Color;

public class ferry extends vehicle {

	private Loader loader;

	public ferry() {
		super(Color.WHITE, 5000, "Stena Line");
		loader = new Loader();
	}


	
	@Override
	public double speedFactor() {
		return getEnginePower() * 0.0002;
	}

}
