package kr.or.connect.jdbcRole;

import kr.or.connect.jdbcRole.dao.RoleDao;
import kr.or.connect.jdbcRole.dto.Role;

public class JDBCExam5 {
	public static void main(String[] args) {
		//수정테스트
		int roleId = 501;
		String description = "CEO";
		
		Role role = new Role(roleId, description);
		
		RoleDao dao = new RoleDao();
		int updateCount = dao.updateRole(role);

		System.out.println(updateCount);
	} 
}
