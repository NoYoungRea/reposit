package ThreadTest7;

class Bank {
	private int balance;
	
	public Bank() {

	}
	
	public Bank( int balance) {

		this.balance = balance;

	}

	public void deposit(int account) {
		balance+=account;
	}
	public int withdraw(int amount) {
		if(amount>balance) {
			return 0;
		}
		balance-=amount;
		return amount;
	}


	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	

}
class Receiver implements Runnable{
	private Bank bank;
	public Receiver(Bank bank) {
		this.bank=bank;
	}
	public void run() {
		System.out.println(bank.getBalance());
	}
}
class Sender implements Runnable{
	private Bank bank;
	public Sender(Bank bank) {
		this.bank=bank;
	}
	public void run() {
		System.out.println(bank.getBalance());
	}
}


public class AppStart {
	public static void main(String []args) {
		Bank bank=new Bank();
		Thread sender=new Thread(new Sender(bank));
		Thread receiver=new Thread(new Receiver(bank));
		
		
		sender.start();
		while(sender.getState()!=Thread.State.TERMINATED);
		receiver.start();

	}
}
