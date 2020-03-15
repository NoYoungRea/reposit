import java.util.Scanner;

public class A1_ScannerTest {
	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		System.out.print("이름:");
		String str=sc.nextLine();
		System.out.print("연령: ");
		int age=sc.nextInt();
		System.out.print("신장: ");
		double height= sc.nextDouble();

		System.out.println("이름:"+str);
		System.out.println("연령:"+age);
		System.out.println("신장:"+height);
	}
}
