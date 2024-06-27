package ex01.sample02;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/test")
public class GuguDanServletResponse extends HttpServlet {
	
	@Override
	public void init() throws ServletException {
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}
	protected void doHandler(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		int Num1 = Integer.parseInt(req.getParameter("user_num"));
		for (int i=1; i<=9; i++) {
			System.out.println(i*Num1);
		}
		
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		
		
		String htm_str = """
							<%@ page language="java" contentType="text/html; charset=EUC-KR"
			    pageEncoding="EUC-KR"%>
			<!DOCTYPE html>
			<html>
			<head>
			<meta charset="EUC-KR">
			<title>구구단</title>
			<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
			</head>
			<body>
				<div class="container">	
				""";
		
		String htm_str2= """
									<script type="text/javascript">
						function fn_num() {
							var numbox = document.numbox;
							var userNum = numbox.user_num.value;
							
							if((userNum.length==0||isNaN(userNum) ||parseInt(userNum)<1)) {
								alert("1이상의 숫자를 입력부탁드립니다.")
							}	else {
								userNum.method = "post";
								userNum.action = "/webjsp/test01";
								userNum.submit();
							}
						}
					</script>
				</body>
				</html>
				""";
		
		out.println(htm_str2);
	}
	
}
