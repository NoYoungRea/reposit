

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class c
 *
 */
@WebListener
public class c implements HttpSessionListener {

    public void sessionCreated(HttpSessionEvent se)  { 
    	HttpSession e=se.getSession();
    	System.out.println("session is made : "+e.getId());
    }
    public void sessionDestroyed(HttpSessionEvent se)  { 
    	HttpSession e=se.getSession();
    	System.out.println("session is destroyed : "+e.getId());
    }
	
}
