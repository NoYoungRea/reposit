package InnerClass;
class Bike implements Car.Runnable{
	public void run() {

	}

}
public class AppStart {
	public static void main(String[]args) {
		Car c=new Car("hundai");
		c.showInfo();

		Car c2=new Car("meri");
		c.showInfo();

		Car.Engine e=new Car.Engine(5000);
		e.on();

		System.out.println(Car.Engine.Engine_Type); 

	}
}