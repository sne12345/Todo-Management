package kr.or.connect.jdbcRole.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import kr.or.connect.jdbcRole.dto.Role;
import kr.or.connect.jdbcRole.dto.Todo;

public class TodoDao {
	private static String dburl = "jdbc:mysql://localhost:3306/connectdb?serverTimezone=UTC";
	private static String dbUser = "connectuser";
	private static String dbpasswd = "connect123!@#";
	
	public int updateTodo(Todo todo) {
		int updateCount = 0;
		Connection conn = null;
		PreparedStatement ps = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(dburl, dbUser, dbpasswd);
			String sql = "UPDATE TODO set type = ? where id = ?";
			ps = conn.prepareStatement(sql);
		
			ps.setString(1, todo.getType());
			ps.setInt(2, todo.getId());

			updateCount = ps.executeUpdate();	// insert, delete, update는 executeUpdate() 이용
												// int type 변수에 결과 입력
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return updateCount;
	}
	
	
	public int deleteTodo(String title) {
		int deleteCount = 0;
		Connection conn = null;
		PreparedStatement ps = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(dburl, dbUser, dbpasswd);
			String sql = "DELETE from TODO where title = ?";
			ps = conn.prepareStatement(sql);
		
			ps.setString(1, title);

			deleteCount = ps.executeUpdate();	// insert, delete, update는 executeUpdate() 이용
												// int type 변수에 결과 입력
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return deleteCount;
	}
	
	
	public List<Todo> getTodos() {
		List<Todo> list = new ArrayList<>();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		String sql = "SELECT id, manager, regdate, priority, title, type FROM TODO order by priority";
		try (Connection conn = DriverManager.getConnection(dburl, dbUser, dbpasswd);
				PreparedStatement ps = conn.prepareStatement(sql)) {

			try (ResultSet rs = ps.executeQuery()) {

				while (rs.next()) {
					Integer id = rs.getInt(1);
					String manager = rs.getString(2);
					String regDate = rs.getString(3);
					Integer priority = rs.getInt(4);
					String title = rs.getString(5);
					String type = rs.getString(6);
					
					Todo todo = new Todo(id, manager, regDate, priority, title, type);
					list.add(todo); // list에 반복할때마다 Todo인스턴스를 생성하여 list에 추가한다.
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return list;
	}
	

	public int addTodo(Todo todo) {		// INSERT문이기 때문에 ResultSet객체는 필요가 없다.
		int insertCount = 0;
		Connection conn = null;
		PreparedStatement ps = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(dburl, dbUser, dbpasswd);
			String sql = "INSERT INTO TODO (title, manager, priority) VALUES ( ?, ?, ? )";
			ps = conn.prepareStatement(sql);
		
			ps.setString(1, todo.getTitle());
			ps.setString(2, todo.getManager());
			ps.setInt(3, todo.getPriority());

			insertCount = ps.executeUpdate();	// insert, delete, update는 executeUpdate() 이용
												// int type 변수에 결과 입력
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return insertCount;
	}


}
