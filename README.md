# Todo-Management
- Todo | Doing | Done 세 파트로 나누어서 할일을 관리합니다.     


# 기술 스택
- JSP, Servlet
- Mysql     


# 2020.12.29
- MainServlet.java에서 정보를 받아와서 main.jsp로 전달
- 받은 정보를 JSTL foreach 문법을 사용하여 화면에 표시
- 새로운 할 일 등록을 위해 "Register new TODO" 버튼을 만듦 -> TodoFormServlet -> todoForm.jsp [포워딩] 
- : /todoform -> /todoform [url 미변경]


# 2020.12.31
- todoForm.jsp에서 post방식으로 TodoFormServlet으로 값을 전달한다.
- TodoFormServlet에서는 값을 받아 TodoDao를 이용해 데이터베이스에 값을 저장한다. 
- 저장 후, TodoFormServlet -> main.jsp [리다이렉트] 
- : /todoform -> /main [url 변경]


# 2021.01.01
- 화살표 누르면 TODO -> DOING, DOING -> DONE으로 변경
- main.jsp에서 post 방식으로 TodoTypeServlet으로 해당 객체의 id와 type을 보냄
- TodoTypeServlet에서 updateTodo()를 이용하여 TODO -> DOING, DOING -> DONE으로 변경
- 변경 후, TodoTypeServlet -> main.jsp [리다이렉트] 



# 메인 화면
<img width="1093" alt="스크린샷 2021-01-03 오전 3 09 35" src="https://user-images.githubusercontent.com/51853700/103463643-25750000-4d71-11eb-8235-2d6792ce1059.png">

