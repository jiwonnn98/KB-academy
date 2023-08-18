package kb.listener;

import java.util.concurrent.atomic.AtomicInteger;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;


@WebListener
public class UserAccessCounterListener implements ServletContextListener, HttpSessionListener {

    private ServletContext application;
    public UserAccessCounterListener() {
       System.out.println("UserAccessCounterListener Constructor call.....");
    }

    public void contextDestroyed(ServletContextEvent sce)  { }

	/**
	 * 서버가 시작될때...
	 * */
   public void contextInitialized(ServletContextEvent e)  { 
         application = e.getServletContext();
        application.setAttribute("count", new AtomicInteger()); //뷰에서 ${applicationScope.count}
   }
	
   /**
    * 세션이 시작될때 count 증가
    * */
    public void sessionCreated(HttpSessionEvent se)  { 
         AtomicInteger at = (AtomicInteger)application.getAttribute("count");    
         int nowCount = at.incrementAndGet();
         System.out.println("증가 한 후 (현재 접속자 수) = " + nowCount + "명");
    }

	/**
	 * 세션의 종료될때 count 감소
	 * */
    public void sessionDestroyed(HttpSessionEvent se)  { 
    	 AtomicInteger at = (AtomicInteger)application.getAttribute("count");  
    	 int nowCount = at.decrementAndGet();
    	 System.out.println("감소 한 후 (현재 접속자 수) = " + nowCount + "명");
    }

	
   
	
}
