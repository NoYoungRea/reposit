package compareTest;

import java.util.Arrays;

public class AppStart {
	public static void main(String[] args) {
		Member[] members = { new Member("abc",20,30), new Member("cde",30,20), new Member("abde",40,50) };
		Arrays.sort(members);
		for (Member m : members) {
			System.out.println(m);
		}
	}
}
