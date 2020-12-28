<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Register TODO</title>
	<link rel="stylesheet" href="assets/css/register.css" />
</head>
<body>
	<header>
		<div>Register TODO</div>
	</header>
	
	<!-- <section>
		<div>
			<div class="question">
				<div>What the title of the work?</div>
				<input type="text">
			</div>
			
			<div class="question">
				<div>Who will do this?</div>
				<input type="text">
			</div>
			
			<div class="question">
				<div>Choose the priority</div>
				<input type="radio">1
				<input type="radio">2
				<input type="radio">3
			</div>
		</div>
		<br/>
		
		<div id="buttons">
			<button>Going Back</button>
			<button>Submit</button>
			<button>Erase All</button>
		</div>
	
	</section> -->
	
	
	
	<div id="center">
		
		<form method="post" action="/Todo/main">
		    What the title of the work? 
		    <p /><input name="title"><p />
		    
		    Who will do this?
		    <p /><input name="manager"><p />
		    
		    Choose the priority
		    <p /> <input type="radio" value="1">1
		    		<input type="radio" value="2">2
		    		<input type="radio" value="3">3
		    		
		    <p /> <input type="submit" value="submit">
				 
		</form>
	</div>
	

</body>
</html>