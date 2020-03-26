package netWorkTest1;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class AppStart {
	public static void main(String[] args) {

		try {
			InetAddress ia=InetAddress.getByName("www.google.com");
			System.out.println(ia.getHostAddress());
	
		}catch(UnknownHostException e) {
			
		}


	}
}
