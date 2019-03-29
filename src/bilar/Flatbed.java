package bilar;

public class Flatbed {

	private boolean open;
	private int angle;

	public Flatbed() {
		open = false;
		angle = 0;
	}

	public boolean isOpen() {
		return open;
	}

	public void open() {
		open = true;

	}

	public void close() {
		open = false;

	}

	public boolean isDown() {
		return angle == 0;
	}

	public void raise() {
		angle += 10;
		if (angle > 70)
			angle = 70;
	}

	public void lower() {
		angle -= 10;
		if (angle < 0)
			angle = 0;

	}

}
