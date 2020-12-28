package kr.or.connect.jdbcRole;

import kr.or.connect.jdbcRole.dao.RoleDao;
import kr.or.connect.jdbcRole.dto.Role;

public class JDBCExam1 {

	public static void main(String[] args) {
		
		RoleDao dao = new RoleDao();
		Role role = dao.getRole(501);
		System.out.println(role);
		
	}

}