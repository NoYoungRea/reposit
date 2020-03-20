package genericInterface1;

public class Box implements Comparable<Integer>{
	
	private int size;
	Box(int size){
		this.size=size;
	}

	
	public int compareTo(Integer a) {
		return (this.size-a);
	}
}
