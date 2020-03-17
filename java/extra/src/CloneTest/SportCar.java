package CloneTest;

public class SportCar extends Car{
	private int maxSpeed;
	
	public SportCar(String name,String color,int maxSpeed) {
		super(name,color);
		this.maxSpeed=maxSpeed;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	public String toString() {
		return (name+" "+color+" "+maxSpeed);
	
	}
	public Object clone() throws CloneNotSupportedException{
		Object o=super.clone();
		((SportCar)o).maxSpeed=this.maxSpeed;
		return o;
		
		
	}
}
