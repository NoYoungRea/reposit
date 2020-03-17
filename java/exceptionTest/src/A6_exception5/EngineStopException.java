package A6_exception5;

public class EngineStopException extends CarException{
	public EngineStopException(){
		super("engine stop");
	}
	public void doException(Car car) {
		System.out.println("engine setup");
		car.setEngineOn(true);
		System.out.println("car on");
	}
}
