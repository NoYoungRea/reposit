package ThreadTest3;

public class AppStart {
	public static void main(String[] args) {
		Thread t = new Thread() {
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println(Thread.currentThread().getName() + "/" + i);
					try {
						Thread.sleep(500);
					} 
					catch (InterruptedException e) {
					}
				}
			}
		};
		t.start();
		try {
			t.join();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"/ exit");
	}
}
