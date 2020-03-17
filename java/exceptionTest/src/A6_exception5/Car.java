package A6_exception5;

public class Car {
	private int fuel;

	public Car(int fuel) {
		this.fuel = fuel;
	}
	public void setFuel(int fuel) {
		this.fuel=fuel;
	}
	public void run(int dist) {
		if((dist/10)<=fuel) {
			System.out.println(dist+"km");
			fuel-=(dist/10);
			System.out.println("fuel"+fuel+"left");
			return;
		}
		NotEnoughFuelException e=new NotEnoughFuelException();
		e.doExcept(this,dist);
	
	}

}
