<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>클라이언트 로그인 View Page</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<div class="login">
			<h3>로그인</h3>
		    <hr>
		    <form name="frmLogin" action="/webjsp/login3" method="post">
		    	<div>
			    	<label>아이디 : </label>
			    	<input type="text" name="user_id" class="form-control">
		    	</div>
		    	<div>
			    	<label>패스워드 : </label>
			    	<input type="password" name="user_pw" class="form-control">
		    	</div>
		    	<div class = "d-flex justify-content-center" >
			    	<div>
			    		<input type="button" onClick="fn_validate()" value="로그인" class="btn btn-success">
			    	</div>
			    	<div>
			    		<input type="submit" value="다시 입력" class="btn btn-success">
			    	</div>
			    	<div>
			    		<input type="hidden" name="user_address" value="부산시">
			    	</div>
		    	</div>
		    </form>
		</div>
	</div>
	<script type="text/javascript">
		function fn_validate() {
			//유효성 검사
			var frmLogin = document.frmLogin;  //form의 name
			var user_id = frmLogin.user_id.value; //frmLogin>user_id
			var user_pw = frmLogin.user_pw.value;
			
			//아이디 및 패스워드가 없을 시 작동 되어지지 않도록 
			if((user_id.length==0 || user_id=="") || (user_pw.length==0||user_pw=="")) { 
				alert("아이디와 비밀번호는 필수 입력 입니다.")
			}	else {
				frmLogin.method = "post";
				frmLogin.action = "/webjsp/login3";
				frmLogin.submit();
			}
			
		}
	</script>
	
</body>
</html>