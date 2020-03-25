package fileIOTest1;

import java.io.File;
import java.io.IOException;

public class AppStart {
	public static void main(String[]args) {
		
		File dir=null;
		
		dir=new File("C://Program Files");
		File[] list = dir.listFiles();
		for(File f: list) {
			System.out.printf("%10s %10d %s %s\n",(f.isDirectory()?"Dir":"File"),f.length(),f.lastModified(),f.getName());
		}
		
		
	}
}
