package ioioio2;

import java.util.Random;

public class Sender implements Runnable{
	private FileObject fobj;
	private String name;
	
	public Sender(FileObject fobj,String name) {
		this.fobj=fobj;
		this.name=name;
	}
	public void run() {
		Random rand=new Random();
		while(true) {
			int r=rand.nextInt();
			try {
				fobj.saveObject(r);
				System.out.println(name+"/lecord");
		
			}catch(Exception e) {
				e.printStackTrace();
			}
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
