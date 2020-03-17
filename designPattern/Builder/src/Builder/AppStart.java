package Builder;

public class AppStart {
	public static void main(String[]args) {
		CarBuilder cb=new CarBuilder();
		Car car=cb.setName("benz").setDisp(4500).setColor("white").getInstance();
		System.out.println(car.toString());
	}
}
