package ThreadTest6;

public class AppStart {
	public static void main(String[]args) {
		Bank bank=new Bank("our",10000);
		Thread t1=new Thread(new User("hgd",bank));
		Thread t2=new Thread(new User("abc",bank));
		
		t1.start();
		t2.start();
	}
}
