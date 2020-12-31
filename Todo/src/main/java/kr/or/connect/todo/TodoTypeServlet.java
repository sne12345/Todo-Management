package kr.or.connect.todo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.connect.jdbcRole.dao.TodoDao;
import kr.or.connect.jdbcRole.dto.Todo;


@WebServlet("/todotype")
public class TodoTypeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public TodoTypeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		request.setCharacterEncoding("utf-8");
		String idTmp = request.getParameter("id");
		String type = request.getParameter("type");
		int id = Integer.parseInt(idTmp);
		
	
		if(type.equals("TODO")) {
			type = "DOING";
		} else if(type.equals("DOING")) {
			type = "DONE";
		}
		
		Todo todo = new Todo(id, "0", "0", 0, "0", type);
		
		// 수정하기
		TodoDao daoUpdate = new TodoDao();
		int updateCount = daoUpdate.updateTodo(todo);

		System.out.println(updateCount);
		
		response.sendRedirect("/Todo/main");
		
	}

}
