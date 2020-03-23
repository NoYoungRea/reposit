package ThreadTest10;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyThread implements Runnable{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName()+"/"+i);
		}
		try {Thread.sleep(5);}catch(InterruptedException e) {}
	}
}

public class AppStart {
	public static void main(String[]args) {
		ExecutorService excutorService=Executors.newFixedThreadPool(3);
		for(int i=0;i<10;i++) {
			Thread t1=new Thread(new MyThread(), i+" Thread");
			excutorService.submit(t1);
		}
	}
}
