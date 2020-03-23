package ThreadTest1;
class Counter implements Runnable{
	private int count;
	
	public Counter() {
		this.count=0;
	}
	public int getCount() {
		return count;
	}
	public void run() {
		for(int i=0;i<10;i++) {
			count++;
			try {
			Thread.sleep(500);
			}
			catch(InterruptedException e) {}
		}
		System.out.println("Counter value /"+count);
	}
}
public class ThreadTest1 {
	public static void main(String[]args) {

		Thread t1=new Thread(new Counter());
		t1.start();
		System.out.println("process exit");
	}
}
