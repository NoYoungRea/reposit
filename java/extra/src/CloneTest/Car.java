package CloneTest;

public abstract class Car implements Cloneable{
	protected String name;
	protected String color;
	
	public Car(String name,String color) {
		this.name=name;
		this.color=color;
	}
	public abstract String toString();
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}


	public Object clone() throws CloneNotSupportedException{
		Object o=super.clone();
		Car car=(Car)o;
		car.name=this.name;
		car.color=this.color;
		return car;
		
	}

}
