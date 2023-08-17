package kb.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import dto.Member;

/**
 * Servlet implementation class AjaxTestServlet
 */
@WebServlet("/ajax")
public class AjaxTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=UTF-8");
		String key = request.getParameter("key");
		if(key.equals("text")) {
			this.text(request, response);
		}else if(key.equals("json")) {
			this.json(request, response);
		}else if(key.equals("dto")) {
			this.dto(request, response);
		}else if(key.equals("list")) {
			this.list(request, response);
		}else if(key.equals("map")) {
			this.map(request, response);
		}else {
			this.property(request, response);
		}
		
	}
	
	public void text(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		
		PrintWriter out = response.getWriter();
		out.print(name +"님 Welcome!");
		
	}
	
	public void json(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<String> menus =  Arrays.asList("누가바", "돼지바", "붕어싸만코", "와삭바");
		Gson gson = new Gson();
		String jsonArray = gson.toJson(menus);
		System.out.println(jsonArray);
		
		PrintWriter out = response.getWriter();
		out.print(jsonArray);
		
	}
	
	public void dto(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String addr = request.getParameter("addr");
		
		
		System.out.println(id +" , " + name + " , " + addr);
		
		Member member = new Member(id, name + "님", 50, addr);
		Gson gson = new Gson();
		String jsonArray = gson.toJson(member);
		System.out.println("jsonArray : " + jsonArray);
		
		PrintWriter out = response.getWriter();
		out.print(jsonArray);
		
	}
	
	public void list(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Member> list = new ArrayList<>();
		list.add(new Member("jiwon", "jiwon", 18, "jeju"));
		list.add(new Member("jiwo", "지원", 18, "jeju"));
		list.add(new Member("jiwo3123n", "지수", 18, "jeje"));
		list.add(new Member("jiqwewon", "지연", 18, "jeju"));
		
		Gson gson = new Gson();
		String jsonArray = gson.toJson(list);
		System.out.println("jsonArray : " + jsonArray);
		
		PrintWriter out = response.getWriter();
		out.print(jsonArray);
		
	}
	
	public void map(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Map<String, Object> map = new HashMap<>();
		map.put("message", "aAAa");
		map.put("pageNo", 10);
		map.put("dto",new Member("jiwon", "jiwon", 18, "jeju"));
		
		List<Member> list = new ArrayList<>();
		list.add(new Member("jiwon", "jiwon", 18, "jeju"));
		list.add(new Member("jiwo", "지원", 18, "jeju"));
		list.add(new Member("jiwo3123n", "지수", 18, "jeje"));
		list.add(new Member("jiqwewon", "지연", 18, "jeju"));
		
		map.put("memberList", list);
		
		Gson gson = new Gson();
		String jsonArray = gson.toJson(map);
		System.out.println(jsonArray);
		
		PrintWriter out = response.getWriter();
		out.print(jsonArray);
	}
	
	public void property(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int age = Integer.parseInt(request.getParameter("age"));
		//문자열을 json 형태로 전송
		Gson gson =new Gson();
		JsonObject obj = new JsonObject();
		
		if(age>18) {
			obj.addProperty("info", "성인");
		}else {
			obj.addProperty("info", "미성년자");
		}
		
		String jsonArray = gson.toJson(obj);
		
		PrintWriter out = response.getWriter();
		out.print(jsonArray);
	}

}
