package ThreadTest6;

public class User implements Runnable {
	private String name;
	private Bank bank;

	public User(String name, Bank bank) {
		this.name = name;
		this.bank = bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

	public Bank getBank() {
		return bank;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {

			}
			int money = 1000;

				money = bank.withdraw(1000);
				System.out.println(name + " is " + money + "/withdraw");
				System.out.println("balance is " + bank.getBalance());

		}
	}
}
