package ex01.sample02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ex01.sample02.dto.AddCalc;

@WebServlet("/calc")
public class CalcServlet extends HttpServlet  {
	private static final long serialVersionUID = 1L;

	@Override
	public void init() throws ServletException {
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
		
		req.setCharacterEncoding("utf-8");
		
		//숫자 형태로 변환
		int num1 = Integer.parseInt(req.getParameter("num1"));
		int num2 = Integer.parseInt(req.getParameter("num2"));
		
		System.out.println(num1 + num2);
		
		//덧셈 계산기 객체 호출
		AddCalc addCalc = AddCalc.builder().num1(num1).num2(num2).build();
		System.out.println(addCalc.result());
				
		int addResult = addCalc.result();
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = resp.getWriter();
		String result = "";
		result += "<html>";
		result += "<body>";
		result += "<h1>계산 결과</h1>";
		result += "<hr>";
		result += num1+" + "+num2+" = "+addResult;
		result += "</ body>";
		result += "</ html>";
		
		out.print(result);
	}
	
	
}
