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
			System.exit(1);//0�� ���������� ��
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
			
			serverSocket=new ServerSocket(portNumber);//�������̶�� ��Ʈ �ѹ��� �ָ� �ڵ����� ���ε��� �ȴ�.
			System.out.println("server waiting at/"+portNumber);
				
			while(true) {
				Socket clientSocket=null;//����� �� ������ �ۿ��� ����Ϸ���
				
					try {//while �ȿ��� try�ϴ� ������ �ȿ��� ���ܰ� ���ܵ� ��� go�ϱ� ����
					clientSocket=serverSocket.accept();//client socket�� ��ȯ�Ѵ�.
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
						System.out.println("��ǰ�ڵ� : " + strBuffer.substring(0, 10));
						strBuffer.delete(0, 10);
						System.out.println("��ǰ���� : " + strBuffer.substring(0, 4));
						strBuffer.delete(0, 4);
						System.out.println("��ǰ���� : " + strBuffer.substring(0, 10));	
						strBuffer.delete(0, 10);
					}	
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {serverSocket.close();}catch(Exception e) {} //���������� ������ �ݾ��ָ� �� Ŭ���̾�Ʈ �� Ŭ���̾�Ʈ�� ���� ����
		}
	}
}
