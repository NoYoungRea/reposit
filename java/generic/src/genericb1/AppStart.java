package genericb1;

class Person<T>{
	public void show(T obj) {
		
	}
}

public class AppStart {
	public static void main(String[]args) {
		Person<String>p=new Person<String>();
	}
}
