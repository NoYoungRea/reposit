package ioioio2;

public class AppStart {
	public static void main(String[]args) {
		FileObject fobj=null;
		try {
			fobj=new FileObject("c:/tmp/data.txt");
			new Thread(new Sender(fobj,"sender")).start();
			new Thread(new Sender(fobj,"sender2")).start();
			Thread.sleep(4000);
			new Thread(new User(fobj,"user1")).start();
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
