package CloneTest;

public class AppStart {
	public static void main(String[] args) {

		Object c = new SportCar("benz", "Black",30);
		try {
			SportCar tmp=(SportCar)c;
			SportCar newCar = (SportCar)tmp.clone();
			newCar.setMaxSpeed(250);
			System.out.println(c.toString());
			System.out.println(newCar.toString());
		} catch (CloneNotSupportedException e) {
			System.out.println("can't clone");
			e.printStackTrace();
		}
	}
}