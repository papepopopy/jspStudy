package ex01.sample04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/cfile")
public class ContextFileServlet extends HttpServlet {
		
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			resp.setContentType("text/html; charset=utf-8");
			PrintWriter writer = resp.getWriter();
			
			ServletContext ctx = getServletContext();
			
			InputStream is = ctx.getResourceAsStream("/WEB-INF/txt/init.txt");
			
			BufferedReader buffer = new BufferedReader(new InputStreamReader(is));
			
			String menu = null;
			String menu_member = ctx.getInitParameter("menu_member");
			String menu_order = ctx.getInitParameter("menu_order");
			String menu_goods = ctx.getInitParameter("menu_goods");

			while((menu = buffer.readLine()) !=null) {
				StringTokenizer tokens = new StringTokenizer(menu, ",");
				
				menu_member = tokens.nextToken();
				menu_order = tokens.nextToken();
				menu_goods = tokens.nextToken();
			}
			
			writer.print("<html><body>");
			writer.print("SevletContext 객체 매개변수 데이터 가져오기");
			writer.print(menu_member+ ","  + menu_order + "," +menu_goods);
			writer.print("</body></html>");
		}

}
