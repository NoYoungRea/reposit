package ThreadTest8;

public class AppStart {
	public static void main(String []args) {
		Thread t1=new Thread() {
			public void run() {
				for(int i=0;i<100;i++) {
					System.out.println(i);
					try {
						Thread.sleep(500);
					}
					catch(InterruptedException e) {
						System.out.println("interruptedException is occuer");
						break;
					}
				}
				System.out.println(Thread.currentThread().getName()+"thread is exited");
			}
	
		};
		t1.start();
		try {
			Thread.sleep(5000);
			t1.interrupt();
		}
		catch(InterruptedException e) {
			
		}
		t1.interrupt();
	}
}
