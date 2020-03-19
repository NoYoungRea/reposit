import java.util.regex.Pattern;

class PatternChecker {
	public static boolean checkPhoneNumber(String myPhoneNumber) {
		String phoneNumber ="\\d{2,3}-\\d{3,4}-\\d{4}";
		return (Pattern.matches(phoneNumber, myPhoneNumber));
	}
	public static boolean checkEmail(String myEmail) {
		String email="[a-z][\\w_]*@\\w+\\.(com|net|mil|gov)|((co|ac|ne)\\.(kr|jp))";
		return (Pattern.matches(email, myEmail));
	}
}

public class B100_pattern {
	public static void main(String[] args) {
		System.out.println(PatternChecker.checkEmail("rea2169@naver.com"));
		System.out.println(PatternChecker.checkPhoneNumber("010-3023-2169"));
	}
}
