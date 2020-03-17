package Builder;

public class Car {
	private String name;
	private String color;
	private int disp;
	
	public Car(String name,String color,int disp) {
		this.name=name;
		this.color=color;
		this.disp=disp;
	}

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

	public int getDisp() {
		return disp;
	}

	public void setDisp(int disp) {
		this.disp = disp;
	}
	public String toString() {
		StringBuffer sb=new StringBuffer();
		sb.append("car:"+name+"\n")
		.append("color: "+color+"\n")
		.append("disp: "+disp+"\n");
		return sb.toString();
	}
}
