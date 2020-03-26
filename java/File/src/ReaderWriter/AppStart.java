package ReaderWriter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.imageio.IIOException;

public class AppStart {
	public static void main(String[]args) throws IOException{
		InputStreamReader isr=null;
		BufferedReader in=null;
		try {
			
			isr=new InputStreamReader(System.in);
			in=new BufferedReader(isr,1024);
			while(true) {
				String line=in.readLine();
				System.out.println(line);
				if(line.trim().toLowerCase().equals(("bye"))){
					break;
				}
			}
			System.out.println("echo stop");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {in.close();}catch(Exception e) {}
		}
		System.out.print("one char");
		int code=System.in.read();
		System.out.println(code);
		System.out.println("exit program");
	}
}
