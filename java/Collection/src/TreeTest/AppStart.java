package TreeTest;

import java.util.TreeSet;

public class AppStart {
	public static void main(String[]args) {
		TreeSet<Integer>ts=new TreeSet<>();
		ts.add(30);
		ts.add(10);
		ts.add(15);
		ts.add(20);
		ts.add(25);

		for(Integer i:ts) {
			System.out.println(i);
			
		}
	}
}
