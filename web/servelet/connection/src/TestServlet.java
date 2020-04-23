import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;


@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
   private static final long serialVersionUID = 1L;
       
  
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      
      Connection con = null;
      Statement stmt = null;
      ResultSet rs = null;
      try {
         InitialContext ic = new InitialContext();
         DataSource ds = (DataSource)ic.lookup("java:comp/env/jdbc/servlet");
         con = ds.getConnection();
         stmt = con.createStatement();
         rs = stmt.executeQuery("SELECT * FROM members");
         while(rs.next()) {
            System.out.printf("%-20s%-10s%s\n", 
                  rs.getString("email"), 
                  rs.getString("nick"), 
                  rs.getString("regdate"));
         }
         
      }
      catch(NamingException e) {
         e.printStackTrace();
      }
      catch(SQLException e) {
         e.printStackTrace();
      }
      finally {
         try {rs.close();} catch(Exception e) {}//´Ý±â
         try {stmt.close();} catch(Exception e) {}//´Ý±â
         try {con.close();} catch(Exception e) {} //jndi ¼­¹ö¿¡ ¹Ý³³ÇÏ´Â°Í
      }
      
   }

   
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      // TODO Auto-generated method stub
      doGet(request, response);
   }

}