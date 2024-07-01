package ex01.sample04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/second03")

public class SecondServlet03 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.setCharacterEncoding("utf-8");
		
		//형전환
		String address = (String)req.getAttribute("address");
//		String age = (String)req.getAttribute("age");
		int age = Integer.parseInt((String)req.getAttribute("age"));
		
		resp.setContentType("text/html; charset=utf-8");
		PrintWriter writer = resp.getWriter();
		
		writer.println("<html><body>");
		writer.println("<div>전송받은 주소</div>" + address);
		writer.println("<div>전송받은 나이</div>" + (age+1));
		writer.println("</body></html>");
	}
}
