package CloneTest;

public class AppStart {
	public static void main(String[] args) {

		Car c = new Car("benz", "Black");
		try {
			Car newCar = (Car)c.clone();
			System.out.println(c.toString());
			System.out.println(newCar.toString());
		} catch (CloneNotSupportedException e) {
			System.out.println("can't clone");
			e.printStackTrace();
		}
	}
}
