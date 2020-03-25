package fileIOTest1;

import java.io.File;
import java.io.IOException;

public class AppStart {

	public static void search(File dir) {
		
		File[] list = dir.listFiles();
		try {
		for (File f : list) {
		
				System.out.printf("%10s %s\n", (f.isDirectory() ? "Dir" : "File"), f.getParent());// f.getParent
		
		
				if (f.isDirectory()&&f.canRead()&&f.canExecute()) {
				search(f);
			}
		}
		}
		catch(Exception e) {
			
		}

	}

	public static void main(String[] args) {
		search(new File("C://Program Files"));
	}
}
