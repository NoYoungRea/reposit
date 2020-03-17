package Builder;

public class AppStart {
	public static void main(String[]args) {
	
		Car car1=CarBuilder.getBuilder().setName("benz").setDisp(4500).setColor("white").getInstance();
		Car car2=CarBuilder.getBuilder().setName("grenger").setDisp(4500).setColor("black").getInstance();

		System.out.println(car1);
		System.out.println(car2);

	}
}
