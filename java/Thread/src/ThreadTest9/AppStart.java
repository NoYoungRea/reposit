package ThreadTest9;

public class AppStart {
	public static void main(String[] args) {
		ThreadGroup tg=new ThreadGroup("myGroup");
		for(int i=0;i<10;i++) {
			Thread t1=new Thread(tg, new Runnable() {
				public void run() {
					for(int i=0;i<100;i++) {
						System.out.println(Thread.currentThread().getName()+"/ "+i);
						try {Thread.sleep(200);}catch(InterruptedException e) {break;}
					}
					System.out.println(Thread.currentThread().getName()+" exited");
				}
			},i+"~");
			t1.start();
		}

		try {
			Thread.sleep(3000);
			tg.interrupt();
		}
		catch(InterruptedException e) {
			
		}
	}
	
}
