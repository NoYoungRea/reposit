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
		BufferedReader cin = null;	// �ܼ� �Է�
		BufferedReader sin = null;	// ���� �Է�
		PrintWriter sout = null;	// ���� ���
		
		try {
			sSock = new ServerSocket(9000);
			System.out.println("9000�� ��Ʈ�� Ŭ���̾�Ʈ�� ������Դϴ�.");
			cin = new BufferedReader(new InputStreamReader(System.in));
			
			Socket cSock = sSock.accept();
			InetAddress client = cSock.getInetAddress();
			System.out.println(client.getHostName() + "�� ����Ǿ����ϴ�.");
			
			sin = new BufferedReader(new InputStreamReader(cSock.getInputStream()));
			sout = new PrintWriter(new BufferedWriter(new OutputStreamWriter(cSock.getOutputStream())));
			
			while (true) {
				String str = sin.readLine();
				System.out.println(str);
				System.out.print("���۸޽��� : ");
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
