package Builder;

public class AppStart {
	public static void main(String[]args) {
		CarBuilder cb=new CarBuilder();
		cb.setName("benz").setDisp(4500).setColor("white");
		Car car=cb.getInstance();
		System.out.println(car.toString());
	}
}
