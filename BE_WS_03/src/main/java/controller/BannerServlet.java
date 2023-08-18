package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import service.BannerService;
import service.BannerServiceImpl;

/**
 * Servlet implementation class BannerServlet
 */
@WebServlet("/banner")




public class BannerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static BannerService bannerService = BannerServiceImpl.getInstance();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BannerServlet() {
        System.out.println("Banner Servlet Constructor...");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		try {
			   List<String> list = bannerService.listBanner();

			   Gson gson = new Gson();
			   String jsonArray = gson.toJson(list);
			   
			   PrintWriter out = response.getWriter();
			   out.print(jsonArray);
			   
		   }catch(Exception e) {
			   e.printStackTrace();
		   }
	}

}
