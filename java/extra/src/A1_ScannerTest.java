import java.util.Scanner;

public class A1_ScannerTest {
	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		System.out.print("�̸�:");
		String str=sc.nextLine();
		System.out.print("����: ");
		int age=sc.nextInt();
		System.out.print("����: ");
		double height= sc.nextDouble();

		System.out.println("�̸�:"+str);
		System.out.println("����:"+age);
		System.out.println("����:"+height);
	}
}
