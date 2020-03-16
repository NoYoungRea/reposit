package InnerClass;

public class Car {
	public final static String TYPE="car1";
	private String name;

	//--------------------------------
	public Car(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//--------------------------------
	public void showInfo() {
		Engine e=new Engine(3000);
		e.on();
	}

	interface Runnable{
		public abstract void run();
	}

	static class Engine{
		public static final String Engine_Type="marine";
		private int displacement;

		public Engine(int displacement) {
			this.displacement=displacement;
		}

		public int getDisplacement() {
			return displacement;
		}

		public void setDisplacement(int displacement) {
			this.displacement = displacement;
		}

		public void on() {
			System.out.println(Car.TYPE);
			//System.out.println(Car.this.name);
			System.out.println(displacement);
			System.out.println(Engine.Engine_Type);
		}

	}

}