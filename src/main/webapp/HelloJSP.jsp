<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    <%!
    String str1 = "JSP";
    String name = "홍길동";
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello JSP</title>
</head>
<body>
	<h1><%= name %>의 <%= str1 %> test file</h1>
	<div>
	<%
		out.println(str1+","+name);
	%>
	</div>
</body>
</html>