package kr.or.connect.jdbcRole;

import kr.or.connect.jdbcRole.dao.RoleDao;
import kr.or.connect.jdbcRole.dto.Role;

public class JDBCExam2 {
	public static void main(String[] args) {
		int roleId = 501;
		String description = "barista";
		
		Role role = new Role(roleId, description);
		
		RoleDao dao = new RoleDao();
		int insertCount = dao.addRole(role);

		System.out.println(insertCount);
	}
}