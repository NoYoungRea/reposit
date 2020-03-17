package A6_exception5;

public class AppStart {
	public static void main(String[]args) {
		Car car=new Car(100);
		for(int i=0;i<10;i++) {
			car.run(200);
		}
	}
}
