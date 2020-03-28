package serverTest1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Sender {
	// java Sender [서버주소] 포트번호
	
	public static void main(String[] args) {
		
		if (!(args.length == 1 || args.length == 2)) {
			System.err.println("잘못된 명령행입니다.");
			System.err.println("사용법> java Sender [서버주소] 포트번호");
			System.exit(1);
		}
		
		int portNumber = 0;
		int posPort = 0;
		InetAddress ia = InetAddress.getLoopbackAddress();
		
		if (args.length == 2) {
			try {
				ia = InetAddress.getByName(args[0]);
			}
			catch (UnknownHostException e) {
				System.err.println(args[0] + "호스트를 찾을 수 없습니다.");
				System.exit(2);
			}
			posPort++;
		}
		
		try {
			portNumber = Integer.parseInt(args[posPort]);//arg는 string 타입이므로 int로 바꿔준다.
			if (portNumber < 1 || portNumber > 65535) {
				System.err.println("잘못된 포트번호입니다.");
				System.err.println("지정가능한 포트번호는 [1 ~ 65535]입니다.");
				System.exit(4);
			}
		}
		catch (NumberFormatException e) {
			System.err.println("잘못된 포트번호입니다.");
			System.exit(3);
		}
		
		Socket socket = null;
		OutputStream out = null;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		//try절 밖에서 쓸 변수들은 try절로 묶지 말자.
		try {
			socket = new Socket(ia, portNumber);
			//소켓을 만들때 생성자는 다양하다. 크게 분류하자면 자동으로 소켓을 포트에 연결해주는 생성자가 있는가 하면(인수두개 이상 고려) 자동으로 연결하는 기능이 없는 생성자도 있다.
			//연결하면 특정 포트에서 accpet를 켜고 기다리고 있는 서버에서 반응이 온다.
			System.out.println(ia.getHostName() + "서버에 접속하였습니다.");
			out = socket.getOutputStream();
			
			while (true) {
				StringBuffer sb = new StringBuffer(128);
				sb.append(Character.toChars(2));
				//그냥 십진수로 2써도 될듯, stx를 의미한다. 저것은 in를 char배열로 바꾸고 그것을 append로 버퍼에 저장한 것이다.(string 문자벼열을 인수로둔 생성자 방식으로)
				
				System.out.print("제품코드 : ");	// 10자리
				String code = in.readLine();
				code = code.substring(0, (code.length() < 10) ? code.length() : 10).toUpperCase();
				//알맞게 자르는 중
				code = String.format("%10s", code);
				sb.append(code);
				
				while (true) {
					try {
						System.out.print("제품수량 : ");	// 4자리
						String unitCount = in.readLine();
						int count = Integer.parseInt(unitCount);
						if (count < 1 || count > 9999) {
							throw new Exception("수량을 잘못 입력하였습니다. 수량은 1 ~ 9999까지 입력할 수 있습니다.");
						}
						sb.append(String.format("%4d", count));
						//여기서 단순 형식 지정뿐만 아니라 string으로 바꾸어 주는 역활도 동시에 한다.
						break;
					}
					catch (NumberFormatException e) {//by parse int
						System.err.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
					}
					catch (Exception e) {
						System.err.println(e.getMessage());
					}
				}
				
				while (true) {
					try {
						System.out.print("제품가격 : ");	// 10자리
						String unitPrice = in.readLine();
						int price = Integer.parseInt(unitPrice);
						if (price < 0 || price > Integer.MAX_VALUE) {
							throw new Exception("가격을 잘못 입력하였습니다. 가격은 0 ~ " + Integer.MAX_VALUE + "까지 입력이 가능합니다.");
						}
						sb.append(String.format("%10d", price));
						break;
					}
					catch (NumberFormatException e) {
						System.err.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
					}
					catch (Exception e) {
						System.err.println(e.getMessage());
					}
				}
				
				sb.append(Character.toChars(3));
				
				out.write(sb.toString().getBytes());
				
				System.out.print("계속 전송하시겠습니까 ([y]/n)?");
				String str = in.readLine();
				if (str.trim().toLowerCase().equals("n")) {
					// 서버에 송신 종료를 나타내는 의미로써 EOT를 전송
					char eot='\u0004';
					out.write((eot+"").getBytes());
					
					break;					
				}
				
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try { socket.close(); } catch (Exception e) {}
		}
	}
}
















