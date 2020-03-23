package ThreadTest2;
class MyThread extends Thread{
	protected int a;
	public MyThread(int a) {
		this.a=a;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
}
public class ThreadTest2 {
	public static void main(String[] args) {
		int a=10;

		Thread t0= new MyThread(100) {
			public void run() {
				for(int i=0;i<10;i++) {
					a++;
					try {
						Thread.sleep(500);
					}
					catch(InterruptedException e) {
						
					}
					System.out.println(a);
				}
			}
		};
		
		Thread t1 = new Thread("first") {
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println(Thread.currentThread().getName() + "/" + i);
				}
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {

				}
			}
			public int getA() {
				return a;
			}
		};
		//t1.getA();


		Thread t2=new Thread(new Runnable(){
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println(Thread.currentThread().getName() + "/" + i);
				}
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {

				}
			}
		},"second thread");

		t0.start();
		t1.start();
		t2.start();
		System.out.println(Thread.currentThread().getName() + "/process exit");
	}
}
