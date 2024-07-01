package ex01.sample04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//어노테이션 방식으로 초기값 설정
//load-on-start 기능
@WebServlet(name = "loadconfig", urlPatterns = {"/LoadConfig"}, loadOnStartup = 1) //loadOnStartup => 우선순위
public class LoadAppConfig extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public ServletContext ctx;

	public void init(ServletConfig config) throws ServletException {
		System.out.println("LoadAppconfig init() ...");
		
		ctx = config.getServletContext();
		
		String menu_member = ctx.getInitParameter("menu_member");
		String menu_order = ctx.getInitParameter("menu_order");
		String menu_goods = ctx.getInitParameter("menu_goods");
		
		ctx.setAttribute("menu_member", menu_member);
		ctx.setAttribute("menu_order", menu_order);
		ctx.setAttribute("menu_goods", menu_goods);
		
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("destory() 메서드 호출");
		
		resp.setContentType("text/html; charset=utf-8");
		PrintWriter writer = resp.getWriter();
		
		String menu_member = (String) ctx.getAttribute("menu_member");
		String menu_order = (String) ctx.getAttribute("menu_order");
		String menu_goods = (String) ctx.getAttribute("menu_goods");
		
		writer.print("<html><body>");
		writer.print("<h1>LoadOnStartup</h1>");
		writer.print(menu_member + "<br />" +menu_order+ "<br />" +menu_goods);
		writer.print("</body></html>");
	}

}
