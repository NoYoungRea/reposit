package A6_exception5;

public class Car {
	private int fuel;
	private boolean engineOn;
	public Car(int fuel) {
		this.fuel = fuel;
	}
	public void setFuel(int fuel) {
		this.fuel=fuel;
	}
	public void setEngineOn(boolean engineOn)
	{
		this.engineOn=engineOn;
	}
	public void run(int dist) {
		
		try {
			if(engineOn==false)
				throw new EngineStopException();
			if(fuel<dist/10)
				throw new NotEnoughFuelException();
			System.out.println(dist+"km");
			fuel-=(dist/10);
			System.out.println("fuel: "+fuel+" left");
			return;
		}

		catch(CarException e){
			System.out.println(e.getMessage());
			e.doException(this);
			this.run(dist);

		}


	
	}

}
