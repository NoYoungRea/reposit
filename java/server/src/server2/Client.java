package server2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
	public static void main(String[]args) {
		Socket sock=null;
		
		BufferedReader cin=null;
		PrintWriter sout=null;
		BufferedReader sin=null;
		
		try {
			sock=new Socket("127.0.0.1",9000);
			System.out.println("client connect to 127.0.0.1");
			
			cin=new BufferedReader(new InputStreamReader(System.in));
			sin=new BufferedReader(new InputStreamReader(sock.getInputStream()));
			sout=new PrintWriter(new BufferedWriter(new OutputStreamWriter(sock.getOutputStream())));
			
			while(true) {
				System.out.print("message : ");
				String str=cin.readLine();
				sout.println(str);
				sout.flush();
				String reply=sin.readLine();
				System.out.println("bakcmessage : "+reply);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {sock.close();}catch(Exception e) {}
		}
	}
}
