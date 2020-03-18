package a2;

import java.util.Comparator;
import java.util.Objects;

public class AppStart {
	public static void main(String[]args) {
		int a=10;
		int b=5;
		int c=Objects.compare(a, b, new Comparator<Integer>() {
			public int compare(Integer a,Integer b) {
				return (a-b);
			}
		});
	}
}
