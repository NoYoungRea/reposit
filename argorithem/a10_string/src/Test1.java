
public class Test1 {
	public static void main(String[]args) {

		String str1="HelloJavaWorld";
		String str2="GoodJavaWorld";
		String str3="HelloJavaWorldGoood";
		String str4="HelloHelloHello";
		
		System.out.println(func(str1));
		System.out.println(func(str2));
		System.out.println(func(str3));
		System.out.println(func(str4));
	}
	public static boolean func(String str) {
		String[]words= {"World","Java","Hello"};
		if(str.length()==0)
			return true;
		for(int i=0;i<words.length;i++) {
			if(str.startsWith(words[i])) {
				str=str.substring(words[i].length());
				return func(str);
			}
			else
				continue;

		}
		return false;
	}
}
