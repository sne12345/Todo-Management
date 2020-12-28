package kr.or.connect.todo;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.connect.jdbcRole.dao.RoleDao;
import kr.or.connect.jdbcRole.dao.TodoDao;
import kr.or.connect.jdbcRole.dto.Role;
import kr.or.connect.jdbcRole.dto.Todo;


@WebServlet("/main")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public static void main(String[] args) {
		
		// 할일 추가하기
		String title = "교육봉사 신청하기";
		String manager = "naeun";
		int priority = 2;
		
		Todo todo = new Todo(title, manager, priority);
		TodoDao dao = new TodoDao();
		
		int insertCount = dao.addTodo(todo);

		System.out.println(insertCount);
		
		
		// 할일 조회하기
		TodoDao daoGet = new TodoDao();
		List<Todo> list = daoGet.getTodos();

		for(Todo todoGet : list) {
			System.out.println(todoGet);
		}
		
		// 할일 삭제하기
		String titleDel = "9시에 일어나기";

		TodoDao daoDel = new TodoDao();
		int deleteCount = daoDel.deleteTodo(titleDel);

		System.out.println(deleteCount);
		
		
		// manager 수정하기
		String titleUpdate = "1시간 운동하기";
		String managerUpdate = "seonghee";
		Integer priorityUpdate = 1;
		
		Todo todoUpdate = new Todo(titleUpdate, managerUpdate, priorityUpdate);
		
		TodoDao daoUpdate = new TodoDao();
		int updateCount = daoUpdate.updateTodo(todoUpdate);

		System.out.println(updateCount);
	}
	
       
    public MainServlet() {
        super();
        
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 할일 조회하기
		TodoDao daoGet = new TodoDao();
		List<Todo> list = daoGet.getTodos();
		
		request.setAttribute("list", list);

//		for(Todo todoGet : list) {
//			
//			System.out.println(todoGet.getTitle());
//		}
		
		RequestDispatcher rd = request.getRequestDispatcher("/main.jsp");		// 루트 : WebContent, webapp
		rd.forward(request, response);
		
	}

}
