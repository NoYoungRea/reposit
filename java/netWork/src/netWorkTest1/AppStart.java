package netWorkTest1;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class AppStart {
	public static void main(String[] args) {

		InetAddress ia = InetAddress.getLoopbackAddress();
		System.out.println(ia.getHostAddress());
		System.out.println(ia.getHostName());

	}
}
