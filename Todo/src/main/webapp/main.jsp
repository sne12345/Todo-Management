<%@ page import="kr.or.connect.jdbcRole.dto.Todo" %>
<%@ page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
	<link rel="stylesheet" href="assets/css/index.css" />
</head>
<body>

	<header>
		<div>
			<button onClick="location.href='/Todo/todoform'">Register new TODO</button>
		</div>
	<!-- 
		<form method="post" action="/Todo/todoform">
			<input type="submit" value="Register new TODO"/>
		</form> -->
		
	</header>
	<br />
	<br />
	<br />
	

	<section>
		<div id="menu">
			<span>TODO</span>
			<span>DOING</span>
			<span>DONE</span>
		</div>
		
		
		<!-- jsp -->
		<%
			
			Todo todo = new Todo();
			List<Todo> listTodo = (List)request.getAttribute("listTodo"); 
			List<Todo> listDoing = (List)request.getAttribute("listDoing"); 
			List<Todo> listDone = (List)request.getAttribute("listDone"); 
			
			%>
		
		<div id="content">
			<ul class="todo">
				
				<c:forEach var="item" items="${listTodo }" begin="0" >
					<li>
					<div>${item.title } </div>  <br />
					<div>${item.regDate }, ${item.manager }, priority ${item.priority }  
					
						<form method="post" action="/Todo/todotype" >
							<input type="hidden" name="id" value=${item.id }>
							<input type="hidden" name="type" value="${item.type }">
							<input type="submit" value="->">
						</form>
						
					</div>
					</li>
				</c:forEach>
				
			</ul>
			
			<ul class="doing">
				
				<c:forEach var="item" items="${listDoing }" begin="0" >
					<li>
					<div> ${item.title } </div> <br />
					<div> ${item.regDate }, ${item.manager }, priority ${item.priority }  
					
						<form method="post" action="/Todo/todotype" >
							<input type="hidden" name="id" value=${item.id }>
							<input type="hidden" name="type" value="${item.type }">
							<input type="submit" value="->">
						</form>

					</div> 
					</li>
				</c:forEach>
				
			</ul>
			
			<ul class="done">
				
				<c:forEach var="item" items="${listDone }" begin="0" >
					<li>
					<div> ${item.title } </div> <br />
					<div> ${item.regDate }, ${item.manager }, priority ${item.priority } </div>
					</li>
				</c:forEach>
				
			</ul>
	
		</div>
	
	</section>

</body>
</html>
