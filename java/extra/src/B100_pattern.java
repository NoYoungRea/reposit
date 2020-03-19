import java.util.regex.Pattern;
public class B100_pattern {
	public static void main(String[]args) {
		String email="[a-z][\\w_]*@\\w+\\.(com|net|mil|gov)|((co|ac|ne)\\.(kr|jp))";
		System.out.println(Pattern.matches(email, "rea2169@naver.com"));
	}
}
