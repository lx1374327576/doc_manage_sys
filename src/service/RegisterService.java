package service;

import dao.RegisterDao;
import model.Register;

public class RegisterService extends BaseService{
	
	public int confim(Register register) {
		int result=-1;
		RegisterDao registerDao=new RegisterDao();
		result=registerDao.confim(register);
		return result;
	}
	
	public void back(Register register) {
		return;
	}
	
	public int username_check(Register register) {
		int result=-1;
		return result;
	}
	
}