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
            throw new Exception("메일주소가 입력되지 않았습니다.");
         }
         
         if(pass.trim().equals("")) {
            throw new Exception("비밀번호가 입력되지 않았습니다.");
         }
         
         if(nick.trim().equals("")) {
            throw new Exception("닉네임이 입력되지 않았습니다.");
         }
         
         String url = "jdbc:mariadb://localhost:3306/servlet?user=servlet&password=1234";
         con = DriverManager.getConnection(url);
         
         
         String sql = "INSERT INTO members(email, pass, nick) VALUES (?, PASSWORD(?),?)";
         pstmt = con.prepareStatement(sql);
         pstmt.setString(1,  email);
         pstmt.setString(2, pass);
         pstmt.setString(3, nick);
         if( pstmt.executeUpdate() == 0) {
            throw new Exception("회원가입 처리에 실패하였습니다.");
         }
         out.println("회원가입이 정상적으로 처리되었습니다.");
         
      }
      catch(ClassNotFoundException e) {
         e.printStackTrace();
         out.println("MariaDB JDBC 드라이버가 설치되지 않았습니다.");
      }
      catch(SQLException e) {
         e.printStackTrace();
         out.println("데이터베이스 서버 오류가 발생하였습니다.");
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