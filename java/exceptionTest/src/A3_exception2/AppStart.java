package A3_exception2;

public class AppStart {
	public static int func() {
		int a=10;
		int b=0;
		int value=0;
		
		
		try {
			System.out.println("file open");
			System.out.println("file using");
			value=a/b;
		}
		catch(ArithmeticException e) {
			return -1;
		}
		System.out.println("file close");
		return value;
	}
	public static void main(String[] args) {
		int a=func();
		System.out.println(a);
	}
}