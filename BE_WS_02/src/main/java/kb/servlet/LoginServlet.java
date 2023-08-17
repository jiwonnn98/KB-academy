package kb.servlet;

import java.io.IOException;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet(
		urlPatterns = { "/login" }, 
		initParams = { 
				@WebInitParam(name = "dbId", value = "jiwon"), 
				@WebInitParam(name = "dbPwd", value = "jiwon")
		}, loadOnStartup = 1)
public class LoginServlet extends HttpServlet {
	private String dbId, dbPwd;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
       
    }
    
    @Override
    public void init() throws ServletException {
    	dbId = ;
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		String userId = request.getParameter("userId");
		String userPwd = request.getParameter("userPwd");
		String userName = request.getParameter("userName");
		
		
		if(dbId.equals(userId) && dbPwd.equals(userPwd)) {
			HttpSession session = request.getSession();
			
			session.setAttribute("sessionId", userId);
			session.setAttribute("sessionName", userName);
			//session.setAttribute("sessionTime", new Date(session.getLastAccessedTime()).toLocaleString());
			Calendar now = Calendar.getInstance();
			int year = now.get(Calendar.YEAR);
			int month = now.get(Calendar.MONTH)+1;
			int date = now.get(Calendar.DATE);
			
			int h = now.get(Calendar.HOUR);
			int m = now.get(Calendar.MINUTE);
			int s = now.get(Calendar.SECOND);
			
			StringBuilder sb  = new StringBuilder();
			sb.append(year + "년");
			sb.append(month + "월");
			sb.append(date + "일");
			sb.append(h + ":");
			sb.append(m + ":");
			sb.append(s);
			
			
			session.setAttribute("sessionTime", sb.toString());
			response.sendRedirect("LoginOk.jsp");
			
		}
	}

}
