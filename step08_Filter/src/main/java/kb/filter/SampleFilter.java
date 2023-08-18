package kb.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * 필터 생성 +  매핑
 * 1) web.xml
 * 
 * 2)@annotation
 */
public class SampleFilter implements Filter {

	
	public SampleFilter() {
		System.out.println("con");
	}
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("init");
		String message = filterConfig.getInitParameter("message");
		System.out.println("message = " + message);
	}
	
	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
		//사전처리
		System.out.println("사전처리");
		
		
		chain.doFilter(req, res);
		
		//사후처리
		System.out.println("사후처리");
		
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy");
	}

}
