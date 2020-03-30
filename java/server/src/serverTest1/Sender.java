package serverTest1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Sender {
	// java Sender [�����ּ�] ��Ʈ��ȣ
	
	public static void main(String[] args) {
		
		if (!(args.length == 1 || args.length == 2)) {
			System.err.println("�߸��� ������Դϴ�.");
			System.err.println("����> java Sender [�����ּ�] ��Ʈ��ȣ");
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
				System.err.println(args[0] + "ȣ��Ʈ�� ã�� �� �����ϴ�.");
				System.exit(2);
			}
			posPort++;
		}
		
		try {
<<<<<<< HEAD
			portNumber = Integer.parseInt(args[posPort]);//arg�� string Ÿ���̹Ƿ� int�� �ٲ��ش�.
=======
			portNumber = Integer.parseInt(args[posPort]);
>>>>>>> 5334b827d51c6f06d33a984fdbcc5866c692d5e9
			if (portNumber < 1 || portNumber > 65535) {
				System.err.println("�߸��� ��Ʈ��ȣ�Դϴ�.");
				System.err.println("���������� ��Ʈ��ȣ�� [1 ~ 65535]�Դϴ�.");
				System.exit(4);
			}
		}
		catch (NumberFormatException e) {
			System.err.println("�߸��� ��Ʈ��ȣ�Դϴ�.");
			System.exit(3);
		}
		
		Socket socket = null;
		OutputStream out = null;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
<<<<<<< HEAD
		//try�� �ۿ��� �� �������� try���� ���� ����.
		try {
			socket = new Socket(ia, portNumber);
			//������ ���鶧 �����ڴ� �پ��ϴ�. ũ�� �з����ڸ� �ڵ����� ������ ��Ʈ�� �������ִ� �����ڰ� �ִ°� �ϸ�(�μ��ΰ� �̻� ���) �ڵ����� �����ϴ� ����� ���� �����ڵ� �ִ�.
			//�����ϸ� Ư�� ��Ʈ���� accpet�� �Ѱ� ��ٸ��� �ִ� �������� ������ �´�.
=======
		try {
			socket = new Socket(ia, portNumber);
>>>>>>> 5334b827d51c6f06d33a984fdbcc5866c692d5e9
			System.out.println(ia.getHostName() + "������ �����Ͽ����ϴ�.");
			out = socket.getOutputStream();
			
			while (true) {
				StringBuffer sb = new StringBuffer(128);
<<<<<<< HEAD
				sb.append(Character.toChars(2));
				//�׳� �������� 2�ᵵ �ɵ�, stx�� �ǹ��Ѵ�. ������ in�� char�迭�� �ٲٰ� �װ��� append�� ���ۿ� ������ ���̴�.(string ���ں����� �μ��ε� ������ �������)
=======
				sb.append(Character.toChars(0x02));
>>>>>>> 5334b827d51c6f06d33a984fdbcc5866c692d5e9
				
				System.out.print("��ǰ�ڵ� : ");	// 10�ڸ�
				String code = in.readLine();
				code = code.substring(0, (code.length() < 10) ? code.length() : 10).toUpperCase();
<<<<<<< HEAD
				//�˸°� �ڸ��� ��
				code = String.format("%-10s", code);
				sb.append(code);
				
				while (true) {	
=======
				code = String.format("%10s", code);
				sb.append(code);
				
				while (true) {
>>>>>>> 5334b827d51c6f06d33a984fdbcc5866c692d5e9
					try {
						System.out.print("��ǰ���� : ");	// 4�ڸ�
						String unitCount = in.readLine();
						int count = Integer.parseInt(unitCount);
						if (count < 1 || count > 9999) {
							throw new Exception("������ �߸� �Է��Ͽ����ϴ�. ������ 1 ~ 9999���� �Է��� �� �ֽ��ϴ�.");
						}
<<<<<<< HEAD
						sb.append(String.format("%-4d", count));
						//���⼭ �ܼ� ���� �����Ӹ� �ƴ϶� string���� �ٲپ� �ִ� ��Ȱ�� ���ÿ� �Ѵ�.
						break;
					}
					catch (NumberFormatException e) {//by parse int
=======
						sb.append(String.format("%4d", count));
						break;
					}
					catch (NumberFormatException e) {
>>>>>>> 5334b827d51c6f06d33a984fdbcc5866c692d5e9
						System.err.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��� �ּ���.");
					}
					catch (Exception e) {
						System.err.println(e.getMessage());
					}
				}
				
				while (true) {
					try {
						System.out.print("��ǰ���� : ");	// 10�ڸ�
						String unitPrice = in.readLine();
						int price = Integer.parseInt(unitPrice);
						if (price < 0 || price > Integer.MAX_VALUE) {
							throw new Exception("������ �߸� �Է��Ͽ����ϴ�. ������ 0 ~ " + Integer.MAX_VALUE + "���� �Է��� �����մϴ�.");
						}
<<<<<<< HEAD
						sb.append(String.format("%-10d", price));
=======
						sb.append(String.format("%10d", price));
>>>>>>> 5334b827d51c6f06d33a984fdbcc5866c692d5e9
						break;
					}
					catch (NumberFormatException e) {
						System.err.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��� �ּ���.");
					}
					catch (Exception e) {
						System.err.println(e.getMessage());
					}
				}
				
<<<<<<< HEAD
				sb.append(Character.toChars(3));
=======
				sb.append(Character.toChars(0x03));
>>>>>>> 5334b827d51c6f06d33a984fdbcc5866c692d5e9
				
				out.write(sb.toString().getBytes());
				
				System.out.print("��� �����Ͻðڽ��ϱ� ([y]/n)?");
				String str = in.readLine();
				if (str.trim().toLowerCase().equals("n")) {
					// ������ �۽� ���Ḧ ��Ÿ���� �ǹ̷ν� EOT�� ����
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
















