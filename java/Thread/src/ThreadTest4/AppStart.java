package ThreadTest4;

class Computer extends Thread {
	private int result;

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			result += i;
			try {
				Thread.sleep(100);

			} catch (InterruptedException e) {

			}
			System.out.println("succdd");

		}
	}
}

public class AppStart {
	public static void main(String []args) {
		Thread t=new Computer();
		t.start();
		try {
			t.join();
		}
		catch(InterruptedException e) {
			
		}
		System.out.println("result/"+((Computer)t).getResult());
	}
}


