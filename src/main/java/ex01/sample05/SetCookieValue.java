package ex01.sample05;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/set")
public class SetCookieValue extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("text/html; charset=utf-8");
		PrintWriter out = resp.getWriter();
		
		//날짜 객체
		Date d = new Date(0);
		
		//쿠키 객체
		Cookie c = new Cookie("cookieTest", URLEncoder.encode("JSP프로그래밍", "utf-8"));
		c.setMaxAge(60*60*24); // 하루 분 유효시간 설정
//		c.setMaxAge(2); // 2초 유효시간 설정
//		c.setMaxAge(-1); // 유효시간(제한 시간이 없음) 클라이언트 Session 쿠키
		
		//클라이언트에게 전달
		resp.addCookie(c);
		out.print("현재시간 : "+d);
		out.print("<br>");
		out.print("문자열을 Cookie에 저장합니다.");
		
	}
	
	//세션 트래킹 : 쿠키 / 세션
	//javax.servlet.http.Cookie
	
}
