package ThreadTest2;

public class ThreadTest2 {
	public static void main(String[] args) {
		int a=10;

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

		
		t1.start();
		t2.start();
		System.out.println(Thread.currentThread().getName() + "/process exit");
	}
}
