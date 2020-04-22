

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class a implements ServletContextListener {

    public void contextDestroyed(ServletContextEvent sce)  { 
    	System.out.println("server dead");

    }

    public void contextInitialized(ServletContextEvent sce)  { 
       	ServletContext sc=sce.getServletContext();
    	sc.setAttribute("servername", "aaa");
 
    	System.out.println("server start");
    }
	
}
