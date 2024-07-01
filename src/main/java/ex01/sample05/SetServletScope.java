package ex01.sample05;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/setscope")
public class SetServletScope extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//-----------------------------
		String context = req.getContextPath();
		String url = req.getRequestURL().toString(); //문자형으로 변경
		String mapping = req.getServletPath();
		String uri = req.getRequestURI();
		
		System.out.println("context : " + context);
		System.out.println("url : " + url);
		System.out.println("mapping : " + mapping);
		System.out.println("uri : " + uri);
		
		//-----------------------------
		
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("text/html; charset = utf-8");
		PrintWriter out = resp.getWriter();
		
		// 어플리케이션에서 브라우저에 관계없이 자원 공유됨
		String ctxMesg = "context에 바인딩됩니다.";
		
		// 어플리케이션에서 브라우저별로 별도로 인식되어 공유되어지지 않음
		String sesMesg = "session에 바인딩됩니다.";
		
		// 같은 어플리케이션에서 요청관계에서만 자원 공유
		String reqMesg = "request에 바인딩됩니다.";
		
		ServletContext ctx = getServletContext();
		HttpSession session = req.getSession();
		
		ctx.setAttribute("context", ctxMesg);
		session.setAttribute("session", sesMesg);
		req.setAttribute("request", reqMesg);
		//음! 모르겠당 ㅎ
		out.println("바인딩을 수행합니다.");
		
		
	}
}
