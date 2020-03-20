package genericInterface1;

public class AppStart {
	public static void main(String[]args) {
		Box box =new Box(10);
		int result = box.compareTo(20);
		System.out.println(result);
	}
}
