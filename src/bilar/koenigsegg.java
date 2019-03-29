package bilar;

import javafx.scene.paint.Color;

public class koenigsegg extends vehicle{
	
	public final static double trimFactor = 100.25;

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
