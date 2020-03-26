package netWorkTest1;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class AppStart {
	public static void main(String[] args) {

		try {
			InetAddress ia=InetAddress.getByName("www.google.com");
			byte[]addr=ia.getAddress();
			
			for(int i=0;i<addr.length;i++) {
				if(i>0)System.out.print(".");
				System.out.print(Byte.toUnsignedInt(addr[i]));
			}
	
		}catch(UnknownHostException e) {
			
		}


	}
}
