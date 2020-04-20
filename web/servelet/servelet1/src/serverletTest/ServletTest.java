package serverletTest;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class ServletTest extends HttpServlet {
   private static final long serialVersionUID = 1L;
       

   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      request.setCharacterEncoding("UTF-8");
      response.setContentType("text/html; charset=UTF-8");
      PrintWriter out = null;
      Connection con = null;
      PreparedStatement pstmt = null;
      
      try {
         out = response.getWriter();
         Class.forName("org.mariadb.jdbc.Driver");
         String email = request.getParameter("email");
         String pass = request.getParameter("pass");
         String nick = request.getParameter("nick");
         
         if(email.trim().equals("")) {
            throw new Exception("�����ּҰ� �Էµ��� �ʾҽ��ϴ�.");
         }
         
         if(pass.trim().equals("")) {
            throw new Exception("��й�ȣ�� �Էµ��� �ʾҽ��ϴ�.");
         }
         
         if(nick.trim().equals("")) {
            throw new Exception("�г����� �Էµ��� �ʾҽ��ϴ�.");
         }
         
         String url = "jdbc:mariadb://localhost:3306/servlet?user=servlet&password=1234";
         con = DriverManager.getConnection(url);
         
         
         String sql = "INSERT INTO members(email, pass, nick) VALUES (?, PASSWORD(?),?)";
         pstmt = con.prepareStatement(sql);
         pstmt.setString(1,  email);
         pstmt.setString(2, pass);
         pstmt.setString(3, nick);
         if( pstmt.executeUpdate() == 0) {
            throw new Exception("ȸ������ ó���� �����Ͽ����ϴ�.");
         }
         out.println("ȸ�������� ���������� ó���Ǿ����ϴ�.");
         
      }
      catch(ClassNotFoundException e) {
         e.printStackTrace();
         out.println("MariaDB JDBC ����̹��� ��ġ���� �ʾҽ��ϴ�.");
      }
      catch(SQLException e) {
         e.printStackTrace();
         out.println("�����ͺ��̽� ���� ������ �߻��Ͽ����ϴ�.");
      }
      
      catch(Exception e) {
         e.printStackTrace();
         out.println(e.getMessage());
      }
      finally {
         try { pstmt.close();} catch(Exception e) {}
         try { con.close();} catch(Exception e) {}
      }
   }
}	