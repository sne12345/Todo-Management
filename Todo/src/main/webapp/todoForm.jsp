<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Register TODO</title>
	<link rel="stylesheet" href="assets/css/todoForm.css" />
	
</head>
<body>
	<header>
		<div>Register TODO</div>
	</header>
	
	<section id="center">
		
		<form method="post" action="/Todo/todoadd">
		    어떤 일인가요?
		    <p /><input name="title" id="title"><p />
		    
		    누가 할일인가요?
		    <p /><input name="manager" id="manager"><p />
		    
		    우선순위를 선택하세요
		    <p /> <input type="radio" id="radio1" name="priority" value="1">1
		    		<input type="radio" id="radio2" name="priority" value="2">2
		    		<input type="radio" id="radio3" name="priority" value="3">3
		    		
		    <p /> <input type="submit" value="submit">
		    	
		</form>
		
		<div>
			<div class="buttons">
				<button id="back" onClick="location.href='/Todo/main'">이전</button> 
				<button id="erase">내용지우기</button>
			</div>
		</div>
	</section>
	

</body>
	<script src="assets/js/todoForm.js"></script>
</html>
