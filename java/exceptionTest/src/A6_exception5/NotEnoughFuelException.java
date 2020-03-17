package A6_exception5;

public class NotEnoughFuelException extends CarException {
	public NotEnoughFuelException() {
		super("fuel is done");
	}

	public void doException(Car car) {
		System.out.println("recharge fuel to 100L");
		car.setFuel(100);
	}
	public void doException(Car car,int dist) {
		System.out.println("recharge fuel to 100L");
		car.setFuel(100);
	}
}
