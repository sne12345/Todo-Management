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
		    TODO Title
		    <p /><input name="title"><p />
		    
		    TODO Manager
		    <p /><input name="manager"><p />
		    
		    TODO Priority
		    <p /> <input type="radio" name="priority" value="1">1
		    		<input type="radio" name="priority" value="2">2
		    		<input type="radio" name="priority" value="3">3
		    		
		    <p /> <input type="submit" value="submit">
				 
		</form>
	</section>
	

</body>
</html>