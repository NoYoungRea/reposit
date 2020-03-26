package server1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[]args) {
		ServerSocket sSock=null;
		BufferedReader in =null;
		try {
			sSock=new ServerSocket(9000);
			System.out.println("serer waiting from 9000");
			
			
			Socket cSock=sSock.accept();
			InetAddress cInet=cSock.getInetAddress();
			System.out.println(cInet.getHostName());
			
			in=new BufferedReader(new InputStreamReader(cSock.getInputStream()));
			
			while(true) {
				String str=in.readLine();
				System.out.println(str);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {sSock.close();}catch(Exception e) {}	
		}
	}
}
