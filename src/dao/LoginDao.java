package dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import model.Login;

public class LoginDao extends BaseDao{
	
	public Login sign_in(Login login) {
		int result=-1;
		getConnection();
		List list = new ArrayList();
		executeQuery("select * from sys_user where name=? and password=?",login.getUsername(),login.getPassword());
		list=convertList(rs);
		result=list.size(); 
		Login tmp=new Login();
		tmp.setIsSuccess(String.valueOf(result));
		if (result==1) {
			Map<String,String> map=(Map)list.get(0);
			tmp.setAuth(map.get("auth"));
		}
		closeAll();
		return tmp;
	}
	
	public void sign_up() {
		return ;
	}
	
}
