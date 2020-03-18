

public class AppStart {
	public static void main(String []args) {
		String str="1234";
		int sum=0;
		for(int i=0;i<str.length();i++) {
			char tmp=str.charAt(i);
			int num=tmp-'0';
			sum*=10;
			sum+=num;
		}
		System.out.println(sum);
	}
}
