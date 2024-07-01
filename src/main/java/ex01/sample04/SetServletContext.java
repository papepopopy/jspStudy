package ex01.sample04;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/cset")
public class SetServletContext extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=utf-8");
		PrintWriter writer = resp.getWriter();
		
		ServletContext ctx = getServletContext();
		
		List list = new ArrayList();
		list.add("이순신");
		list.add(10);
		
		ctx.setAttribute("memberInfo", list);
		
		writer.print("<html><body>");
		writer.print("이순신");
		writer.print("</body></html>");
	}
	
}
