package bilar;

public abstract class car_truck extends truck {
	
	
	
	
	public car_truck(){
		
	}
	
	
	
	int ramp_uppe = 1;
	int ramp_nere = 0;
	int ramp;
	
	
	
	
	public void updateAllPositions() {
		for (Car car : car) {
			car.setXpos.(this.getXpos());
			car.setYpos.(this.getYpos());
			
			
		}
	}
	
	
	public void loadcar(car c) {
		if (ramp_uppe()&& car.size()< 5 && c ! = this) {
			
		}
		cars.add(c);
	}
	
	public void unloadcard() {
		if(flatbed.isopne() && car.size() > 0)
			cars.remove(cars.sizr()-1);
		
	}
	
	
	
	
	public void rampraise() {
		if (0 == currentSpeed)
			ramp++;

		if (ramp > ramp_uppe)
			ramp = ramp_uppe;
	}

	public void ramplower() {
		if (0 == currentSpeed)
			ramp--;

		if (ramp < ramp_nere)
			ramp = ramp_nere;
		
	}
	public boolean candrive() {
		return ramp == 1;
	}


	@Override
	public void gas(double amount) {
		if (candrive())
			super.gas(amount);

	}

	
}
