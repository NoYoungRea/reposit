package equalsTest;

public class AppStart {
	public static void main(String[] args) {
		Object o1 = new Object();
		Object o2 = new Object();

		System.out.println(o1 == o2);
		System.out.println(o1.equals(o2));
	}
}
