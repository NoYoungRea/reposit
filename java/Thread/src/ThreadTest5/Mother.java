package ThreadTest5;

public class Mother extends Thread{
	private Bank bank;
	
	public Mother(Bank bank) {
		this.bank=bank;
	}
	public void run() {
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e) {
				
			}
			bank.deposit(1000);
			System.out.println("mother/" + 1000 + "/deposit");

			synchronized(bank) {
				try {
					bank.notify();
					bank.wait();
				}
				catch(InterruptedException e) {
					
				}
			}
		}
	}
}
