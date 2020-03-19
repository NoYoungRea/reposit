package compareTest;

import java.util.Arrays;

public class AppStart {
	public static void main(String[] args) {
		Member[] members = { new Member("abc"), new Member("cde"), new Member("abde") };
		Arrays.sort(members);
		for (Member m : members) {
			System.out.println(m.getName());
		}
	}
}
