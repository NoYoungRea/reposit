import java.util.StringTokenizer;

public class A92_StringToken {
	public static void main(String[]args) {
		String str="hello java hello";
		StringTokenizer st=new StringTokenizer(str);
		while(st.hasMoreElements()) {
			System.out.println(st.nextElement());
		}
	}
}
