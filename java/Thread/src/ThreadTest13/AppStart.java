package ThreadTest13;

import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class AppStart {
	public static void main(String []args) {
		Box box =new Box();
		ExecutorService executorService=Executors.newFixedThreadPool(3);
		CompletionService<Box> completionService=new ExecutorCompletionService<Box>(executorService);
		for(int i=0;i<10;i++) {
			completionService.submit(new MyBoxThread(box),box);
		}
		
		Thread t=new Thread(new Runnable(){
			public void run() {
				while(true) {
					try {
						Future<Box> future=completionService.take();
						Box b=future.get();
						System.out.println(b.getNumber());
					
					} catch (Exception e) {
						break;
					}
				}
			}
		});
		t.start();
		System.out.println("main process is exited");
	}
}
