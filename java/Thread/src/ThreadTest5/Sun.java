package ThreadTest5;

public class Sun extends Thread {
	private Bank bank;

	public Sun(Bank bank) {
		this.bank = bank;
	}

	public void run() {
		int money = 100;
		synchronized (bank) {
			try {
				bank.wait();
			} catch (InterruptedException e) {

			}
		}

		money = bank.withdraw(1000);
		System.out.println("sun/" + money + "/withdraw");

	}
}
