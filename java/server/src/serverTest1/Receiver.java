package serverTest1;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Receiver {
	public static final char STX = '\u0002';
	public static final char ETX = '\u0003';
	public static final char EOT = '\u0004';
	public static void main(String[]args) {
		ServerSocket serverSocket=null;
		InputStream in=null;
		
		if(args.length!=1) {
			System.err.println("wrong behavior please input port");
			System.exit(1);//0이 정상종료인 듯
		}
		int portNumber=0;
		try {
			portNumber=Integer.parseInt(args[0]);
			if(portNumber<1||portNumber>65535) {
				System.out.println("portNumber is out of range please input 1~65535");
				System.exit(3);
			}
		}catch(NumberFormatException e) {
			System.out.println("wrong port number please input integer");
			System.exit(2);
		}
		try {
			
			serverSocket=new ServerSocket(portNumber);//정상적이라면 포트 넘버를 주면 자동으로 바인딩이 된다.
			System.out.println("server waiting at/"+portNumber);
				
			while(true) {
				Socket clientSocket=null;//여기로 뺀 이유는 밖에서 사용하려고
				
					try {//while 안에서 try하는 이유는 안에서 예외가 생겨도 계쏙 go하기 위해
					clientSocket=serverSocket.accept();//client socket을 반환한다.
					System.out.println(clientSocket.getInetAddress().getHostName()+" is connet to server");
					in=clientSocket.getInputStream();
					
					byte[] buffer=new byte[128];
					
					
					while (true) {
						in.read(buffer);					
						StringBuffer strBuffer = new StringBuffer(new String(buffer));
	
						if(strBuffer.indexOf(""+EOT)==0) {
							System.out.println(clientSocket.getInetAddress().getHostName()+"/done");
							break;
						}
						if (strBuffer.indexOf(""+STX) < 0||strBuffer.indexOf(""+ETX) < 0) {
							System.out.println(clientSocket.getInetAddress().getHostName()+"/something problem");
							break;

						}
						
						strBuffer.delete(0, 1);
						System.out.println("제품코드 : " + strBuffer.substring(0, 10));
						strBuffer.delete(0, 10);
						System.out.println("제품수량 : " + strBuffer.substring(0, 4));
						strBuffer.delete(0, 4);
						System.out.println("제품가격 : " + strBuffer.substring(0, 10));	
						strBuffer.delete(0, 10);
					}	
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {serverSocket.close();}catch(Exception e) {} //서버에서는 서버만 닫아주면 됨 클라이언트 는 클라이언트가 닫을 거임
		}
	}
}
