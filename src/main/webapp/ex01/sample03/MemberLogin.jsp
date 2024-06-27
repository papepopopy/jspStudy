<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 등록</title>
</head>
<body>
<div class="container">
		<div class="login">
			<h3>로그인 View Page</h3>
		    <hr>
		    <form action="/webjsp/registerMember" method="post">
		    	<div>
			    	<label>아이디 : </label>
			    	<input type="text" name="user_id" class="form-control">
		    	</div>
		    	<div>
			    	<label>비밀번호 : </label>
			    	<input type="password" name="user_pw" class="form-control">
		    	</div>
		    	<div>
			    	<label>이름 : </label>
			    	<input type="text" name="user_name" class="form-control">
		    	</div>
		    	<div>
			    	<label>이메일 : </label>
			    	<input type="email" name="user_email" class="form-control">
		    	</div>
		    </form>
		</div>
	</div>
</body>
</body>
</html>