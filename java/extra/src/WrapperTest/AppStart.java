package WrapperTest;

public class AppStart {
	public static void func(Integer i) {
		i=200;
	}
	public static void sFunc(String s) {
		s="asd";
	}
	public static void main(String[]args) {
		Integer a=100;
		String str="abc";
		func(a);
		System.out.println(a);
		sFunc(str);
		System.out.println(str);
	}
}
