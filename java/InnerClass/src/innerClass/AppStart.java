package innerClass;
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
		
		Car.Engine e=c.new Engine(5000);
		e.on();
		
		//System.out.println(c.Engine.ENGINE_TYPE); error
		System.out.println(Car.Engine.Engine_Type);
	}
}
