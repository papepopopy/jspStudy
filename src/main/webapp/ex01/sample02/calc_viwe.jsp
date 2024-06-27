<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>덧셈 계산 요청</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
<div class="container">
		<div class="calc">
			<h3>덧셈 계산 요청</h3>
		    <hr>
		    <form action="/webjsp/calc" method="get">
		    	<div>
			    	<label>숫자 : </label>
			    	<input type="text" name="num1" class="form-control">
		    	</div>
		    	<div>
			    	<label>숫자2 : </label>
			    	<input type="text" name="num2" class="form-control">
		    	</div>
		    	<div class = "d-flex justify-content-center" >
			    	<div>
			    		<input type="submit" value="보내기" class="btn btn-success">
			    	</div>
		    	</div>
		    </form>
		</div>
	</div>
</body>
</html>