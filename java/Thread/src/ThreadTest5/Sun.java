package ThreadTest5;

public class Sun extends Thread{
	private Bank bank;
	
	public Sun(Bank bank) {
		this.bank=bank;
	}
	public void run() {
		int i=0;
		while(!bank.GetisReady()) {
			i++;
			System.out.println("mom is not already");
			
		}
		System.out.println(i);
		int money=bank.withdraw(1000);
		System.out.println("sun/"+money+"/withdraw");

	}
}

