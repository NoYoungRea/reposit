package netWorkTest1;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class AppStart {
	public static void main(String[] args) {

		try {
			InetAddress[] ia=InetAddress.getAllByName("www.naver.com");
			for(InetAddress g:ia)
				System.out.println(g.getHostAddress());			

		}catch(UnknownHostException e) {
			
		}


	}
}
