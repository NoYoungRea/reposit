package A6_exception5;

public abstract class CarException extends Exception{
	public CarException(String msg){
		super(msg);
	}
	public abstract void doException(Car car);
}
