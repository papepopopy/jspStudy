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
@WebServlet("/getscope")
public class GetServletScope extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("text/html; charset = utf-8");
		PrintWriter out = resp.getWriter();
		
		ServletContext ctx = getServletContext();
		HttpSession session = req.getSession();
		
		String ctxMesg = (String) ctx.getAttribute("context");
		String sesMesg = (String) session.getAttribute("session");
		String reqMesg = (String) req.getAttribute("request");
		
		out.println(ctxMesg);
		out.println(sesMesg);
		out.println(reqMesg);
	}
}