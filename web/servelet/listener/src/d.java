

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class d implements ServletRequestAttributeListener {

    public void attributeRemoved(ServletRequestAttributeEvent srae)  { 
    	System.out.println("삭제");
    }
    public void attributeAdded(ServletRequestAttributeEvent srae)  { 
    	System.out.println("추가");

    }
    public void attributeReplaced(ServletRequestAttributeEvent srae)  { 
    	System.out.println("대체");

    }
	
}
