package ex01.sample04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/initMenu")
public class ContextParamSelvlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=utf-8");
		PrintWriter writer = resp.getWriter();
		
		ServletContext ctx = getServletContext();
		
		String menu_member = ctx.getInitParameter("menu_member");
		String menu_order = ctx.getInitParameter("menu_order");
		String menu_goods = ctx.getInitParameter("menu_goods");
		
		writer.print("<html><body>");
		writer.print("SevletContext 객체 매개변수 데이터 가져오기");
		writer.print(menu_member+ ","  + menu_order + "," +menu_goods);
		writer.print("</body></html>");
	}

}
