package Builder;

public class AppStart {
	public static void main(String[]args) {
	
		Car car=CarBuilder.getBuilder().setName("benz").setDisp(4500).setColor("white").getInstance();
		System.out.println(car.toString());
	}
}
