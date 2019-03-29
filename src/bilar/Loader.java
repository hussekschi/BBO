package bilar;

import java.util.ArrayList;

import sun.java2d.loops.Blit;

public class Loader  {

	private ArrayList<vehicle> cars;

	public void load(vehicle c) {
		
		
	}
	
	public void loadcar(vehicle c) {
		
			cars.add(c);

		}
	

	public void unloadcard() {
		
			cars.remove(cars.size() - 1);

	}

	
	

	
}
