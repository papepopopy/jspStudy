<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>클라이언트 로그인 View Page</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<style>
	.login {
		width: 500px;
	}
	.login div {
		margin-bottom: 10px;
	}
</style>
</head>
<body>
	<div class="container">
		<div class="login">
			<h3>로그인 View Page</h3>
		    <hr>
		    <form action="/webjsp/login" method="post">
		    	<div>
			    	<label>아이디 : </label>
			    	<input type="text" name="user_id" class="form-control">
		    	</div>
		    	<div>
			    	<label>비밀번호 : </label>
			    	<input type="password" name="user_pw" class="form-control">
		    	</div>
		    	
		    	<br>
		    	
		    	<input type="checkbox" name="subject" class="" value="java">자바
		    	<input type="checkbox" name="subject" class="" value="python">파이선
		    	<input type="checkbox" name="subject" class="" value="jsp">JSP
		    	<input type="checkbox" name="subject" class="" value="android">안드로이드
		    	<br>
		    	
		    	<input type="radio" name="address" value="1">서울
		    	<input type="radio" name="address" value="2">부산
		    	<input type="radio" name="address" value="3">경남
		    	<br>
		    	<select name="sel_size" size="3" multiple="multiple">
		    		<option value="100">100cm</option>
		    		<option value="200">200cm</option>
		    		<option value="300">300cm</option>
		    		<option value="400">400cm</option>
		    		<option value="500">500cm</option>
		    	</select>
		    	<div class = "d-flex justify-content-center" >
		    	
			    	<div>
			    		<input type="submit" value="로그인" class="btn btn-success m-1">
			    	</div>
			    	<div>
			    		<input type="reset" value="다시입력" class="btn btn-danger">
			    	</div>
		    	</div>
		    </form>
		</div>
	</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>