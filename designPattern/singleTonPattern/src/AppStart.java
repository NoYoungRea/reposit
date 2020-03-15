
public class AppStart {
	public static void main(String[]args) {
		SingleTonPattern m1=SingleTonPattern.getInstance();
		SingleTonPattern m2=SingleTonPattern.getInstance();
		System.out.println(m1);
		System.out.println(m2);
	}
}	
