import java.util.regex.Pattern;

class PatternChecker {
	private static String phoneNumber ="\\d{2,3}-\\d{3,4}-\\d{4}";
	private static String email="[a-z][\\w_]*@\\w+\\.(com|net|mil|gov)|((co|ac|ne)\\.(kr|jp))";
	private static String id;
	private static String password="[\\w!@#$%^&*]{6,15}";
	
	public static String getId() {
		return id;
	}
	public static void setId(String id) {
		PatternChecker.id = id;
	}
	public static boolean checkPhoneNumber(String myPhoneNumber) {
		return (Pattern.matches(phoneNumber, myPhoneNumber));
	}
	public static boolean checkId(String myId) {
		return (Pattern.matches(id, myId));
	}
	public static boolean checkEmail(String myEmail) {
		return (Pattern.matches(email, myEmail));
	}
	public static boolean checkPassword(String myPassword) {
		return (Pattern.matches(password, myPassword));
	}
}

public class B100_pattern {
	public static void main(String[] args) {
		System.out.println(PatternChecker.checkEmail("rea2169@naver.com"));
		System.out.println(PatternChecker.checkPhoneNumber("010-3023-2169"));
		System.out.println(PatternChecker.checkPassword("dudfo123Q!"));
		PatternChecker.setId("[a-z]{6,10}");
		System.out.println(PatternChecker.checkId("shdudfo"));

		

	}
}
