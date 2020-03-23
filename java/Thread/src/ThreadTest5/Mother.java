package ThreadTest5;

public class Mother extends Thread{
	private Bank bank;
	
	public Mother(Bank bank) {
		this.bank=bank;
	}
	public void run() {
		try {
		Thread.sleep(500);
		}
		catch(InterruptedException e) {
			
		}
		
		System.out.println("1000won is deposited by mother");
		bank.deposit(1000);
		synchronized(bank){
			bank.notify();
		}
	}
}
