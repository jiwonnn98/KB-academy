package kb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")


public class LoginServlet extends HttpServlet {
	
	private String dbId, dbPwd;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        System.out.println("LoginServlet Constructor");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("userId");
		String pwd = request.getParameter("userPwd");
		String name = request.getParameter("userName");
		
		dbId = "jiwon";
		dbPwd = "jiwon";
		
		
		if(dbId.equals(id) && dbPwd.equals(pwd)) {
			
			
			HttpSession session = request.getSession();
			
			session.setAttribute("userId", id);
			session.setAttribute("userName", name);
			long time = session.getLastAccessedTime();
			session.setAttribute("time", time);
			
			response.sendRedirect( "LoginOk.jsp");
			
			
		}else {	
			response.setContentType("text/html; charset=UTF-8");
			//오류메시지
			PrintWriter out = response.getWriter();
			out.print("<script>"
					+ "alert('"+name+"님 정보를 다시 확인해주세요.');"
					+ "location.href = 'LoginForm.html';"
					+ "</script>"
					
					);
			//폼으로 다시 이동
			
			response.sendRedirect("LoginForm.html");
			
		}
	}


}
