package TreeTest;

public class Person implements Comparable<Person>{
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	
	public Person(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int compareTo(Person obj) {
		//return -(this.sum()-obj.sum());
		return -Integer.valueOf(sum()).compareTo(obj.sum());
	}
	public String toString() {
		return name+"/"+sum();
	}
	public int sum() {
		return kor+eng+math;
	}
}
