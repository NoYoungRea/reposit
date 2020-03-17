package A6_exception5;

public class NotEnoughFuelException extends Exception {
	public NotEnoughFuelException() {
		this("fuel is done");//default message
	}
	public NotEnoughFuelException(String msg) {
		super(msg);
	}
	public void doExcept(Car car) {
		System.out.println("recharge fuel to 100L");
		car.setFuel(100);
		System.out.println("end recharge now let's go");
		car.run(100);
	}
	public void doExcept(Car car,int dist) {
		System.out.println("recharge fuel to 100L");
		car.setFuel(100);
		System.out.println("end recharge now let's go");
		car.run(dist);
	}
}
