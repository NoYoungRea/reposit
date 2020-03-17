package CloneTest;

public class AppStart {
	public static void main(String[] args) {

		SportCar c = new SportCar("benz", "Black",30);
		try {
			SportCar newCar = (SportCar)c.clone();
			System.out.println(c.toString());
			System.out.println(newCar.toString());
		} catch (CloneNotSupportedException e) {
			System.out.println("can't clone");
			e.printStackTrace();
		}
	}
}
