package ex01.sample03.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ex01.sample03.service.MemberDAOServiceImpl;
import ex01.sample03.vo.MemberVO;

@SuppressWarnings("serial")
@WebServlet("/registerMember")
public class registerMemberController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doHandler(req,resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doHandler(req,resp);
	}
	
	protected void doHandler(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("MemberController Servlet");
		req.setCharacterEncoding("utf-8");
		String id = req.getParameter("user_id");
		String pw = req.getParameter("user_pw");
		String name = req.getParameter("user_name");
		String email = req.getParameter("user_email");
		
		MemberVO vo = new MemberVO(id, pw, name, email, null);
		MemberDAOServiceImpl memberDAOServiceImpl = new MemberDAOServiceImpl();
		
		int result = memberDAOServiceImpl.registerMember(vo);
		
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("text/html; charset=utf-8");
		PrintWriter write = resp.getWriter();
		
		if(result>0) {
			System.out.println("회원등록을 축하합니다.");
			
			write.print("<script>");
			write.print("alert(\"회원가입을 축하합니다.\");");
			write.print("	location.href='"+ req.getContextPath()+"/member'; ");
//			write.print("location.href'"+req.getContextPath() + "/ex01/sample03/MemberLogin.jsp'");
			write.print("</script>");
			
		} else {
			System.out.println("회원 등록을 실패하였습니다.");
			
			write.print("<script>");
			write.print("alert(\"회원가입을 실패합니다.\");");
			write.print("	location.href='/webjsp/ex01/sample03/MemberLogin.jsp'; ");
//			write.print("location.href'"+req.getContextPath() + "/ex01/sample03/MemberLogin.jsp'");
			write.print("</script>");
		}
		
	}
}
