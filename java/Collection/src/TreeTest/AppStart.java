package TreeTest;

import java.util.TreeSet;

public class AppStart {
	public static void main(String[]args) {
		TreeSet<String>ts=new TreeSet<>();
		ts.add("a");
		ts.add("b");
		ts.add("c");
		ts.add("d");
		ts.add("e");

		for(String i:ts) {
			System.out.println(i);
			
		}
	}
}
