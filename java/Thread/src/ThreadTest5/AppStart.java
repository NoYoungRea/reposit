package ThreadTest5;

public class AppStart {
	public static void main(String[]args) {
		Bank bank=new Bank("our moeny",0);
		Thread mom =new Mother(bank);
		Thread son= new Sun(bank);
		
		mom.start();
		son.start();
	}
}