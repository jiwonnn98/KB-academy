package kb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginCheckServlet extends HttpServlet {
	
	public LoginCheckServlet() {
		//Servlet Constructor
		
		System.out.println("LoginServlet Contructor");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String dbId = "jiwon";
		String dbPwd = "jiwon";
		
		String id = req.getParameter("userId");
		String pwd = req.getParameter("userPwd");
		
		if(id.equals(dbId) && pwd.equals(dbPwd)) {
			req.getRequestDispatcher("LoginOk.jsp").forward(req, resp);
			System.out.println("일치");
		}else {		
		}
	}	
	
}
