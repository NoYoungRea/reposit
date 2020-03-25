package outputStream;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class AppStart {
	public static void main(String[]args) {
		DataOutputStream dos=null;
		FileOutputStream fos=null;
		try {
			fos=new FileOutputStream("c:/tmp/data.txt");
			dos=new DataOutputStream(fos);
			fos.write(65);
			fos.write(66);
			fos.write(166);
			dos.writeDouble(3.14);
			dos.writeChar('A');
			dos.writeChars("shdudfo");

		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				dos.close();//dos closed with fos
			}
			catch(IOException |NullPointerException e) {
				e.printStackTrace();
			}
		}
	}
}
