package kb.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class TimerRequestListener
 *
 */
@WebListener
public class TimerRequestListener implements ServletRequestListener {
    long start, end;
    public TimerRequestListener() {
        System.out.println("TimerRequestListener Constructor call....");
    }

    public void requestInitialized(ServletRequestEvent sre)  { 
        System.out.println("TimerRequestListener requestInitialized call...");
        start = System.currentTimeMillis();
    }
    
    public void requestDestroyed(ServletRequestEvent sre)  { 
        System.out.println("TimerRequestListener requestDestroyed call...");
        end = System.currentTimeMillis();
        
        System.out.println("총 소요 ms : " + (end - start) +"ms");
    }

	
    
	
}
