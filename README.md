# Todo-Management
- Todo | Doing | Done 세 파트로 나누어서 할일을 관리합니다.     


# 기술 스택
- JSP, Servlet
- Mysql     


# 2020.12.29
- MainServlet.java에서 정보를 받아와서 main.jsp로 전달
- 받은 정보를 JSTL foreach 문법을 사용하여 화면에 표시
- 새로운 할 일 등록을 위해 "Register new TODO" 버튼을 만듦 -> TodoFormServlet -> todoForm.jsp [포워딩] : /todoform  



# 2021.01.01
- todoForm.jsp에서 post방식으로 TodoFormServlet으로 값을 전달한다.
- TodoFormServlet에서는 값을 받아 TodoDao를 이용해 데이터베이스에 값을 저장한다. 
- 저장 후, TodoFormServlet -> main.jsp [리다이렉트] : /main

# 메인 화면
<img width="1439" alt="스크린샷 2020-12-29 오전 3 26 51" src="https://user-images.githubusercontent.com/51853700/103235509-b882f400-4985-11eb-8d93-904cbaa130c1.png">
