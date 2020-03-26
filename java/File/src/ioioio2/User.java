package ioioio2;

import java.util.List;

public class User implements Runnable{
	private String name;
	FileObject fobj;
	
	public User(FileObject fobj,String name) {
		this.fobj=fobj;
		this.name=name;
	}
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
				List<Object>objs=fobj.getObject();
				for(Object o:objs) {
					System.out.print(o+" ");
				}
				System.out.println();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
