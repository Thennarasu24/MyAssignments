package week2.day1;

public class Car {

	public void driveCar() {

		System.out.println("Drive the car");

	}

	private void applyBrake() {

		System.out.println("Apply the Brake");

	}

	protected void soundHorn() {

		System.out.println("Horn is Used");

	}

	boolean isPuncture(boolean punc) {

		System.out.println("Drive the car");
		return punc;
	}

	public static void main(String[] args) {

		Car obj = new Car();
		obj.driveCar();
		obj.applyBrake();
		obj.isPuncture(true);
		obj.soundHorn();

	}
}
