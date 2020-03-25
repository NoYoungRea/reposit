package fileIO;

import java.io.File;
import java.io.IOException;

public class AppStart {
	public static void main(String[] args) {
		File dir = null;

		dir = new File("C:/tmp/backup/abc");
		if (!dir.exists()) {
			dir.mkdirs();	
		}

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
		}
	}
}
//C:\tmp\temp_4671520706010542476.tmp/ we make	
