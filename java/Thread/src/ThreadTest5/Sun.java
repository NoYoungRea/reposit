package ThreadTest5;

public class Sun extends Thread{
	private Bank bank;
	
	public Sun(Bank bank) {
		this.bank=bank;
	}
	public void run() {
		while(!bank.GetisReady()) {
			System.out.println("mom is not already");
		}
		int money=bank.withdraw(1000);
		System.out.println("sun/"+money+"/withdraw");

	}
}

