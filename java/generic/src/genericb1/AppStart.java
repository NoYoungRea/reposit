package genericb1;

class Person<T extends Number>{
	private T value;
	
	public Person(T value) {
		this.value=value;
	}
	public T getValue() {
		return value;
	}
}

public class AppStart {
	public static void main(String[]args) {
		//Person<String>p=new Person<>("shdudfo")//xxxxxx is can be number Type?;
	}
}
