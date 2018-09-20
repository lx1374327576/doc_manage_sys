package service;

import dao.LoginDao;
import model.Login;

public class LoginService extends BaseService{
	
	LoginDao loginDao=new LoginDao();
	
	public Login sign_in(Login login) {
		int result=-1;
		Login tmp=new Login();
		tmp=loginDao.sign_in(login);
		return tmp;
	}
	
	public void sign_up(Login login) {
		return ;
	}
	
}