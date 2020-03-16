package A3_exception2;

public class AppStart {
	public static int func() {
		int a=10;
		int b=0;
		int value=0;
		
		try {
			value=a/b;
		}
		catch(ArithmeticException e) {
			value=-1;
		}
		return value;
	}
	public static void main(String[] args) {
		int a=func();
		System.out.println(a);
	}
}