package ex01.sample04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/first01")
public class FirstServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=utf-8");
		PrintWriter writer = resp.getWriter();
		
		//1. redurect 포워딩 기능 / 웹 브라우저에서 재 요청하는 방식
//		resp.sendRedirect("second01");
		
		//2. refresh 포워딩 기능 / 일정 시간 후 서블릿 재 요청
//		resp.addHeader("Refresh", "3; url = second");
		
		//3. location 포워딩 기능 / 자바스크립트 이용
//		writer.print("<script type='text/javascript'>");
//		writer.print("location.href = 'second01'");
//		writer.print("</script>");
		
		//4. 포워딩에서 데이터 전달
//		resp.sendRedirect("second02?name=lee");
		
		//5. dispach 포워딩 기능 / 서버에 포워딩이 진행됨
//		RequestDispatcher dispatcher = req.getRequestDispatcher("second01");
//		RequestDispatcher dispatcher = req.getRequestDispatcher("second02?name=lee");
//		dispatcher.forward(req, resp);
		
		//6. 포워딩 데이터 전달 방식
		// 클라이언트 요청
		// get ; 적은 양 / binding : 많은 양(한번에 보내는 기능)
//		req.setAttribute("address", "부산시");
//		resp.sendRedirect("second03");
		
		// 서버 요청
		RequestDispatcher dispatcher = req.getRequestDispatcher("second03");
		req.setAttribute("age", "10");
		req.setAttribute("address", "부산시");
		dispatcher.forward(req, resp);
	}
}

/*
 * 포워드(forward) 기능
 * : 하나의 서블릿에서 다른 서블릿이나 JSP를 연동하는 방식
 * : 요청에 포함된 정보를 공유
 * : 
 * */
