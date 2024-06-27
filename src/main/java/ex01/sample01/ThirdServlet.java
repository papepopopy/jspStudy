package ex01.sample01;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/third")

public class ThirdServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	@Override
	public void init() throws ServletException {
		// 서블릿 요청 처음 한번만 호출
		System.out.println("ThirdServlet init() 메서드 호출");
		
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 서블릿 요청(get) 시 매번 호출
		System.out.println("ThirdServlet doGet() 메서드 호출");
		doHandle(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 서블릿 요청(get) 시 매번 호출
		System.out.println("ThirdServlet doPost() 메서드 호출");
	}
	@Override
	public void destroy() {
		// 서블릿 기능 수행후 메모리 소멸 시 호출
		System.out.println("ThirdServlet destory() 메서드 호출");
	}
	
	private void doHandle(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 서블릿 요청(get) 시 매번 호출
		System.out.println("ThirdServlet doHandle() 메서드 호출");
		
	}
}
