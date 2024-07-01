package ex01.sample04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(
		urlPatterns = { 
				"/sInit", 
				"/sInit2"
		}, 
		initParams = { 
				@WebInitParam(name = "email", value = "hong@gmail.com"), 
				@WebInitParam(name = "tel", value = "010-1234-5678")
		})

public class initParamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public initParamServlet() {
    }

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=utf-8");
		PrintWriter writer = resp.getWriter();
		
		String email = getInitParameter("email");
		String tel = getInitParameter("tel");
		
		writer.print("<html><body>");
		writer.print("<h1>SevletConfig 객체 있는 데이터 가져오기</h1>");
		writer.print(email + "<br />" +tel);
		writer.print("</body></html>");
	}

}
