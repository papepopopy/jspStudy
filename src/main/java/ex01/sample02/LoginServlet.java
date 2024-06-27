package ex01.sample02;

import java.io.IOException;
import java.util.Arrays;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	public void init(ServletConfig config) throws ServletException {
		System.out.println("서블릿 로딩 시 최초 한번 수행 : 초기화 작업");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandler(request, response);
	}
     
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		System.out.println("doPost() 방식으로 요청");
		doHandler(request, response);
	}
	
	protected void doHandler(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost(), doGet() 방식으로 요청");
		
		request.setCharacterEncoding("utf-8");//전송된 데이터를 utf-8로 인코딩
		
		String userId = request.getParameter("user_id");
		String userPw = request.getParameter("user_pw");
		
		System.out.println("아이디 : " + userId);
		System.out.println("비밀번호 : " + userPw);
		
		System.out.println("--일괄처리--");
		
		Enumeration<String> enu = request.getParameterNames();
		
		while(enu.hasMoreElements()) {
			String name = (String) enu.nextElement();
			System.out.println("name : " + name);
		}
		
		System.out.println("--다중값 처리--");
		
		// 다중 값을 들고 올때 배열구조로 변경
		String[] subject = request.getParameterValues("subject");
		Arrays.stream(subject).forEach(value -> {
			System.out.println(value);
		});

		String[] selSize2 = request.getParameterValues("sel_size");
		Arrays.stream(selSize2).forEach(value -> {
			System.out.println("사이즈 : "+ value);
		});
		
		System.out.println("--단일값 처리--");
		String address = request.getParameter("address");
		System.out.println("거주지 : " + address);
		
		String selSize = request.getParameter("sel_size");
		System.out.println("사이즈 : "+ selSize);
	}

}
