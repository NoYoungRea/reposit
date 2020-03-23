package ThreadTest5;

public class Sun extends Thread {
	private Bank bank;

	public Sun(Bank bank) {
		this.bank = bank;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			synchronized (bank) {
				try {
					bank.wait();
				} catch (InterruptedException e) {

				}
			}
			int money = 1000;
			money = bank.withdraw(money);

			System.out.println("sun/" + money + "/withdraw");
			bank.deposit(1000);
			synchronized (bank) {
				bank.notify();

			}
		}
	}
}
