package kb.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;


@WebListener
public class SessionListener implements HttpSessionListener {
   
    public SessionListener() {
        System.out.println("SessionListener Constructor call....");
    }

	
    public void sessionCreated(HttpSessionEvent se)  { 
         System.out.println("SessionListener sessionCreated call....");
    }

	/**
	 * 세션의 종료될때 호출
	 *   1) session.invaildate();
	 *   2) session timeout 되었을때
	 *   
	 *   3) 브라우져의 x 를 클릭했을때 호출되지 않는다. 
	 * */
    public void sessionDestroyed(HttpSessionEvent se)  { 
         System.out.println("SessionListener sessionDestroyed call.....");
    }
	
}
