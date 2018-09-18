package dao;

import java.util.ArrayList;
import java.util.List;

import model.Login;

public class LoginDao extends BaseDao{
	
	public int sign_in(Login login) {
		int result;
		getConnection();
		List list = new ArrayList();
		executeQuery("select * from sys_user where name=? and password=?",login.getUsername(),login.getPassword());
		list=convertList(rs);
		result=list.size(); 
		closeAll();
		return result;
	}
	
	public void sign_up() {
		return ;
	}
	
}
