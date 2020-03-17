package Builder;

public class AppStart {
	public static void main(String[]args) {
		CarBuilder cb=new CarBuilder();
		Car car=cb.getInstance();
		System.out.println(car.toString());
	}
}
