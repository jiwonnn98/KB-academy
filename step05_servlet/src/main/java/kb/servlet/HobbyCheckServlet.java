package kb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HobbyCheckServlet extends HttpServlet {
	
	public HobbyCheckServlet() {
		System.out.println("hobby servlet constructor");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("service");
		resp.setContentType("text/html;charset=UTF-8");
		req.setCharacterEncoding("UTF-8");

		String name = req.getParameter("name");
		String age = req.getParameter("age");
		String hobby = req.getParameter("hobby");
		
		String[] hobbys = req.getParameterValues("hobby");
		
		System.out.println("name : "+ name);
		System.out.println("age : "+ age);
		System.out.println("hobby : "+ hobby);
		
		PrintWriter out = resp.getWriter();
		out.print("<html>");
		out.print("<head><title>Hobby Check</title></head>");
		out.print("<body>");
		out.println("<h1 style='color:red'>이름 : "+name +"</h1>"
				+ "<br>나이 : " + age
				+ "<br>취미 : " + hobby
				+ "<br>취미 : "+ hobbys);
		
		for(String h : hobbys) {
			out.print(h + " ");
		}
		out.print("</body>");
		out.print("</html>");

	}
//	@Override
//	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		System.out.println("get");
//	}
//	
//	@Override
//	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		System.out.println("post");
//	}
}
