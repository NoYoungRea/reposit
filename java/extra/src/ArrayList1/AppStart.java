package ArrayList1;

import java.util.ArrayList;

public class AppStart {
	public static void main(String[]args) {
		ArrayList<Integer> al=new ArrayList<>(3);
		al.add(10);
		al.add(0,20);
		al.add(1,30);
		al.add(0,50.0);
		
		for(int i=0;i<al.size();i++) {
			Object o=al.get(i);
			System.out.println(o);

		}
	}
}
