package service;

import dao.LoginDao;
import model.Login;

public class LoginService extends BaseService{
	
	LoginDao loginDao=new LoginDao();
	
	public int sign_in(Login login) {
		int result=0;
		result=loginDao.sign_in(login);
		return result;
	}
	
	public void sign_up(Login login) {
		return ;
	}
	
}