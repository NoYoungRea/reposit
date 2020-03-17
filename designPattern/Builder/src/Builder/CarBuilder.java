package Builder;

public class CarBuilder {
	private Car car;
	private static CarBuilder builder = null;

	private CarBuilder() {

	}

	public static CarBuilder getBuilder() {
		if (builder == null)
			builder = new CarBuilder();
		builder.car = new Car("sonata", "black", 2500);
		return builder;
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
