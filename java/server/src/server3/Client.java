package server3;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
	Socket sock = null;
	BufferedReader cin = null;		
	PrintWriter sout = null;
	BufferedReader sin = null;
	
	class Receiver extends Thread {
		public void run() {
			try {
				while (true) {
					String recvMessage = Client.this.sin.readLine();
					System.out.println(recvMessage);
					try {
						Thread.sleep(1);
					}
					catch (InterruptedException e) {
						break;
					}
				}
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public void start() {
		Thread t = null;
		try {
			sock = new Socket("127.0.0.1", 9000);
			System.out.println("127.0.0.1 서버 접속에 성공하였습니다.");
			cin = new BufferedReader(new InputStreamReader(System.in));
			sout = new PrintWriter(new BufferedWriter(new OutputStreamWriter(sock.getOutputStream())));
			sin = new BufferedReader(new InputStreamReader(sock.getInputStream()));		
			t = new Receiver();
			t.start();
			
			while (true) {
				String sendMessage = cin.readLine();
				sout.println(sendMessage);
				sout.flush();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			t.interrupt();
			try { sock.close(); } catch (Exception e) {}
		}
	}

	public static void main(String[] args) {
		Client client = new Client();
		client.start();
	}
}
