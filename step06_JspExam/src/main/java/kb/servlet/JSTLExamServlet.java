package kb.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JSTLExamServlet
 */
@WebServlet(
		urlPatterns = { 
				"/JSTLExamServlet", 
				"/info"
		}, 
		initParams = { 
				@WebInitParam(name = "id", value = "jung")
		}, loadOnStartup = 1)
public class JSTLExamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println();
	}

}
