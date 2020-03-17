package A6_exception5;

public class Car {
	private int fuel;

	public Car(int fuel) {
		this.fuel = fuel;
	}
	public void setFuel(int fuel) {
		this.fuel=fuel;
	}
	public void run(int dist) throws NotEnoughFuelException{
		if((dist/10)<=fuel) {
			System.out.println(dist+"km");
			fuel-=(dist/10);
			System.out.println("fuel"+fuel+"left");
			return;
		}
		try {
		throw new NotEnoughFuelException();
		}
		catch(NotEnoughFuelException e) {
			e.doExcept(this);
		}
		finally {
			System.out.println(dist+"km");
			fuel-=(dist/10);
			System.out.println("fuel"+fuel+"left");
		}
	}

}
