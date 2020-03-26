package ReaderWriter2;

import java.io.BufferedReader;
import java.io.FileReader;

public class Leader {
	public static void main(String[]args) {
		BufferedReader in=null;
		try {
			in=new BufferedReader(new FileReader("C:/tmp/data.txt"),1024);
			while(true) {
				String line=in.readLine();
				System.out.println(line);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try{in.close();}catch(Exception e) {}
		}
	}
}
