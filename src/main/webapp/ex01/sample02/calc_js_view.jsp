<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Ŭ���̾�Ʈ �α��� View Page</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<div class="login">
			<h3>�α���</h3>
		    <hr>
		    <form name="frmLogin" action="/webjsp/login3" method="post">
		    	<div>
			    	<label>���̵� : </label>
			    	<input type="text" name="user_id" class="form-control">
		    	</div>
		    	<div>
			    	<label>�н����� : </label>
			    	<input type="password" name="user_pw" class="form-control">
		    	</div>
		    	<div class = "d-flex justify-content-center" >
			    	<div>
			    		<input type="button" onClick="fn_validate()" value="�α���" class="btn btn-success">
			    	</div>
			    	<div>
			    		<input type="submit" value="�ٽ� �Է�" class="btn btn-success">
			    	</div>
			    	<div>
			    		<input type="hidden" name="user_address" value="�λ��">
			    	</div>
		    	</div>
		    </form>
		</div>
	</div>
	<script type="text/javascript">
		function fn_validate() {
			//��ȿ�� �˻�
			var frmLogin = document.frmLogin;  //form�� name
			var user_id = frmLogin.user_id.value; //frmLogin>user_id
			var user_pw = frmLogin.user_pw.value;
			
			//���̵� �� �н����尡 ���� �� �۵� �Ǿ����� �ʵ��� 
			if((user_id.length==0 || user_id=="") || (user_pw.length==0||user_pw=="")) { 
				alert("���̵�� ��й�ȣ�� �ʼ� �Է� �Դϴ�.")
			}	else {
				frmLogin.method = "post";
				frmLogin.action = "/webjsp/login3";
				frmLogin.submit();
			}
			
		}
	</script>
	
</body>
</html>