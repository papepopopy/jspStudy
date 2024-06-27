package ex01.sample02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/login2")
public class LoginServletResponse extends HttpServlet {
	@Override
	public void init() throws ServletException {
		System.out.println("init()...");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doHandler(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doHandler(req, resp);
	}

	protected void doHandler(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doGet(), doPost() ...");
		
		// 서버 > 클라이언트 정보전달 (text.html)
		/*
		 * html 데이터
		 *  
		 * 텍스트 데이터 : text/plain
		 * XML데이터 : application/xml
		 * */
		
		req.setCharacterEncoding("utf-8");
		String id = req.getParameter("user_id");
		String pw = req.getParameter("user_pw");
		
		//응답 response처리
		resp.setContentType("text/html; charset=UTF-8");
		PrintWriter out = resp.getWriter();
		
		String data ="";
		data += "<html>1234</html>";
		
		out.print(data);
	}

}
