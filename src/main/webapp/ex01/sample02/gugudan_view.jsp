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
		<h3>구구단</h3>
		<hr>
		<form action="/webjsp/test01" name="numbox" method="post">
			<div>
				<label>단을 입력하세요</label>
				<input type="text" name="user_num" class="form-control">
			</div>
			<div class="d-flex justify-content-center">
				<input onClick="fn_num()" type="button" value="보내는 값" class="btn btn-success">
			</div>
		</form>
	</div>
	<script type="text/javascript">
		function fn_num() {
			var numbox = document.numbox;
			var userNum = numbox.user_num.value;
			
			if((userNum.length==0||isNaN(userNum) ||parseInt(userNum)<1)) {
				alert("1이상의 숫자를 입력부탁드립니다.")
				
			}	else {
				numbox.method = "post";
				numbox.action = "/webjsp/test01";
				numbox.submit();
			}
		}
	</script>
	<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.min.js" integrity="sha384-0pUGZvbkm6XF6gxjEnlmuGrJXVbNuzT9qBBavbLwCsOGabYfZo0T0to5eqruptLy" crossorigin="anonymous"></script>
</body>
</html>