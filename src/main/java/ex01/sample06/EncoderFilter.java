package ex01.sample06;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;

@SuppressWarnings("serial")
@WebFilter("/Loginfilter")
//@WebFilter("/*")
public class EncoderFilter extends HttpFilter implements Filter {
       
	ServletContext ctx;
    public EncoderFilter() {
    	//생성자
    }

	public void destroy() {
		//필터 소멸시 종료
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("doFilter()");
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		String ctx = ((HttpServletRequest)request).getContextPath();
		String pathInfo = ((HttpServletRequest)request).getRequestURI();
		String realPath = request.getRealPath(pathInfo);
		
		String msg = "Contex 정보 : " + ctx 
				+ "<br> URI 정보 : " + pathInfo 
				+ "<br> 물리적 경로" + realPath;
		System.out.println(msg);
		
		chain.doFilter(request, response);
	}

	public void init(FilterConfig fConfig) throws ServletException {
		//필터 생성시 초기화
		System.out.println("filter init()");
		
		ctx = fConfig.getServletContext();
	}

}
