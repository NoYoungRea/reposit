package transientTest;

import java.io.Serializable;

public class Box implements Serializable{
	private static final long serialVersionUID = -8479505010869961944L;
	private transient int width;
	private transient int height;
	public Box(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public String toString() {
		return "width/"+width+":height/"+height;
	}

}
