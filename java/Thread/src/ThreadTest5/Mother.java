package ThreadTest5;

public class Mother extends Thread{
	private Bank bank;
	
	public Mother(Bank bank) {
		this.bank=bank;
	}
	public void run() {
		System.out.println("1000won is deposited by mother");
		bank.deposit(1000);
		bank.setIsReady(true);
	}
}
