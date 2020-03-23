package ThreadTest1;
class Counter extends Thread{
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
		Counter counter=new Counter();
		counter.run();
		System.out.println("process exit");
	}
}
