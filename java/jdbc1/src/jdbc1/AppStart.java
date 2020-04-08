package jdbc1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AppStart {
	public static void main(String[]args) {
		Connection con=null;
		String url="jdbc:mariadb://127.0.0.1:3306/shdudfoils";
		String user="shdudfoils";
		String pass="1234";
		try {
			Class.forName("org.mariadb.jdbc.Driver");
//forname�� Ŭ���� �δ��� ȣ���Ų��.
			System.out.println("jdbc ����̹��� drivermanager�� ����Ͽ����ϴ�.");
			con=DriverManager.getConnection(url,user,pass);
			System.out.println("�����ͺ��̽� ������ ���������� ������");
		} catch (ClassNotFoundException e) {
			System.err.println("jdbc ����̹� �˻��� �����Ͽ����ϴ�.");
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try{con.close();}catch(Exception e) {}
			//null�̶� sqlexception
		}
	}
}
//���� ��Ƽ ����̹��� ����ϱ� ���ؼ��� 
//1. ������Ʈ �ȿ� �ִ´�. ���� �佺���� �߰� but �̰Ŵ� ��Ŭ���� �ȿ����� �õ��� �����ϴ�.(cmd�� ��Ʈ ������ jre system��)
//2. jre�� ���� �߰�

//����̹� �޴����� ���� �Ͽ� ����̹��� �ν��Ͻ��� ����� ���� �ƴ϶� ����̹� ��ü�� �ν��Ͻ��� ���� �Ŵ������� �ѱ��.(�ܺο����� �� ����� �̱������� ����)
