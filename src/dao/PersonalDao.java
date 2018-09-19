package dao;

import model.Personal;

public class PersonalDao extends BaseDao {
	
	public Personal getinfo(Personal personal) {
		Personal r_personal=new Personal();
		
		return r_personal;
	}
	
	public int change(Personal personal) {
		int result;
		getConnection();
		result=executeUpdate("update sys_info set password=? where name=? and password=?",
								personal.getNewpassword(),personal.getUsername(),personal.getOldpassword());
		return result;
	}
	
}
