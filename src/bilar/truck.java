package bilar;

public abstract class truck extends car {

	int minst_vinkel = 0;
	int högst_vinkel = 70;
	int vinkel;

	public void raise() {
		if (0 == currentSpeed)
			vinkel++;

		if (vinkel > högst_vinkel)
			vinkel = högst_vinkel;
	}

	public void lower() {
		if (0 == currentSpeed)
			vinkel--;

		if (vinkel < minst_vinkel)
			vinkel = minst_vinkel;

	}

	public int getAngle() {
		return vinkel;
	}

	public boolean candrive() {
		return vinkel == 0;
	}
	

	@Override
	public void gas(double amount) {
		if (candrive())
			super.gas(amount);

	}

}
