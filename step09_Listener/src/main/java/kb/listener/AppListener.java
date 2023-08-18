package kb.listener;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class AppListener implements ServletContextListener{
	
	public AppListener() {
		System.out.println("AppListener 생성자 호출.....");
	}

	/**
	 * 서버가 start될 때 호출
	 * 	- 사전 초기화
	 */
	@Override
	public void contextInitialized(ServletContextEvent e) {
	   System.out.println("AppListener Initialized call.....");	
	   
	   //각 나라별 국가코드를 모든 영역에서 사용할수 있도록 미리 map저장한다.
	   Map<String, String> map = new HashMap<String, String>();
	   map.put("kr", "대한민국");
	   map.put("cn", "중국");
	   map.put("fr", "프랑스");
	   map.put("us", "미국");
	   map.put("jp", "일본");
	   
	   //저장된 map은 현재 클래스에서만 사용할수 있기때문에 ServletContext영역에 저장해야한다.
	   ServletContext application = e.getServletContext();
	   application.setAttribute("nationMap", map);//모든 뷰영역에서 ${applicationScope.nationMap}
	   
	   
	}
	
	/**
	 * 서버가 종료될 때 호출
	 */
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("AppListener contextDestroyed call.....");
	}

	
    
}
