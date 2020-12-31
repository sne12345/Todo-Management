package kr.or.connect.todo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.connect.jdbcRole.dao.TodoDao;
import kr.or.connect.jdbcRole.dto.Todo;

@WebServlet("/todoadd")
public class TodoAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public TodoAddServlet() {
        super();  
        
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		String title = request.getParameter("title");
		String manager = request.getParameter("manager");
		String priorityTmp = request.getParameter("priority");
		int priority = Integer.parseInt(priorityTmp);
		
		Todo todo = new Todo(0, manager, "0", priority, title, "0");
		TodoDao dao = new TodoDao();
		
		int insertCount = dao.addTodo(todo); 
		System.out.println(insertCount);
		
		response.sendRedirect("/Todo/main");
	}

}
