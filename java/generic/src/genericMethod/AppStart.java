package genericMethod;

class Circle{
	public<T> void func(T a) {
			System.out.println("generidc methd is called")
		
	}
}
public class AppStart {
	public static void main(String[]args) {
		Circle c=new Circle();
		c.func(10);
		c.<Integer>func(100);
	}
}
