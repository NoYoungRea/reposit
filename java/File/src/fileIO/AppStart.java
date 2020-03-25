package fileIO;

import java.io.File;
import java.io.IOException;

public class AppStart {
	public static void main(String[]args) {
		File file=null;
		try {
			file=new File("C:/tmp/data.txt");
			file=new File("C:\\tmp","data.txt");
			file=new File(new File("C:/tmp"),"data.txt");
			if(file.exists()) {
				System.out.println("file is");
			}
			else {
				System.out.println("file is not");
				file.createNewFile();
			}
			file.deleteOnExit();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		try {
			Thread.sleep(10000);
		}
		catch(InterruptedException e) {}
	}
}
