package Test4;

import java.util.Comparator;

public class Box implements Comparable<Box>{
	int width;
	int height;
	Comparator<Box> comparator;
	
	public Box(int width, int height) {
		super();
		this.width = width;
		this.height = height;
		this.comparator=null;
	}
	
	public Comparator<Box> getComparator() {
		return comparator;
	}

	public void setComparator(Comparator<Box> comparator) {
		this.comparator = comparator;
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

	public int getArea() {
		return this.width*this.height;
	}
	public int compareTo(Box obj) {
		return this.comparator.compare(this, obj);
	}
}
