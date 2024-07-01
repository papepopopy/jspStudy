package ex01.sample05;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/sess")
public class SesstionTest extends HttpServlet {
	//세션
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=utf-8;");
		PrintWriter out = resp.getWriter();
		
		HttpSession session = req.getSession();
		
		out.print("세션 id : "+session.getId()+"<br>");
		out.println("최초 세션 생성 시간 : " + session.getCreationTime() + "<br>");
		out.println("최근 세션 근접 시간 : " + session.getLastAccessedTime() + "<br>");
		
//		session.setMaxInactiveInterval(5); //유효 시간 설정 web.xml에서도 가능
		out.println("세션 유효 시간 : " + session.getMaxInactiveInterval() + "<br>");
		
		
		if (session.isNew())
			out.print("새 세션이 만들어졌습니다.");
		
		// 세션 객체 강제로 삭제
//		session.invalidate();
	}
	
}
