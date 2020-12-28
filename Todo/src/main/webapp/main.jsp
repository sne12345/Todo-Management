<%@ page import="kr.or.connect.jdbcRole.dto.Todo" %>
<%@ page import="java.util.List" %>


<html>
<head>
	<link rel="stylesheet" href="assets/css/index.css" />
</head>
<body>

	<header>
	
		<form method="post" action="/Todo/register">
			<input type="submit" value="Register new TODO"/>
		</form>
		
	</header>

	<section>
		<div id="menu">
			<span>TODO</span>
			<span>DOING</span>
			<span>DONE</span>
		</div>
		
		
		<!-- jsp -->
		<%
			
			Todo todo = new Todo();
			List<Todo> list = (List)request.getAttribute("list");

		%>
		<br />
		
		
		<div id="content">
			<ul>
				<li>
					<div>study javascript</div>
					<div>date:2020.12.27, naeun, priority 1 <button>-></button></div>
				</li>
				<li>
					<div>study javascript</div>
					<div>date:2020.12.27, naeun, priority 1 <button>-></button></div>
				</li>
			</ul>
			
			<ul>
				<li>
					<div>study javascript</div>
					<div>date:2020.12.27, naeun, priority 1 <button>-></button></div>
				</li>
				<li>
					<div>study javascript</div>
					<div>date:2020.12.27, naeun, priority 1 <button>-></button></div>
				</li>
			</ul>

			<ul>
				<li>
					<div>study javascript</div>
					<div>date:2020.12.27, naeun, priority 1 <button>-></button></div>
				</li>
				<li>
					<div>study javascript</div>
					<div>date:2020.12.27, naeun, priority 1 <button>-></button></div>
				</li>
			</ul> 
		</div>
	
	</section>

</body>
</html>
