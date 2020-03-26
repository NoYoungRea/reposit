package server1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
	public static void main(String[] args) {
		PrintWriter out = null;
		Socket sock = null;
		BufferedReader cin = null;
		try {
			sock = new Socket("127.0.01", 9000);
			System.out.println("127.0.01 connect");
			out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(sock.getOutputStream())));
			cin = new BufferedReader(new InputStreamReader(System.in));

			while (true) {
				String str = cin.readLine();
				out.println(str);
				out.flush();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			sock.close();
		} catch (Exception e) {

		}

	}
}
