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
			
			file=File.createTempFile("temp_", ".tmp", new File("C:\\tmp"));
			System.out.println(file.getAbsolutePath()+"/ we make");	
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
//C:\tmp\temp_4671520706010542476.tmp/ we make
