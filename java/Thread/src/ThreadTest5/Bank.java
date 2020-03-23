package ThreadTest5;

public class Bank {
	private String accouont;
	private int balance;
	public Bank(String accouont, int balance) {
		this.accouont = accouont;
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

	public String getAccouont() {
		return accouont;
	}

	public void setAccouont(String accouont) {
		this.accouont = accouont;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	

}
