package server2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) {
		ServerSocket sSock = null;
		BufferedReader cin = null;	// 콘솔 입력
		BufferedReader sin = null;	// 소켓 입력
		PrintWriter sout = null;	// 소켓 출력
		
		try {
			sSock = new ServerSocket(9000);
			System.out.println("9000번 포트로 클라이언트를 대기중입니다.");
			cin = new BufferedReader(new InputStreamReader(System.in));
			
			Socket cSock = sSock.accept();
			InetAddress client = cSock.getInetAddress();
			System.out.println(client.getHostName() + "가 연결되었습니다.");
			
			sin = new BufferedReader(new InputStreamReader(cSock.getInputStream()));
			sout = new PrintWriter(new BufferedWriter(new OutputStreamWriter(cSock.getOutputStream())));
			
			while (true) {
				String str = sin.readLine();
				System.out.println(str);
				System.out.print("전송메시지 : ");
				String sendStr = cin.readLine();
				sout.println(sendStr);				
				sout.flush();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try { sSock.close(); } catch (Exception e) {}
		}
	} 
}
