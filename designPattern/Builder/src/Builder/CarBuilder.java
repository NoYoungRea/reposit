package Builder;

public class CarBuilder {
	private Car car;
	
	private CarBuilder() {
		this.car=new Car("sonata","black",2500);
	}
	public static CarBuilder getBuilder() {
		return new CarBuilder();
	}
	
	public CarBuilder setName(String name) {
		this.car.setName(name);
		return this;
	}
	public CarBuilder setColor(String color) {
		this.car.setColor(color);
		return this;
	}
	public CarBuilder setDisp(int disp) {
		this.car.setDisp(disp);
		return this;
	}
	public Car getInstance() {
		return car;
	}
}
